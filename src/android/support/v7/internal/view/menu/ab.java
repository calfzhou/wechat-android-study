package android.support.v7.internal.view.menu;

import android.support.v4.view.n;
import android.support.v4.view.p;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class ab extends v
  implements p
{
  ActionProvider.VisibilityListener lQ;

  public ab(aa paramaa, n paramn)
  {
    super(paramaa, paramn);
  }

  public final boolean isVisible()
  {
    return true;
  }

  public final View onCreateActionView(MenuItem paramMenuItem)
  {
    return this.lL.onCreateActionView();
  }

  public final boolean overridesItemVisibility()
  {
    return false;
  }

  public final void refreshVisibility()
  {
    this.lL.refreshVisibility();
  }

  public final void setVisibilityListener(ActionProvider.VisibilityListener paramVisibilityListener)
  {
    this.lQ = paramVisibilityListener;
    n localn = this.lL;
    if (paramVisibilityListener != null);
    while (true)
    {
      localn.a(this);
      return;
      this = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ab
 * JD-Core Version:    0.6.2
 */