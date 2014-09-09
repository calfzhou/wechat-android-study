package com.tencent.mm.ui.pluginapp;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.mm.b;

final class v
  implements Runnable
{
  v(t paramt, View paramView)
  {
  }

  public final void run()
  {
    this.jKW.setVisibility(8);
    this.jKW.startAnimation(AnimationUtils.loadAnimation(this.jKV.agh(), b.Mw));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.v
 * JD-Core Version:    0.6.2
 */