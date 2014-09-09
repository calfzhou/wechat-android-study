package com.tencent.mm.ui.tools;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.TextView;
import com.tencent.mm.b;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.tools.gridviewheaders.a;
import java.util.Date;

final class cg
  implements AbsListView.OnScrollListener
{
  private Runnable eWP = new ch(this);

  cg(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  private void bb(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ImageGalleryGridUI.b(this.jRz).removeCallbacks(this.eWP);
      if (ImageGalleryGridUI.b(this.jRz).getVisibility() != 0)
      {
        ImageGalleryGridUI.b(this.jRz).clearAnimation();
        Animation localAnimation = AnimationUtils.loadAnimation(this.jRz.aPI(), b.Mv);
        ImageGalleryGridUI.b(this.jRz).setVisibility(0);
        ImageGalleryGridUI.b(this.jRz).startAnimation(localAnimation);
      }
      return;
    }
    ImageGalleryGridUI.b(this.jRz).removeCallbacks(this.eWP);
    ImageGalleryGridUI.b(this.jRz).postDelayed(this.eWP, 256L);
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    ImageGalleryGridUI localImageGalleryGridUI = this.jRz;
    ar localar = (ar)localImageGalleryGridUI.jRq.getItem(paramInt1);
    if (localar == null);
    Date localDate;
    for (Object localObject = null; ; localObject = a.bbi().a(localDate, localImageGalleryGridUI))
    {
      ImageGalleryGridUI.b(this.jRz).setText((CharSequence)localObject);
      return;
      localDate = new Date(localar.kn());
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (1 == paramInt)
      bb(true);
    while (paramInt != 0)
      return;
    bb(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cg
 * JD-Core Version:    0.6.2
 */