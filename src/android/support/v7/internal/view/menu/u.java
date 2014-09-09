package android.support.v7.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.af;
import android.support.v4.view.n;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

class u extends k
  implements android.support.v4.a.a.b
{
  private final boolean lJ;
  private boolean lK;

  u(MenuItem paramMenuItem)
  {
    this(paramMenuItem, true);
  }

  u(MenuItem paramMenuItem, boolean paramBoolean)
  {
    super(paramMenuItem);
    this.lK = paramMenuItem.isVisible();
    this.lJ = paramBoolean;
  }

  public final android.support.v4.a.a.b a(af paramaf)
  {
    MenuItem localMenuItem = (MenuItem)this.kE;
    if (paramaf != null);
    for (y localy = new y(this, paramaf); ; localy = null)
    {
      localMenuItem.setOnActionExpandListener(localy);
      return null;
    }
  }

  public final android.support.v4.a.a.b a(n paramn)
  {
    MenuItem localMenuItem = (MenuItem)this.kE;
    if (paramn != null);
    for (v localv = b(paramn); ; localv = null)
    {
      localMenuItem.setActionProvider(localv);
      return this;
    }
  }

  v b(n paramn)
  {
    return new v(this, paramn);
  }

  final boolean cj()
  {
    v localv;
    if (this.lK)
    {
      localv = (v)((MenuItem)this.kE).getActionProvider();
      if (localv == null);
    }
    return false;
  }

  public boolean collapseActionView()
  {
    return ((MenuItem)this.kE).collapseActionView();
  }

  public boolean expandActionView()
  {
    return ((MenuItem)this.kE).expandActionView();
  }

  public ActionProvider getActionProvider()
  {
    return ((MenuItem)this.kE).getActionProvider();
  }

  public View getActionView()
  {
    View localView = ((MenuItem)this.kE).getActionView();
    if ((localView instanceof x))
      localView = (View)((x)localView).lP;
    return localView;
  }

  public char getAlphabeticShortcut()
  {
    return ((MenuItem)this.kE).getAlphabeticShortcut();
  }

  public int getGroupId()
  {
    return ((MenuItem)this.kE).getGroupId();
  }

  public Drawable getIcon()
  {
    return ((MenuItem)this.kE).getIcon();
  }

  public Intent getIntent()
  {
    return ((MenuItem)this.kE).getIntent();
  }

  public int getItemId()
  {
    return ((MenuItem)this.kE).getItemId();
  }

  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((MenuItem)this.kE).getMenuInfo();
  }

  public char getNumericShortcut()
  {
    return ((MenuItem)this.kE).getNumericShortcut();
  }

  public int getOrder()
  {
    return ((MenuItem)this.kE).getOrder();
  }

  public SubMenu getSubMenu()
  {
    return a(((MenuItem)this.kE).getSubMenu());
  }

  public CharSequence getTitle()
  {
    return ((MenuItem)this.kE).getTitle();
  }

  public CharSequence getTitleCondensed()
  {
    return ((MenuItem)this.kE).getTitleCondensed();
  }

  public boolean hasSubMenu()
  {
    return ((MenuItem)this.kE).hasSubMenu();
  }

  public boolean isActionViewExpanded()
  {
    return ((MenuItem)this.kE).isActionViewExpanded();
  }

  public boolean isCheckable()
  {
    return ((MenuItem)this.kE).isCheckable();
  }

  public boolean isChecked()
  {
    return ((MenuItem)this.kE).isChecked();
  }

  public boolean isEnabled()
  {
    return ((MenuItem)this.kE).isEnabled();
  }

  public boolean isVisible()
  {
    return ((MenuItem)this.kE).isVisible();
  }

  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    ((MenuItem)this.kE).setActionProvider(paramActionProvider);
    if ((paramActionProvider != null) && (this.lJ))
      cj();
    return this;
  }

  public MenuItem setActionView(int paramInt)
  {
    ((MenuItem)this.kE).setActionView(paramInt);
    View localView = ((MenuItem)this.kE).getActionView();
    if ((localView instanceof android.support.v7.a.b))
      ((MenuItem)this.kE).setActionView(new x(localView));
    return this;
  }

  public MenuItem setActionView(View paramView)
  {
    if ((paramView instanceof android.support.v7.a.b))
      paramView = new x(paramView);
    ((MenuItem)this.kE).setActionView(paramView);
    return this;
  }

  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((MenuItem)this.kE).setAlphabeticShortcut(paramChar);
    return this;
  }

  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((MenuItem)this.kE).setCheckable(paramBoolean);
    return this;
  }

  public MenuItem setChecked(boolean paramBoolean)
  {
    ((MenuItem)this.kE).setChecked(paramBoolean);
    return this;
  }

  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((MenuItem)this.kE).setEnabled(paramBoolean);
    return this;
  }

  public MenuItem setIcon(int paramInt)
  {
    ((MenuItem)this.kE).setIcon(paramInt);
    return this;
  }

  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((MenuItem)this.kE).setIcon(paramDrawable);
    return this;
  }

  public MenuItem setIntent(Intent paramIntent)
  {
    ((MenuItem)this.kE).setIntent(paramIntent);
    return this;
  }

  public MenuItem setNumericShortcut(char paramChar)
  {
    ((MenuItem)this.kE).setNumericShortcut(paramChar);
    return this;
  }

  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    ((MenuItem)this.kE).setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }

  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    MenuItem localMenuItem = (MenuItem)this.kE;
    if (paramOnMenuItemClickListener != null);
    for (z localz = new z(this, paramOnMenuItemClickListener); ; localz = null)
    {
      localMenuItem.setOnMenuItemClickListener(localz);
      return this;
    }
  }

  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((MenuItem)this.kE).setShortcut(paramChar1, paramChar2);
    return this;
  }

  public void setShowAsAction(int paramInt)
  {
    ((MenuItem)this.kE).setShowAsAction(paramInt);
  }

  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((MenuItem)this.kE).setShowAsActionFlags(paramInt);
    return this;
  }

  public MenuItem setTitle(int paramInt)
  {
    ((MenuItem)this.kE).setTitle(paramInt);
    return this;
  }

  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((MenuItem)this.kE).setTitle(paramCharSequence);
    return this;
  }

  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((MenuItem)this.kE).setTitleCondensed(paramCharSequence);
    return this;
  }

  public MenuItem setVisible(boolean paramBoolean)
  {
    if (this.lJ)
    {
      this.lK = paramBoolean;
      cj();
    }
    return ((MenuItem)this.kE).setVisible(paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.u
 * JD-Core Version:    0.6.2
 */