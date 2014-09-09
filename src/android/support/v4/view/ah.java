package android.support.v4.view;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class ah
  implements MenuItem.OnActionExpandListener
{
  private ai dH;

  public ah(ai paramai)
  {
    this.dH = paramai;
  }

  public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    return this.dH.Q();
  }

  public final boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    return this.dH.P();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ah
 * JD-Core Version:    0.6.2
 */