package com.tencent.mm.compatible.g;

import android.os.Build;
import com.tencent.mm.sdk.platformtools.ch;

public final class q
{
  public static boolean nT()
  {
    return ch.Y(Build.MANUFACTURER, "").toLowerCase().indexOf("samsung".toLowerCase()) >= 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.q
 * JD-Core Version:    0.6.2
 */