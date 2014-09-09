package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RemoteViews.RemoteView;

@RemoteViews.RemoteView
public class QImageView extends View
{
  private static final p[] kbU;
  private static final Matrix.ScaleToFit[] kbV = arrayOfScaleToFit;
  private int giV = 0;
  private int kbC = 0;
  private p kbD;
  private boolean kbE = false;
  private boolean kbF = false;
  private ColorFilter kbG;
  private int kbH = 255;
  private int kbI = 256;
  private boolean kbJ = false;
  private Drawable kbK = null;
  private int[] kbL = null;
  private boolean kbM = false;
  private int kbN;
  private int kbO;
  private Matrix kbP = null;
  private final RectF kbQ = new RectF();
  private final RectF kbR = new RectF();
  private boolean kbS;
  private boolean kbT = false;
  private Context mContext;
  private Matrix mMatrix;
  private Uri mUri;
  private int pw = 2147483647;
  private int py = 2147483647;

  static
  {
    p[] arrayOfp = new p[8];
    arrayOfp[0] = p.kbW;
    arrayOfp[1] = p.kbX;
    arrayOfp[2] = p.kbY;
    arrayOfp[3] = p.kbZ;
    arrayOfp[4] = p.kca;
    arrayOfp[5] = p.kcb;
    arrayOfp[6] = p.kcc;
    arrayOfp[7] = p.kcd;
    kbU = arrayOfp;
    Matrix.ScaleToFit[] arrayOfScaleToFit = new Matrix.ScaleToFit[4];
    arrayOfScaleToFit[0] = Matrix.ScaleToFit.FILL;
    arrayOfScaleToFit[1] = Matrix.ScaleToFit.START;
    arrayOfScaleToFit[2] = Matrix.ScaleToFit.CENTER;
    arrayOfScaleToFit[3] = Matrix.ScaleToFit.END;
  }

  public QImageView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    bcv();
  }

  public QImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.mContext = paramContext;
    bcv();
  }

  public QImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    bcv();
    this.kbT = false;
    this.kbF = false;
    this.pw = 2147483647;
    this.py = 2147483647;
    this.kbS = false;
  }

  private void bcA()
  {
    float f1 = 0.0F;
    if ((this.kbK == null) || (!this.kbE))
      return;
    int i = this.kbN;
    int j = this.kbO;
    int k = getWidth() - getPaddingLeft() - getPaddingRight();
    int m = getHeight() - getPaddingTop() - getPaddingBottom();
    if (((i < 0) || (k == i)) && ((j < 0) || (m == j)));
    for (int n = 1; (i <= 0) || (j <= 0) || (p.kbX == this.kbD); n = 0)
    {
      this.kbK.setBounds(0, 0, k, m);
      this.kbP = null;
      return;
    }
    this.kbK.setBounds(0, 0, i, j);
    if (p.kbW == this.kbD)
    {
      if (this.mMatrix.isIdentity())
      {
        this.kbP = null;
        return;
      }
      this.kbP = this.mMatrix;
      return;
    }
    if (n != 0)
    {
      this.kbP = null;
      return;
    }
    if (p.kcb == this.kbD)
    {
      this.kbP = this.mMatrix;
      this.kbP.setTranslate((int)(0.5F + 0.5F * (k - i)), (int)(0.5F + 0.5F * (m - j)));
      return;
    }
    if (p.kcc == this.kbD)
    {
      this.kbP = this.mMatrix;
      float f5;
      if (i * m > k * j)
        f5 = m / j;
      for (float f6 = 0.5F * (k - f5 * i); ; f6 = 0.0F)
      {
        this.kbP.setScale(f5, f5);
        this.kbP.postTranslate((int)(f6 + 0.5F), (int)(f1 + 0.5F));
        return;
        f5 = k / i;
        f1 = 0.5F * (m - f5 * j);
      }
    }
    if (p.kcd == this.kbD)
    {
      this.kbP = this.mMatrix;
      if ((i <= k) && (j <= m));
      for (float f2 = 1.0F; ; f2 = Math.min(k / i, m / j))
      {
        float f3 = (int)(0.5F + 0.5F * (k - f2 * i));
        float f4 = (int)(0.5F + 0.5F * (m - f2 * j));
        this.kbP.setScale(f2, f2);
        this.kbP.postTranslate(f3, f4);
        return;
      }
    }
    this.kbQ.set(0.0F, 0.0F, i, j);
    this.kbR.set(0.0F, 0.0F, k, m);
    this.kbP = this.mMatrix;
    Matrix localMatrix = this.kbP;
    RectF localRectF1 = this.kbQ;
    RectF localRectF2 = this.kbR;
    p localp = this.kbD;
    localMatrix.setRectToRect(localRectF1, localRectF2, kbV[(-1 + localp.kce)]);
  }

  private void bcB()
  {
    if ((this.kbK != null) && (this.kbJ))
    {
      this.kbK = this.kbK.mutate();
      this.kbK.setColorFilter(this.kbG);
      this.kbK.setAlpha(this.kbH * this.kbI >> 8);
    }
  }

  private void bcv()
  {
    this.mMatrix = new Matrix();
    this.kbD = p.kbZ;
  }

  private void bcx()
  {
    if (this.kbK != null);
    Resources localResources;
    do
    {
      return;
      localResources = getResources();
    }
    while (localResources == null);
    if (this.kbC != 0);
    Uri localUri;
    do
    {
      try
      {
        Drawable localDrawable2 = localResources.getDrawable(this.kbC);
        localDrawable1 = localDrawable2;
        h(localDrawable1);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          new StringBuilder("Unable to find resource: ").append(this.kbC);
          this.mUri = null;
          localDrawable1 = null;
        }
      }
      localUri = this.mUri;
      Drawable localDrawable1 = null;
    }
    while (localUri != null);
  }

  private void h(Drawable paramDrawable)
  {
    if (this.kbK != null)
    {
      this.kbK.setCallback(null);
      unscheduleDrawable(this.kbK);
    }
    this.kbK = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (paramDrawable.isStateful())
        paramDrawable.setState(getDrawableState());
      paramDrawable.setLevel(this.giV);
      this.kbN = paramDrawable.getIntrinsicWidth();
      this.kbO = paramDrawable.getIntrinsicHeight();
      bcB();
      bcA();
    }
  }

  private static int s(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt3);
    int j = View.MeasureSpec.getSize(paramInt3);
    switch (i)
    {
    default:
      return paramInt1;
    case 0:
      return Math.min(paramInt1, paramInt2);
    case -2147483648:
      return Math.min(Math.min(paramInt1, j), paramInt2);
    case 1073741824:
    }
    return j;
  }

  public final void a(p paramp)
  {
    if (paramp == null)
      throw new NullPointerException();
    if (this.kbD != paramp)
    {
      this.kbD = paramp;
      if (this.kbD != p.kcb)
        break label51;
    }
    label51: for (boolean bool = true; ; bool = false)
    {
      setWillNotCacheDrawing(bool);
      requestLayout();
      invalidate();
      return;
    }
  }

  public final void bcw()
  {
    setImageDrawable(new BitmapDrawable(this.mContext.getResources(), null));
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.kbK;
    if ((localDrawable != null) && (localDrawable.isStateful()))
      localDrawable.setState(getDrawableState());
  }

  public int getBaseline()
  {
    if (this.kbT)
      return getMeasuredHeight();
    return -1;
  }

  public final Drawable getDrawable()
  {
    return this.kbK;
  }

  public final Matrix getImageMatrix()
  {
    return this.mMatrix;
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.kbK)
    {
      invalidate();
      return;
    }
    super.invalidateDrawable(paramDrawable);
  }

  public int[] onCreateDrawableState(int paramInt)
  {
    if (this.kbL == null)
      return super.onCreateDrawableState(paramInt);
    if (!this.kbM)
      return this.kbL;
    return mergeDrawableStates(super.onCreateDrawableState(paramInt + this.kbL.length), this.kbL);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    super.onDraw(paramCanvas);
    if (this.kbK == null);
    while ((this.kbN == 0) || (this.kbO == 0))
      return;
    if ((this.kbP == null) && (getPaddingTop() == 0) && (getPaddingLeft() == 0))
    {
      this.kbK.draw(paramCanvas);
      return;
    }
    int i = paramCanvas.getSaveCount();
    paramCanvas.save();
    if (this.kbS)
    {
      int j = getScrollX();
      int k = getScrollY();
      paramCanvas.clipRect(j + getPaddingLeft(), k + getPaddingTop(), j + getRight() - getLeft() - getPaddingRight(), k + getBottom() - getTop() - getPaddingBottom());
    }
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    if (this.kbP != null)
      paramCanvas.concat(this.kbP);
    this.kbK.draw(paramCanvas);
    paramCanvas.restoreToCount(i);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.kbE = true;
    bcA();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    bcx();
    int i = 0;
    int j;
    int m;
    int n;
    float f1;
    if (this.kbK == null)
    {
      this.kbN = -1;
      this.kbO = -1;
      j = 0;
      m = 0;
      n = 0;
      f1 = 0.0F;
    }
    while (true)
    {
      int i1 = getPaddingLeft();
      int i2 = getPaddingRight();
      int i3 = getPaddingTop();
      int i4 = getPaddingBottom();
      int i5;
      int i6;
      int i9;
      if ((n != 0) || (i != 0))
      {
        i5 = s(i2 + (j + i1), this.pw, paramInt1);
        i6 = s(i4 + (m + i3), this.py, paramInt2);
        if ((f1 == 0.0F) || (Math.abs((i5 - i1 - i2) / (i6 - i3 - i4) - f1) <= 1.0E-07D))
          break label402;
        if (n == 0)
          break label413;
        int i10 = i2 + (i1 + (int)(f1 * (i6 - i3 - i4)));
        if (i10 > i5)
          break label413;
        i9 = 1;
        i5 = i10;
      }
      int k;
      while (true)
      {
        int i7;
        int i8;
        if ((i9 == 0) && (i != 0))
        {
          i7 = i4 + (i3 + (int)((i5 - i1 - i2) / f1));
          if (i7 <= i6)
            i8 = i5;
        }
        while (true)
        {
          setMeasuredDimension(i8, i7);
          return;
          j = this.kbN;
          k = this.kbO;
          if (j <= 0)
            j = 1;
          if (k <= 0)
            k = 1;
          if (!this.kbF)
            break label419;
          int i15 = View.MeasureSpec.getMode(paramInt1);
          int i16 = View.MeasureSpec.getMode(paramInt2);
          int i17;
          if (i15 != 1073741824)
          {
            i17 = 1;
            label292: if (i16 == 1073741824)
              break label336;
          }
          label336: for (i = 1; ; i = 0)
          {
            float f2 = j / k;
            int i18 = i17;
            f1 = f2;
            m = k;
            n = i18;
            break;
            i17 = 0;
            break label292;
          }
          int i11 = j + (i1 + i2);
          int i12 = m + (i3 + i4);
          int i13 = Math.max(i11, getSuggestedMinimumWidth());
          int i14 = Math.max(i12, getSuggestedMinimumHeight());
          i8 = resolveSize(i13, paramInt1);
          i7 = resolveSize(i14, paramInt2);
          continue;
          label402: i7 = i6;
          i8 = i5;
        }
        label413: i9 = 0;
      }
      label419: m = k;
      n = 0;
      i = 0;
      f1 = 0.0F;
    }
  }

  protected boolean onSetAlpha(int paramInt)
  {
    if (getBackground() == null)
    {
      int i = paramInt + (paramInt >> 7);
      if (this.kbI != i)
      {
        this.kbI = i;
        this.kbJ = true;
        bcB();
      }
      return true;
    }
    return false;
  }

  public final void setAlpha(int paramInt)
  {
    int i = paramInt & 0xFF;
    if (this.kbH != i)
    {
      this.kbH = i;
      this.kbJ = true;
      bcB();
      invalidate();
    }
  }

  public final void setImageDrawable(Drawable paramDrawable)
  {
    if (this.kbK != paramDrawable)
    {
      this.kbC = 0;
      this.mUri = null;
      h(paramDrawable);
      invalidate();
    }
  }

  public final void setImageResource(int paramInt)
  {
    if ((this.mUri != null) || (this.kbC != paramInt))
    {
      h(null);
      this.kbC = paramInt;
      this.mUri = null;
      bcx();
      invalidate();
    }
  }

  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    Drawable localDrawable = this.kbK;
    if (localDrawable != null)
    {
      int i = localDrawable.getIntrinsicWidth();
      if (i < 0)
        i = this.kbN;
      int j = localDrawable.getIntrinsicHeight();
      if (j < 0)
        j = this.kbO;
      if ((i != this.kbN) || (j != this.kbO))
      {
        this.kbN = i;
        this.kbO = j;
        requestLayout();
      }
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (this.kbK == paramDrawable) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.QImageView
 * JD-Core Version:    0.6.2
 */