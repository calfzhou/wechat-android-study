package android.support.v4.widget;

import android.view.View;

final class h extends af
{
  private final int ei;
  private ac gC;
  private final Runnable gD = new i(this);

  public h(DrawerLayout paramDrawerLayout, int paramInt)
  {
    this.ei = paramInt;
  }

  private void av()
  {
    int i = 3;
    if (this.ei == i)
      i = 5;
    View localView = this.gv.p(i);
    if (localView != null)
      this.gv.u(localView);
  }

  public final void a(ac paramac)
  {
    this.gC = paramac;
  }

  public final void au()
  {
    this.gv.removeCallbacks(this.gD);
  }

  public final void aw()
  {
    this.gv.postDelayed(this.gD, 160L);
  }

  public final void c(View paramView, float paramFloat)
  {
    float f = DrawerLayout.p(paramView);
    int i = paramView.getWidth();
    int j;
    if (DrawerLayout.c(paramView, 3))
      if ((paramFloat > 0.0F) || ((paramFloat == 0.0F) && (f > 0.5F)))
        j = 0;
    while (true)
    {
      this.gC.g(j, paramView.getTop());
      this.gv.invalidate();
      return;
      j = -i;
      continue;
      j = this.gv.getWidth();
      if ((paramFloat < 0.0F) || ((paramFloat == 0.0F) && (f < 0.5F)))
        j -= i;
    }
  }

  public final void d(View paramView, int paramInt)
  {
    int i = paramView.getWidth();
    float f;
    if (DrawerLayout.c(paramView, 3))
    {
      f = (i + paramInt) / i;
      this.gv.b(paramView, f);
      if (f != 0.0F)
        break label79;
    }
    label79: for (int j = 4; ; j = 0)
    {
      paramView.setVisibility(j);
      this.gv.invalidate();
      return;
      f = (this.gv.getWidth() - paramInt) / i;
      break;
    }
  }

  public final int e(View paramView, int paramInt)
  {
    if (DrawerLayout.c(paramView, 3))
      return Math.max(-paramView.getWidth(), Math.min(paramInt, 0));
    int i = this.gv.getWidth();
    return Math.max(i - paramView.getWidth(), Math.min(paramInt, i));
  }

  public final void f(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0x1) == 1);
    for (View localView = this.gv.p(3); ; localView = this.gv.p(5))
    {
      if ((localView != null) && (this.gv.o(localView) == 0))
        this.gC.f(localView, paramInt2);
      return;
    }
  }

  public final void q(int paramInt)
  {
    DrawerLayout localDrawerLayout = this.gv;
    localDrawerLayout.a(paramInt, this.gC.aE());
  }

  public final boolean w(View paramView)
  {
    return (DrawerLayout.s(paramView)) && (DrawerLayout.c(paramView, this.ei)) && (this.gv.o(paramView) == 0);
  }

  public final void x(View paramView)
  {
    ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).gx = false;
    av();
  }

  public final int y(View paramView)
  {
    return paramView.getWidth();
  }

  public final int z(View paramView)
  {
    return paramView.getTop();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.h
 * JD-Core Version:    0.6.2
 */