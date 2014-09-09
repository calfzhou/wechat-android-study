package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Environment;
import android.os.RemoteException;
import android.os.StatFs;
import com.tencent.mm.a.c;
import com.tencent.mm.c.a.ef;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.network.ag;
import com.tencent.mm.network.n;
import com.tencent.mm.network.r;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.i;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.cn;
import com.tencent.mm.protocal.a.co;
import com.tencent.mm.protocal.a.cx;
import com.tencent.mm.protocal.a.pd;
import com.tencent.mm.protocal.a.pe;
import com.tencent.mm.protocal.a.tc;
import com.tencent.mm.protocal.a.te;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.l;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cm;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.q;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class bg
  implements com.tencent.mm.o.h
{
  private static bg dkK = null;
  private static boolean dkP = true;
  private static boolean dkQ = false;
  private static boolean dkR = false;
  private static boolean dkS = false;
  private static am dkX;
  private static String dkY = "NoResetUinStack";
  private final String djT;
  private final com.tencent.mm.o.aw dkL;
  private final ac dkM;
  private final com.tencent.mm.sdk.platformtools.am dkN;
  private final d dkO;
  private com.tencent.mm.compatible.audio.e dkT = null;
  private dv dkU = null;
  private dz dkV = null;
  private final int dkW = 1;
  private com.tencent.mm.o.g dkZ;
  private final b dkx;
  private final ap dky;
  private String dla = "";
  private Map dlb = new HashMap();
  private HashSet dlc = new HashSet();
  private ag dld = new bh(this);
  private dy dle = new dy();
  private cu dlf = new cu();
  private u dlg = new u();
  private dw dlh = new dw();
  private eb dli = new eb();
  private q dlj = new bq(this);
  private com.tencent.mm.storage.v dlk = new br(this);
  private com.tencent.mm.storage.v dll = new bi(this);

  private bg(ap paramap, d paramd, com.tencent.mm.o.ak paramak)
  {
    this.dky = paramap;
    this.dkO = paramd;
    this.dkU = new dv();
    this.dkV = new dz();
    this.djT = qM();
    this.dkN = new com.tencent.mm.sdk.platformtools.am();
    this.dkL = new com.tencent.mm.o.aw();
    if (ch.a((Integer)this.dkO.get(17)) != 0);
    for (boolean bool = true; ; bool = false)
    {
      dkP = bool;
      this.dkx = new b(this.djT, new bk(this, paramap));
      this.dkM = ac.a(paramak);
      this.dkM.a(this.dkN);
      return;
    }
  }

  public static boolean CD()
  {
    if (dkK == null)
      return false;
    return dkK.dkx.CD();
  }

  public static boolean CF()
  {
    return dkK == null;
  }

  public static void R(boolean paramBoolean)
  {
    dkQ = true;
  }

  public static void S(boolean paramBoolean)
  {
    dkS = paramBoolean;
  }

  public static void a(am paramam)
  {
    dkX = paramam;
  }

  public static void a(ap paramap, com.tencent.mm.o.ak paramak)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = com.tencent.mm.sdk.platformtools.k.aNb();
    arrayOfObject1[1] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
    z.i("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "initialize packageInfo:%s version:%x", arrayOfObject1);
    File localFile1 = new File(com.tencent.mm.storage.h.dgF);
    if (!localFile1.exists())
      localFile1.mkdirs();
    d locald = new d(com.tencent.mm.storage.h.dgF + "systemInfo.cfg");
    String str1 = (String)locald.get(258);
    if (str1 != null)
      com.tencent.mm.compatible.c.o.mT().set(258, str1);
    try
    {
      File localFile2 = Environment.getDataDirectory();
      StatFs localStatFs = new StatFs(localFile2.getPath());
      Object[] arrayOfObject5 = new Object[4];
      arrayOfObject5[0] = localFile2.getAbsolutePath();
      arrayOfObject5[1] = Integer.valueOf(localStatFs.getBlockSize());
      arrayOfObject5[2] = Integer.valueOf(localStatFs.getBlockCount());
      arrayOfObject5[3] = Integer.valueOf(localStatFs.getAvailableBlocks());
      z.i("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "CheckData path[%s] blocksize:%d blockcount:%d availcount:%d", arrayOfObject5);
      str2 = com.tencent.mm.storage.h.dgF + "alphahold.ini";
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
      arrayOfObject3[1] = Boolean.valueOf(com.tencent.mm.protocal.a.hrq);
      arrayOfObject3[2] = str2;
      z.i("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "initialize dkalpha client:%x  isapha:%b %s", arrayOfObject3);
      if ((com.tencent.mm.protocal.a.hrq) || (com.tencent.mm.protocal.a.hrr))
      {
        String str3 = com.tencent.mm.platformtools.g.getValue(str2, "noneedhold");
        if (!com.tencent.mm.protocal.a.hrn.equals(str3))
        {
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
          arrayOfObject4[1] = Boolean.valueOf(com.tencent.mm.protocal.a.hrq);
          z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkalpha version need  reset to DefaultAccount , hold it! client:%x  isapha:%b", arrayOfObject4);
          locald.set(1, Integer.valueOf(0));
          com.tencent.mm.platformtools.g.h(str2, "noneedhold", com.tencent.mm.protocal.a.hrn);
        }
        bg localbg = new bg(paramap, locald, paramak);
        dkK = localbg;
        i.a(localbg);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str2;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException.getMessage();
        z.e("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "check data size failed :%s", arrayOfObject2);
        continue;
        c.deleteFile(str2);
      }
    }
  }

  public static void a(ag paramag)
  {
    qN().dlc.add(paramag);
  }

  public static void a(com.tencent.mm.o.g paramg)
  {
    z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "cdndns setCdnUpdateListener");
    qN().dkZ = paramg;
  }

  public static void a(boolean paramBoolean, co paramco, tc paramtc, pe parampe)
  {
    Object[] arrayOfObject1 = new Object[9];
    arrayOfObject1[0] = Boolean.valueOf(paramBoolean);
    int i;
    int j;
    label38: int k;
    label54: int m;
    label70: int n;
    label86: int i1;
    label102: String str1;
    if (paramco == null)
    {
      i = -1;
      arrayOfObject1[1] = Integer.valueOf(i);
      if (paramco != null)
        break label208;
      j = -1;
      arrayOfObject1[2] = Integer.valueOf(j);
      if (parampe != null)
        break label217;
      k = -1;
      arrayOfObject1[3] = Integer.valueOf(k);
      if (paramtc != null)
        break label226;
      m = -1;
      arrayOfObject1[4] = Integer.valueOf(m);
      if (paramtc != null)
        break label235;
      n = -1;
      arrayOfObject1[5] = Integer.valueOf(n);
      if (paramtc != null)
        break label244;
      i1 = -1;
      arrayOfObject1[6] = Integer.valueOf(i1);
      if (paramtc != null)
        break label253;
      str1 = "null";
      label121: arrayOfObject1[7] = str1;
      if (paramtc != null)
        break label262;
    }
    label262: for (String str2 = "null"; ; str2 = paramtc.ino)
    {
      arrayOfObject1[8] = str2;
      z.i("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc updateMultiIDCInfo resetnewwork:%b iplist[l:%d s:%d] hostList[%d] noop[%d %d] typing[%d] port[%s] timeout[%s]", arrayOfObject1);
      if ((parampe != null) && (parampe.hQc != null) && (parampe.hQc.size() > 0))
        break label271;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = ch.aHN();
      z.f("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", arrayOfObject2);
      return;
      i = paramco.hSA;
      break;
      label208: j = paramco.hSB;
      break label38;
      label217: k = parampe.huF;
      break label54;
      label226: m = paramtc.inp;
      break label70;
      label235: n = paramtc.inq;
      break label86;
      label244: i1 = paramtc.inr;
      break label102;
      label253: str1 = paramtc.inn;
      break label121;
    }
    label271: if ((parampe == null) || (parampe.hQc == null) || (parampe.hQc.size() <= 0))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = ch.aHN();
      z.f("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", arrayOfObject3);
      return;
    }
    LinkedList localLinkedList1 = new LinkedList();
    localLinkedList1.clear();
    Iterator localIterator1 = paramco.hSE.iterator();
    while (localIterator1.hasNext())
    {
      cn localcn2 = (cn)localIterator1.next();
      String str8 = "";
      if (localcn2.hSz != null)
        str8 = localcn2.hSz.aFt();
      localLinkedList1.add(new com.tencent.mm.protocal.u(localcn2.type, localcn2.hSy.aFt(), localcn2.port, str8));
      Object[] arrayOfObject8 = new Object[3];
      arrayOfObject8[0] = Integer.valueOf(localcn2.type);
      arrayOfObject8[1] = Integer.valueOf(localcn2.port);
      arrayOfObject8[2] = localcn2.hSy.aFt();
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc updateMultiIDCInfo short type:%d port:%d ip:%s", arrayOfObject8);
    }
    String str3 = com.tencent.mm.protocal.u.aX(localLinkedList1);
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator2 = paramco.hSD.iterator();
    while (localIterator2.hasNext())
    {
      cn localcn1 = (cn)localIterator2.next();
      String str7 = "";
      if (localcn1.hSz != null)
        str7 = localcn1.hSz.aFt();
      localLinkedList2.add(new com.tencent.mm.protocal.u(localcn1.type, localcn1.hSy.aFt(), localcn1.port, str7));
      Object[] arrayOfObject7 = new Object[3];
      arrayOfObject7[0] = Integer.valueOf(localcn1.type);
      arrayOfObject7[1] = Integer.valueOf(localcn1.port);
      arrayOfObject7[2] = localcn1.hSy.aFt();
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc updateMultiIDCInfo long type:%d port:%d ip:%s", arrayOfObject7);
    }
    String str4 = com.tencent.mm.protocal.u.aX(localLinkedList2);
    z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc updateMultiIDCInfo builtin ip long[%s] short[%s]", new Object[] { str4, str3 });
    qN().dkO.set(2, str3);
    SharedPreferences localSharedPreferences = com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("system_config_prefs", 0);
    localSharedPreferences.edit().putString("builtin_short_ips", str3).commit();
    qN().dkO.set(3, str4);
    qN().dkO.set(6, paramtc.inn);
    qN().dkO.set(7, paramtc.ino);
    int i3;
    com.tencent.mm.protocal.v localv;
    String str5;
    String str6;
    String[] arrayOfString1;
    String[] arrayOfString2;
    int[] arrayOfInt;
    Iterator localIterator3;
    int i2;
    if (paramtc.inr != 0)
    {
      d locald = qN().dkO;
      if (paramtc.inr > 60)
      {
        i3 = 60;
        locald.set(35, Integer.valueOf(i3));
      }
    }
    else
    {
      com.tencent.mm.network.bp.b(paramtc.inp, paramtc.ins);
      localv = com.tencent.mm.protocal.u.bz(paramtc.inn, paramtc.ino);
      str5 = "";
      str6 = "";
      arrayOfString1 = new String[parampe.hQc.size()];
      arrayOfString2 = new String[parampe.hQc.size()];
      arrayOfInt = new int[parampe.hQc.size()];
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(parampe.huF);
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "hostlist.Count=%d", arrayOfObject4);
      localIterator3 = parampe.hQc.iterator();
      i2 = 0;
    }
    while (true)
    {
      if (!localIterator3.hasNext())
        break label1154;
      pd localpd = (pd)localIterator3.next();
      Object[] arrayOfObject6 = new Object[2];
      arrayOfObject6[0] = localpd.ifa;
      arrayOfObject6[1] = localpd.ifb;
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc host org:%s sub:%s", arrayOfObject6);
      arrayOfString1[i2] = localpd.ifa;
      arrayOfString2[i2] = localpd.ifb;
      arrayOfInt[i2] = localpd.ifc;
      i2++;
      if ((!ch.jb(localpd.ifa)) && (!ch.jb(localpd.ifb)))
      {
        if (localpd.ifa.equals("short.weixin.qq.com"))
        {
          qN().dkO.set(24, localpd.ifb);
          str6 = localpd.ifb;
          continue;
          i3 = paramtc.inr;
          break;
        }
        if (localpd.ifa.equals("long.weixin.qq.com"))
        {
          qN().dkO.set(25, localpd.ifb);
          str5 = localpd.ifb;
        }
        else if ((localpd.ifa.equals("support.weixin.qq.com")) && (!ch.jb(localpd.ifb)))
        {
          localSharedPreferences.edit().putString("support.weixin.qq.com", localpd.ifb).commit();
        }
      }
    }
    label1154: if (arrayOfString1.length > 0)
    {
      if (i.sZ().rg().rk() != null)
        break label1337;
      z.e("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "getDispatcher return null!!!");
    }
    while (true)
    {
      Object[] arrayOfObject5 = new Object[3];
      arrayOfObject5[0] = Boolean.valueOf(paramBoolean);
      arrayOfObject5[1] = str6;
      arrayOfObject5[2] = str5;
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc updateMultiIDCInfo resetnetwork:%b RESULT host s:%s l:%s", arrayOfObject5);
      if (!ch.jb(str5))
        qN().dkO.set(25, str5);
      if (!ch.jb(str6))
        qN().dkO.set(24, str6);
      if ((i.sZ() == null) || (i.sZ().rg() == null) || (i.sZ().rg().rk() == null))
        break;
      i.sZ().rg().rk().a(paramBoolean, str3, str4, localv.aGS(), localv.aGT(), localv.aGU(), localv.aGZ(), str6, str5);
      return;
      label1337: i.sZ().rg().rk().setHostInfo(arrayOfString1, arrayOfString2, arrayOfInt);
    }
  }

  public static boolean a(cx paramcx1, cx paramcx2, cx paramcx3)
  {
    com.tencent.mm.sdk.platformtools.am.h(new bj(paramcx1, paramcx2, paramcx3));
    return true;
  }

  public static void b(b paramb, boolean paramBoolean)
  {
    if (!paramBoolean);
    Cursor localCursor;
    do
    {
      return;
      z.i("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "start time check version upgrade dbUpgrateVersionToDo");
      paramb.oV().zH("qqmail");
      localCursor = qW().oV().zz("@t.qq.com");
    }
    while (localCursor == null);
    if (localCursor.moveToFirst())
      if (!localCursor.isAfterLast())
      {
        com.tencent.mm.storage.ar localar1 = new com.tencent.mm.storage.ar();
        localar1.b(localCursor);
        com.tencent.mm.storage.ar localar2 = qW().oV().q(localar1.kt(), localar1.kl());
        z.d("!32@/B4Tb64lLpLj7S4izLo0fC/WdDBM+++1", "msg.getMsgSvrId() " + localar2.kl());
        if (localar2.kl() > 0L);
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            qW().oV().y(localar1);
          localCursor.moveToNext();
          break;
        }
      }
    localCursor.close();
  }

  public static void b(ag paramag)
  {
    qN().dlc.remove(paramag);
  }

  public static void b(r paramr)
  {
    z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "setting up remote dispatcher " + paramr);
    try
    {
      if (paramr.tF() != null)
        paramr.tF().c(qN().dld);
      label49: paramr.a(new bl());
      n localn = paramr.tE();
      if (localn == null)
      {
        z.f("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "accInfo is null, it would assert before!!!");
        qN().dkM.tz();
      }
      b localb;
      label377: label508: 
      do
      {
        return;
        com.tencent.mm.sdk.b.b.a(new bm());
        String str1 = "setAutoAuth, getSysCfg() is null, stack = " + ch.aHN();
        boolean bool1;
        boolean bool2;
        String str9;
        if (qN().dkO != null)
        {
          bool1 = true;
          Assert.assertTrue(str1, bool1);
          String str2 = (String)qN().dkO.get(2);
          String str3 = (String)qN().dkO.get(3);
          String str4 = (String)qN().dkO.get(6);
          String str5 = (String)qN().dkO.get(7);
          String str6 = (String)qN().dkO.get(25);
          String str7 = (String)qN().dkO.get(24);
          com.tencent.mm.protocal.v localv = com.tencent.mm.protocal.u.bz(str4, str5);
          z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc host[s:%s l:%s] builtin[s:%s l:%s] ports[%s] timeout[%s]", new Object[] { str7, str6, str2, str3, str4, str5 });
          Assert.assertTrue("setAutoAuth, autoAuth is null, stack = " + ch.aHN(), true);
          paramr.a(false, str2, str3, localv.aGS(), localv.aGT(), localv.aGU(), localv.aGZ(), str7, str6);
          localb = qW();
          String str8 = "setAutoAuth, accStg is null, stack = " + ch.aHN();
          if (localb == null)
            break label496;
          bool2 = true;
          Assert.assertTrue(str8, bool2);
          str9 = "setAutoAuth, accInfo is null, stack = " + ch.aHN();
          if (localn == null)
            break label502;
        }
        for (boolean bool3 = true; ; bool3 = false)
        {
          Assert.assertTrue(str9, bool3);
          if ((oE()) && (!CD()))
            break label508;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Boolean.valueOf(oE());
          arrayOfObject[1] = Boolean.valueOf(CD());
          z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "need to clear acc info and maybe stop networking accHasReady():%b accInitializing():%b", arrayOfObject);
          localn.reset();
          paramr.reset();
          qN().dkM.b(paramr);
          return;
          bool1 = false;
          break;
          bool2 = false;
          break label377;
        }
        qN().dkM.b(paramr);
        com.tencent.mm.network.k.a(new bn(paramr));
      }
      while (localb.oD() == localn.oD());
      label496: label502: z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "update acc info with acc stg: uin =" + localn.oD());
      String str10 = "setAutoAuth, getConfigStg() is null, stack = " + ch.aHN();
      if (qW().oQ() != null);
      for (boolean bool4 = true; ; bool4 = false)
      {
        Assert.assertTrue(str10, bool4);
        String str11 = (String)qW().oQ().get(2);
        String str12 = (String)qW().oQ().get(3);
        String str13 = (String)qW().oQ().get(19);
        localn.l("", qW().oD());
        localn.e(str11, str12, str13);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      break label49;
    }
  }

  public static void cL(int paramInt)
  {
    b localb = qN().dkx;
    if (localb != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("MMCore has not been initialize ?", bool);
      try
      {
        if (oE())
          return;
        localb.g(null, paramInt);
        return;
      }
      finally
      {
      }
    }
  }

  public static void ef(String paramString)
  {
    dkY = paramString;
  }

  public static int eg(String paramString)
  {
    int i;
    int j;
    if (qN().dlb.get(paramString) == null)
    {
      i = 0;
      j = (int)ch.CL();
      if (i != 0)
        break label67;
      qN().dlb.put(paramString, Integer.valueOf(j));
    }
    label67: 
    do
    {
      return i;
      i = ((Integer)qN().dlb.get(paramString)).intValue();
      break;
      i = j - i;
      qN().dlb.put(paramString, Integer.valueOf(j));
    }
    while (i >= 0);
    return 0;
  }

  public static void eh(String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = com.tencent.mm.a.k.getString(qW().oD());
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = ch.aHN();
    z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "logoutAccount uin:%s info:%s stack:%s", arrayOfObject);
    dkY = ch.aHN().toString() + paramString;
    qN().dkL.E(qW().oD());
    release();
    qN().dkO.set(1, Integer.valueOf(0));
    dkQ = false;
    dkR = false;
    dkS = false;
  }

  public static ar ig()
  {
    return qN().dky.ig();
  }

  public static an ii()
  {
    return qN().dky.ii();
  }

  public static aj ij()
  {
    return qN().dky.ij();
  }

  public static boolean oE()
  {
    if (dkK == null)
      return false;
    return (dkK.dkx.oE()) && (dkK.dkx.oD() == ch.a((Integer)qN().dkO.get(1)));
  }

  public static String qE()
  {
    return dkY;
  }

  public static dv qF()
  {
    return qN().dkU;
  }

  public static dz qG()
  {
    return qN().dkV;
  }

  public static am qH()
  {
    return dkX;
  }

  public static boolean qI()
  {
    return dkR;
  }

  public static void qJ()
  {
    dkR = false;
  }

  public static boolean qK()
  {
    return dkS;
  }

  public static String qL()
  {
    try
    {
      String str = ch.ja(qN().dkM.rk().tE().qL());
      return str;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "get session key error, %s", arrayOfObject);
    }
    return "";
  }

  private static String qM()
  {
    String str = com.tencent.mm.storage.h.dgF;
    z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "summer buildSysPath sysPath: " + str + " SDCARD_ROOT: " + com.tencent.mm.compatible.g.h.dOH);
    File localFile5;
    if ((new File(com.tencent.mm.compatible.g.h.dOH).exists()) && (j.nI()))
    {
      if (c.ae(com.tencent.mm.compatible.g.h.dOI))
        str = com.tencent.mm.compatible.g.h.dOI;
      File localFile2 = new File(com.tencent.mm.compatible.g.h.dOL);
      if (!localFile2.exists())
        localFile2.mkdirs();
      File localFile3 = new File(com.tencent.mm.compatible.g.h.dOM);
      if (!localFile3.exists())
        localFile3.mkdirs();
      File localFile4 = new File(com.tencent.mm.compatible.g.h.dON);
      if (!localFile4.exists())
        localFile4.mkdirs();
      localFile5 = new File(com.tencent.mm.compatible.g.h.dOM + ".nomedia");
      if (localFile5.exists());
    }
    try
    {
      localFile5.createNewFile();
      label193: File localFile1 = new File(str);
      if (!localFile1.exists())
        localFile1.mkdirs();
      return str;
    }
    catch (IOException localIOException)
    {
      break label193;
    }
  }

  private static bg qN()
  {
    Assert.assertNotNull("MMCore not initialized by MMApplication", dkK);
    return dkK;
  }

  public static com.tencent.mm.o.aw qO()
  {
    return qN().dkL;
  }

  public static d qP()
  {
    return qN().dkO;
  }

  public static com.tencent.mm.sdk.platformtools.am qQ()
  {
    return qN().dkN;
  }

  public static dw qR()
  {
    return qN().dlh;
  }

  public static String qS()
  {
    if (ch.jb(qN().dla))
      qT();
    return qN().dla;
  }

  public static void qT()
  {
    qN().dla = (com.tencent.mm.compatible.c.v.nh() + "_" + System.currentTimeMillis());
    qN().dlb.clear();
  }

  public static void qU()
  {
    b localb = qN().dkx;
    boolean bool = false;
    if (localb != null)
      bool = true;
    Assert.assertTrue("MMCore has not been initialize ?", bool);
    try
    {
      localb.g(null, 0);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void qV()
  {
    boolean bool = true;
    b localb = qN().dkx;
    if (localb != null);
    while (true)
    {
      Assert.assertTrue("MMCore has not been initialize ?", bool);
      try
      {
        String str = qM();
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(localb.oD());
        arrayOfObject[1] = localb.oF();
        arrayOfObject[2] = str;
        z.i("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "remount begin uin:%d oldpath:[%s] newPath:[%s]", arrayOfObject);
        if (!ch.jb(str))
        {
          if (str.equalsIgnoreCase(localb.oF()))
            return;
          localb.g(str, localb.oD());
          com.tencent.mm.c.a.o localo = new com.tencent.mm.c.a.o();
          com.tencent.mm.sdk.c.a.aGB().g(localo);
        }
        return;
      }
      finally
      {
      }
      bool = false;
    }
  }

  public static b qW()
  {
    boolean bool = true;
    b localb = qN().dkx;
    if (localb != null);
    while (true)
    {
      Assert.assertTrue("MMCore has not been initialize ?", bool);
      if (!oE())
        break;
      return localb;
      bool = false;
    }
    try
    {
      if (oE())
        return localb;
      d locald = qN().dkO;
      Integer localInteger = (Integer)locald.get(1);
      if ((localInteger != null) && (localInteger.intValue() != 0))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = ch.aHN();
        z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "auto set up account storage stack: %s", arrayOfObject);
        localb.g(null, localInteger.intValue());
        if (ch.ja((String)localb.oQ().get(2)).length() <= 0)
        {
          z.e("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "username of acc stg not set: uin=" + localInteger);
          localb.reset();
          locald.set(1, Integer.valueOf(0));
          dkY = ch.aHN().toString();
          com.tencent.mm.sdk.platformtools.am.h(new bo());
        }
      }
      return localb;
    }
    finally
    {
    }
  }

  public static ac qX()
  {
    return qN().dkM;
  }

  public static com.tencent.mm.compatible.audio.e qY()
  {
    if (qN().dkT == null)
      qN().dkT = new com.tencent.mm.compatible.audio.e(com.tencent.mm.sdk.platformtools.ak.getContext());
    return qN().dkT;
  }

  public static boolean qZ()
  {
    if ((qN().dkx == null) || (oE()))
      return false;
    return ch.a((Integer)qN().dkO.get(1)) != 0;
  }

  public static boolean ra()
  {
    if (dkK == null)
      return false;
    return ch.a((Integer)qN().dkO.get(1)) != 0;
  }

  public static boolean rb()
  {
    return qW() != null;
  }

  public static boolean rc()
  {
    if ((qN().dkx == null) || (oE()))
      return false;
    return ch.a((Integer)qN().dkO.get(1)) != 0;
  }

  public static boolean rd()
  {
    Object[] arrayOfObject;
    if (dkP)
    {
      arrayOfObject = new Object[1];
      if (qN().dkx == null)
        break label50;
    }
    label50: for (String str = com.tencent.mm.a.k.getString(qN().dkx.oD()); ; str = "-1")
    {
      arrayOfObject[0] = str;
      z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "account holded :%s", arrayOfObject);
      return dkP;
    }
  }

  public static void re()
  {
    Object[] arrayOfObject = new Object[2];
    if (qN().dkx != null);
    for (String str = com.tencent.mm.a.k.getString(qN().dkx.oD()); ; str = "-1")
    {
      arrayOfObject[0] = str;
      arrayOfObject[1] = ch.aHN();
      z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", " HOLD ACCOUNT! uin:%s stack:%s", arrayOfObject);
      dkP = true;
      qN().dkO.set(17, Integer.valueOf(1));
      return;
    }
  }

  public static void release()
  {
    Object[] arrayOfObject = new Object[1];
    if (qN().dkx != null);
    for (String str = com.tencent.mm.a.k.getString(qN().dkx.oD()); ; str = "-1")
    {
      arrayOfObject[0] = str;
      z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "release uin:%s ", arrayOfObject);
      if (qN().dkM != null)
        qN().dkM.reset();
      if (qN().dkN != null)
        qN().dkN.a(new bp());
      return;
    }
  }

  public static void rf()
  {
    Object[] arrayOfObject = new Object[1];
    if (qN().dkx != null);
    for (String str = com.tencent.mm.a.k.getString(qN().dkx.oD()); ; str = "-1")
    {
      arrayOfObject[0] = str;
      z.w("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", " UN HOLD ACCOUNT! uin:%s", arrayOfObject);
      dkP = false;
      qN().dkO.set(17, Integer.valueOf(0));
      return;
    }
  }

  public final void a(l paraml, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "onAutoAuthEnd [%d,%d]", arrayOfObject1);
    if (!oE())
    {
      z.e("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "onAutoAuthEnd but account not read");
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -301))
    {
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkidc onAutoAuthEnd RedirectIDC");
      a(true, paraml.hNr.hRm, paraml.hNr.hRn, paraml.hNr.hRl);
      return;
    }
    com.tencent.mm.a.k localk = new com.tencent.mm.a.k(paraml.hNr.imL);
    if ((paramInt1 == 4) && (paramInt2 == -105))
    {
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkwt onAutoAuthEnd INVALID LOGINBUFF  set use to md5");
      com.tencent.mm.o.aw.m(x.pG(), 2);
      qN().dkL.E(localk.longValue());
      return;
    }
    boolean bool1 = qN().dkL.a(localk.longValue(), ai.a(paraml.hNr.iod));
    Object[] arrayOfObject2 = new Object[4];
    arrayOfObject2[0] = x.pG();
    int i;
    boolean bool2;
    label402: com.tencent.mm.storage.e locale;
    if (paraml.hNr.iod == null)
    {
      i = -1;
      arrayOfObject2[1] = Integer.valueOf(i);
      arrayOfObject2[2] = Boolean.valueOf(bool1);
      arrayOfObject2[3] = Integer.valueOf(paraml.hNr.ioc);
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkwt onAutoAuthEnd username:%s wtresp:%d parseWtResp:%b nextAuthType:%d ", arrayOfObject2);
      com.tencent.mm.o.aw.m(x.pG(), paraml.hNr.ioc);
      cL(paraml.hNr.hQv);
      qW().oR().zZ(paraml.hNr.inY);
      qW().a(paraml);
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkwt onAutoAuthEnd succ . UNset manual auth scene for update");
      qW().oQ().set(256, Boolean.valueOf(false));
      if (paraml.hNr.imL != 0)
        qW().oY().ao(new com.tencent.mm.a.k(paraml.hNr.imL) + "@qqim", 3);
      com.tencent.mm.storage.cl localcl = qW().oY();
      String str = paraml.hNr.inK.getString();
      if (paraml.hNr.inL != 1)
        break label625;
      bool2 = true;
      localcl.L(str, bool2);
      a(false, paraml.hNr.hRm, paraml.hNr.hRn, paraml.hNr.hRl);
      qW().oQ().set(-1535680990, paraml.hNr.ieG);
      locale = qW().oQ();
      if (paraml.hNr.ioa == 0)
        break label631;
    }
    label625: label631: for (int j = 1; ; j = 0)
    {
      locale.set(57, Integer.valueOf(j));
      qN().dkO.set(32, "");
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = paraml.hNr.inC;
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkrsa setautoauthtick:%s", arrayOfObject3);
      a(paraml.hNr.ibf, paraml.hNr.ibg, paraml.hNr.ibh);
      com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putInt("default_uin", paraml.hNr.hQv).commit();
      ef localef = new ef();
      com.tencent.mm.sdk.c.a.aGB().g(localef);
      return;
      i = paraml.hNr.iod.aLK();
      break;
      bool2 = false;
      break label402;
    }
  }

  public final ac rg()
  {
    return this.dkM;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bg
 * JD-Core Version:    0.6.2
 */