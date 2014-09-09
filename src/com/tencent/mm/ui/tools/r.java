package com.tencent.mm.ui.tools;

import android.view.View;

public final class r
{
  public static void s(View paramView, int paramInt)
  {
    if (paramView == null)
      return;
    fg localfg = new fg(paramView);
    paramView.setBackgroundResource(paramInt);
    localfg.restore();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.r
 * JD-Core Version:    0.6.2
 */