package com.tencent.mm.ui.tools;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.mm.b;

final class ch
  implements Runnable
{
  ch(cg paramcg)
  {
  }

  public final void run()
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this.jRA.jRz.aPI(), b.Mw);
    ImageGalleryGridUI.b(this.jRA.jRz).startAnimation(localAnimation);
    ImageGalleryGridUI.b(this.jRA.jRz).setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ch
 * JD-Core Version:    0.6.2
 */