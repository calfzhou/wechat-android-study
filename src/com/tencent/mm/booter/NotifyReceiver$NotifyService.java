package com.tencent.mm.booter;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.mm.a.j;
import com.tencent.mm.ab.i;
import com.tencent.mm.ab.k;
import com.tencent.mm.ab.n;
import com.tencent.mm.ak.m;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.c.a.dg;
import com.tencent.mm.c.a.dp;
import com.tencent.mm.c.a.dr;
import com.tencent.mm.c.a.gk;
import com.tencent.mm.c.a.gl;
import com.tencent.mm.c.a.kq;
import com.tencent.mm.c.a.lm;
import com.tencent.mm.c.a.lo;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.jni.platformcomm.WakerLock;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.av;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.model.app.bb;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.a.to;
import com.tencent.mm.protocal.ar;
import com.tencent.mm.protocal.bd;
import com.tencent.mm.protocal.bj;
import com.tencent.mm.protocal.o;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.storage.e;

public class NotifyReceiver$NotifyService extends Service
{
  public final int diN = -1212;

  private void a(Intent paramIntent)
  {
    int i = 1;
    if (paramIntent == null)
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "receiveImp receiveIntent == null");
    label405: byte[] arrayOfByte2;
    label1105: label1130: label1142: 
    do
    {
      do
      {
        String str1;
        long l1;
        while (true)
        {
          return;
          boolean bool1 = WorkerProfile.jdMethod_if().H(false);
          if (bg.CF())
          {
            Object[] arrayOfObject5 = new Object[i];
            arrayOfObject5[0] = Boolean.valueOf(bool1);
            com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "mmcore is null, appcreate %b", arrayOfObject5);
            return;
          }
          int j = paramIntent.getIntExtra("notify_option_type", 0);
          if (j == 0)
          {
            com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "receiveImp invalid opcode.");
            return;
          }
          if (bg.qZ())
            bg.rb();
          if ((!bg.oE()) || (bg.rd()))
          {
            Object[] arrayOfObject1 = new Object[3];
            arrayOfObject1[0] = Boolean.valueOf(bg.oE());
            arrayOfObject1[i] = Boolean.valueOf(bg.rd());
            arrayOfObject1[2] = Integer.valueOf(j);
            com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "receiveImp hasSetuin:%b  isHold:%b  opcode:%d", arrayOfObject1);
            return;
          }
          if (bg.qX().rk() == null)
          {
            Object[] arrayOfObject4 = new Object[i];
            arrayOfObject4[0] = Integer.valueOf(j);
            com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "receiveImp  opcode:%d  getDispatcher == null", arrayOfObject4);
            bg.qX().W(i);
          }
          switch (j)
          {
          case 99:
          default:
            com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "invald opCode:" + j);
            return;
          case 1:
            u(ak.getContext());
            Context localContext = ak.getContext();
            com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "dealWithLooper");
            if ((!bg.oE()) || (bg.rd()))
            {
              com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "receiveImp hasSetuin:" + bg.oE() + " isHold:" + bg.rd());
              return;
            }
            if (!bg.qX().tv())
            {
              if ((localContext != null) && (!bc.bN(localContext)))
                if (i != 0)
                  break label405;
            }
            else
              bg.qX().d(new k(3));
            while (true)
            {
              bm.BF().run();
              m.AM().run();
              com.tencent.mm.y.ap.ye().run();
              bf.azb().run();
              com.tencent.mm.plugin.voicereminder.a.f.arH().run();
              a.aGB().g(new kq());
              return;
              i = 0;
              break;
              bg.qX().d(new i());
            }
          case 2:
            u(ak.getContext());
            com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "dealWithNotify");
            int m = paramIntent.getIntExtra("notify_respType", 0);
            arrayOfByte2 = paramIntent.getByteArrayExtra("notify_respBuf");
            str1 = paramIntent.getStringExtra("notify_skey");
            l1 = paramIntent.getLongExtra("notfiy_recv_time", -1L);
            switch (m)
            {
            default:
              return;
            case 10:
              com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "on direct send notify");
              y localy = new y();
              localy.fo(com.tencent.mm.compatible.c.v.nh());
              av localav = new av(localy, 10);
              try
              {
                if (localav.a(10, arrayOfByte2, null))
                {
                  bg.qX().a(0, 0, "", new com.tencent.mm.modelsimple.t(localy));
                  return;
                }
              }
              catch (RemoteException localRemoteException)
              {
                return;
              }
            case 268369921:
            case 38:
            case 1000000205:
            case 39:
            case 170:
            case 174:
            case 192:
            case 268369923:
            case 241:
            }
            break;
          case 3:
          }
        }
        if (com.tencent.mm.platformtools.ap.jb(str1))
        {
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "dkpush dealWithNotify session:" + str1);
          return;
        }
        if ((com.tencent.mm.platformtools.ap.B(arrayOfByte2)) || (arrayOfByte2.length <= 8))
        {
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "dkpush dealWithNotify respBuf error ");
          return;
        }
        int i1 = j.b(arrayOfByte2, 0);
        int i2 = j.b(arrayOfByte2, 4);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "dkpush: flag:" + i1 + " bufLen:" + i2 + " dump:" + com.tencent.mm.platformtools.ap.A(arrayOfByte2));
        if (i2 != -8 + arrayOfByte2.length)
        {
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "dkpush: respBuf length error len:" + arrayOfByte2.length);
          return;
        }
        byte[] arrayOfByte5 = new byte[i2];
        System.arraycopy(arrayOfByte2, 8, arrayOfByte5, 0, i2);
        ar localar = new ar();
        PByteArray localPByteArray1 = new PByteArray();
        PByteArray localPByteArray2 = new PByteArray();
        PInt localPInt = new PInt();
        try
        {
          if (!MMProtocalJni.unpack(localPByteArray2, arrayOfByte5, str1.getBytes(), localPByteArray1, localPInt))
          {
            com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "unpack push resp failed");
            return;
          }
        }
        catch (Exception localException2)
        {
          Object[] arrayOfObject3 = new Object[i];
          arrayOfObject3[0] = localException2;
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "unpack push resp failed: %s", arrayOfObject3);
          return;
        }
        if (localPInt.value == -13)
        {
          localar.dj(localPInt.value);
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "unpack push resp failed session timeout");
          return;
        }
        int i3 = localar.r(localPByteArray2.value);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "bufToResp using protobuf ok");
        localar.dj(i3);
        localar.cI(arrayOfByte5.length);
        byte[] arrayOfByte6 = com.tencent.mm.platformtools.ap.jg(com.tencent.mm.platformtools.ap.ja((String)bg.qW().oQ().get(8195)));
        byte[] arrayOfByte7 = ai.a(localar.hNM.hTq);
        if ((com.tencent.mm.platformtools.ap.B(arrayOfByte7)) || (!bj.g(arrayOfByte6, arrayOfByte7)))
        {
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "compareKeybuf syncKey failed");
          return;
        }
        bg.qX().d(new k(localar, i1, l1));
        return;
        StringBuilder localStringBuilder2 = new StringBuilder("dkpush on sync notify, notify=");
        boolean bool2;
        long l2;
        if (arrayOfByte2 != null)
        {
          bool2 = i;
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", bool2);
          if (arrayOfByte2 != null)
            break label1130;
          l2 = 7L;
          if (arrayOfByte2 != null)
            break label1142;
        }
        for (int n = 3; ; n = 7)
        {
          n.a(l2, n, "");
          return;
          bool2 = false;
          break;
          l2 = j.b(arrayOfByte2, 0);
          break label1105;
        }
        StringBuilder localStringBuilder1 = new StringBuilder("oreh on newsynccheck2 notify, notify=");
        if (arrayOfByte2 != null);
        while (true)
        {
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", i);
          bd localbd = new bd();
          try
          {
            localbd.r(arrayOfByte2);
            n.a(localbd.aHd(), 7, localbd.aHl());
            return;
          }
          catch (Exception localException1)
          {
            return;
          }
          i = 0;
        }
        bg.qX().d(new i());
        return;
        lm locallm1 = new lm();
        locallm1.cOG.cOI = i;
        a.aGB().g(locallm1);
        String str3 = locallm1.cOH.cOK;
        if (!com.tencent.mm.platformtools.ap.jb(str3))
        {
          com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "voipinvite, exit talkroom first: " + str3);
          lm locallm2 = new lm();
          locallm2.cOG.cOJ = i;
          a.aGB().g(locallm2);
        }
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "dealWithNotify case MMFunc_VoipInvite, will launch voipUI");
        mx localmx2 = new mx();
        localmx2.cPr.cEg = 3;
        localmx2.cPr.cPt = arrayOfByte2;
        a.aGB().g(localmx2);
        return;
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "dealWithNotify MMFunc_VoipSync do VoipSync");
        mx localmx1 = new mx();
        localmx1.cPr.cEg = 6;
        localmx1.cPr.cPt = arrayOfByte2;
        a.aGB().g(localmx1);
        return;
        dg localdg = new dg();
        localdg.cJv.cJw = arrayOfByte2;
        a.aGB().g(localdg);
        return;
      }
      while (com.tencent.mm.platformtools.ap.B(arrayOfByte2));
      String str2 = new String(arrayOfByte2);
      com.tencent.mm.c.a.t localt = new com.tencent.mm.c.a.t();
      localt.cHt.type = 3;
      localt.cHt.cHv = str2;
      a.aGB().g(localt);
      return;
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "jacks do voice notify UI");
    }
    while (arrayOfByte2.length < 8);
    byte[] arrayOfByte3 = new byte[4];
    byte[] arrayOfByte4 = new byte[4];
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, 4);
    System.arraycopy(arrayOfByte2, 4, arrayOfByte4, 0, 4);
    gk localgk = new gk();
    localgk.cLA.cLB = j.b(arrayOfByte3, 0);
    localgk.cLA.cLC = j.b(arrayOfByte4, 0);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(localgk.cLA.cLB);
    arrayOfObject2[i] = Integer.valueOf(localgk.cLA.cLC);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "notifyId: %d, sequence: %d", arrayOfObject2);
    a.aGB().g(localgk);
    return;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "handleCommand, shoot netscene action");
    int k = paramIntent.getIntExtra("remote_netscene_funcid_key", 0);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "edw onReceive, funcId = " + k);
    if (k == 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "edw onReceive fail, funcId is 0");
      return;
    }
    byte[] arrayOfByte1 = paramIntent.getByteArrayExtra("remote_netscene_req_buffer_key");
    if (com.tencent.mm.platformtools.ap.B(arrayOfByte1))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "onReceive, reqBuffer is null");
      return;
    }
    dp localdp = new dp();
    localdp.cER.cET = arrayOfByte1;
    switch (k)
    {
    default:
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "onReceive fail, unknown type = " + k);
      return;
    case 444:
      localdp.cER.cDf = 0;
    case 445:
    case 441:
    case 447:
    case 440:
    case 450:
    case 446:
    case 516:
    }
    while (true)
    {
      a.aGB().g(localdp);
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "edw onReceive, ret = " + localdp.cES.cCM);
      return;
      localdp.cER.cDf = i;
      continue;
      localdp.cER.cDf = 2;
      continue;
      localdp.cER.cDf = 3;
      continue;
      localdp.cER.cDf = 4;
      continue;
      localdp.cER.cDf = 5;
      continue;
      localdp.cER.cDf = 6;
      continue;
      localdp.cER.cDf = 7;
    }
  }

  private static void u(Context paramContext)
  {
    NotifyReceiver.a(new WakerLock(paramContext));
    NotifyReceiver.ly().lock(14000L);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    if (Build.VERSION.SDK_INT < 18)
      startForeground(-1212, new Notification());
    super.onCreate();
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    a(paramIntent);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "NotifyService onStartCommand flags :" + paramInt1 + "startId :" + paramInt2 + " intent " + paramIntent);
    a(paramIntent);
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver.NotifyService
 * JD-Core Version:    0.6.2
 */