package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class de
  implements Animation.AnimationListener
{
  de(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (ImageGalleryUI.k(ImageGalleryUI.j(this.jSA)).getVisibility() != 0)
      return;
    ImageGalleryUI.aF(ImageGalleryUI.l(this.jSA));
    ImageGalleryUI.m(ImageGalleryUI.j(this.jSA)).setVisibility(8);
    ImageGalleryUI.i(this.jSA);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.de
 * JD-Core Version:    0.6.2
 */