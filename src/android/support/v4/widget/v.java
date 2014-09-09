package android.support.v4.widget;

import android.view.View;

final class v extends af
{
  private v(SlidingPaneLayout paramSlidingPaneLayout)
  {
  }

  public final void c(View paramView, float paramFloat)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i = this.hb.getPaddingLeft() + localLayoutParams.leftMargin;
    if ((paramFloat > 0.0F) || ((paramFloat == 0.0F) && (SlidingPaneLayout.c(this.hb) > 0.5F)))
      i += SlidingPaneLayout.e(this.hb);
    SlidingPaneLayout.b(this.hb).g(i, paramView.getTop());
    this.hb.invalidate();
  }

  public final void d(View paramView, int paramInt)
  {
    SlidingPaneLayout.a(this.hb, paramInt);
    this.hb.invalidate();
  }

  public final int e(View paramView, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(this.hb).getLayoutParams();
    int i = this.hb.getPaddingLeft() + localLayoutParams.leftMargin;
    int j = i + SlidingPaneLayout.e(this.hb);
    return Math.min(Math.max(paramInt, i), j);
  }

  public final void f(int paramInt1, int paramInt2)
  {
    SlidingPaneLayout.b(this.hb).f(SlidingPaneLayout.d(this.hb), paramInt2);
  }

  public final void q(int paramInt)
  {
    if (SlidingPaneLayout.b(this.hb).aC() == 0)
    {
      if (SlidingPaneLayout.c(this.hb) == 0.0F)
      {
        this.hb.A(SlidingPaneLayout.d(this.hb));
        SlidingPaneLayout localSlidingPaneLayout2 = this.hb;
        SlidingPaneLayout.d(this.hb);
        localSlidingPaneLayout2.az();
        SlidingPaneLayout.a(this.hb, false);
      }
    }
    else
      return;
    SlidingPaneLayout localSlidingPaneLayout1 = this.hb;
    SlidingPaneLayout.d(this.hb);
    localSlidingPaneLayout1.ay();
    SlidingPaneLayout.a(this.hb, true);
  }

  public final boolean w(View paramView)
  {
    if (SlidingPaneLayout.a(this.hb))
      return false;
    return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).hd;
  }

  public final void x(View paramView)
  {
    this.hb.aA();
  }

  public final int y(View paramView)
  {
    return SlidingPaneLayout.e(this.hb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.v
 * JD-Core Version:    0.6.2
 */