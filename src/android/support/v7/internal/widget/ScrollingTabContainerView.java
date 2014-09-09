package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.c;
import android.support.v7.internal.view.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.d;
import com.tencent.mm.k;

public final class ScrollingTabContainerView extends HorizontalScrollView
  implements w
{
  private final LayoutInflater gJ;
  private int mi;
  Runnable nj;
  private ao pT;
  private LinearLayout pU;
  private ap pV;
  private boolean pW;
  int pX;
  int pY;
  private int pZ;

  public ScrollingTabContainerView(Context paramContext)
  {
    super(paramContext);
    this.gJ = LayoutInflater.from(paramContext);
    setHorizontalScrollBarEnabled(false);
    a locala = a.d(paramContext);
    C(locala.bg());
    this.pY = locala.bi();
    this.pU = ((LinearLayout)this.gJ.inflate(k.bak, this, false));
    addView(this.pU, new ViewGroup.LayoutParams(-2, -1));
  }

  private void C(int paramInt)
  {
    this.mi = paramInt;
    requestLayout();
  }

  private ScrollingTabContainerView.TabView a(c paramc, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = (ScrollingTabContainerView.TabView)this.gJ.inflate(k.baj, this.pU, false);
    localTabView.a(this, paramc, paramBoolean);
    if (paramBoolean)
    {
      localTabView.setBackgroundDrawable(null);
      localTabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.mi));
      return localTabView;
    }
    localTabView.setFocusable(true);
    if (this.pT == null)
      this.pT = new ao(this, (byte)0);
    localTabView.setOnClickListener(this.pT);
    return localTabView;
  }

  private boolean cY()
  {
    if (!cx())
      return false;
    removeView(this.pV);
    addView(this.pU, new ViewGroup.LayoutParams(-2, -1));
    L(this.pV.oz);
    return false;
  }

  private boolean cx()
  {
    return (this.pV != null) && (this.pV.getParent() == this);
  }

  public final void L(int paramInt)
  {
    this.pZ = paramInt;
    int i = this.pU.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = this.pU.getChildAt(j);
      if (j == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        if (bool)
          M(paramInt);
        j++;
        break;
      }
    }
  }

  public final void M(int paramInt)
  {
    View localView = this.pU.getChildAt(paramInt);
    if (this.nj != null)
      removeCallbacks(this.nj);
    this.nj = new am(this, localView);
    post(this.nj);
  }

  public final void N(int paramInt)
  {
    ((ScrollingTabContainerView.TabView)this.pU.getChildAt(paramInt)).update();
    if (this.pV != null)
      ((an)this.pV.mk).notifyDataSetChanged();
    if (this.pW)
      requestLayout();
  }

  public final void b(c paramc, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = a(paramc, false);
    this.pU.addView(localTabView, new LinearLayout.LayoutParams(0, -1, 1.0F));
    if (this.pV != null)
      ((an)this.pV.mk).notifyDataSetChanged();
    if (paramBoolean)
      localTabView.setSelected(true);
    if (this.pW)
      requestLayout();
  }

  public final void i(View paramView, int paramInt)
  {
    ((ScrollingTabContainerView.TabView)paramView).cZ().select();
  }

  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.nj != null)
      post(this.nj);
  }

  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    a locala = a.d(getContext());
    C(locala.bg());
    this.pY = locala.bi();
  }

  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.nj != null)
      removeCallbacks(this.nj);
  }

  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    label72: label87: int m;
    if (j == 1073741824)
    {
      bool = i;
      setFillViewport(bool);
      int k = this.pU.getChildCount();
      if ((k <= i) || ((j != 1073741824) && (j != -2147483648)))
        break label338;
      if (k <= 2)
        break label325;
      this.pX = ((int)(0.4F * View.MeasureSpec.getSize(paramInt1)));
      this.pX = Math.min(this.pX, this.pY);
      m = View.MeasureSpec.makeMeasureSpec(this.mi, 1073741824);
      if ((bool) || (!this.pW))
        break label346;
      label110: if (i == 0)
        break label359;
      this.pU.measure(0, m);
      if (this.pU.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1))
        break label351;
      if (!cx())
      {
        if (this.pV == null)
        {
          ap localap = new ap(getContext(), d.actionDropDownStyle);
          localap.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
          localap.b(this);
          this.pV = localap;
        }
        removeView(this.pU);
        addView(this.pV, new ViewGroup.LayoutParams(-2, -1));
        if (this.pV.mk == null)
          this.pV.setAdapter(new an(this, (byte)0));
        if (this.nj != null)
        {
          removeCallbacks(this.nj);
          this.nj = null;
        }
        this.pV.setSelection(this.pZ);
      }
    }
    while (true)
    {
      int n = getMeasuredWidth();
      super.onMeasure(paramInt1, m);
      int i1 = getMeasuredWidth();
      if ((bool) && (n != i1))
        L(this.pZ);
      return;
      bool = false;
      break;
      label325: this.pX = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label72;
      label338: this.pX = -1;
      break label87;
      label346: i = 0;
      break label110;
      label351: cY();
      continue;
      label359: cY();
    }
  }

  public final void x(boolean paramBoolean)
  {
    this.pW = paramBoolean;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView
 * JD-Core Version:    0.6.2
 */