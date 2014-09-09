package com.tencent.mm.compatible.g;

import android.os.Build.VERSION;

public final class g
{
  public static boolean cp(int paramInt)
  {
    return Build.VERSION.SDK_INT >= paramInt;
  }

  public static boolean cq(int paramInt)
  {
    return Build.VERSION.SDK_INT < paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.g
 * JD-Core Version:    0.6.2
 */