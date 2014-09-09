package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.b;
import android.support.v4.view.af;
import android.support.v4.view.n;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class a
  implements b
{
  private final int cg;
  private CharSequence jA;
  private Intent jB;
  private char jC;
  private char jD;
  private Drawable jE;
  private int jF = 0;
  private MenuItem.OnMenuItemClickListener jG;
  private int jH = 16;
  private final int jw;
  private final int jx;
  private final int jy;
  private CharSequence jz;
  private Context mContext;

  public a(Context paramContext, CharSequence paramCharSequence)
  {
    this.mContext = paramContext;
    this.cg = 16908332;
    this.jw = 0;
    this.jx = 0;
    this.jy = 0;
    this.jz = paramCharSequence;
  }

  public final b a(af paramaf)
  {
    return this;
  }

  public final b a(n paramn)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean collapseActionView()
  {
    return false;
  }

  public final boolean expandActionView()
  {
    return false;
  }

  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }

  public final View getActionView()
  {
    return null;
  }

  public final char getAlphabeticShortcut()
  {
    return this.jD;
  }

  public final int getGroupId()
  {
    return this.jw;
  }

  public final Drawable getIcon()
  {
    return this.jE;
  }

  public final Intent getIntent()
  {
    return this.jB;
  }

  public final int getItemId()
  {
    return this.cg;
  }

  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }

  public final char getNumericShortcut()
  {
    return this.jC;
  }

  public final int getOrder()
  {
    return this.jy;
  }

  public final SubMenu getSubMenu()
  {
    return null;
  }

  public final CharSequence getTitle()
  {
    return this.jz;
  }

  public final CharSequence getTitleCondensed()
  {
    return this.jA;
  }

  public final boolean hasSubMenu()
  {
    return false;
  }

  public final boolean isActionViewExpanded()
  {
    return false;
  }

  public final boolean isCheckable()
  {
    return (0x1 & this.jH) != 0;
  }

  public final boolean isChecked()
  {
    return (0x2 & this.jH) != 0;
  }

  public final boolean isEnabled()
  {
    return (0x10 & this.jH) != 0;
  }

  public final boolean isVisible()
  {
    return (0x8 & this.jH) == 0;
  }

  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }

  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.jD = paramChar;
    return this;
  }

  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i = 0xFFFFFFFE & this.jH;
    if (paramBoolean);
    for (int j = 1; ; j = 0)
    {
      this.jH = (j | i);
      return this;
    }
  }

  public final MenuItem setChecked(boolean paramBoolean)
  {
    int i = 0xFFFFFFFD & this.jH;
    if (paramBoolean);
    for (int j = 2; ; j = 0)
    {
      this.jH = (j | i);
      return this;
    }
  }

  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int i = 0xFFFFFFEF & this.jH;
    if (paramBoolean);
    for (int j = 16; ; j = 0)
    {
      this.jH = (j | i);
      return this;
    }
  }

  public final MenuItem setIcon(int paramInt)
  {
    this.jF = paramInt;
    this.jE = this.mContext.getResources().getDrawable(paramInt);
    return this;
  }

  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.jE = paramDrawable;
    this.jF = 0;
    return this;
  }

  public final MenuItem setIntent(Intent paramIntent)
  {
    this.jB = paramIntent;
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar)
  {
    this.jC = paramChar;
    return this;
  }

  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }

  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.jG = paramOnMenuItemClickListener;
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.jC = paramChar1;
    this.jD = paramChar2;
    return this;
  }

  public final void setShowAsAction(int paramInt)
  {
  }

  public final MenuItem setTitle(int paramInt)
  {
    this.jz = this.mContext.getResources().getString(paramInt);
    return this;
  }

  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.jz = paramCharSequence;
    return this;
  }

  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.jA = paramCharSequence;
    return this;
  }

  public final MenuItem setVisible(boolean paramBoolean)
  {
    int i = 0x8 & this.jH;
    if (paramBoolean);
    for (int j = 0; ; j = 8)
    {
      this.jH = (j | i);
      return this;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.a
 * JD-Core Version:    0.6.2
 */