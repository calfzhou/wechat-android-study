package android.support.v7.widget;

import android.support.v4.widget.a;

final class f
  implements Runnable
{
  f(SearchView paramSearchView)
  {
  }

  public final void run()
  {
    if ((SearchView.b(this.JW) != null) && ((SearchView.b(this.JW) instanceof q)))
      SearchView.b(this.JW).changeCursor(null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.f
 * JD-Core Version:    0.6.2
 */