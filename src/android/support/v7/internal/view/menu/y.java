package android.support.v7.internal.view.menu;

import android.support.v4.view.af;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class y extends l
  implements MenuItem.OnActionExpandListener
{
  y(u paramu, af paramaf)
  {
    super(paramaf);
  }

  public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    af localaf = (af)this.kE;
    this.lM.h(paramMenuItem);
    return localaf.Q();
  }

  public final boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    af localaf = (af)this.kE;
    this.lM.h(paramMenuItem);
    return localaf.P();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.y
 * JD-Core Version:    0.6.2
 */