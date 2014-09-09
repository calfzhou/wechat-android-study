package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import com.tencent.mm.sdk.platformtools.ak;

public final class ch
  implements MenuItem
{
  private int iX;
  private int iconId;
  private int jaE;
  private Drawable jaF;
  private ContextMenu.ContextMenuInfo jaG;
  private MenuItem.OnMenuItemClickListener jaH;
  private int je;
  private CharSequence title;

  public ch(int paramInt1, int paramInt2)
  {
    this.je = paramInt1;
    this.iX = paramInt2;
  }

  public final void a(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.jaG = paramContextMenuInfo;
  }

  @TargetApi(14)
  public final boolean collapseActionView()
  {
    return false;
  }

  @TargetApi(14)
  public final boolean expandActionView()
  {
    return false;
  }

  @TargetApi(14)
  public final ActionProvider getActionProvider()
  {
    return null;
  }

  @TargetApi(14)
  public final View getActionView()
  {
    return null;
  }

  public final char getAlphabeticShortcut()
  {
    return '\000';
  }

  public final int getGroupId()
  {
    return this.iX;
  }

  public final Drawable getIcon()
  {
    if (this.jaF == null)
    {
      if (this.iconId != 0)
        return ak.getContext().getResources().getDrawable(this.iconId);
      return null;
    }
    return this.jaF;
  }

  public final Intent getIntent()
  {
    return null;
  }

  public final int getItemId()
  {
    return this.je;
  }

  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.jaG;
  }

  public final char getNumericShortcut()
  {
    return '\000';
  }

  public final int getOrder()
  {
    return 0;
  }

  public final SubMenu getSubMenu()
  {
    return null;
  }

  public final CharSequence getTitle()
  {
    if (this.title == null)
    {
      if (this.jaE != 0)
        return ak.getContext().getString(this.jaE);
      return null;
    }
    return this.title;
  }

  public final CharSequence getTitleCondensed()
  {
    return null;
  }

  public final boolean hasSubMenu()
  {
    return false;
  }

  @TargetApi(14)
  public final boolean isActionViewExpanded()
  {
    return false;
  }

  public final boolean isCheckable()
  {
    return false;
  }

  public final boolean isChecked()
  {
    return false;
  }

  public final boolean isEnabled()
  {
    return true;
  }

  public final boolean isVisible()
  {
    return true;
  }

  public final boolean performClick()
  {
    if (this.jaH != null)
      return this.jaH.onMenuItemClick(this);
    return false;
  }

  @TargetApi(14)
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    return null;
  }

  @TargetApi(14)
  public final MenuItem setActionView(int paramInt)
  {
    return null;
  }

  @TargetApi(14)
  public final MenuItem setActionView(View paramView)
  {
    return null;
  }

  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    return this;
  }

  public final MenuItem setCheckable(boolean paramBoolean)
  {
    return this;
  }

  public final MenuItem setChecked(boolean paramBoolean)
  {
    return this;
  }

  public final MenuItem setEnabled(boolean paramBoolean)
  {
    return this;
  }

  public final MenuItem setIcon(int paramInt)
  {
    this.iconId = paramInt;
    return this;
  }

  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.jaF = paramDrawable;
    return this;
  }

  public final MenuItem setIntent(Intent paramIntent)
  {
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar)
  {
    return this;
  }

  @TargetApi(14)
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    return null;
  }

  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.jaH = paramOnMenuItemClickListener;
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    return this;
  }

  @TargetApi(14)
  public final void setShowAsAction(int paramInt)
  {
  }

  @TargetApi(14)
  public final MenuItem setShowAsActionFlags(int paramInt)
  {
    return null;
  }

  public final MenuItem setTitle(int paramInt)
  {
    this.jaE = paramInt;
    return this;
  }

  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.title = paramCharSequence;
    return this;
  }

  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    return this;
  }

  public final MenuItem setVisible(boolean paramBoolean)
  {
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ch
 * JD-Core Version:    0.6.2
 */