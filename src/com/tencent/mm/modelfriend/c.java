package com.tencent.mm.modelfriend;

import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;

public final class c
{
  private static f dsJ = null;
  public static final HashSet dsK = new HashSet();
  private static final h dsL = new d();

  public static boolean a(h paramh)
  {
    long l = Thread.currentThread().getId();
    boolean bool = aa.we();
    if (!bool)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.e("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "canSync:%b, skip", arrayOfObject);
      return false;
    }
    am.h(new e(l, paramh));
    return true;
  }

  public static boolean vp()
  {
    return a(dsL);
  }

  public static boolean vq()
  {
    return f.dsC;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.c
 * JD-Core Version:    0.6.2
 */