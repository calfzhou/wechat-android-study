package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.tencent.mm.f;
import com.tencent.mm.g;
import com.tencent.mm.p;

public class MMPinProgressBtn extends CompoundButton
{
  private int cK;
  private Paint kaR;
  private Paint kaS;
  private RectF kaT = new RectF();
  private int kaU;
  private Runnable kaV = new e(this);
  private int pA;

  public MMPinProgressBtn(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }

  public MMPinProgressBtn(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }

  public MMPinProgressBtn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.pA = 100;
    this.cK = 0;
    Resources localResources = getResources();
    int i = localResources.getColor(f.akr);
    int j = localResources.getColor(f.aku);
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cEJ, paramInt, 0);
      this.pA = localTypedArray.getInteger(p.cEL, this.pA);
      this.cK = localTypedArray.getInteger(p.cEM, this.cK);
      i = localTypedArray.getColor(p.cEK, i);
      j = localTypedArray.getColor(p.cEN, j);
      localTypedArray.recycle();
    }
    this.kaU = localResources.getDimensionPixelSize(g.axW);
    this.kaR = new Paint();
    this.kaR.setColor(i);
    this.kaR.setStyle(Paint.Style.STROKE);
    this.kaR.setStrokeWidth(2.0F);
    this.kaR.setAntiAlias(true);
    this.kaS = new Paint();
    this.kaS.setColor(j);
    this.kaS.setAntiAlias(true);
    setClickable(false);
  }

  public final void bcp()
  {
    removeCallbacks(this.kaV);
    post(this.kaV);
  }

  public final int getMax()
  {
    return this.pA;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.kaT.set(1.0F, 1.0F, this.kaU - 1.0F, this.kaU - 1.0F);
    this.kaT.offset((getWidth() - this.kaU) / 2, (getHeight() - this.kaU) / 2);
    paramCanvas.drawArc(this.kaT, 0.0F, 360.0F, true, this.kaR);
    this.kaT.set(5.0F, 5.0F, this.kaU - 5.0F, this.kaU - 5.0F);
    this.kaT.offset((getWidth() - this.kaU) / 2, (getHeight() - this.kaU) / 2);
    paramCanvas.drawArc(this.kaT, -90.0F, 360 * this.cK / this.pA, true, this.kaS);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(resolveSize(this.kaU, paramInt1), resolveSize(this.kaU, paramInt2));
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof MMPinProgressBtn.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    MMPinProgressBtn.SavedState localSavedState = (MMPinProgressBtn.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.pA = MMPinProgressBtn.SavedState.a(localSavedState);
    this.cK = MMPinProgressBtn.SavedState.b(localSavedState);
  }

  public Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    if (isSaveEnabled())
    {
      MMPinProgressBtn.SavedState localSavedState = new MMPinProgressBtn.SavedState(localParcelable);
      MMPinProgressBtn.SavedState.a(localSavedState, this.pA);
      MMPinProgressBtn.SavedState.b(localSavedState, this.cK);
      return localSavedState;
    }
    return localParcelable;
  }

  public final void setProgress(int paramInt)
  {
    this.cK = Math.max(0, paramInt);
    this.cK = Math.min(paramInt, this.pA);
    invalidate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMPinProgressBtn
 * JD-Core Version:    0.6.2
 */