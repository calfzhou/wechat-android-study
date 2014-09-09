package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.p;

public class LinearLayoutICS extends LinearLayout
{
  private final Drawable oO;
  private final int oP;
  private final int oQ;
  private final int oR;
  private final int oS;

  public LinearLayoutICS(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cwW);
    this.oO = localTypedArray.getDrawable(p.cwX);
    if (this.oO != null)
      this.oP = this.oO.getIntrinsicWidth();
    for (this.oQ = this.oO.getIntrinsicHeight(); ; this.oQ = 0)
    {
      this.oR = localTypedArray.getInt(p.cwZ, 0);
      this.oS = localTypedArray.getDimensionPixelSize(p.cwY, 0);
      localTypedArray.recycle();
      Drawable localDrawable = this.oO;
      boolean bool = false;
      if (localDrawable == null)
        bool = true;
      setWillNotDraw(bool);
      return;
      this.oP = 0;
    }
  }

  private void a(Canvas paramCanvas, int paramInt)
  {
    this.oO.setBounds(getPaddingLeft() + this.oS, paramInt, getWidth() - getPaddingRight() - this.oS, paramInt + this.oQ);
    this.oO.draw(paramCanvas);
  }

  private void b(Canvas paramCanvas, int paramInt)
  {
    this.oO.setBounds(paramInt, getPaddingTop() + this.oS, paramInt + this.oP, getHeight() - getPaddingBottom() - this.oS);
    this.oO.draw(paramCanvas);
  }

  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    LinearLayout.LayoutParams localLayoutParams;
    if (this.oO != null)
    {
      i = indexOfChild(paramView);
      j = getChildCount();
      localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
      if (getOrientation() != 1)
        break label97;
      if (!y(i))
        break label67;
      localLayoutParams.topMargin = this.oQ;
    }
    while (true)
    {
      super.measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
      label67: if ((i == j - 1) && (y(j)))
      {
        localLayoutParams.bottomMargin = this.oQ;
        continue;
        label97: if (y(i))
          localLayoutParams.leftMargin = this.oP;
        else if ((i == j - 1) && (y(j)))
          localLayoutParams.rightMargin = this.oP;
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    View localView3;
    int i1;
    if (getOrientation() == 1)
    {
      int m = getChildCount();
      for (int n = 0; n < m; n++)
      {
        View localView4 = getChildAt(n);
        if ((localView4 != null) && (localView4.getVisibility() != 8) && (y(n)))
        {
          LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)localView4.getLayoutParams();
          a(paramCanvas, localView4.getTop() - localLayoutParams2.topMargin);
        }
      }
      if (y(m))
      {
        localView3 = getChildAt(m - 1);
        if (localView3 != null)
          break label136;
        i1 = getHeight() - getPaddingBottom() - this.oQ;
        a(paramCanvas, i1);
      }
    }
    label136: int i;
    do
    {
      return;
      i1 = localView3.getBottom();
      break;
      i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView2 = getChildAt(j);
        if ((localView2 != null) && (localView2.getVisibility() != 8) && (y(j)))
        {
          LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView2.getLayoutParams();
          b(paramCanvas, localView2.getLeft() - localLayoutParams1.leftMargin);
        }
      }
    }
    while (!y(i));
    View localView1 = getChildAt(i - 1);
    if (localView1 == null);
    for (int k = getWidth() - getPaddingRight() - this.oP; ; k = localView1.getRight())
    {
      b(paramCanvas, k);
      return;
    }
  }

  protected boolean y(int paramInt)
  {
    if (paramInt == 0)
      if ((0x1 & this.oR) == 0);
    do
    {
      return true;
      return false;
      if (paramInt != getChildCount())
        break;
    }
    while ((0x4 & this.oR) != 0);
    return false;
    if ((0x2 & this.oR) != 0)
      for (int i = paramInt - 1; ; i--)
      {
        if (i < 0)
          break label74;
        if (getChildAt(i).getVisibility() != 8)
          break;
      }
    return false;
    label74: return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.LinearLayoutICS
 * JD-Core Version:    0.6.2
 */