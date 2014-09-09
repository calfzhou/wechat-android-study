package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class ak extends o
  implements SubMenu
{
  private o mc;
  private s md;

  public ak(Context paramContext, o paramo, s params)
  {
    super(paramContext);
    this.mc = paramo;
    this.md = params;
  }

  public final void a(p paramp)
  {
    this.mc.a(paramp);
  }

  public final boolean a(o paramo, MenuItem paramMenuItem)
  {
    return (super.a(paramo, paramMenuItem)) || (this.mc.a(paramo, paramMenuItem));
  }

  public final boolean bI()
  {
    return this.mc.bI();
  }

  public final boolean bJ()
  {
    return this.mc.bJ();
  }

  public final o bT()
  {
    return this.mc;
  }

  public final Menu cl()
  {
    return this.mc;
  }

  public final void clearHeader()
  {
  }

  public final boolean f(s params)
  {
    return this.mc.f(params);
  }

  public final boolean g(s params)
  {
    return this.mc.g(params);
  }

  public final MenuItem getItem()
  {
    return this.md;
  }

  public final SubMenu setHeaderIcon(int paramInt)
  {
    super.a(getContext().getResources().getDrawable(paramInt));
    return this;
  }

  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    return this;
  }

  public final SubMenu setHeaderTitle(int paramInt)
  {
    super.e(getContext().getResources().getString(paramInt));
    return this;
  }

  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.e(paramCharSequence);
    return this;
  }

  public final SubMenu setHeaderView(View paramView)
  {
    super.E(paramView);
    return this;
  }

  public final SubMenu setIcon(int paramInt)
  {
    this.md.setIcon(paramInt);
    return this;
  }

  public final SubMenu setIcon(Drawable paramDrawable)
  {
    this.md.setIcon(paramDrawable);
    return this;
  }

  public final void setQwertyMode(boolean paramBoolean)
  {
    this.mc.setQwertyMode(paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ak
 * JD-Core Version:    0.6.2
 */