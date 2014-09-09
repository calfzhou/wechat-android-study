package com.tencent.mm.ui.chatting;

import com.tencent.mm.a.c;
import com.tencent.mm.pluginsdk.model.app.a;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import com.tencent.mm.y.n;

public final class mp
{
  public static String a(ar paramar, com.tencent.mm.ai.b paramb)
  {
    String str = "";
    if ((paramb != null) && (!ch.jb(paramb.dQY)))
    {
      a locala = bf.GP().uU(paramb.dQY);
      if ((locala != null) && (locala.sl()) && (c.ac(locala.field_fileFullPath)))
        str = locala.field_fileFullPath;
    }
    if (!ch.jb(str))
    {
      z.d("!44@/B4Tb64lLpLxj3ZqxKn6+3KYy5Lgm91EfA8MrgDHsA4=", "get hd appmsg image path ok, %s", new Object[] { str });
      return str;
    }
    if (paramar != null)
      str = ap.yg().gS(paramar.kp());
    z.d("!44@/B4Tb64lLpLxj3ZqxKn6+3KYy5Lgm91EfA8MrgDHsA4=", "try get thumb appmsg image path finish, %s", new Object[] { str });
    return str;
  }

  public static String di(long paramLong)
  {
    String str = e(ap.yg().T(paramLong));
    if (str != null)
      return str;
    return null;
  }

  public static String dj(long paramLong)
  {
    String str = e(ap.yg().S(paramLong));
    if (str != null)
      return str;
    return null;
  }

  private static String e(l paraml)
  {
    if (paraml != null)
    {
      String str2;
      if (paraml.xR())
      {
        str2 = paraml.xN();
        if ((str2 == null) || (!c.ac(str2)));
      }
      do
      {
        do
        {
          return str2;
          String str1 = paraml.xN();
          str2 = ap.yg().f(str1, null, null);
        }
        while ((str2 != null) && (c.ac(str2)));
        String str3 = paraml.xO();
        str2 = ap.yg().f(str3, null, null);
      }
      while ((str2 != null) && (c.ac(str2)));
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mp
 * JD-Core Version:    0.6.2
 */