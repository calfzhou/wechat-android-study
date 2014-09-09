package com.tencent.mm.ui.applet;

import android.content.Context;
import android.view.LayoutInflater;
import com.tencent.mm.k;

public final class s
{
  private static int iWb = 0;

  public static void cm(Context paramContext)
  {
    if (iWb > 0)
      return;
    new t(paramContext, LayoutInflater.from(paramContext).inflate(k.boK, null)).show();
    iWb = 1 + iWb;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.s
 * JD-Core Version:    0.6.2
 */