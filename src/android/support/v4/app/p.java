package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class p
  implements Animation.AnimationListener
{
  p(m paramm, Fragment paramFragment)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (this.bK.af != null)
    {
      this.bK.af = null;
      this.bJ.a(this.bK, this.bK.ag, 0, 0, false);
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.p
 * JD-Core Version:    0.6.2
 */