package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
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
import android.view.ViewDebug.CapturedViewProperty;

public final class s
  implements b
{
  private static String lE;
  private static String lF;
  private static String lG;
  private static String lH;
  private final int cg;
  private o hM;
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
  private n lA;
  private af lB;
  private boolean lC = false;
  private ContextMenu.ContextMenuInfo lD;
  private ak lw;
  private Runnable lx;
  private int ly = 0;
  private View lz;

  s(o paramo, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.hM = paramo;
    this.cg = paramInt2;
    this.jw = paramInt1;
    this.jx = paramInt3;
    this.jy = paramInt4;
    this.jz = paramCharSequence;
    this.ly = paramInt5;
  }

  private b F(View paramView)
  {
    this.lz = paramView;
    this.lA = null;
    if ((paramView != null) && (paramView.getId() == -1) && (this.cg > 0))
      paramView.setId(this.cg);
    this.hM.bO();
    return this;
  }

  public final b a(af paramaf)
  {
    this.lB = paramaf;
    return this;
  }

  public final b a(n paramn)
  {
    if (this.lA == paramn);
    do
    {
      return this;
      this.lz = null;
      if (this.lA != null)
        this.lA.a(null);
      this.lA = paramn;
      this.hM.m(true);
    }
    while (paramn == null);
    paramn.a(new t(this));
    return this;
  }

  final CharSequence a(ah paramah)
  {
    if ((paramah != null) && (paramah.bq()))
      return getTitleCondensed();
    return getTitle();
  }

  final void a(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.lD = paramContextMenuInfo;
  }

  final void b(ak paramak)
  {
    this.lw = paramak;
    paramak.setHeaderTitle(getTitle());
  }

  public final boolean bX()
  {
    if ((this.jG != null) && (this.jG.onMenuItemClick(this)));
    while (this.hM.a(this.hM.bT(), this))
      return true;
    if (this.lx != null)
    {
      this.lx.run();
      return true;
    }
    if (this.jB != null)
      try
      {
        this.hM.getContext().startActivity(this.jB);
        return true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
      }
    if (this.lA != null);
    return false;
  }

  final char bY()
  {
    return this.jD;
  }

  final String bZ()
  {
    char c = this.jD;
    if (c == 0)
      return "";
    StringBuilder localStringBuilder = new StringBuilder(lE);
    switch (c)
    {
    default:
      localStringBuilder.append(c);
    case '\n':
    case '\b':
    case ' ':
    }
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append(lF);
      continue;
      localStringBuilder.append(lG);
      continue;
      localStringBuilder.append(lH);
    }
  }

  final boolean ca()
  {
    return (this.hM.bJ()) && (this.jD != 0);
  }

  public final boolean cb()
  {
    return (0x4 & this.jH) != 0;
  }

  public final boolean cc()
  {
    return this.hM.bU();
  }

  public final boolean cd()
  {
    return (0x20 & this.jH) == 32;
  }

  public final boolean ce()
  {
    return (0x1 & this.ly) == 1;
  }

  public final boolean cf()
  {
    return (0x2 & this.ly) == 2;
  }

  public final boolean cg()
  {
    return (0x4 & this.ly) == 4;
  }

  public final n ch()
  {
    return this.lA;
  }

  public final boolean ci()
  {
    return ((0x8 & this.ly) != 0) && (this.lz != null);
  }

  public final boolean collapseActionView()
  {
    if ((0x8 & this.ly) == 0)
      return false;
    if (this.lz == null)
      return true;
    if (this.lB != null)
      this.lB.Q();
    return this.hM.g(this);
  }

  public final boolean expandActionView()
  {
    if (((0x8 & this.ly) == 0) || (this.lz == null))
      return false;
    if (this.lB != null)
      this.lB.P();
    return this.hM.f(this);
  }

  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("Implementation should use getSupportActionProvider!");
  }

  public final View getActionView()
  {
    if (this.lz != null)
      return this.lz;
    if (this.lA != null)
    {
      this.lz = this.lA.onCreateActionView();
      return this.lz;
    }
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
    if (this.jE != null)
      return this.jE;
    if (this.jF != 0)
    {
      Drawable localDrawable = this.hM.getResources().getDrawable(this.jF);
      this.jF = 0;
      this.jE = localDrawable;
      return localDrawable;
    }
    return null;
  }

  public final Intent getIntent()
  {
    return this.jB;
  }

  @ViewDebug.CapturedViewProperty
  public final int getItemId()
  {
    return this.cg;
  }

  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.lD;
  }

  public final char getNumericShortcut()
  {
    return this.jC;
  }

  public final int getOrder()
  {
    return this.jx;
  }

  public final int getOrdering()
  {
    return this.jy;
  }

  public final SubMenu getSubMenu()
  {
    return this.lw;
  }

  @ViewDebug.CapturedViewProperty
  public final CharSequence getTitle()
  {
    return this.jz;
  }

  public final CharSequence getTitleCondensed()
  {
    if (this.jA != null)
      return this.jA;
    return this.jz;
  }

  public final boolean hasSubMenu()
  {
    return this.lw != null;
  }

  public final boolean isActionViewExpanded()
  {
    return this.lC;
  }

  public final boolean isCheckable()
  {
    return (0x1 & this.jH) == 1;
  }

  public final boolean isChecked()
  {
    return (0x2 & this.jH) == 2;
  }

  public final boolean isEnabled()
  {
    return (0x10 & this.jH) != 0;
  }

  public final boolean isVisible()
  {
    return (this.lA == null) || ((0x8 & this.jH) == 0);
  }

  public final void n(boolean paramBoolean)
  {
    int i = 0xFFFFFFFB & this.jH;
    if (paramBoolean);
    for (int j = 4; ; j = 0)
    {
      this.jH = (j | i);
      return;
    }
  }

  final void o(boolean paramBoolean)
  {
    int i = this.jH;
    int j = 0xFFFFFFFD & this.jH;
    if (paramBoolean);
    for (int k = 2; ; k = 0)
    {
      this.jH = (k | j);
      if (i != this.jH)
        this.hM.m(false);
      return;
    }
  }

  final boolean p(boolean paramBoolean)
  {
    int i = this.jH;
    int j = 0xFFFFFFF7 & this.jH;
    if (paramBoolean);
    for (int k = 0; ; k = 8)
    {
      this.jH = (k | j);
      int m = this.jH;
      boolean bool = false;
      if (i != m)
        bool = true;
      return bool;
    }
  }

  public final void q(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.jH = (0x20 | this.jH);
      return;
    }
    this.jH = (0xFFFFFFDF & this.jH);
  }

  public final void r(boolean paramBoolean)
  {
    this.lC = paramBoolean;
    this.hM.m(false);
  }

  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("Implementation should use setSupportActionProvider!");
  }

  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (this.jD == paramChar)
      return this;
    this.jD = Character.toLowerCase(paramChar);
    this.hM.m(false);
    return this;
  }

  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i = this.jH;
    int j = 0xFFFFFFFE & this.jH;
    if (paramBoolean);
    for (int k = 1; ; k = 0)
    {
      this.jH = (k | j);
      if (i != this.jH)
        this.hM.m(false);
      return this;
    }
  }

  public final MenuItem setChecked(boolean paramBoolean)
  {
    if ((0x4 & this.jH) != 0)
    {
      this.hM.i(this);
      return this;
    }
    o(paramBoolean);
    return this;
  }

  public final MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (this.jH = (0x10 | this.jH); ; this.jH = (0xFFFFFFEF & this.jH))
    {
      this.hM.m(false);
      return this;
    }
  }

  public final MenuItem setIcon(int paramInt)
  {
    this.jE = null;
    this.jF = paramInt;
    this.hM.m(false);
    return this;
  }

  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.jF = 0;
    this.jE = paramDrawable;
    this.hM.m(false);
    return this;
  }

  public final MenuItem setIntent(Intent paramIntent)
  {
    this.jB = paramIntent;
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar)
  {
    if (this.jC == paramChar)
      return this;
    this.jC = paramChar;
    this.hM.m(false);
    return this;
  }

  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException("Implementation should use setSupportOnActionExpandListener!");
  }

  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.jG = paramOnMenuItemClickListener;
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.jC = paramChar1;
    this.jD = Character.toLowerCase(paramChar2);
    this.hM.m(false);
    return this;
  }

  public final void setShowAsAction(int paramInt)
  {
    switch (paramInt & 0x3)
    {
    default:
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    case 0:
    case 1:
    case 2:
    }
    this.ly = paramInt;
    this.hM.bO();
  }

  public final MenuItem setTitle(int paramInt)
  {
    return setTitle(this.hM.getContext().getString(paramInt));
  }

  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.jz = paramCharSequence;
    this.hM.m(false);
    if (this.lw != null)
      this.lw.setHeaderTitle(paramCharSequence);
    return this;
  }

  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.jA = paramCharSequence;
    if (paramCharSequence == null);
    this.hM.m(false);
    return this;
  }

  public final MenuItem setVisible(boolean paramBoolean)
  {
    if (p(paramBoolean))
      this.hM.bN();
    return this;
  }

  public final String toString()
  {
    return this.jz.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.s
 * JD-Core Version:    0.6.2
 */