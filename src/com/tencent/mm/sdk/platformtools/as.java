package com.tencent.mm.sdk.platformtools;

import java.util.HashSet;
import java.util.Set;

public final class as
{
  private static Set iEv = new HashSet();

  public static boolean AO(String paramString)
  {
    if (AR(paramString))
    {
      z.d("!32@/B4Tb64lLpIEAZRXGnbxCKv0yDb0jVnH", "locked-" + paramString);
      return false;
    }
    z.d("!32@/B4Tb64lLpIEAZRXGnbxCKv0yDb0jVnH", "lock-" + paramString);
    return iEv.add(paramString);
  }

  public static void AP(String paramString)
  {
    iEv.remove(paramString);
    z.d("!32@/B4Tb64lLpIEAZRXGnbxCKv0yDb0jVnH", "unlock-" + paramString);
  }

  public static boolean AR(String paramString)
  {
    return iEv.contains(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.as
 * JD-Core Version:    0.6.2
 */