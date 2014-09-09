package com.tencent.mm.ak;

import com.tencent.mm.compatible.g.h;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.o.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;

public final class v
{
  public static boolean AQ(String paramString)
  {
    q localq = new q();
    localq.setStatus(112);
    localq.V(ch.CL());
    localq.W(ch.CL());
    localq.hT(paramString);
    localq.db(3328);
    if (!d(localq))
      return false;
    m.AM().run();
    return true;
  }

  public static boolean Cu(String paramString)
  {
    q localq = ij(paramString);
    if (localq == null)
      return false;
    if (localq.AQ() < localq.AR())
      localq.setStatus(103);
    while (true)
    {
      localq.q(ch.CL());
      localq.V(ch.CL());
      localq.W(ch.CL());
      localq.db(3840);
      if (!d(localq))
        break;
      m.AM().run();
      return true;
      localq.setStatus(104);
    }
  }

  public static boolean a(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    return a(paramString1, paramInt, paramString2, paramString3, 0, "", 43);
  }

  public static boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, int paramInt3)
  {
    q localq = new q();
    localq.hT(paramString1);
    localq.eJ(paramInt1);
    localq.setUser(paramString2);
    localq.hU((String)f.c(2, ""));
    localq.q(ch.CL());
    localq.V(ch.CL());
    localq.hW(paramString4);
    localq.hV(paramString3);
    if (!ch.jb(paramString3))
      localq.eL(1);
    if (paramInt2 > 0)
      localq.eL(1);
    if (62 == paramInt3)
      localq.ep(3);
    int i;
    while (true)
    {
      i = r.id(m.AL().ib(paramString1));
      if (i > 0)
        break;
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "get Video size failed :" + paramString1);
      return false;
      if (paramInt2 > 0)
        localq.ep(2);
      else
        localq.ep(1);
    }
    localq.cZ(i);
    String str = m.AL().ic(paramString1);
    int j = r.id(str);
    if (j <= 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "get Thumb size failed :" + str + " size:" + j);
      return false;
    }
    localq.eI(j);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "init record file:" + paramString1 + " thumbsize:" + localq.AR() + " videosize:" + localq.sp() + " msgType:" + paramInt3);
    localq.setStatus(102);
    ar localar = new ar();
    localar.bJ(localq.getUser());
    localar.setType(paramInt3);
    localar.bv(1);
    localar.bK(paramString1);
    localar.setStatus(1);
    localar.q(bw.eo(localq.getUser()));
    localq.eK((int)bw.e(localar));
    return m.AL().a(localq);
  }

  public static void c(q paramq)
  {
    if (paramq == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "video info is null");
      return;
    }
    ar localar = new ar();
    localar.bJ(paramq.getUser());
    localar.p(paramq.kl());
    localar.setStatus(2);
    localar.setContent(o.a(paramq.AN(), paramq.AU(), false));
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "[oneliang][updateWriteFinMsgInfo]");
    bg.qW().oV().a(paramq.AV(), localar);
  }

  public static boolean d(q paramq)
  {
    if (paramq == null);
    while (((paramq.getFileName() == null) || (paramq.getFileName().length() <= 0)) && (paramq.ss() == -1))
      return false;
    return m.AL().b(paramq);
  }

  public static int e(q paramq)
  {
    if (paramq.sp() == 0)
      return 0;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "cdntra getDownloadProgress :" + paramq.AO() + " " + paramq.sp());
    return 100 * paramq.AP() / paramq.sp();
  }

  public static boolean ie(String paramString)
  {
    if (paramString == null);
    q localq;
    do
    {
      return false;
      localq = ij(paramString);
    }
    while ((localq == null) || (localq.AW() >= 2500));
    localq.dP(1 + localq.AW());
    localq.db(16384);
    return d(localq);
  }

  public static boolean jdMethod_if(String paramString)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = ch.aHN();
    com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "setError file:%s stack:[%s]", arrayOfObject1);
    if (paramString == null)
      return false;
    q localq = ij(paramString);
    if (localq == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "Set error failed file:" + paramString);
      return false;
    }
    localq.setStatus(198);
    localq.V(System.currentTimeMillis() / 1000L);
    localq.db(1280);
    boolean bool = d(localq);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "setError file:" + paramString + " msgid:" + localq.AV() + " old stat:" + localq.getStatus());
    if ((localq == null) || (localq.AV() == 0))
      return bool;
    int i = bg.qW().oV().w(localq.getUser(), localq.AV());
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(i);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "set error, msg type %d", arrayOfObject2);
    if (10000 == i)
      return bool;
    ar localar = new ar();
    localar.o(localq.AV());
    localar.setStatus(5);
    localar.bJ(localq.getUser());
    localar.setContent(o.a(localq.AN(), -1L, true));
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "[oneliang][setError]");
    bg.qW().oV().a(localar.kk(), localar);
    return bool;
  }

  public static boolean ig(String paramString)
  {
    q localq = ij(paramString);
    if (localq == null)
      return false;
    ar localar = bg.qW().oV().cV(localq.AV());
    localar.setContent(o.a(localq.AN(), localq.AU(), false));
    localar.setStatus(2);
    bg.qW().oV().a(localq.AV(), localar);
    localq.setStatus(197);
    localq.V(ch.CL());
    localq.db(1280);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "[oneliang][setBlack]");
    return d(localq);
  }

  public static int ih(String paramString)
  {
    q localq = ij(paramString);
    if (localq == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " getinfo failed: " + paramString);
      return 0 - k.nJ();
    }
    if ((localq.getStatus() != 102) && (localq.getStatus() != 105))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " get status failed: " + paramString + " status:" + localq.getStatus());
      return 0 - k.nJ();
    }
    int i = localq.getStatus();
    if ((localq.getStatus() != 102) && (localq.AR() == localq.AQ()))
      localq.setStatus(104);
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", k.nL() + "startSend file:" + paramString + " status:[" + i + "->" + localq.getStatus() + "]");
      localq.W(ch.CL());
      localq.V(ch.CL());
      localq.db(3328);
      if (d(localq))
        break;
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " update failed: " + paramString);
      return 0 - k.nJ();
      localq.setStatus(103);
    }
    m.AM().Bd();
    m.AM().run();
    return 0;
  }

  public static int ii(String paramString)
  {
    q localq = ij(paramString);
    if (localq == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " getinfo failed: " + paramString);
      return 0 - k.nJ();
    }
    if ((localq.getStatus() != 111) && (localq.getStatus() != 113))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " get status failed: " + paramString + " status:" + localq.getStatus());
      return 0 - k.nJ();
    }
    localq.setStatus(112);
    localq.W(ch.CL());
    localq.V(ch.CL());
    localq.db(3328);
    if (!d(localq))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " update failed: " + paramString);
      return 0 - k.nJ();
    }
    m.AM().Bc();
    m.AM().run();
    return 0;
  }

  public static q ij(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    return m.AL().hY(paramString);
  }

  public static String ik(String paramString)
  {
    String str = h.dOL + ch.CM() + ".mp4";
    if (!p.bA(paramString, str))
      str = null;
    return str;
  }

  public static int r(String paramString, int paramInt)
  {
    int i = 1;
    q localq = ij(paramString);
    if (localq == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " getinfo failed: " + paramString);
      i = 0 - k.nJ();
      return i;
    }
    localq.eG(paramInt);
    localq.V(ch.CL());
    localq.db(1040);
    if ((localq.sp() > 0) && (paramInt >= localq.sp()))
    {
      int j = bg.qW().oV().w(localq.getUser(), localq.AV());
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = Integer.valueOf(j);
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "update read fin msg info, msg type %d", arrayOfObject);
      if (10000 != j)
      {
        ar localar = new ar();
        localar.p(localq.kl());
        localar.setContent(o.a(localq.AN(), localq.AU(), false));
        localar.bJ(localq.getUser());
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "set msg content :" + localar.getContent());
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "[oneliang][updateReadFinMsgInfo]");
        bg.qW().oV().b(localq.kl(), localar);
      }
      localq.setStatus(199);
      localq.db(0x100 | localq.ss());
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "END!!! " + k.nL() + " updateRecv  file:" + paramString + " newsize:" + paramInt + " total:" + localq.sp() + " status:" + localq.getStatus() + " netTimes:" + localq.AW());
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "updateRecv " + k.nL() + " file:" + paramString + " newsize:" + paramInt + " total:" + localq.sp() + " status:" + localq.getStatus());
      if (d(localq))
        break;
      return 0 - k.nJ();
      i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.v
 * JD-Core Version:    0.6.2
 */