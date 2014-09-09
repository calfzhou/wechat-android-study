package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.tencent.mm.d;
import com.tencent.mm.e;
import com.tencent.mm.p;

abstract class a extends ViewGroup
{
  protected ActionBarContainer ie;
  protected ActionMenuView me;
  protected ActionMenuPresenter mf;
  protected boolean mg;
  protected boolean mh;
  protected int mi;

  a(Context paramContext)
  {
    super(paramContext);
  }

  a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = paramInt2 + (paramInt3 - j) / 2;
    paramView.layout(paramInt1, k, paramInt1 + i, j + k);
    return i;
  }

  protected static int b(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = paramInt2 + (paramInt3 - j) / 2;
    paramView.layout(paramInt1 - i, k, paramInt1, j + k);
    return i;
  }

  protected static int c(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, 0 + (paramInt1 - paramView.getMeasuredWidth()));
  }

  public void C(int paramInt)
  {
    this.mi = paramInt;
    requestLayout();
  }

  public void a(ActionBarContainer paramActionBarContainer)
  {
    this.ie = paramActionBarContainer;
  }

  public boolean bA()
  {
    return (this.mf != null) && (this.mf.bA());
  }

  public boolean bv()
  {
    if (this.mf != null)
      return this.mf.bv();
    return false;
  }

  public boolean bw()
  {
    if (this.mf != null)
      return this.mf.bw();
    return false;
  }

  public boolean bz()
  {
    if (this.mf != null)
      return this.mf.bz();
    return false;
  }

  public int cm()
  {
    return getVisibility();
  }

  public void cn()
  {
    post(new b(this));
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    TypedArray localTypedArray = getContext().obtainStyledAttributes(null, p.cuS, d.actionBarStyle, 0);
    C(localTypedArray.getLayoutDimension(p.cuY, 0));
    localTypedArray.recycle();
    if (this.mh)
      s(getContext().getResources().getBoolean(e.NO));
    if (this.mf != null)
      this.mf.aQ();
  }

  public void s(boolean paramBoolean)
  {
    this.mg = paramBoolean;
  }

  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
      super.setVisibility(paramInt);
  }

  public void t(boolean paramBoolean)
  {
    this.mh = paramBoolean;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.a
 * JD-Core Version:    0.6.2
 */