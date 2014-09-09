package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v7.internal.view.menu.ae;
import android.support.v7.internal.view.menu.ak;
import android.support.v7.internal.view.menu.o;
import android.support.v7.internal.view.menu.s;
import android.view.View;
import android.widget.LinearLayout;

final class h
  implements ae
{
  o hM;
  s nr;

  private h(ActionBarView paramActionBarView)
  {
  }

  public final void a(Context paramContext, o paramo)
  {
    if ((this.hM != null) && (this.nr != null))
      this.hM.g(this.nr);
    this.hM = paramo;
  }

  public final void a(o paramo, boolean paramBoolean)
  {
  }

  public final boolean a(ak paramak)
  {
    return false;
  }

  public final boolean bB()
  {
    return false;
  }

  public final boolean d(s params)
  {
    this.nq.nl = params.getActionView();
    ActionBarView.e(this.nq).setIcon(ActionBarView.d(this.nq).getConstantState().newDrawable(this.nq.getResources()));
    this.nr = params;
    if (this.nq.nl.getParent() != this.nq)
      this.nq.addView(this.nq.nl);
    if (ActionBarView.e(this.nq).getParent() != this.nq)
      this.nq.addView(ActionBarView.e(this.nq));
    ActionBarView.f(this.nq).setVisibility(8);
    if (ActionBarView.g(this.nq) != null)
      ActionBarView.g(this.nq).setVisibility(8);
    if (ActionBarView.h(this.nq) != null)
      ActionBarView.h(this.nq).setVisibility(8);
    if (ActionBarView.i(this.nq) != null)
      ActionBarView.i(this.nq).setVisibility(8);
    if (ActionBarView.j(this.nq) != null)
      ActionBarView.j(this.nq).setVisibility(8);
    this.nq.requestLayout();
    params.r(true);
    if ((this.nq.nl instanceof android.support.v7.a.b))
      ((android.support.v7.a.b)this.nq.nl).onActionViewExpanded();
    return true;
  }

  public final boolean e(s params)
  {
    if ((this.nq.nl instanceof android.support.v7.a.b))
      ((android.support.v7.a.b)this.nq.nl).onActionViewCollapsed();
    this.nq.removeView(this.nq.nl);
    this.nq.removeView(ActionBarView.e(this.nq));
    this.nq.nl = null;
    if ((0x2 & ActionBarView.k(this.nq)) != 0)
      ActionBarView.f(this.nq).setVisibility(0);
    if ((0x8 & ActionBarView.k(this.nq)) != 0)
    {
      if (ActionBarView.g(this.nq) != null)
        break label245;
      ActionBarView.l(this.nq);
    }
    while (true)
    {
      if ((ActionBarView.h(this.nq) != null) && (ActionBarView.m(this.nq) == 2))
        ActionBarView.h(this.nq).setVisibility(0);
      if ((ActionBarView.i(this.nq) != null) && (ActionBarView.m(this.nq) == 1))
        ActionBarView.i(this.nq).setVisibility(0);
      if ((ActionBarView.j(this.nq) != null) && ((0x10 & ActionBarView.k(this.nq)) != 0))
        ActionBarView.j(this.nq).setVisibility(0);
      ActionBarView.e(this.nq).setIcon(null);
      this.nr = null;
      this.nq.requestLayout();
      params.r(false);
      return true;
      label245: ActionBarView.g(this.nq).setVisibility(0);
    }
  }

  public final void j(boolean paramBoolean)
  {
    int k;
    if (this.nr != null)
    {
      if (this.hM == null)
        break label79;
      int j = this.hM.size();
      k = 0;
      if (k >= j)
        break label79;
      if ((android.support.v4.a.a.b)this.hM.getItem(k) != this.nr)
        break label73;
    }
    label73: label79: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        e(this.nr);
      return;
      k++;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.h
 * JD-Core Version:    0.6.2
 */