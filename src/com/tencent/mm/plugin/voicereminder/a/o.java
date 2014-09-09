package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.io.File;

public final class o
{
  public static String A(String paramString, boolean paramBoolean)
  {
    String str = com.tencent.mm.sdk.platformtools.o.a(bg.qW().pg(), "recbiz_", paramString, ".rec", 2);
    if (ap.jb(str))
      str = null;
    while ((paramBoolean) || (!new File(str).exists()))
      return str;
    return str;
  }

  public static boolean X(String paramString, int paramInt)
  {
    if (paramString == null);
    n localn;
    do
    {
      return false;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "StopRecord fileName[" + paramString + "]");
      localn = f.arG().tk(paramString);
    }
    while (localn == null);
    if ((localn.field_status != 97) && (localn.field_status != 98))
      localn.field_status = 3;
    localn.field_totallen = d.id(A(paramString, false));
    if (localn.field_totallen <= 0)
    {
      jdMethod_if(paramString);
      return false;
    }
    localn.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localn.field_voicelenght = paramInt;
    localn.db(3424);
    ar localar = new ar();
    localar.bJ(localn.field_user);
    localar.setType(34);
    localar.bv(1);
    localar.bK(paramString);
    if (localn.field_status == 97)
    {
      localar.setStatus(2);
      localar.setContent(m.a(localn.field_human, localn.field_voicelenght, false));
    }
    while (true)
    {
      localar.q(bw.eo(localn.field_user));
      localn.field_msglocalid = ((int)bw.e(localar));
      return a(localn);
      if (localn.field_status == 98)
      {
        localar.setStatus(5);
        localar.setContent(m.a(localn.field_human, -1L, true));
      }
      else
      {
        localar.setStatus(1);
      }
    }
  }

  public static int a(String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2)
  {
    int i = 1;
    if (paramString1 == null)
      i = -1;
    while (true)
    {
      return i;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "UpdateAfterSend file:[" + paramString1 + "] newOff:" + paramInt1 + " SvrID:" + paramLong + " clientID:" + paramString2 + " hasSendEndFlag " + paramInt2);
      n localn = f.arG().tk(paramString1);
      if (localn == null)
        return -1;
      localn.field_offset = paramInt1;
      localn.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
      localn.db(264);
      if ((ap.jb(localn.field_clientid)) && (paramString2 != null))
      {
        localn.field_clientid = paramString2;
        localn.db(0x200 | localn.ss());
      }
      if ((localn.field_msgid == 0L) && (paramLong != 0L))
      {
        localn.field_msgid = paramLong;
        localn.db(0x4 | localn.ss());
      }
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "info.getTotalLen() " + localn.field_totallen + "  newOffset " + paramInt1 + "  " + localn.field_status);
      if ((localn.field_totallen <= paramInt1) && (localn.field_status == 3) && (paramInt2 == i))
      {
        localn.field_status = 99;
        localn.db(0x40 | localn.ss());
        ar localar = new ar();
        localar.bJ(localn.field_user);
        localar.p(localn.field_msgid);
        localar.setStatus(2);
        localar.setContent(m.a(localn.field_human, localn.field_voicelenght, false));
        bg.qW().oV().a(localn.field_msglocalid, localar);
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "END!!! updateSend  file:" + paramString1 + " total:" + localn.field_totallen + " status:" + localn.field_status + " netTimes:" + localn.field_nettimes);
        iD(paramString1);
      }
      while (!a(localn))
      {
        return -4;
        i = 0;
      }
    }
  }

  private static boolean a(n paramn)
  {
    if (paramn == null);
    while (paramn.ss() == -1)
      return false;
    return f.arG().a(paramn.field_filename, paramn);
  }

  public static boolean eQ(int paramInt)
  {
    ar localar = bg.qW().oV().cV(paramInt);
    if ((localar.kk() == 0L) || (localar.kp() == null));
    n localn;
    do
    {
      do
        return false;
      while (ap.jb(localar.kp()));
      String str = localar.kp();
      localn = f.arG().tk(str);
    }
    while ((localn == null) || (ap.jb(localn.field_filename)));
    localn.field_status = 3;
    localn.field_offset = 0;
    localn.field_createtime = (System.currentTimeMillis() / 1000L);
    localn.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localn.db(16840);
    boolean bool = a(localn);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", " file:" + localn.field_filename + " msgid:" + localn.field_msglocalid + "  stat:" + localn.field_status);
    if ((localn.field_msglocalid == 0) || (ap.jb(localn.field_user)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", " failed msg id:" + localn.field_msglocalid + " user:" + localn.field_user);
      return bool;
    }
    localar.setStatus(1);
    bg.qW().oV().a(localar.kk(), localar);
    f.arH().run();
    return true;
  }

  private static void iD(String paramString)
  {
    f.arG().iD(A(paramString, false));
  }

  public static boolean jdMethod_if(String paramString)
  {
    if (paramString == null)
      return false;
    n localn = f.arG().tk(paramString);
    if (localn == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "Set error failed file:" + paramString);
      return false;
    }
    localn.field_status = 98;
    localn.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localn.db(320);
    boolean bool = a(localn);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "setError file:" + paramString + " msgid:" + localn.field_msglocalid + " old stat:" + localn.field_status);
    if ((localn.field_msglocalid == 0) || (ap.jb(localn.field_user)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "setError failed msg id:" + localn.field_msglocalid + " user:" + localn.field_user);
      return bool;
    }
    ar localar = new ar();
    localar.o(localn.field_msglocalid);
    localar.setStatus(5);
    localar.bJ(localn.field_user);
    localar.setContent(m.a(localn.field_human, -1L, true));
    bg.qW().oV().a(localar.kk(), localar);
    return bool;
  }

  public static boolean ig(String paramString)
  {
    n localn = f.arG().tk(paramString);
    if (localn == null)
      return false;
    if (localn.field_status == 3)
    {
      ar localar = bg.qW().oV().cV(localn.field_msglocalid);
      localar.setContent(m.a(localn.field_human, localn.field_voicelenght, false));
      localar.setStatus(2);
      bg.qW().oV().a(localn.field_msglocalid, localar);
    }
    localn.field_status = 97;
    localn.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localn.db(320);
    return a(localn);
  }

  public static boolean in(String paramString)
  {
    if (paramString == null);
    do
    {
      return false;
      n localn = f.arG().tk(paramString);
      if (localn == null)
      {
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "cancel null record : " + paramString);
        return true;
      }
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "cancel record : " + paramString + " LocalId:" + localn.field_msglocalid);
      if (localn.field_msglocalid != 0)
        bg.qW().oV().cW(localn.field_msglocalid);
    }
    while (paramString == null);
    f.arG().iE(paramString);
    iD(paramString);
    return new File(A(paramString, false)).delete();
  }

  public static boolean iv(String paramString)
  {
    if (paramString == null);
    n localn;
    do
    {
      return false;
      localn = f.arG().tk(paramString);
    }
    while ((localn == null) || (localn.field_nettimes >= 80));
    localn.field_nettimes = (1 + localn.field_nettimes);
    localn.db(16384);
    return a(localn);
  }

  public static boolean iy(String paramString)
  {
    if (paramString == null);
    n localn;
    do
    {
      return false;
      localn = f.arG().tk(paramString);
      if (localn == null)
      {
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "startSend null record : " + paramString);
        return false;
      }
    }
    while (localn.field_status != 1);
    localn.field_status = 2;
    localn.db(64);
    return a(localn);
  }

  public static boolean iz(String paramString)
  {
    if (paramString == null);
    n localn;
    do
    {
      return false;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JUta8syYGx1fpYWB6qoEDUU=", "Mark Canceled fileName[" + paramString + "]");
      localn = f.arG().tk(paramString);
    }
    while (localn == null);
    localn.field_status = 8;
    localn.field_totallen = d.id(A(paramString, false));
    localn.db(64);
    return a(localn);
  }

  public static d th(String paramString)
  {
    return f.arG().tj(A(paramString, false));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.o
 * JD-Core Version:    0.6.2
 */