package com.tencent.mm.q;

import com.tencent.mm.model.b;
import com.tencent.mm.protocal.a.se;
import com.tencent.mm.storage.bb;
import java.util.List;

public final class r
{
  public static void c(a parama)
  {
    if (parama != null)
    {
      se localse = new se();
      localse.dtr = parama.field_brandFlag;
      localse.gnq = parama.field_username;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(47, localse));
      aa.uY().a(parama, new String[0]);
    }
  }

  public static a fE(String paramString)
  {
    a locala = aa.uY().fz(paramString);
    if (locala.field_updateTime > 0L)
      return locala;
    return null;
  }

  public static boolean fF(String paramString)
  {
    a locala = fE(paramString);
    if (locala == null);
    while (!locala.uh())
      return false;
    return true;
  }

  public static boolean uF()
  {
    return aa.uY().em(1) > 0;
  }

  public static boolean uG()
  {
    return aa.uY().em(4) > 0;
  }

  public static boolean uI()
  {
    return aa.uY().em(8) > 0;
  }

  public static boolean uK()
  {
    return aa.uY().em(16) > 0;
  }

  public static boolean uM()
  {
    return aa.uY().em(32) > 0;
  }

  public static boolean uO()
  {
    return aa.uY().em(64) > 0;
  }

  public static List uP()
  {
    return aa.uY().dk(128);
  }

  public static boolean uQ()
  {
    return aa.uY().em(128) > 0;
  }

  public static boolean uS()
  {
    return aa.uY().em(256) > 0;
  }

  public static boolean uU()
  {
    return aa.uY().em(512) > 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.r
 * JD-Core Version:    0.6.2
 */