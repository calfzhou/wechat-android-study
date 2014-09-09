package com.tencent.mm.ui.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cg
  implements ContextMenu
{
  private List jaD = new ArrayList();
  private CharSequence lj;

  public final MenuItem a(int paramInt, CharSequence paramCharSequence)
  {
    ch localch = new ch(paramInt, 0);
    localch.setTitle(paramCharSequence);
    this.jaD.add(localch);
    return localch;
  }

  public final MenuItem a(int paramInt1, CharSequence paramCharSequence, int paramInt2)
  {
    ch localch = new ch(paramInt1, 0);
    localch.setTitle(paramCharSequence);
    localch.setIcon(paramInt2);
    this.jaD.add(localch);
    return localch;
  }

  public final List aSj()
  {
    return this.jaD;
  }

  public final CharSequence aSk()
  {
    return this.lj;
  }

  public final boolean aSl()
  {
    return this.jaD.size() == 0;
  }

  public final MenuItem add(int paramInt)
  {
    ch localch = new ch(0, 0);
    localch.setTitle(paramInt);
    this.jaD.add(localch);
    return localch;
  }

  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ch localch = new ch(paramInt2, paramInt1);
    localch.setTitle(paramInt4);
    this.jaD.add(localch);
    return localch;
  }

  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    ch localch = new ch(paramInt2, paramInt1);
    localch.setTitle(paramCharSequence);
    this.jaD.add(localch);
    return localch;
  }

  public final MenuItem add(CharSequence paramCharSequence)
  {
    ch localch = new ch(0, 0);
    localch.setTitle(paramCharSequence);
    this.jaD.add(localch);
    return localch;
  }

  public final int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    return 0;
  }

  public final SubMenu addSubMenu(int paramInt)
  {
    return null;
  }

  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return null;
  }

  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return null;
  }

  public final SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return null;
  }

  public final MenuItem bf(int paramInt1, int paramInt2)
  {
    ch localch = new ch(paramInt1, 0);
    localch.setTitle(paramInt2);
    this.jaD.add(localch);
    return localch;
  }

  public final void clear()
  {
    Iterator localIterator = this.jaD.iterator();
    while (localIterator.hasNext())
    {
      MenuItem localMenuItem = (MenuItem)localIterator.next();
      ((ch)localMenuItem).a(null);
      ((ch)localMenuItem).setOnMenuItemClickListener(null);
    }
    this.jaD.clear();
    this.lj = null;
  }

  public final void clearHeader()
  {
  }

  public final void close()
  {
  }

  public final MenuItem findItem(int paramInt)
  {
    Iterator localIterator = this.jaD.iterator();
    while (localIterator.hasNext())
    {
      MenuItem localMenuItem = (MenuItem)localIterator.next();
      if (localMenuItem.getItemId() == paramInt)
        return localMenuItem;
    }
    return null;
  }

  public final MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.jaD.get(paramInt);
  }

  public final boolean hasVisibleItems()
  {
    return false;
  }

  public final boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public final MenuItem n(int paramInt1, int paramInt2, int paramInt3)
  {
    ch localch = new ch(paramInt1, 0);
    localch.setTitle(paramInt2);
    localch.setIcon(paramInt3);
    this.jaD.add(localch);
    return localch;
  }

  public final boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return false;
  }

  public final boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return false;
  }

  public final void removeGroup(int paramInt)
  {
  }

  public final void removeItem(int paramInt)
  {
  }

  public final void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
  }

  public final void setGroupVisible(int paramInt, boolean paramBoolean)
  {
  }

  public final ContextMenu setHeaderIcon(int paramInt)
  {
    return this;
  }

  public final ContextMenu setHeaderIcon(Drawable paramDrawable)
  {
    return this;
  }

  public final ContextMenu setHeaderTitle(int paramInt)
  {
    if (paramInt > 0)
      this = setHeaderTitle(ak.getContext().getString(paramInt));
    return this;
  }

  public final ContextMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null)
      return this;
    this.lj = paramCharSequence;
    return this;
  }

  public final ContextMenu setHeaderView(View paramView)
  {
    return this;
  }

  public final void setQwertyMode(boolean paramBoolean)
  {
  }

  public final int size()
  {
    if (this.jaD == null)
      return 0;
    return this.jaD.size();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cg
 * JD-Core Version:    0.6.2
 */