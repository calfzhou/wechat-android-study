package android.support.v7.internal.widget;

import android.view.View;

final class am
  implements Runnable
{
  am(ScrollingTabContainerView paramScrollingTabContainerView, View paramView)
  {
  }

  public final void run()
  {
    int i = this.qa.getLeft() - (this.qb.getWidth() - this.qa.getWidth()) / 2;
    this.qb.smoothScrollTo(i, 0);
    this.qb.nj = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.am
 * JD-Core Version:    0.6.2
 */