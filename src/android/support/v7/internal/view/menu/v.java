package android.support.v7.internal.view.menu;

import android.support.v4.view.n;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class v extends ActionProvider
{
  final n lL;

  public v(u paramu, n paramn)
  {
    super(paramn.getContext());
    this.lL = paramn;
    if (u.a(paramu))
      this.lL.a(new w(this, paramu));
  }

  public boolean hasSubMenu()
  {
    return false;
  }

  public View onCreateActionView()
  {
    if (u.a(this.lM))
      this.lM.cj();
    return this.lL.onCreateActionView();
  }

  public boolean onPerformDefaultAction()
  {
    return false;
  }

  public void onPrepareSubMenu(SubMenu paramSubMenu)
  {
    this.lM.a(paramSubMenu);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.v
 * JD-Core Version:    0.6.2
 */