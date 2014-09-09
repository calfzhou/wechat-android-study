package android.support.v7.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class g
  implements View.OnFocusChangeListener
{
  g(SearchView paramSearchView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (SearchView.c(this.JW) != null)
      SearchView.c(this.JW).onFocusChange(this.JW, paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.g
 * JD-Core Version:    0.6.2
 */