package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.f;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;

public class MultiTouchImageView extends ImageView
{
  private boolean gHs = true;
  private float gbW;
  private boolean gra = false;
  protected Matrix jdL = new Matrix();
  protected Matrix jdM = new Matrix();
  private final Matrix jdN = new Matrix();
  private final float[] jdO = new float[9];
  protected Bitmap jdP = null;
  int jdQ = -1;
  int jdR = -1;
  private float jdS = 0.0F;
  private float jdT = 0.0F;
  private float jdU = 0.0F;
  private int jdV;
  private int jdW;
  private int jdX;
  private int jdY;
  private float jdZ = 2.0F;
  private float jea = 0.75F;
  private float jeb = 3.0F;
  private boolean jec = false;
  private boolean jed = false;
  private boolean jee = false;
  private float jef;
  private float jeg;
  float jeh = 0.0F;
  protected cm mHandler = new cm();

  public MultiTouchImageView(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.jdW = paramInt2;
    this.jdV = paramInt1;
    init();
  }

  public MultiTouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0, 0);
  }

  public MultiTouchImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet);
    this.jdW = paramInt2;
    this.jdV = paramInt1;
    init();
  }

  private void aTg()
  {
    boolean bool1 = true;
    this.jef = (this.jdX / this.jdV);
    this.jeg = (this.jdY / this.jdW);
    this.jed = i.N(this.jdV, this.jdW);
    this.jee = i.M(this.jdV, this.jdW);
    boolean bool2;
    if ((this.jed) && (this.jdV > this.jdX))
    {
      bool2 = bool1;
      this.jed = bool2;
      if ((!this.jee) || (this.jdW <= this.jdY))
        break label166;
    }
    while (true)
    {
      this.jee = bool1;
      if (((!this.gHs) || (!this.jed)) && (!this.jee))
        break label171;
      this.gbW = Math.max(this.jef, this.jeg);
      if (this.gbW > 1.0F)
        this.gbW = 1.0F;
      return;
      bool2 = false;
      break;
      label166: bool1 = false;
    }
    label171: this.gbW = Math.min(this.jef, this.jeg);
  }

  private Matrix aTk()
  {
    this.jdN.set(this.jdL);
    this.jdN.postConcat(this.jdM);
    return this.jdN;
  }

  private float aTm()
  {
    float f1 = getScale();
    float f2;
    if (0.7F * this.jef > f1)
      f2 = this.jef;
    while (true)
    {
      if (f2 > this.jdT)
        f2 = this.jdT;
      return f2;
      if (0.7F * this.jeg > f1)
        f2 = this.jeg;
      else
        f2 = this.gbW * this.jdZ;
    }
  }

  private void e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = (paramFloat1 - getScale()) / 128.0F;
    float f2 = getScale();
    long l = System.currentTimeMillis();
    this.mHandler.post(new fj(this, 128.0F, l, f2, f1, paramFloat2, paramFloat3));
  }

  private void init()
  {
    z.d("dktest", "init screenWidth:" + this.jdX + " screenHeight :" + this.jdY);
    setScaleType(ImageView.ScaleType.MATRIX);
    setBackgroundColor(getContext().getResources().getColor(f.NU));
  }

  public final boolean aTc()
  {
    return this.jed;
  }

  public final boolean aTd()
  {
    return this.jee;
  }

  public final void aTe()
  {
    this.jec = true;
  }

  public final void aTf()
  {
    this.jdM.reset();
    aTg();
    if (((this.gHs) && (this.jed)) || (this.jee))
    {
      d(this.gbW, 0.0F, 0.0F);
      return;
    }
    d(this.gbW, this.jdX / 2.0F, this.jdY / 2.0F);
  }

  public final float aTh()
  {
    return this.gbW;
  }

  public final int aTi()
  {
    return this.jdV;
  }

  public final int aTj()
  {
    return this.jdW;
  }

  public final void aTl()
  {
    if ((this.jec) && (0.0F == this.jdS))
      this.jdS = aTm();
  }

  public final void ab(float paramFloat)
  {
    if (Float.compare(paramFloat, 1.0F) < 0)
    {
      z.w("!44@/B4Tb64lLpL5aiCbYmx2SjWrgSB3hTZ3a/79cTAOp88=", "max scale limit is less than 1.0, change nothing, return");
      return;
    }
    this.jeb = paramFloat;
  }

  public final void bh(int paramInt1, int paramInt2)
  {
    this.jdV = paramInt1;
    this.jdW = paramInt2;
  }

  public final void d(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    int i = 1;
    float f1 = getScale();
    float f7;
    label51: int j;
    label97: label104: RectF localRectF;
    float f4;
    float f5;
    if (this.jec)
    {
      if (0.0F == this.jdS)
      {
        f7 = this.jeb;
        this.jdT = f7;
      }
    }
    else
    {
      if (paramFloat1 <= this.jdT)
        break label284;
      paramFloat1 = this.jdT;
      float f2 = paramFloat1 / f1;
      setImageMatrix(aTk());
      this.jdM.postScale(f2, f2, paramFloat2, paramFloat3);
      if ((this.gHs) && (this.jed))
        break label301;
      j = i;
      if (this.jee)
        break label307;
      if (this.jdP != null)
      {
        Matrix localMatrix1 = aTk();
        localRectF = new RectF(0.0F, 0.0F, this.jdP.getWidth(), this.jdP.getHeight());
        localMatrix1.mapRect(localRectF);
        float f3 = localRectF.height();
        f4 = localRectF.width();
        if (i == 0)
          break label421;
        if (f3 >= this.jdY)
          break label313;
        f5 = (this.jdY - f3) / 2.0F - localRectF.top;
      }
    }
    while (true)
    {
      label200: float f6;
      if (j != 0)
        if (f4 < this.jdX)
          f6 = (this.jdX - f4) / 2.0F - localRectF.left;
      while (true)
      {
        t(f6, f5);
        Matrix localMatrix2 = aTk();
        setImageMatrix(localMatrix2);
        localMatrix2.mapRect(localRectF);
        localRectF.height();
        localRectF.width();
        return;
        f7 = this.jdS;
        break;
        label284: if (paramFloat1 >= this.jdU)
          break label51;
        paramFloat1 = this.jdU;
        break label51;
        label301: j = 0;
        break label97;
        label307: i = 0;
        break label104;
        label313: if (localRectF.top > 0.0F)
        {
          f5 = -localRectF.top;
          break label200;
        }
        if (localRectF.bottom >= this.jdY)
          break label421;
        f5 = this.jdY - localRectF.bottom;
        break label200;
        if (localRectF.left > 0.0F)
          f6 = -localRectF.left;
        else if (localRectF.right < this.jdX)
          f6 = this.jdX - localRectF.right;
        else
          f6 = 0.0F;
      }
      label421: f5 = 0.0F;
    }
  }

  public final void eW(boolean paramBoolean)
  {
    this.gHs = paramBoolean;
  }

  public final float getScale()
  {
    this.jdM.getValues(this.jdO);
    aTg();
    this.jdT = this.jeb;
    this.jdU = (this.gbW * this.jea);
    if (this.jdT < 1.0F)
      this.jdT = 1.0F;
    if (this.jdU > 1.0F)
      this.jdU = 1.0F;
    return this.jdO[0];
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
      this.gra = false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.jdP != null) && (this.jdP.isRecycled()))
    {
      z.e("!44@/B4Tb64lLpL5aiCbYmx2SjWrgSB3hTZ3a/79cTAOp88=", "this bitmap is recycled! draw nothing!");
      return;
    }
    super.onDraw(paramCanvas);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      if (c.Dx())
      {
        new b();
        paramKeyEvent.startTracking();
      }
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (c.Dx())
        new b();
      for (boolean bool1 = paramKeyEvent.isTracking(); bool1; bool1 = false)
      {
        boolean bool2 = c.Dx();
        boolean bool3 = false;
        if (bool2)
        {
          new b();
          bool3 = paramKeyEvent.isCanceled();
        }
        if ((bool3) || (getScale() <= 1.0F))
          break;
        d(1.0F, this.jdX / 2.0F, this.jdY / 2.0F);
        return true;
      }
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.jdX = View.MeasureSpec.getSize(paramInt1);
    this.jdY = View.MeasureSpec.getSize(paramInt2);
    z.v("!44@/B4Tb64lLpL5aiCbYmx2SjWrgSB3hTZ3a/79cTAOp88=", "MultiTouchImageView width:" + this.jdX + " height:" + this.jdY);
    if (!this.gra)
    {
      this.gra = true;
      init();
    }
    aTf();
  }

  public final void q(float paramFloat1, float paramFloat2)
  {
    aTg();
    e(this.gbW, paramFloat1, paramFloat2);
  }

  public final void s(float paramFloat1, float paramFloat2)
  {
    this.jdS = aTm();
    e(this.jdS, paramFloat1, paramFloat2);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.jdP = paramBitmap;
    this.gra = false;
    super.setImageBitmap(paramBitmap);
  }

  public final void t(float paramFloat1, float paramFloat2)
  {
    this.jdM.postTranslate(paramFloat1, paramFloat2);
    setImageMatrix(aTk());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MultiTouchImageView
 * JD-Core Version:    0.6.2
 */