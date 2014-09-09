package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.io.File;

public final class bs
{
  public static b T(String paramString1, String paramString2)
  {
    return bm.BD().c(paramString1, paramString2, true);
  }

  public static int a(br parambr, byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    l locall = new l();
    br localbr = bm.BD().Y(parambr.kl());
    if ((localbr != null) && (localbr.getStatus() == 99));
    while ((bg.qW().oV().q(parambr.getUser(), parambr.kl()).kl() == parambr.kl()) && (localbr == null))
      return 0;
    String str1;
    String str2;
    int i;
    boolean bool;
    if (localbr != null)
    {
      parambr.hT(localbr.getFileName());
      parambr.db(0x1 | parambr.ss());
      z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", k.nL() + "checktime :" + locall.nM());
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 1))
        break label827;
      if (localbr != null)
        z.e("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Sync Voice Buf , But  VoiceInfo is not new !");
      str1 = parambr.BO();
      str2 = parambr.getFileName();
      i = T(str1, str2).write(paramArrayOfByte, paramArrayOfByte.length, 0);
      if (i >= 0)
        break label519;
      z.e("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Write Failed File:" + str2 + " newOffset:" + i + " voiceFormat:" + str1);
      bool = false;
    }
    while (true)
    {
      label231: z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", k.nL() + "checktime :" + locall.nM());
      parambr.V(System.currentTimeMillis() / 1000L);
      parambr.db(0x100 | parambr.ss());
      if (bool)
        parambr.setStatus(99);
      while (true)
      {
        parambr.db(0x40 | parambr.ss());
        if (localbr != null)
          break label705;
        if (bool)
          parambr.eK((int)a(parambr, bool, paramInt, paramString));
        z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", k.nL() + "checktime :" + locall.nM());
        parambr.db(-1);
        z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Insert fileName:" + parambr.getFileName() + " stat:" + parambr.getStatus() + " net:" + parambr.AO() + " total:" + parambr.sp());
        if (bm.BD().c(parambr))
          break label664;
        z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Insert Error fileName:" + parambr.getFileName() + " stat:" + parambr.getStatus() + " net:" + parambr.AO() + " total:" + parambr.sp());
        return -2;
        parambr.hT(cb.iC(parambr.AN()));
        break;
        label519: if (paramArrayOfByte.length != i)
        {
          z.e("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Write File:" + str2 + " fileOff:" + i + " bufLen:" + paramArrayOfByte.length + " voiceFormat:" + str1);
          bool = false;
          break label231;
        }
        z.i("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "writeVoiceFile file:[" + str2 + "] + buf:" + paramArrayOfByte.length + " voiceFormat:" + str1);
        bm.BD().iD(str2);
        bool = true;
        break label231;
        if (parambr.sp() == 0)
          parambr.setStatus(5);
        else
          parambr.setStatus(6);
      }
      label664: z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", k.nL() + "checktime :" + locall.nM());
      if (bool)
      {
        return 1;
        label705: z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Sync Update file:" + parambr.getFileName() + " stat:" + parambr.getStatus());
        if (!b(parambr))
          return -44;
        if (bool)
        {
          a(parambr);
          return 1;
        }
      }
      if ((localbr != null) && (localbr.AP() == parambr.sp()))
      {
        r(localbr.getFileName(), localbr.AP());
        z.w("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Sync TotalLen not Change (send endflag but TotoalLen == FileLen) :" + localbr.getFileName());
      }
      bm.BF().run();
      return 0;
      label827: bool = false;
    }
  }

  private static long a(br parambr, boolean paramBoolean, int paramInt, String paramString)
  {
    ar localar = new ar();
    localar.p(parambr.kl());
    localar.bK(parambr.getFileName());
    localar.setStatus(paramInt);
    localar.q(bw.b(parambr.getUser(), parambr.kn()));
    localar.bJ(parambr.getUser());
    int i;
    if (x.cY(parambr.AN()))
    {
      i = 1;
      localar.bv(i);
      localar.setType(34);
      localar.bO(paramString);
      localar.ok(parambr.BL());
      if (paramBoolean)
        break label130;
      localar.setContent(bp.a(parambr.AN(), 0L, false));
    }
    while (true)
    {
      return bw.e(localar);
      i = 0;
      break;
      label130: localar.setContent(bp.a(parambr.AN(), parambr.BM(), false));
    }
  }

  private static boolean a(br parambr)
  {
    try
    {
      parambr.eK((int)a(parambr, true, 3, ""));
      parambr.db(0x800 | parambr.ss());
      boolean bool = b(parambr);
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean b(br parambr)
  {
    if (parambr == null);
    while (parambr.ss() == -1)
      return false;
    return bm.BD().a(parambr.getFileName(), parambr);
  }

  public static String c(String paramString1, String paramString2, int paramInt)
  {
    if (ch.jb(paramString1));
    String str;
    do
    {
      return null;
      if ((!ch.jb(paramString2)) && (!paramString2.startsWith("amr_")) && (!paramString2.startsWith("spx_")))
        paramString2.startsWith("silk_");
      str = ix(paramString1);
    }
    while ((ch.jb(str)) || (!p.f(gP(paramString2), gP(str), false)));
    f(str, paramInt, 1);
    return str;
  }

  public static boolean eQ(int paramInt)
  {
    ar localar = bg.qW().oV().cV(paramInt);
    if ((localar.kk() == 0L) || (localar.kp() == null));
    br localbr;
    do
    {
      do
        return false;
      while (ch.jb(localar.kp()));
      String str = localar.kp();
      localbr = bm.BD().iG(str);
    }
    while ((localbr == null) || (ch.jb(localbr.getFileName())));
    localbr.setStatus(3);
    localbr.eF(0);
    localbr.q(System.currentTimeMillis() / 1000L);
    localbr.V(System.currentTimeMillis() / 1000L);
    localbr.db(8648);
    boolean bool = b(localbr);
    z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", " file:" + localbr.getFileName() + " msgid:" + localbr.AV() + "  stat:" + localbr.getStatus());
    if ((localbr.AV() == 0) || (ch.jb(localbr.getUser())))
    {
      z.e("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", " failed msg id:" + localbr.AV() + " user:" + localbr.getUser());
      return bool;
    }
    localar.setStatus(1);
    bg.qW().oV().a(localar.kk(), localar);
    bm.BF().run();
    return true;
  }

  public static boolean f(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null);
    br localbr;
    do
    {
      return false;
      z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "StopRecord fileName[" + paramString + "]");
      localbr = bm.BD().iG(paramString);
    }
    while (localbr == null);
    if ((localbr.getStatus() != 97) && (localbr.getStatus() != 98))
      localbr.setStatus(3);
    localbr.cZ(bq.id(paramString));
    if (localbr.sp() <= 0)
    {
      jdMethod_if(paramString);
      return false;
    }
    localbr.V(System.currentTimeMillis() / 1000L);
    localbr.eP(paramInt1);
    localbr.db(3424);
    ar localar = new ar();
    localar.bJ(localbr.getUser());
    localar.setType(34);
    localar.bv(1);
    localar.bK(paramString);
    if (localbr.getStatus() == 97)
    {
      localar.setStatus(2);
      localar.setContent(bp.a(localbr.AN(), localbr.BM(), false));
    }
    while (true)
    {
      localar.q(bw.eo(localbr.getUser()));
      localar.ok(paramInt2);
      localbr.eK((int)bw.e(localar));
      return b(localbr);
      if (localbr.getStatus() == 98)
      {
        localar.setStatus(5);
        localar.setContent(bp.a(localbr.AN(), -1L, true));
      }
      else
      {
        localar.setStatus(1);
        localar.setContent(bp.a(localbr.AN(), localbr.BM(), false));
      }
    }
  }

  public static String gP(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    return m(paramString, false);
  }

  public static boolean iA(String paramString)
  {
    if (paramString == null)
      return false;
    br localbr = bm.BD().iG(paramString);
    if (localbr == null)
    {
      z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "cancel null download : " + paramString);
      return true;
    }
    z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "cancel download : " + paramString + " SvrlId:" + localbr.kl());
    if (localbr.kl() != 0L)
      bg.qW().oV().s(localbr.getUser(), localbr.kl());
    return iB(paramString);
  }

  public static boolean iB(String paramString)
  {
    if (paramString == null)
      return false;
    bm.BD().iE(paramString);
    bm.BD().iD(paramString);
    return new File(gP(paramString)).delete();
  }

  public static boolean jdMethod_if(String paramString)
  {
    if (paramString == null)
      return false;
    br localbr = bm.BD().iG(paramString);
    if (localbr == null)
    {
      z.e("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Set error failed file:" + paramString);
      return false;
    }
    localbr.setStatus(98);
    localbr.V(System.currentTimeMillis() / 1000L);
    localbr.db(320);
    boolean bool = b(localbr);
    z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "setError file:" + paramString + " msgid:" + localbr.AV() + " old stat:" + localbr.getStatus());
    if ((localbr.AV() == 0) || (ch.jb(localbr.getUser())))
    {
      z.e("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "setError failed msg id:" + localbr.AV() + " user:" + localbr.getUser());
      return bool;
    }
    ar localar = new ar();
    localar.o(localbr.AV());
    localar.setStatus(5);
    localar.bJ(localbr.getUser());
    localar.setContent(bp.a(localbr.AN(), -1L, true));
    bg.qW().oV().a(localar.kk(), localar);
    return bool;
  }

  public static boolean in(String paramString)
  {
    if (paramString == null)
      return false;
    br localbr = bm.BD().iG(paramString);
    if (localbr == null)
    {
      z.i("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "cancel null record : " + paramString);
      return true;
    }
    z.i("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "cancel record : " + paramString + " LocalId:" + localbr.AV());
    if (localbr.AV() != 0)
      bg.qW().oV().cW(localbr.AV());
    return iB(paramString);
  }

  public static boolean iv(String paramString)
  {
    if (paramString == null);
    br localbr;
    do
    {
      return false;
      localbr = bm.BD().iG(paramString);
    }
    while ((localbr == null) || (localbr.AW() >= 250));
    localbr.dP(1 + localbr.AW());
    localbr.db(8192);
    return b(localbr);
  }

  public static b iw(String paramString)
  {
    return bm.BD().c("", paramString, false);
  }

  public static String ix(String paramString)
  {
    String str = cb.iC(x.pG());
    br localbr = new br();
    localbr.hT(str);
    localbr.setUser(paramString);
    localbr.q(System.currentTimeMillis() / 1000L);
    localbr.it(str);
    localbr.V(System.currentTimeMillis() / 1000L);
    localbr.setStatus(1);
    localbr.hU(x.pG());
    localbr.db(-1);
    if (!bm.BD().c(localbr))
      return null;
    z.i("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "startRecord insert voicestg success");
    return str;
  }

  public static boolean iy(String paramString)
  {
    if (paramString == null);
    br localbr;
    do
    {
      return false;
      localbr = bm.BD().iG(paramString);
      if (localbr == null)
      {
        z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "startSend null record : " + paramString);
        return false;
      }
    }
    while (localbr.getStatus() != 1);
    localbr.setStatus(2);
    localbr.db(64);
    return b(localbr);
  }

  public static boolean iz(String paramString)
  {
    if (paramString == null);
    br localbr;
    do
    {
      return false;
      z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "Mark Canceled fileName[" + paramString + "]");
      localbr = bm.BD().iG(paramString);
    }
    while (localbr == null);
    localbr.setStatus(8);
    localbr.cZ(bq.id(paramString));
    localbr.db(64);
    return b(localbr);
  }

  public static boolean k(ar paramar)
  {
    if ((paramar == null) || (!paramar.aJw()))
      return false;
    return new bp(paramar.getContent()).BH();
  }

  public static boolean l(ar paramar)
  {
    int i = 1;
    if ((paramar == null) || (!paramar.aJw()) || (paramar.jK() == i))
      i = 0;
    while (new bp(paramar.getContent()).getTime() == 0L)
      return i;
    return false;
  }

  public static String m(String paramString, boolean paramBoolean)
  {
    String str1 = o.a(bg.qW().pf(), "msg_", paramString, ".amr", 2);
    if (ch.jb(str1))
      str1 = null;
    String str2;
    do
    {
      do
        return str1;
      while ((paramBoolean) || (new File(str1).exists()));
      str2 = bg.qW().pe() + paramString;
      if (new File(str2 + ".amr").exists())
      {
        p.f(str2 + ".amr", str1, true);
        return str1;
      }
    }
    while (!new File(str2).exists());
    p.f(str2, str1, true);
    return str1;
  }

  public static void m(ar paramar)
  {
    if ((paramar == null) || (!paramar.aJw()));
    bp localbp;
    do
    {
      ar localar;
      do
      {
        return;
        localar = bg.qW().oV().cV(paramar.kk());
      }
      while (localar.kk() != paramar.kk());
      localbp = new bp(localar.getContent());
    }
    while (localbp.BH());
    localbp.BI();
    paramar.setContent(localbp.BG());
    bg.qW().oV().a(paramar.kk(), paramar);
  }

  public static int r(String paramString, int paramInt)
  {
    int i = -1;
    if (paramString == null);
    br localbr;
    do
    {
      do
      {
        return i;
        localbr = bm.BD().iG(paramString);
      }
      while (localbr == null);
      localbr.eG(paramInt);
      localbr.V(System.currentTimeMillis() / 1000L);
      localbr.db(272);
      int j = localbr.sp();
      i = 0;
      if (j > 0)
      {
        int k = localbr.sp();
        i = 0;
        if (paramInt >= k)
        {
          a(localbr);
          localbr.setStatus(99);
          localbr.db(0x40 | localbr.ss());
          z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "END!!! updateRecv  file:" + paramString + " newsize:" + paramInt + " total:" + localbr.sp() + " status:" + localbr.getStatus() + " netTimes:" + localbr.AW());
          i = 1;
          bm.BD().iD(paramString);
        }
      }
      z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "updateRecv file:" + paramString + " newsize:" + paramInt + " total:" + localbr.sp() + " status:" + localbr.getStatus());
    }
    while (b(localbr));
    return -3;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bs
 * JD-Core Version:    0.6.2
 */