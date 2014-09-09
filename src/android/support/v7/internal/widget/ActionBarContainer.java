package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.i;
import com.tencent.mm.p;

public class ActionBarContainer extends FrameLayout
{
  private ActionBarView hK;
  private Drawable kK;
  private Drawable mA;
  private boolean mB;
  private boolean mC;
  private boolean mx;
  private View my;
  private Drawable mz;

  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBackgroundDrawable(null);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cuS);
    this.kK = localTypedArray.getDrawable(p.cuT);
    this.mz = localTypedArray.getDrawable(p.cuV);
    if (getId() == i.aRL)
    {
      this.mB = bool;
      this.mA = localTypedArray.getDrawable(p.cuU);
    }
    localTypedArray.recycle();
    if (this.mB)
      if (this.mA != null);
    while (true)
    {
      setWillNotDraw(bool);
      return;
      bool = false;
      continue;
      if ((this.kK != null) || (this.mz != null))
        bool = false;
    }
  }

  public final void a(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    if (this.my != null)
      removeView(this.my);
    this.my = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null)
    {
      addView(paramScrollingTabContainerView);
      ViewGroup.LayoutParams localLayoutParams = paramScrollingTabContainerView.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramScrollingTabContainerView.x(false);
    }
  }

  public final void b(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.kK != null)
    {
      this.kK.setCallback(null);
      unscheduleDrawable(this.kK);
    }
    this.kK = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    if (this.mB)
      if (this.mA != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.kK != null) || (this.mz != null))
        bool = false;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.kK != null) && (this.kK.isStateful()))
      this.kK.setState(getDrawableState());
    if ((this.mz != null) && (this.mz.isStateful()))
      this.mz.setState(getDrawableState());
    if ((this.mA != null) && (this.mA.isStateful()))
      this.mA.setState(getDrawableState());
  }

  public void onDraw(Canvas paramCanvas)
  {
    if ((getWidth() == 0) || (getHeight() == 0));
    do
    {
      do
      {
        return;
        if (!this.mB)
          break;
      }
      while (this.mA == null);
      this.mA.draw(paramCanvas);
      return;
      if (this.kK != null)
        this.kK.draw(paramCanvas);
    }
    while ((this.mz == null) || (!this.mC));
    this.mz.draw(paramCanvas);
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.hK = ((ActionBarView)findViewById(i.aee));
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.mx) || (super.onInterceptTouchEvent(paramMotionEvent));
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i;
    if ((this.my != null) && (this.my.getVisibility() != 8))
      i = bool1;
    int j;
    int k;
    while ((this.my != null) && (this.my.getVisibility() != 8))
    {
      j = getMeasuredHeight();
      k = this.my.getMeasuredHeight();
      if ((0x2 & this.hK.getDisplayOptions()) != 0)
        break label199;
      int m = getChildCount();
      int n = 0;
      while (true)
        if (n < m)
        {
          View localView = getChildAt(n);
          if ((localView != this.my) && (!this.hK.cx()))
            localView.offsetTopAndBottom(k);
          n++;
          continue;
          i = 0;
          break;
        }
      this.my.layout(paramInt1, 0, paramInt3, k);
    }
    if (this.mB)
    {
      if (this.mA == null)
        break label353;
      this.mA.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    while (true)
    {
      if (bool1)
        invalidate();
      return;
      label199: this.my.layout(paramInt1, j - k, paramInt3, j);
      break;
      if (this.kK != null)
        this.kK.setBounds(this.hK.getLeft(), this.hK.getTop(), this.hK.getRight(), this.hK.getBottom());
      for (boolean bool2 = bool1; ; bool2 = false)
      {
        boolean bool3 = false;
        if (i != 0)
        {
          Drawable localDrawable = this.mz;
          bool3 = false;
          if (localDrawable != null)
            bool3 = bool1;
        }
        this.mC = bool3;
        if (bool3)
        {
          this.mz.setBounds(this.my.getLeft(), this.my.getTop(), this.my.getRight(), this.my.getBottom());
          break;
        }
        bool1 = bool2;
        break;
      }
      label353: bool1 = false;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.hK == null);
    while (true)
    {
      return;
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.hK.getLayoutParams();
      if (this.hK.cx());
      for (int i = 0; (this.my != null) && (this.my.getVisibility() != 8) && (View.MeasureSpec.getMode(paramInt2) == -2147483648); i = this.hK.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin)
      {
        int j = View.MeasureSpec.getSize(paramInt2);
        setMeasuredDimension(getMeasuredWidth(), Math.min(i + this.my.getMeasuredHeight(), j));
        return;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      if (this.kK != null)
        this.kK.setVisible(bool, false);
      if (this.mz != null)
        this.mz.setVisible(bool, false);
      if (this.mA != null)
        this.mA.setVisible(bool, false);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.kK) && (!this.mB)) || ((paramDrawable == this.mz) && (this.mC)) || ((paramDrawable == this.mA) && (this.mB)) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContainer
 * JD-Core Version:    0.6.2
 */