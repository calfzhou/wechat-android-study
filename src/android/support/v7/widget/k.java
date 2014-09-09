package android.support.v7.widget;

import android.support.v4.view.u;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class k
  implements View.OnKeyListener
{
  k(SearchView paramSearchView)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (SearchView.o(this.JW) == null);
    do
    {
      return false;
      if ((SearchView.m(this.JW).isPopupShowing()) && (SearchView.m(this.JW).getListSelection() != -1))
        return SearchView.a(this.JW, paramInt, paramKeyEvent);
    }
    while ((SearchView.SearchAutoComplete.a(SearchView.m(this.JW))) || (!u.b(paramKeyEvent)) || (paramKeyEvent.getAction() != 1) || (paramInt != 66));
    paramView.cancelLongPress();
    SearchView.a(this.JW, SearchView.m(this.JW).getText().toString());
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.k
 * JD-Core Version:    0.6.2
 */