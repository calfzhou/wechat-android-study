package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.mm.b;

final class j
  implements Runnable
{
  j(h paramh, View paramView)
  {
  }

  public final void run()
  {
    this.jKW.setVisibility(8);
    this.jKW.startAnimation(AnimationUtils.loadAnimation(this.jLA.agh(), b.Mw));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.j
 * JD-Core Version:    0.6.2
 */