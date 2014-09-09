package android.support.v7.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.support.v4.a.a.c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class al extends aj
  implements c
{
  al(SubMenu paramSubMenu)
  {
    super(paramSubMenu);
  }

  public final void clearHeader()
  {
    ((SubMenu)this.kE).clearHeader();
  }

  public final MenuItem getItem()
  {
    return h(((SubMenu)this.kE).getItem());
  }

  public final SubMenu setHeaderIcon(int paramInt)
  {
    ((SubMenu)this.kE).setHeaderIcon(paramInt);
    return this;
  }

  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    ((SubMenu)this.kE).setHeaderIcon(paramDrawable);
    return this;
  }

  public final SubMenu setHeaderTitle(int paramInt)
  {
    ((SubMenu)this.kE).setHeaderTitle(paramInt);
    return this;
  }

  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    ((SubMenu)this.kE).setHeaderTitle(paramCharSequence);
    return this;
  }

  public final SubMenu setHeaderView(View paramView)
  {
    ((SubMenu)this.kE).setHeaderView(paramView);
    return this;
  }

  public final SubMenu setIcon(int paramInt)
  {
    ((SubMenu)this.kE).setIcon(paramInt);
    return this;
  }

  public final SubMenu setIcon(Drawable paramDrawable)
  {
    ((SubMenu)this.kE).setIcon(paramDrawable);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.al
 * JD-Core Version:    0.6.2
 */