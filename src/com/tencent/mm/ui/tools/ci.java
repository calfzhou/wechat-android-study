package com.tencent.mm.ui.tools;

import android.animation.TimeInterpolator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.mm.sdk.platformtools.cm;

final class ci
  implements Runnable
{
  ci(ImageGalleryGridUI paramImageGalleryGridUI, View paramView, TimeInterpolator paramTimeInterpolator)
  {
  }

  public final void run()
  {
    if (Build.VERSION.SDK_INT >= 16)
      this.jRB.animate().setDuration(500L).alpha(0.0F).withEndAction(this.jRz.jRx).withLayer().setInterpolator(this.jRC);
    while (this.jRz.gQj == null)
      return;
    this.jRB.animate().setDuration(500L).alpha(0.0F).setInterpolator(this.jRC);
    this.jRz.gQj.postDelayed(this.jRz.jRx, 500L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ci
 * JD-Core Version:    0.6.2
 */