package com.tencent.mm.sdk.platformtools;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation;

public final class d
{
  public static void a(View paramView, Animation paramAnimation)
  {
    if (Build.VERSION.SDK_INT >= 8)
    {
      new b();
      paramAnimation.cancel();
    }
    do
    {
      return;
      new a();
    }
    while (paramView == null);
    paramView.setAnimation(null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.d
 * JD-Core Version:    0.6.2
 */