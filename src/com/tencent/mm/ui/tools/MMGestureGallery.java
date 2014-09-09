package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.SpinnerAdapter;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MultiTouchImageView;
import java.lang.ref.WeakReference;

public class MMGestureGallery extends Gallery
{
  private int count = 0;
  private int enc;
  private int ene;
  private cm gQj = new cm(Looper.getMainLooper());
  private boolean jTA = true;
  private boolean jTB = false;
  private final int jTC = 60;
  private final int jTD = 500;
  private GestureDetector jTn;
  private ef jTo;
  private ef jTp;
  private ef jTq;
  private long jTr = 0L;
  private long jTs = 0L;
  private float jTt = 0.0F;
  private float jTu = 0.0F;
  private long jTv = 0L;
  private dw jTw;
  private ea jTx;
  private dx jTy;
  private dz jTz;
  private MultiTouchImageView jda;
  private boolean jdc = false;
  private boolean jdd = false;
  private boolean jde = false;
  private boolean jdf = false;
  private boolean jdg = false;
  private float jdh;
  private float jdi;

  public MMGestureGallery(Context paramContext)
  {
    super(paramContext);
    setStaticTransformationsEnabled(true);
  }

  public MMGestureGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setStaticTransformationsEnabled(true);
    this.jTn = new GestureDetector(paramContext, new dy(this, (byte)0));
    this.jTo = new ef(new WeakReference(this));
    this.jTp = new ef(new WeakReference(this));
    this.jTq = new ef(new WeakReference(this));
    setOnTouchListener(new dv(this));
  }

  public MMGestureGallery(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setStaticTransformationsEnabled(true);
  }

  private void a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat)
  {
    float f1 = paramMotionEvent1.getX() - paramMotionEvent2.getX();
    float f2 = paramMotionEvent1.getY() - paramMotionEvent2.getY();
    boolean bool = a(paramMotionEvent1, paramMotionEvent2);
    float f3 = Math.abs(f1);
    float f4 = Math.abs(f2);
    if (Math.abs(paramFloat) <= 500.0F);
    while ((f3 < 60.0F) || (f3 < f4))
      return;
    if (bool)
    {
      onKeyDown(21, null);
      return;
    }
    onKeyDown(22, null);
  }

  private boolean a(float paramFloat1, float paramFloat2, View paramView, float paramFloat3)
  {
    int i;
    if ((this.jde) || (this.jdd))
    {
      i = 0;
      if (i == 0)
        break label130;
    }
    while (true)
    {
      return true;
      if (getPositionForView(paramView) == -1 + getAdapter().getCount())
      {
        if (this.jdg)
        {
          if (paramFloat3 > 0.0F)
          {
            this.jda.t(-paramFloat3, 0.0F);
            i = 1;
            break;
          }
          i = 0;
          break;
        }
        if (paramFloat3 > 0.0F)
        {
          if (paramFloat2 < this.enc)
            this.jdg = true;
          this.jda.t(-paramFloat3, 0.0F);
          i = 1;
          break;
        }
      }
      this.jdg = false;
      i = 0;
      break;
      label130: int j;
      if ((this.jde) || (this.jdd))
        j = 0;
      while (j == 0)
      {
        return false;
        if (getPositionForView(paramView) == 0)
        {
          if (this.jdf)
          {
            if (paramFloat3 < 0.0F)
            {
              this.jda.t(-paramFloat3, 0.0F);
              j = 1;
            }
            else
            {
              j = 0;
            }
          }
          else if (paramFloat3 < 0.0F)
          {
            if (paramFloat1 > 0.0F)
              this.jdf = true;
            this.jda.t(-paramFloat3, 0.0F);
            j = 1;
          }
        }
        else
        {
          this.jdf = false;
          j = 0;
        }
      }
    }
  }

  private static boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    return paramMotionEvent1.getX() - paramMotionEvent2.getX() < 0.0F;
  }

  private boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (this.jdd)
      return true;
    this.jde = true;
    if (this.jTz != null)
      this.jTz.aoK();
    return super.onScroll(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
  }

  private void aSV()
  {
    this.jTo.removeMessages(1);
  }

  private boolean c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((this.jde) || (this.jdf) || (this.jdg));
    do
    {
      do
      {
        return true;
        this.jdd = true;
        if (paramFloat1 >= 0.0F)
          break;
      }
      while ((paramFloat2 >= 0.2D * this.ene) && (paramFloat3 >= this.ene));
      this.jda.t(0.0F, -paramFloat1);
      return true;
    }
    while ((paramFloat2 <= 0.0F) && (paramFloat3 <= 0.8F * this.ene));
    this.jda.t(0.0F, -paramFloat1);
    return true;
  }

  public final void a(dx paramdx)
  {
    this.jTy = paramdx;
  }

  public final void a(dz paramdz)
  {
    this.jTz = paramdz;
  }

  public final void a(ea paramea)
  {
    this.jTx = paramea;
  }

  public final void baE()
  {
    this.jTA = false;
  }

  public final void gh(boolean paramBoolean)
  {
    this.jTB = paramBoolean;
  }

  public boolean isFocused()
  {
    return true;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    View localView1 = getSelectedView();
    if ((localView1 instanceof ViewGroup))
    {
      View localView2 = localView1.findViewById(i.axT);
      if ((localView2 == null) || (localView2.getVisibility() == 8))
      {
        a(paramMotionEvent1, paramMotionEvent2, paramFloat1);
        return false;
      }
      localView1 = localView2.findViewById(i.axK);
      if (localView1 == null)
      {
        a(paramMotionEvent1, paramMotionEvent2, paramFloat1);
        return false;
      }
    }
    if ((localView1 instanceof MultiTouchImageView))
    {
      MultiTouchImageView localMultiTouchImageView = (MultiTouchImageView)localView1;
      float f1 = localMultiTouchImageView.getScale() * localMultiTouchImageView.aTi();
      if ((localMultiTouchImageView.aTc()) || (localMultiTouchImageView.aTd()) || ((int)f1 > this.enc))
      {
        float[] arrayOfFloat = new float[9];
        localMultiTouchImageView.getImageMatrix().getValues(arrayOfFloat);
        float f2 = arrayOfFloat[2];
        float f3 = f1 + f2;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Float.valueOf(f2);
        arrayOfObject[1] = Float.valueOf(f3);
        arrayOfObject[2] = Boolean.valueOf(a(paramMotionEvent1, paramMotionEvent2));
        z.d("!44@/B4Tb64lLpLtADHeupmcR9RkE1hpp/4l1le5KqFDqOc=", "jacks left: %f,right: %f isGestureRight=> %B", arrayOfObject);
        if (((!a(paramMotionEvent1, paramMotionEvent2)) || (f2 < 0.0F)) && ((a(paramMotionEvent1, paramMotionEvent2)) || (f3 > this.enc)))
          return true;
      }
    }
    if (this.jTB)
      return true;
    if (this.jdc)
      return true;
    a(paramMotionEvent1, paramMotionEvent2, paramFloat1);
    return true;
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    if (paramBoolean)
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.enc = View.MeasureSpec.getSize(paramInt1);
    this.ene = View.MeasureSpec.getSize(paramInt2);
    z.v("!44@/B4Tb64lLpLtADHeupmcR9RkE1hpp/4l1le5KqFDqOc=", "MMGestureGallery width:" + this.enc + " height:" + this.ene);
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (this.jdc)
      return true;
    View localView1 = getSelectedView();
    if ((localView1 instanceof ViewGroup))
    {
      View localView2 = localView1.findViewById(i.axT);
      if ((localView2 == null) || (localView2.getVisibility() == 8))
        return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
      localView1 = localView2.findViewById(i.axK);
      if (localView1 == null)
        return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
    }
    if ((localView1 instanceof MultiTouchImageView))
    {
      this.jda = ((MultiTouchImageView)localView1);
      float[] arrayOfFloat = new float[9];
      this.jda.getImageMatrix().getValues(arrayOfFloat);
      float f1 = this.jda.getScale() * this.jda.aTi();
      float f2 = this.jda.getScale() * this.jda.aTj();
      float f3 = arrayOfFloat[2];
      float f4 = f3 + f1;
      float f5 = arrayOfFloat[5];
      float f6 = f5 + f2;
      Rect localRect = new Rect();
      this.jda.getGlobalVisibleRect(localRect);
      if (((int)f1 <= this.enc) && ((int)f2 <= this.ene))
      {
        if (a(f3, f4, localView1, paramFloat1))
          return true;
        if (paramFloat1 > 0.0F)
        {
          if (f4 <= this.enc)
            return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
        }
        else if (f3 >= 0.0F)
          return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
        if (!this.jde)
          this.jda.t(-paramFloat1, 0.0F);
        return true;
      }
      if (((int)f1 <= this.enc) && ((int)f2 > this.ene))
      {
        if (Math.abs(paramFloat2) > Math.abs(paramFloat1))
          return c(paramFloat2, f5, f6);
        if (a(f3, f4, localView1, paramFloat1))
          return true;
        if (paramFloat1 > 0.0F)
        {
          if (f4 <= this.enc)
            return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
        }
        else if (f3 >= 0.0F)
          return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
        if (!this.jde)
          this.jda.t(-paramFloat1, 0.0F);
        return true;
      }
      if (((int)f1 > this.enc) && ((int)f2 <= this.ene))
      {
        if (a(f3, f4, localView1, paramFloat1))
          return true;
        if (paramFloat1 > 0.0F)
        {
          if (f4 <= this.enc)
            return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
        }
        else if (f3 >= 0.0F)
          return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
        if (!this.jde)
          this.jda.t(-paramFloat1, 0.0F);
        return true;
      }
      if (Math.abs(paramFloat2) > Math.abs(paramFloat1))
        return c(paramFloat2, f5, f6);
      if (a(f3, f4, localView1, paramFloat1))
        return true;
      if (paramFloat1 > 0.0F)
      {
        if (f4 <= this.enc)
          return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
      }
      else if (f3 >= 0.0F)
        return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
      if (!this.jde)
        this.jda.t(-paramFloat1, -paramFloat2);
      return true;
    }
    return a(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.jTn.onTouchEvent(paramMotionEvent);
    z.d("dktest", "onTouchEvent event.getAction()" + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction())
    {
    default:
    case 1:
    }
    while (true)
    {
      return super.onTouchEvent(paramMotionEvent);
      View localView = getSelectedView();
      if ((localView instanceof MultiTouchImageView))
      {
        this.jda = ((MultiTouchImageView)localView);
        float f1 = this.jda.getScale() * this.jda.aTi();
        float f2 = this.jda.getScale() * this.jda.aTj();
        if (((int)f1 <= this.enc) && ((int)f2 <= this.ene))
        {
          z.i("dktest", "onTouchEvent width:" + f1 + "height:" + f2);
        }
        else
        {
          float[] arrayOfFloat = new float[9];
          this.jda.getImageMatrix().getValues(arrayOfFloat);
          float f3 = arrayOfFloat[5];
          float f4 = f3 + f2;
          z.d("dktest", "onTouchEvent top:" + f3 + " height:" + f2 + " bottom:" + f4);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if (paramBoolean)
      super.onWindowFocusChanged(paramBoolean);
  }

  public final void release()
  {
    this.jTp.release();
    this.jTq.release();
    this.jTo.release();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery
 * JD-Core Version:    0.6.2
 */