package com.tencent.mm.sdk.platformtools;

public final class c
{
  public static boolean Gw = false;

  static
  {
    Cz();
  }

  private static boolean Cz()
  {
    try
    {
      Class.forName("android.media.ExifInterface");
      z.i("!24@/B4Tb64lLpKVEdGqaNtVOg==", "android.media.ExifInterface find");
      Gw = true;
      return true;
    }
    catch (Exception localException)
    {
      z.w("!24@/B4Tb64lLpKVEdGqaNtVOg==", "android.media.ExifInterface can not found");
      Gw = false;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.c
 * JD-Core Version:    0.6.2
 */