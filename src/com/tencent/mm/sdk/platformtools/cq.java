package com.tencent.mm.sdk.platformtools;

import java.util.HashMap;

public final class cq
{
  private static final HashMap iFX = new HashMap();

  public static String getProperty(String paramString)
  {
    return (String)iFX.get(paramString);
  }

  public static void setProperty(String paramString1, String paramString2)
  {
    iFX.put(paramString1, paramString2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.cq
 * JD-Core Version:    0.6.2
 */