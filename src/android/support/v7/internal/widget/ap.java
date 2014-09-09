package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;
import com.tencent.mm.p;

final class ap extends AbsSpinnerICS
  implements DialogInterface.OnClickListener
{
  private Rect dR = new Rect();
  private int ei;
  int oX;
  private au qf;
  private ar qg;

  ap(Context paramContext, int paramInt)
  {
    this(paramContext, null, paramInt);
  }

  private ap(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, null, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, p.cyE, paramInt, 0);
    switch (localTypedArray.getInt(p.cyL, 0))
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      this.ei = localTypedArray.getInt(p.cyI, 17);
      this.qf.h(localTypedArray.getString(p.cyK));
      localTypedArray.recycle();
      if (this.qg != null)
      {
        this.qf.setAdapter(this.qg);
        this.qg = null;
      }
      return;
      this.qf = new aq(this, (byte)0);
      continue;
      as localas = new as(this, paramContext, null, paramInt);
      this.oX = localTypedArray.getLayoutDimension(p.cyH, -2);
      localas.setBackgroundDrawable(localTypedArray.getDrawable(p.cyJ));
      int i = localTypedArray.getDimensionPixelOffset(p.cyG, 0);
      if (i != 0)
        localas.setVerticalOffset(i);
      int j = localTypedArray.getDimensionPixelOffset(p.cyF, 0);
      if (j != 0)
        localas.setHorizontalOffset(j);
      this.qf = localas;
    }
  }

  private void H(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = generateDefaultLayoutParams();
    addViewInLayout(paramView, 0, localLayoutParams);
    paramView.setSelected(hasFocus());
    int i = ViewGroup.getChildMeasureSpec(this.ml, this.ms.top + this.ms.bottom, localLayoutParams.height);
    paramView.measure(ViewGroup.getChildMeasureSpec(this.mm, this.ms.left + this.ms.right, localLayoutParams.width), i);
    int j = this.ms.top + (getMeasuredHeight() - this.ms.bottom - this.ms.top - paramView.getMeasuredHeight()) / 2;
    int k = j + paramView.getMeasuredHeight();
    paramView.layout(0, j, 0 + paramView.getMeasuredWidth(), k);
  }

  private View O(int paramInt)
  {
    if (!this.oy)
    {
      View localView2 = this.mt.D(paramInt);
      if (localView2 != null)
      {
        H(localView2);
        return localView2;
      }
    }
    View localView1 = this.mk.getView(paramInt, null, this);
    H(localView1);
    return localView1;
  }

  final int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null)
      return 0;
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = Math.max(0, this.oz);
    int m = Math.min(paramSpinnerAdapter.getCount(), k + 15);
    int n = Math.max(0, k - (15 - (m - k)));
    View localView1 = null;
    int i1 = 0;
    int i2 = 0;
    int i3;
    if (n < m)
    {
      i3 = paramSpinnerAdapter.getItemViewType(n);
      if (i3 == i2)
        break label200;
    }
    for (View localView2 = null; ; localView2 = localView1)
    {
      localView1 = paramSpinnerAdapter.getView(n, localView2, this);
      if (localView1.getLayoutParams() == null)
        localView1.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      localView1.measure(i, j);
      i1 = Math.max(i1, localView1.getMeasuredWidth());
      n++;
      i2 = i3;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.dR);
        return i1 + (this.dR.left + this.dR.right);
      }
      return i1;
      label200: i3 = i2;
    }
  }

  public final void a(w paramw)
  {
    throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
  }

  final void b(w paramw)
  {
    super.a(paramw);
  }

  public final int getBaseline()
  {
    int i = -1;
    View localView;
    if (getChildCount() > 0)
      localView = getChildAt(0);
    while (true)
    {
      if (localView != null)
      {
        int k = localView.getBaseline();
        if (k >= 0)
          i = k + localView.getTop();
      }
      return i;
      SpinnerAdapter localSpinnerAdapter = this.mk;
      localView = null;
      if (localSpinnerAdapter != null)
      {
        int j = this.mk.getCount();
        localView = null;
        if (j > 0)
        {
          localView = O(0);
          this.mt.b(0, localView);
          removeAllViewsInLayout();
        }
      }
    }
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    setSelection(paramInt);
    paramDialogInterface.dismiss();
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.qf != null) && (this.qf.isShowing()))
      this.qf.dismiss();
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.as = true;
    int i = this.ms.left;
    int j = getRight() - getLeft() - this.ms.left - this.ms.right;
    if (this.oy)
      handleDataChanged();
    if (this.oE == 0)
    {
      co();
      this.as = false;
      return;
    }
    if (this.oz >= 0)
      I(this.oz);
    int k = getChildCount();
    c localc = this.mt;
    int m = this.ol;
    for (int n = 0; n < k; n++)
    {
      View localView2 = getChildAt(n);
      localc.b(m + n, localView2);
    }
    removeAllViewsInLayout();
    this.ol = this.oB;
    View localView1 = O(this.oB);
    int i1 = localView1.getMeasuredWidth();
    switch (0x7 & this.ei)
    {
    default:
    case 1:
    case 5:
    }
    while (true)
    {
      localView1.offsetLeftAndRight(i);
      this.mt.clear();
      invalidate();
      cQ();
      this.oy = false;
      this.ot = false;
      J(this.oB);
      break;
      i = i + j / 2 - i1 / 2;
      continue;
      i = i + j - i1;
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.qf != null) && (View.MeasureSpec.getMode(paramInt1) == -2147483648))
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(this.mk, getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
  }

  public final boolean performClick()
  {
    boolean bool = super.performClick();
    if (!bool)
    {
      bool = true;
      if (!this.qf.isShowing())
        this.qf.show();
    }
    return bool;
  }

  public final void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    super.setAdapter(paramSpinnerAdapter);
    if (this.qf != null)
    {
      this.qf.setAdapter(new ar(paramSpinnerAdapter));
      return;
    }
    this.qg = new ar(paramSpinnerAdapter);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ap
 * JD-Core Version:    0.6.2
 */