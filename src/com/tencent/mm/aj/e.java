package com.tencent.mm.aj;

import com.tencent.mm.sdk.platformtools.z;

public final class e
{
  public static long b(String paramString, long paramLong)
  {
    long l = 0L;
    if (paramString != null)
    {
      f localf = l.AE().hJ(paramString);
      if (localf != null)
        l = 1L + localf.field_createTime;
    }
    if (l > paramLong * 1000L)
      return l;
    return paramLong * 1000L;
  }

  public static void hH(String paramString)
  {
    z.d("!32@/B4Tb64lLpISOYcLaKm7W3a/ZbV5G6j0", "clearFMsgAndFConvByTalker, talker = " + paramString);
    boolean bool1 = l.AF().hG(paramString);
    z.i("!32@/B4Tb64lLpISOYcLaKm7W3a/ZbV5G6j0", "clearFMsgAndFConvByTalker, delete fconversation, ret = " + bool1);
    boolean bool2 = l.AE().hG(paramString);
    z.i("!32@/B4Tb64lLpISOYcLaKm7W3a/ZbV5G6j0", "clearFMsgAndFConvByTalker, delete fmsginfo, ret = " + bool2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.e
 * JD-Core Version:    0.6.2
 */