package com.tencent.mm.modelstat;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.jni.platformcomm.PlatformComm.C2Java;
import com.tencent.mm.jni.platformcomm.c;
import com.tencent.mm.network.MMNativeNetComm.ReportInfo;
import com.tencent.mm.network.a.a;
import com.tencent.mm.network.a.b;
import com.tencent.mm.network.a.f;
import com.tencent.mm.network.bk;
import com.tencent.mm.network.bp;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.protocal.a.aat;
import com.tencent.mm.protocal.bi;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.Queue;

public final class l
  implements a
{
  static final String dEG = h.dOP;
  private static int dEN = 0;
  private static int dEO = 0;
  private q dEH = new q();
  private RandomAccessFile dEI = null;
  private long dEJ = 0L;
  private String dEK = "";
  private WifiManager dEL = null;
  private TelephonyManager dEM = null;
  private am dEP = new am();
  private ay dEQ;
  Queue dER;
  private int dES;
  private boolean dET;
  private aat dEU;
  private long dEV;
  private long dEW;
  private long dEX;
  private long dEY;
  private long dEZ;
  private aat dFa;
  private aat dFb;

  public l()
  {
    this.dEQ = new ay(this.dEP.getLooper(), new m(this), bool);
    this.dER = new LinkedList();
    this.dES = 0;
    this.dET = false;
    this.dEU = null;
    this.dEV = 0L;
    this.dEW = 0L;
    this.dEX = 0L;
    this.dEY = 0L;
    this.dEZ = 0L;
    this.dFa = null;
    this.dFb = null;
    File localFile = new File(dEG);
    if (!localFile.exists())
      localFile.mkdirs();
    Aj();
    if (ch.jb(this.dEK));
    while (true)
    {
      ac(bool);
      a(10001, "", null);
      this.dEQ.cP(60000L);
      if (bk.getContext() != null)
      {
        this.dEL = ((WifiManager)bk.getContext().getSystemService("wifi"));
        this.dEM = ((TelephonyManager)bk.getContext().getSystemService("phone"));
        this.dEM.listen(new p((byte)0), 256);
      }
      return;
      bool = false;
    }
  }

  private void Ak()
  {
    if (this.dEI == null)
      return;
    try
    {
      this.dEI.close();
      label15: this.dEI = null;
      return;
    }
    catch (Exception localException)
    {
      break label15;
    }
  }

  private void Al()
  {
    if (this.dEI == null)
    {
      z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "file operator closed at commitFile");
      ac(true);
    }
    this.dEH.b(this.dEI);
    try
    {
      this.dEI.seek(this.dEI.length());
      while (this.dER.size() > 0)
      {
        byte[] arrayOfByte = (byte[])this.dER.poll();
        if (!ch.B(arrayOfByte))
        {
          this.dEI.writeInt(arrayOfByte.length);
          this.dEI.write(arrayOfByte);
        }
      }
      this.dEI.getFD().sync();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private int a(int paramInt, aat paramaat, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report: IGNORE stat:" + paramInt);
      return 0;
    case 10501:
      z.i("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog net change connected");
      this.dET = true;
      return 0;
    case 4:
      int i6 = ch.a((Integer)paramObject);
      Object[] arrayOfObject8 = new Object[1];
      arrayOfObject8[0] = Integer.valueOf(i6);
      z.i("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog received:%d", arrayOfObject8);
      this.dEH.H(4, i6);
      return 0;
    case 5:
      int i5 = ch.a((Integer)paramObject);
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[0] = Integer.valueOf(i5);
      z.i("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog send:%d", arrayOfObject7);
      this.dEH.H(3, i5);
      return 0;
    case 1103:
      this.dEH.eC(7);
      this.dEX = (1L + this.dEX);
      return 0;
    case 1104:
      this.dEH.eC(11);
      this.dEY = (1L + this.dEY);
      return 0;
    case 10001:
      z.d("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog push start");
      this.dEV = ch.CM();
      paramaat.itO = 10001;
      paramaat.eJL = ((int)(this.dEV / 1000L));
      paramaat.iul = Process.myPid();
      return 1;
    case 10002:
      long l5 = this.dEV;
      this.dEV = 0L;
      long l6 = ch.CM();
      paramaat.itO = 10002;
      paramaat.iul = Process.myPid();
      if (!a(true, 0L, l5, l6, paramaat))
        return 0;
      Object[] arrayOfObject6 = new Object[1];
      arrayOfObject6[0] = Integer.valueOf(paramaat.itV);
      z.d("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog push stop alive:%d", arrayOfObject6);
      Al();
      return 1;
    case 10003:
      z.d("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog worker start");
      this.dEW = ch.CM();
      paramaat.itO = 10003;
      paramaat.iul = Process.myPid();
      paramaat.eJL = ((int)(this.dEW / 1000L));
      return 1;
    case 10004:
      long l3 = this.dEW;
      this.dEW = 0L;
      long l4 = ch.CM();
      paramaat.itO = 10004;
      paramaat.iul = Process.myPid();
      if (!a(true, 0L, l3, l4, paramaat))
        return 0;
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Integer.valueOf(paramaat.itV);
      z.d("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog worker start alive:%d", arrayOfObject5);
      Al();
      return 1;
    case 10955:
      MMNativeNetComm.ReportInfo localReportInfo7 = (MMNativeNetComm.ReportInfo)paramObject;
      if (localReportInfo7 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report cgi info null");
        return 0;
      }
      if (localReportInfo7.endFlag != 1)
        return 0;
      paramaat.iul = Process.myPid();
      if (localReportInfo7.rtType == 38L)
      {
        this.dEZ = (1L + this.dEZ);
        this.dEH.eC(5);
        if (localReportInfo7.errType != 0)
          this.dEH.eC(6);
      }
      this.dEH.eC(8);
      if (localReportInfo7.errType != 0)
        this.dEH.eC(9);
      int i2 = bi.get((int)localReportInfo7.rtType);
      if (!a(false, localReportInfo7.expand1, localReportInfo7.endTime - localReportInfo7.expand1, localReportInfo7.endTime, paramaat))
        return 0;
      int i3 = localReportInfo7.errType;
      if ((i3 == 0) && (localReportInfo7.errCode != 0))
        i3 = 4;
      f localf4 = new f(InetAddress.getByName(localReportInfo7.ip), localReportInfo7.port, localReportInfo7.ipType);
      Object[] arrayOfObject4 = new Object[10];
      arrayOfObject4[0] = Integer.valueOf(i2);
      arrayOfObject4[1] = Integer.valueOf(i3);
      arrayOfObject4[2] = Integer.valueOf(localReportInfo7.errCode);
      arrayOfObject4[3] = localf4;
      arrayOfObject4[4] = Boolean.valueOf(localReportInfo7.isSocket);
      arrayOfObject4[5] = Long.valueOf(localReportInfo7.endTime - localReportInfo7.beginTime);
      arrayOfObject4[6] = Long.valueOf(localReportInfo7.sendSize);
      arrayOfObject4[7] = Long.valueOf(localReportInfo7.recvSize);
      arrayOfObject4[8] = Integer.valueOf(localReportInfo7.netType);
      arrayOfObject4[9] = Integer.valueOf(localReportInfo7.retryCount);
      z.i("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog FUNC:%d [%d,%d] [%s] sock:%b cost:%d tx:%d rx:%d net:%d retry:%d", arrayOfObject4);
      paramaat.eJz = localReportInfo7.errCode;
      paramaat.iui = localReportInfo7.host;
      paramaat.iuH = localReportInfo7.usedIpIndex;
      paramaat.iur = ((int)localReportInfo7.connCostTime);
      paramaat.iuG = ((int)localReportInfo7.connTotalCostTime);
      paramaat.iuI = localReportInfo7.localIp;
      paramaat.itT = i2;
      paramaat.itO = 1102;
      paramaat.isa = localReportInfo7.netType;
      paramaat.iuf = bc.bB(bk.getContext());
      paramaat.iug = bc.bC(bk.getContext());
      paramaat.itP = hB(localReportInfo7.ip);
      paramaat.itR = localReportInfo7.ipType;
      paramaat.itQ = localReportInfo7.port;
      int i4;
      if (localReportInfo7.isSocket)
      {
        i4 = 1;
        paramaat.iud = i4;
        paramaat.itS = localReportInfo7.errType;
        paramaat.itW = ((int)localReportInfo7.sendSize);
        paramaat.itX = ((int)localReportInfo7.recvSize);
        paramaat.eJz = localReportInfo7.errCode;
        paramaat.iue = ((int)localReportInfo7.netSignal);
        paramaat.ium = hB(localReportInfo7.clientIp);
        paramaat.iun = ((int)localReportInfo7.expand2);
        paramaat.iuh = localReportInfo7.retryCount;
        if (i2 != 110)
          break label1193;
        this.dFa = paramaat;
      }
      while (true)
      {
        return 1;
        i4 = 0;
        break;
        if (i2 == 109)
          this.dFb = paramaat;
      }
    case 10401:
      b localb3 = (b)paramObject;
      if (localb3 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report multi scene info null");
        return 0;
      }
      if (localb3.rtType == 110L)
        paramaat.itO = 10401;
      while (true)
      {
        paramaat.iul = Process.myPid();
        if (a(false, localb3.dDR, localb3.beginTime, localb3.endTime, paramaat))
          break;
        return 0;
        if (localb3.rtType == 109L)
          paramaat.itO = 10402;
      }
      if (paramaat.itO == 10401)
      {
        if (this.dFa == null)
          return 0;
        paramaat.iud = this.dFa.iud;
        paramaat.itP = this.dFa.itP;
        paramaat.itQ = this.dFa.itQ;
        paramaat.iuc = this.dFa.iuc;
        paramaat.isa = this.dFa.isa;
        bc.bP(bk.getContext());
        paramaat.iue = 0;
        paramaat.iuf = this.dFa.iuf;
      }
      for (paramaat.iug = this.dFa.iug; ; paramaat.iug = this.dFb.iug)
      {
        paramaat.huF = ((int)localb3.dUw);
        paramaat.itW = ((int)localb3.dUu);
        paramaat.itX = ((int)localb3.dUv);
        paramaat.ium = hB(localb3.clientIp);
        return 1;
        if (this.dFb == null)
          return 0;
        paramaat.iud = this.dFb.iud;
        paramaat.itP = this.dFb.itP;
        paramaat.itQ = this.dFb.itQ;
        paramaat.iuc = this.dFb.iuc;
        paramaat.isa = this.dFb.isa;
        bc.bP(bk.getContext());
        paramaat.iue = 0;
        paramaat.iuf = this.dFb.iuf;
      }
    case 10101:
    case 10105:
      MMNativeNetComm.ReportInfo localReportInfo6 = (MMNativeNetComm.ReportInfo)paramObject;
      if (localReportInfo6 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report connect ip info null or nettype error");
        return 0;
      }
      paramaat.iul = Process.myPid();
      f localf3 = new f(InetAddress.getByName(localReportInfo6.ip), localReportInfo6.port, localReportInfo6.ipType);
      Object[] arrayOfObject3 = new Object[8];
      if (paramInt == 10105);
      for (String str = "synccheckconnect"; ; str = "connect")
      {
        arrayOfObject3[0] = str;
        arrayOfObject3[1] = localf3;
        arrayOfObject3[2] = Boolean.valueOf(localReportInfo6.isSocket);
        arrayOfObject3[3] = Integer.valueOf(localReportInfo6.netType);
        arrayOfObject3[4] = Long.valueOf(localReportInfo6.endTime - localReportInfo6.beginTime);
        arrayOfObject3[5] = Integer.valueOf(localReportInfo6.errCode);
        arrayOfObject3[6] = Long.valueOf(localReportInfo6.sendSize);
        arrayOfObject3[7] = Long.valueOf(localReportInfo6.recvSize);
        z.i("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog %s:[%s] sock:%b net:%d cost:%d ret:%d tx:%d rx:%d", arrayOfObject3);
        if (localReportInfo6.errCode == 0)
          break;
        this.dES = (1 + this.dES);
        if (this.dES < 10)
          break label1775;
        return 0;
      }
      this.dES = 0;
      this.dEZ = 0L;
      this.dEX = 0L;
      this.dEY = 0L;
      paramaat.itO = paramInt;
      paramaat.isa = localReportInfo6.netType;
      paramaat.iue = ((int)localReportInfo6.netSignal);
      paramaat.iuf = bc.bB(bk.getContext());
      paramaat.iug = bc.bC(bk.getContext());
      paramaat.itP = hB(localReportInfo6.ip);
      paramaat.itQ = localReportInfo6.port;
      paramaat.itR = localReportInfo6.ipType;
      paramaat.itW = ((int)localReportInfo6.sendSize);
      paramaat.itX = ((int)localReportInfo6.recvSize);
      int m;
      int i1;
      if (localReportInfo6.isSocket)
      {
        m = 1;
        paramaat.iud = m;
        paramaat.iuc = localf3.type();
        if (paramaat.isa != 1)
          break label2044;
        if (!this.dET)
          break label2038;
        i1 = 1;
        paramaat.itY = i1;
        this.dET = false;
        if (localReportInfo6.errCode != 0)
          break label2052;
      }
      for (int n = 0; ; n = 1)
      {
        paramaat.itS = n;
        paramaat.eJz = localReportInfo6.errCode;
        paramaat.iuC = localReportInfo6.newNetType;
        paramaat.iuD = localReportInfo6.subNetType;
        paramaat.iuE = localReportInfo6.extraInfo;
        paramaat.iuh = localReportInfo6.retryCount;
        if (a(false, localReportInfo6.endTime - localReportInfo6.beginTime, localReportInfo6.beginTime, localReportInfo6.endTime, paramaat))
          break label2058;
        return 0;
        m = 0;
        break;
        i1 = 0;
        break label1928;
        paramaat.itY = 0;
        break label1934;
      }
      if (localReportInfo6.isSocket)
        this.dEU = paramaat;
      paramaat.ium = hB(localReportInfo6.clientIp);
      return 1;
    case 10428:
      MMNativeNetComm.ReportInfo localReportInfo5 = (MMNativeNetComm.ReportInfo)paramObject;
      if (localReportInfo5 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report nslookup info null");
        return 0;
      }
      f localf2 = new f(InetAddress.getByName(localReportInfo5.ip), localReportInfo5.port, localReportInfo5.ipType);
      Object[] arrayOfObject2 = new Object[5];
      arrayOfObject2[0] = localReportInfo5.host;
      arrayOfObject2[1] = localf2;
      arrayOfObject2[2] = Long.valueOf(localReportInfo5.expand1);
      arrayOfObject2[3] = Integer.valueOf(localReportInfo5.netType);
      arrayOfObject2[4] = Integer.valueOf(localReportInfo5.errCode);
      z.i("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog dns [%s][%s] cnt:%d net:%d ret:%d", arrayOfObject2);
      if (!a(false, localReportInfo5.endTime - localReportInfo5.beginTime, localReportInfo5.beginTime, localReportInfo5.endTime, paramaat))
        return 0;
      paramaat.iul = Process.myPid();
      paramaat.itO = 10428;
      paramaat.isa = localReportInfo5.netType;
      int j = paramaat.isa;
      int k;
      if (j == 1)
      {
        if ((this.dEL == null) && (bk.getContext() != null))
          this.dEL = ((WifiManager)bk.getContext().getSystemService("wifi"));
        if (this.dEL == null)
          break label2569;
        k = Math.abs(this.dEL.getConnectionInfo().getRssi());
      }
      while (true)
      {
        paramaat.iue = k;
        paramaat.iuj = ((int)localReportInfo5.expand1);
        paramaat.itS = localReportInfo5.errType;
        paramaat.iui = localReportInfo5.host;
        paramaat.iuf = bc.bB(bk.getContext());
        paramaat.iug = bc.bC(bk.getContext());
        paramaat.eJz = localReportInfo5.errCode;
        paramaat.itR = localf2.type();
        paramaat.ium = hB(localReportInfo5.clientIp);
        paramaat.itV = ((int)localReportInfo5.expand2);
        paramaat.itP = hB(localReportInfo5.ip);
        paramaat.itV = ((int)localReportInfo5.expand2);
        return 1;
        if (j == 4)
        {
          if ((this.dEM == null) && (bk.getContext() != null))
          {
            this.dEM = ((TelephonyManager)bk.getContext().getSystemService("phone"));
            this.dEM.listen(new p((byte)0), 256);
          }
          if (this.dEM != null)
            k = dEN;
        }
        else if (j == 3)
        {
          if ((this.dEM == null) && (bk.getContext() != null))
          {
            this.dEM = ((TelephonyManager)bk.getContext().getSystemService("phone"));
            this.dEM.listen(new p((byte)0), 256);
          }
          if (this.dEM != null)
            k = dEO;
        }
        else
        {
          k = 0;
        }
      }
    case 10102:
      MMNativeNetComm.ReportInfo localReportInfo4 = (MMNativeNetComm.ReportInfo)paramObject;
      if (localReportInfo4 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report disconnect ip info null or nettype error");
        return 0;
      }
      paramaat.iul = Process.myPid();
      f localf1 = new f(InetAddress.getByName(localReportInfo4.ip), localReportInfo4.port, localReportInfo4.ipType);
      Object[] arrayOfObject1 = new Object[4];
      arrayOfObject1[0] = localf1;
      arrayOfObject1[1] = Integer.valueOf(localReportInfo4.netType);
      arrayOfObject1[2] = Long.valueOf(localReportInfo4.endTime - localReportInfo4.beginTime);
      arrayOfObject1[3] = Integer.valueOf(localReportInfo4.errCode);
      z.i("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkdog DISconnect:[%s] net:%d alive:%d err:%d ", arrayOfObject1);
      long l1 = localReportInfo4.beginTime;
      paramaat.itN = ((int)this.dEY);
      paramaat.itI = ((int)this.dEZ);
      paramaat.iub = ((int)this.dEX);
      this.dEZ = 0L;
      this.dEY = 0L;
      this.dEX = 0L;
      long l2 = localReportInfo4.endTime;
      paramaat.itO = 10102;
      if (!a(true, 0L, l1, l2, paramaat))
        return 0;
      if (localReportInfo4.errCode == 0);
      for (int i = 0; ; i = 1)
      {
        paramaat.itS = i;
        paramaat.iud = 1;
        paramaat.itP = hB(localReportInfo4.ip);
        paramaat.itQ = localReportInfo4.port;
        paramaat.itR = localReportInfo4.ipType;
        paramaat.isa = localReportInfo4.netType;
        paramaat.itT = 0;
        paramaat.eJz = localReportInfo4.errCode;
        paramaat.iue = ((int)localReportInfo4.netSignal);
        paramaat.iuf = this.dEU.iuf;
        paramaat.iug = this.dEU.iug;
        paramaat.iuk = localReportInfo4.expand1;
        paramaat.ium = hB(localReportInfo4.clientIp);
        return 1;
      }
    case 9999002:
      b localb2 = (b)paramObject;
      if (localb2 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report ESS_FOR_IPXX_READ_TICKET info null");
        return 0;
      }
      paramaat.itO = 9999002;
      paramaat.iui = localb2.host;
      return 1;
    case 9999001:
      b localb1 = (b)paramObject;
      if (localb1 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report ESS_FOR_IPXX_SAVE_TICKET info null");
        return 0;
      }
      paramaat.itO = 9999001;
      paramaat.iui = localb1.host;
      return 1;
    case 10103:
      MMNativeNetComm.ReportInfo localReportInfo3 = (MMNativeNetComm.ReportInfo)paramObject;
      if (localReportInfo3 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report build connect info null or nettype error");
        return 0;
      }
      if (!a(true, localReportInfo3.endTime - localReportInfo3.beginTime, localReportInfo3.beginTime, localReportInfo3.endTime, paramaat))
        return 0;
      paramaat.itO = 10103;
      paramaat.eJz = localReportInfo3.errCode;
      paramaat.iue = ((int)localReportInfo3.netSignal);
      paramaat.isa = localReportInfo3.netType;
      paramaat.ium = hB(localReportInfo3.clientIp);
      return 1;
    case 10104:
      MMNativeNetComm.ReportInfo localReportInfo2 = (MMNativeNetComm.ReportInfo)paramObject;
      if (localReportInfo2 == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report build connect info null or nettype error");
        return 0;
      }
      if (!a(true, localReportInfo2.endTime - localReportInfo2.beginTime, localReportInfo2.beginTime, localReportInfo2.endTime, paramaat))
        return 0;
      paramaat.itO = 10104;
      paramaat.iue = ((int)localReportInfo2.netSignal);
      paramaat.isa = localReportInfo2.netType;
      paramaat.ium = hB(localReportInfo2.clientIp);
      return 1;
    case -1:
      if ((MMNativeNetComm.ReportInfo)paramObject == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report build connect info null or nettype error");
        return 0;
      }
      paramaat.itO = -1;
      paramaat.itZ = (System.currentTimeMillis() / 1000L);
      paramaat.iua = (bp.Ds() / 1000L);
      paramaat.itU = ((int)bp.Dt());
      return 1;
    case -2:
      label1193: label1775: label2038: label2044: if ((MMNativeNetComm.ReportInfo)paramObject == null)
      {
        z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report build connect info null or nettype error");
        return 0;
      }
      label1928: label1934: paramaat.itO = -2;
      label2052: label2058: Context localContext = bk.getContext();
      label2569: if (localContext != null)
      {
        paramaat.isa = PlatformComm.C2Java.getStatisticsNetType();
        paramaat.itR = bc.bB(localContext);
        if (!bc.bP(localContext))
          break label3301;
      }
      label3301: for (paramaat.iue = ((int)c.CA()); ; paramaat.iue = ((int)c.Cy()))
        return 1;
    case -3:
    }
    MMNativeNetComm.ReportInfo localReportInfo1 = (MMNativeNetComm.ReportInfo)paramObject;
    if (localReportInfo1 == null)
    {
      z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "report build connect info null or nettype error");
      return 0;
    }
    if (!a(true, localReportInfo1.endTime - localReportInfo1.beginTime, localReportInfo1.beginTime, localReportInfo1.endTime, paramaat))
      return 0;
    paramaat.isa = PlatformComm.C2Java.getStatisticsNetType();
    paramaat.itO = -3;
    paramaat.iui = localReportInfo1.clientIp;
    paramaat.itP = hB(localReportInfo1.ip);
    return 1;
  }

  private static boolean a(boolean paramBoolean, long paramLong1, long paramLong2, long paramLong3, aat paramaat)
  {
    long l1 = paramLong3 - paramLong2;
    long l2 = ch.CM();
    if ((paramLong3 < 0L) || (paramLong2 < 0L) || (l1 < 0L) || (paramLong1 < 0L))
    {
      z.w("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "dkreport fixItemTimes beg:" + paramLong2 + " end:" + paramLong3 + " now:" + l2 + " t:" + l1 + " cost:" + paramLong1);
      return false;
    }
    paramaat.eJL = ((int)(l2 / 1000L));
    paramaat.iua = paramLong3;
    paramaat.itZ = paramLong2;
    if (paramBoolean)
      paramaat.itV = ((int)l1);
    while (true)
    {
      return true;
      paramaat.itU = ((int)Math.min(paramLong1, l1));
    }
  }

  private void ac(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.dEK = ch.CM();
      g.h(dEG + "wd.ini", "LastFile", this.dEK);
    }
    try
    {
      this.dEI = new RandomAccessFile(hA(this.dEK), "rw");
      if ((paramBoolean) && (this.dEI.length() != 0L))
      {
        z.e("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "already exist , clean up file:" + this.dEK);
        this.dEI.setLength(0L);
      }
      while (this.dEI.length() > 0L)
      {
        this.dEH.a(this.dEI);
        return;
        if ((!paramBoolean) && (this.dEI.length() < 160L))
        {
          z.e("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "length error , clean up file:" + this.dEK);
          this.dEI.setLength(0L);
        }
      }
    }
    catch (Exception localException)
    {
      if (this.dEI != null)
      {
        Ak();
        return;
        this.dEH.b(this.dEI);
      }
    }
  }

  static String hA(String paramString)
  {
    if (ch.jb(paramString))
      return dEG + "wd_" + ch.CM() + ".bin";
    return dEG + "wd_" + paramString + ".bin";
  }

  private static int hB(String paramString)
  {
    if (paramString.length() == 0)
      return 0;
    try
    {
      byte[] arrayOfByte = InetAddress.getByName(paramString).getAddress();
      int i = 0xFF & arrayOfByte[3] | 0xFF00 & arrayOfByte[2] << 8 | 0xFF0000 & arrayOfByte[1] << 16;
      int j = arrayOfByte[0];
      return i | 0xFF000000 & j << 24;
    }
    catch (UnknownHostException localUnknownHostException)
    {
    }
    return 0;
  }

  public final void Aj()
  {
    this.dEJ = g.a(dEG + "wd.ini", "NextReportTime", -1L);
    if (this.dEJ <= 0L)
      this.dEJ = (43200L + ch.CL());
    this.dEK = g.getValue(dEG + "wd.ini", "LastFile");
    z.d("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "readConfig: nextTime:" + this.dEJ + " file:" + this.dEK);
  }

  public final void a(int paramInt, String paramString, Object paramObject)
  {
    try
    {
      this.dEP.n(new n(this, paramInt, paramString, paramObject));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.l
 * JD-Core Version:    0.6.2
 */