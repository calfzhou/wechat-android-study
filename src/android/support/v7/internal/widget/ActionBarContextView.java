package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.tencent.mm.d;
import com.tencent.mm.p;

public class ActionBarContextView extends a
{
  private View iz;
  private Drawable mA;
  private View mD;
  private LinearLayout mE;
  private int mF;
  private int mG;
  private boolean mH;

  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, d.actionModeStyle);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cvu, paramInt, 0);
    setBackgroundDrawable(localTypedArray.getDrawable(p.cvv));
    this.mF = localTypedArray.getResourceId(p.cvz, 0);
    this.mG = localTypedArray.getResourceId(p.cvy, 0);
    this.mi = localTypedArray.getLayoutDimension(p.cvx, 0);
    this.mA = localTypedArray.getDrawable(p.cvw);
    localTypedArray.recycle();
  }

  public final void C(int paramInt)
  {
    this.mi = paramInt;
  }

  public final boolean bv()
  {
    if (this.mf != null)
      return this.mf.bv();
    return false;
  }

  public final boolean bw()
  {
    if (this.mf != null)
      return this.mf.bw();
    return false;
  }

  public final boolean bz()
  {
    if (this.mf != null)
      return this.mf.bz();
    return false;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.mf != null)
    {
      this.mf.bw();
      this.mf.by();
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    ViewGroup.MarginLayoutParams localMarginLayoutParams;
    int i1;
    if ((this.mD != null) && (this.mD.getVisibility() != 8))
    {
      localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.mD.getLayoutParams();
      i1 = i + localMarginLayoutParams.leftMargin;
    }
    for (int m = i1 + a(this.mD, i1, j, k) + localMarginLayoutParams.rightMargin; ; m = i)
    {
      if ((this.mE != null) && (this.iz == null) && (this.mE.getVisibility() != 8))
        m += a(this.mE, m, j, k);
      if (this.iz != null)
        a(this.iz, m, j, k);
      int n = paramInt3 - paramInt1 - getPaddingRight();
      if (this.me != null)
        b(this.me, n, j, k);
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    int j = 0;
    if (View.MeasureSpec.getMode(paramInt1) != i)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"FILL_PARENT\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    int k = View.MeasureSpec.getSize(paramInt1);
    int m;
    int i1;
    int i2;
    int i3;
    int i11;
    label284: int i12;
    label310: label317: int i7;
    label346: label376: int i8;
    label396: int i5;
    label432: int i6;
    if (this.mi > 0)
    {
      m = this.mi;
      int n = getPaddingTop() + getPaddingBottom();
      i1 = k - getPaddingLeft() - getPaddingRight();
      i2 = m - n;
      i3 = View.MeasureSpec.makeMeasureSpec(i2, -2147483648);
      if (this.mD != null)
      {
        int i13 = c(this.mD, i1, i3);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.mD.getLayoutParams();
        i1 = i13 - (localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin);
      }
      if ((this.me != null) && (this.me.getParent() == this))
        i1 = c(this.me, i1, i3);
      if ((this.mE != null) && (this.iz == null))
      {
        if (!this.mH)
          break label492;
        int i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mE.measure(i9, i3);
        int i10 = this.mE.getMeasuredWidth();
        if (i10 > i1)
          break label479;
        i11 = 1;
        if (i11 != 0)
          i1 -= i10;
        LinearLayout localLinearLayout = this.mE;
        if (i11 == 0)
          break label485;
        i12 = 0;
        localLinearLayout.setVisibility(i12);
      }
      if (this.iz != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.iz.getLayoutParams();
        if (localLayoutParams.width == -2)
          break label508;
        i7 = i;
        if (localLayoutParams.width >= 0)
          i1 = Math.min(localLayoutParams.width, i1);
        if (localLayoutParams.height == -2)
          break label515;
        if (localLayoutParams.height < 0)
          break label521;
        i8 = Math.min(localLayoutParams.height, i2);
        this.iz.measure(View.MeasureSpec.makeMeasureSpec(i1, i7), View.MeasureSpec.makeMeasureSpec(i8, i));
      }
      if (this.mi > 0)
        break label537;
      int i4 = getChildCount();
      i5 = 0;
      if (j >= i4)
        break label528;
      i6 = n + getChildAt(j).getMeasuredHeight();
      if (i6 <= i5)
        break label546;
    }
    while (true)
    {
      j++;
      i5 = i6;
      break label432;
      m = View.MeasureSpec.getSize(paramInt2);
      break;
      label479: i11 = 0;
      break label284;
      label485: i12 = 8;
      break label310;
      label492: i1 = c(this.mE, i1, i3);
      break label317;
      label508: i7 = -2147483648;
      break label346;
      label515: i = -2147483648;
      break label376;
      label521: i8 = i2;
      break label396;
      label528: setMeasuredDimension(k, i5);
      return;
      label537: setMeasuredDimension(k, m);
      return;
      label546: i6 = i5;
    }
  }

  public final void s(boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams;
    if (this.mg != paramBoolean)
      if (this.mf != null)
      {
        localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
        if (paramBoolean)
          break label94;
        this.me = ((ActionMenuView)this.mf.b(this));
        this.me.setBackgroundDrawable(null);
        ViewGroup localViewGroup2 = (ViewGroup)this.me.getParent();
        if (localViewGroup2 != null)
          localViewGroup2.removeView(this.me);
        addView(this.me, localLayoutParams);
      }
    while (true)
    {
      super.s(paramBoolean);
      return;
      label94: this.mf.x(getContext().getResources().getDisplayMetrics().widthPixels);
      this.mf.bu();
      localLayoutParams.width = -1;
      localLayoutParams.height = this.mi;
      this.me = ((ActionMenuView)this.mf.b(this));
      this.me.setBackgroundDrawable(this.mA);
      ViewGroup localViewGroup1 = (ViewGroup)this.me.getParent();
      if (localViewGroup1 != null)
        localViewGroup1.removeView(this.me);
      this.ie.addView(this.me, localLayoutParams);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContextView
 * JD-Core Version:    0.6.2
 */