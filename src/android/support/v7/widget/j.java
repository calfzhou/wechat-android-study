package android.support.v7.widget;

import android.view.View;
import android.view.View.OnClickListener;

final class j
  implements View.OnClickListener
{
  j(SearchView paramSearchView)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView == SearchView.e(this.JW))
      SearchView.f(this.JW);
    do
    {
      return;
      if (paramView == SearchView.g(this.JW))
      {
        SearchView.h(this.JW);
        return;
      }
      if (paramView == SearchView.i(this.JW))
      {
        SearchView.j(this.JW);
        return;
      }
      if (paramView == SearchView.k(this.JW))
      {
        SearchView.l(this.JW);
        return;
      }
    }
    while (paramView != SearchView.m(this.JW));
    SearchView.n(this.JW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.j
 * JD-Core Version:    0.6.2
 */