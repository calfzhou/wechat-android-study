package android.support.v7.internal.widget;

import android.support.v7.app.c;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

final class ao
  implements View.OnClickListener
{
  private ao(ScrollingTabContainerView paramScrollingTabContainerView)
  {
  }

  public final void onClick(View paramView)
  {
    ((ScrollingTabContainerView.TabView)paramView).cZ().select();
    int i = ScrollingTabContainerView.c(this.qb).getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = ScrollingTabContainerView.c(this.qb).getChildAt(j);
      if (localView == paramView);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        j++;
        break;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ao
 * JD-Core Version:    0.6.2
 */