package android.support.v4.view;

import android.view.MenuItem;

final class ac extends ab
{
  public final MenuItem a(MenuItem paramMenuItem, af paramaf)
  {
    if (paramaf == null)
      return ag.a(paramMenuItem, null);
    return ag.a(paramMenuItem, new ad(this, paramaf));
  }

  public final boolean d(MenuItem paramMenuItem)
  {
    return paramMenuItem.expandActionView();
  }

  public final boolean e(MenuItem paramMenuItem)
  {
    return paramMenuItem.collapseActionView();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ac
 * JD-Core Version:    0.6.2
 */