package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public final class ProgressBarICS extends View
{
  private static final int[] pv = { 16843062, 16843063, 16843064, 16843065, 16843066, 16843067, 16843068, 16843069, 16843070, 16843071, 16843039, 16843072, 16843040, 16843073 };
  private int cK = 0;
  int jM = 24;
  private Interpolator mInterpolator;
  private int pA = 100;
  private int pB = 1;
  private int pC = 4000;
  private boolean pD = false;
  private boolean pE = false;
  private Transformation pF;
  private AlphaAnimation pG;
  private Drawable pH;
  private Drawable pI;
  private Drawable pJ;
  Bitmap pK;
  private boolean pL;
  private ak pM;
  private long pN = Thread.currentThread().getId();
  private boolean pO;
  private long pP;
  private boolean pQ;
  int pw = 48;
  int px = 24;
  int py = 48;
  private int pz = 0;

  public ProgressBarICS(Context paramContext, int paramInt)
  {
    super(paramContext, null, 0);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, pv, 0, paramInt);
    this.pL = true;
    setMax(localTypedArray.getInt(0, this.pA));
    setProgress(localTypedArray.getInt(1, this.cK));
    setSecondaryProgress(localTypedArray.getInt(2, this.pz));
    boolean bool1 = localTypedArray.getBoolean(3, this.pD);
    this.pE = localTypedArray.getBoolean(4, this.pE);
    Drawable localDrawable1 = localTypedArray.getDrawable(5);
    if (localDrawable1 != null)
    {
      Drawable localDrawable4 = c(localDrawable1);
      if (localDrawable4 != null)
        localDrawable4.setCallback(this);
      this.pH = localDrawable4;
      if (this.pD)
      {
        this.pJ = localDrawable4;
        postInvalidate();
      }
    }
    Drawable localDrawable2 = localTypedArray.getDrawable(6);
    Drawable localDrawable3;
    if (localDrawable2 != null)
    {
      localDrawable3 = a(localDrawable2, false);
      if ((this.pI == null) || (localDrawable3 == this.pI))
        break label505;
      this.pI.setCallback(null);
    }
    label505: for (int j = 1; ; j = 0)
    {
      if (localDrawable3 != null)
      {
        localDrawable3.setCallback(this);
        int k = localDrawable3.getMinimumHeight();
        if (this.py < k)
        {
          this.py = k;
          requestLayout();
        }
      }
      this.pI = localDrawable3;
      if (!this.pD)
      {
        this.pJ = localDrawable3;
        postInvalidate();
      }
      if (j != 0)
      {
        q(getWidth(), getHeight());
        cX();
        j(16908301, this.cK);
        j(16908303, this.pz);
      }
      this.pC = localTypedArray.getInt(7, this.pC);
      this.pB = localTypedArray.getInt(8, this.pB);
      this.jM = localTypedArray.getDimensionPixelSize(9, this.jM);
      this.pw = localTypedArray.getDimensionPixelSize(10, this.pw);
      this.px = localTypedArray.getDimensionPixelSize(11, this.px);
      this.py = localTypedArray.getDimensionPixelSize(12, this.py);
      int i = localTypedArray.getResourceId(13, 17432587);
      if (i > 0)
        this.mInterpolator = AnimationUtils.loadInterpolator(paramContext, i);
      localTypedArray.recycle();
      this.pL = false;
      boolean bool2;
      if (!this.pE)
      {
        bool2 = false;
        if (!bool1);
      }
      else
      {
        bool2 = true;
      }
      setIndeterminate(bool2);
      return;
    }
  }

  private void K(int paramInt)
  {
    while (true)
    {
      try
      {
        boolean bool = this.pD;
        if (bool)
          return;
        i = 0;
        if (paramInt < 0)
        {
          if (i > this.pA)
            i = this.pA;
          if (i == this.cK)
            continue;
          this.cK = i;
          a(16908301, this.cK, false);
          continue;
        }
      }
      finally
      {
      }
      int i = paramInt;
    }
  }

  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    int i = 0;
    if ((paramDrawable instanceof LayerDrawable))
    {
      localLayerDrawable1 = (LayerDrawable)paramDrawable;
      j = localLayerDrawable1.getNumberOfLayers();
      arrayOfDrawable = new Drawable[j];
      k = 0;
      if (k < j)
      {
        m = localLayerDrawable1.getId(k);
        localDrawable = localLayerDrawable1.getDrawable(k);
        if ((m == 16908301) || (m == 16908303));
        for (bool = true; ; bool = false)
        {
          arrayOfDrawable[k] = a(localDrawable, bool);
          k++;
          break;
        }
      }
      localLayerDrawable2 = new LayerDrawable(arrayOfDrawable);
      while (i < j)
      {
        localLayerDrawable2.setId(i, localLayerDrawable1.getId(i));
        i++;
      }
      paramDrawable = localLayerDrawable2;
    }
    while (!(paramDrawable instanceof BitmapDrawable))
    {
      LayerDrawable localLayerDrawable1;
      int j;
      Drawable[] arrayOfDrawable;
      int k;
      int m;
      Drawable localDrawable;
      boolean bool;
      LayerDrawable localLayerDrawable2;
      return paramDrawable;
    }
    Bitmap localBitmap = ((BitmapDrawable)paramDrawable).getBitmap();
    if (this.pK == null)
      this.pK = localBitmap;
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
    BitmapShader localBitmapShader = new BitmapShader(localBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
    localShapeDrawable.getPaint().setShader(localBitmapShader);
    if (paramBoolean)
      return new ClipDrawable(localShapeDrawable, 3, 1);
    return localShapeDrawable;
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        if (this.pN == Thread.currentThread().getId())
        {
          j(paramInt1, paramInt2);
          return;
        }
        if (this.pM != null)
        {
          localak = this.pM;
          this.pM = null;
          localak.b(paramInt1, paramInt2, false);
          post(localak);
          continue;
        }
      }
      finally
      {
      }
      ak localak = new ak(this, paramInt1, paramInt2, false);
    }
  }

  private Drawable c(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof AnimationDrawable))
    {
      AnimationDrawable localAnimationDrawable1 = (AnimationDrawable)paramDrawable;
      int i = localAnimationDrawable1.getNumberOfFrames();
      AnimationDrawable localAnimationDrawable2 = new AnimationDrawable();
      localAnimationDrawable2.setOneShot(localAnimationDrawable1.isOneShot());
      for (int j = 0; j < i; j++)
      {
        Drawable localDrawable = a(localAnimationDrawable1.getFrame(j), true);
        localDrawable.setLevel(10000);
        localAnimationDrawable2.addFrame(localDrawable, localAnimationDrawable1.getDuration(j));
      }
      localAnimationDrawable2.setLevel(10000);
      paramDrawable = localAnimationDrawable2;
    }
    return paramDrawable;
  }

  private void cV()
  {
    if (getVisibility() != 0)
      return;
    if ((this.pH instanceof Animatable))
    {
      this.pO = true;
      this.pG = null;
    }
    while (true)
    {
      postInvalidate();
      return;
      if (this.mInterpolator == null)
        this.mInterpolator = new LinearInterpolator();
      this.pF = new Transformation();
      this.pG = new AlphaAnimation(0.0F, 1.0F);
      this.pG.setRepeatMode(this.pB);
      this.pG.setRepeatCount(-1);
      this.pG.setDuration(this.pC);
      this.pG.setInterpolator(this.mInterpolator);
      this.pG.setStartTime(-1L);
    }
  }

  private void cW()
  {
    this.pG = null;
    this.pF = null;
    if ((this.pH instanceof Animatable))
    {
      ((Animatable)this.pH).stop();
      this.pO = false;
    }
    postInvalidate();
  }

  private void cX()
  {
    int[] arrayOfInt = getDrawableState();
    if ((this.pI != null) && (this.pI.isStateful()))
      this.pI.setState(arrayOfInt);
    if ((this.pH != null) && (this.pH.isStateful()))
      this.pH.setState(arrayOfInt);
  }

  private void j(int paramInt1, int paramInt2)
  {
    while (true)
    {
      float f;
      Object localObject2;
      Drawable localDrawable;
      try
      {
        if (this.pA > 0)
        {
          f = paramInt2 / this.pA;
          localObject2 = this.pJ;
          if (localObject2 != null)
          {
            boolean bool = localObject2 instanceof LayerDrawable;
            localDrawable = null;
            if (!bool)
              break label88;
            localDrawable = ((LayerDrawable)localObject2).findDrawableByLayerId(paramInt1);
            break label88;
            ((Drawable)localObject2).setLevel(i);
          }
        }
        else
        {
          f = 0.0F;
          continue;
        }
        invalidate();
        continue;
      }
      finally
      {
      }
      label88: int i = (int)(f * 10000.0F);
      if (localDrawable != null)
        localObject2 = localDrawable;
    }
  }

  private void q(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - getPaddingRight() - getPaddingLeft();
    int j = paramInt2 - getPaddingBottom() - getPaddingTop();
    float f1;
    int n;
    int k;
    int m;
    int i1;
    if (this.pH != null)
      if ((this.pE) && (!(this.pH instanceof AnimationDrawable)))
      {
        int i2 = this.pH.getIntrinsicWidth();
        int i3 = this.pH.getIntrinsicHeight();
        f1 = i2 / i3;
        float f2 = paramInt1 / paramInt2;
        if (f1 != f2)
          if (f2 > f1)
          {
            int i7 = (int)(f1 * paramInt2);
            n = (paramInt1 - i7) / 2;
            k = i7 + n;
            m = j;
            i1 = 0;
            this.pH.setBounds(n, i1, k, m);
          }
      }
    while (true)
    {
      if (this.pI != null)
        this.pI.setBounds(0, 0, k, m);
      return;
      int i4 = (int)(paramInt1 * (1.0F / f1));
      int i5 = (paramInt2 - i4) / 2;
      int i6 = i4 + i5;
      k = i;
      m = i6;
      i1 = i5;
      n = 0;
      break;
      k = i;
      m = j;
      n = 0;
      i1 = 0;
      break;
      k = i;
      m = j;
    }
  }

  private void setIndeterminate(boolean paramBoolean)
  {
    try
    {
      if (((!this.pE) || (!this.pD)) && (paramBoolean != this.pD))
      {
        this.pD = paramBoolean;
        if (!paramBoolean)
          break label48;
        this.pJ = this.pH;
        cV();
      }
      while (true)
      {
        return;
        label48: this.pJ = this.pI;
        cW();
      }
    }
    finally
    {
    }
  }

  private void setProgress(int paramInt)
  {
    try
    {
      K(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void setSecondaryProgress(int paramInt)
  {
    while (true)
    {
      try
      {
        boolean bool = this.pD;
        if (bool)
          return;
        i = 0;
        if (paramInt < 0)
        {
          if (i > this.pA)
            i = this.pA;
          if (i == this.pz)
            continue;
          this.pz = i;
          a(16908303, this.pz, false);
          continue;
        }
      }
      finally
      {
      }
      int i = paramInt;
    }
  }

  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    cX();
  }

  public final void invalidateDrawable(Drawable paramDrawable)
  {
    if (!this.pQ)
    {
      if (verifyDrawable(paramDrawable))
      {
        Rect localRect = paramDrawable.getBounds();
        int i = getScrollX() + getPaddingLeft();
        int j = getScrollY() + getPaddingTop();
        invalidate(i + localRect.left, j + localRect.top, i + localRect.right, j + localRect.bottom);
      }
    }
    else
      return;
    super.invalidateDrawable(paramDrawable);
  }

  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.pD)
      cV();
  }

  protected final void onDetachedFromWindow()
  {
    if (this.pD)
      cW();
    if (this.pM != null)
      removeCallbacks(this.pM);
    super.onDetachedFromWindow();
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      Drawable localDrawable = this.pJ;
      float f;
      if (localDrawable != null)
      {
        paramCanvas.save();
        paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        long l = getDrawingTime();
        if (this.pG != null)
        {
          this.pG.getTransformation(l, this.pF);
          f = this.pF.getAlpha();
        }
      }
      try
      {
        this.pQ = true;
        localDrawable.setLevel((int)(f * 10000.0F));
        this.pQ = false;
        if (SystemClock.uptimeMillis() - this.pP >= 200L)
        {
          this.pP = SystemClock.uptimeMillis();
          postInvalidateDelayed(200L);
        }
        localDrawable.draw(paramCanvas);
        paramCanvas.restore();
        if ((this.pO) && ((localDrawable instanceof Animatable)))
        {
          ((Animatable)localDrawable).start();
          this.pO = false;
        }
        return;
      }
      finally
      {
        localObject2 = finally;
        this.pQ = false;
        throw localObject2;
      }
    }
    finally
    {
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    while (true)
    {
      try
      {
        Drawable localDrawable = this.pJ;
        if (localDrawable != null)
        {
          i = Math.max(this.jM, Math.min(this.pw, localDrawable.getIntrinsicWidth()));
          j = Math.max(this.px, Math.min(this.py, localDrawable.getIntrinsicHeight()));
          cX();
          int k = i + (getPaddingLeft() + getPaddingRight());
          int m = j + (getPaddingTop() + getPaddingBottom());
          setMeasuredDimension(resolveSize(k, paramInt1), resolveSize(m, paramInt2));
          return;
        }
      }
      finally
      {
      }
      int j = 0;
      int i = 0;
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ProgressBarICS.SavedState localSavedState = (ProgressBarICS.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setProgress(localSavedState.progress);
    setSecondaryProgress(localSavedState.secondaryProgress);
  }

  public final Parcelable onSaveInstanceState()
  {
    ProgressBarICS.SavedState localSavedState = new ProgressBarICS.SavedState(super.onSaveInstanceState());
    localSavedState.progress = this.cK;
    localSavedState.secondaryProgress = this.pz;
    return localSavedState;
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    q(paramInt1, paramInt2);
  }

  protected final void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (this.pD)
    {
      if ((paramInt == 8) || (paramInt == 4))
        cW();
    }
    else
      return;
    cV();
  }

  public final void postInvalidate()
  {
    if (!this.pL)
      super.postInvalidate();
  }

  public final void setMax(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 0;
    try
    {
      if (paramInt != this.pA)
      {
        this.pA = paramInt;
        postInvalidate();
        if (this.cK > paramInt)
          this.cK = paramInt;
        a(16908301, this.cK, false);
      }
      return;
    }
    finally
    {
    }
  }

  public final void setVisibility(int paramInt)
  {
    if (getVisibility() != paramInt)
    {
      super.setVisibility(paramInt);
      if (this.pD)
      {
        if ((paramInt != 8) && (paramInt != 4))
          break label36;
        cW();
      }
    }
    return;
    label36: cV();
  }

  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    return (paramDrawable == this.pI) || (paramDrawable == this.pH) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ProgressBarICS
 * JD-Core Version:    0.6.2
 */