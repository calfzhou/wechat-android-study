package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

public class PagerTabStrip extends PagerTitleStrip
{
  private int dK = this.eq;
  private int dL;
  private int dM;
  private int dN;
  private int dO;
  private int dP;
  private final Paint dQ = new Paint();
  private final Rect dR = new Rect();
  private int dS = 255;
  private boolean dT = false;
  private boolean dU = false;
  private int dV;
  private boolean dW;
  private float dX;
  private float dY;
  private int dZ;

  public PagerTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.dQ.setColor(this.dK);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.dL = ((int)(0.5F + 3.0F * f));
    this.dM = ((int)(0.5F + 6.0F * f));
    this.dN = ((int)(64.0F * f));
    this.dP = ((int)(0.5F + 16.0F * f));
    this.dV = ((int)(0.5F + 1.0F * f));
    this.dO = ((int)(0.5F + f * 32.0F));
    this.dZ = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    g(R());
    setWillNotDraw(false);
    this.ec.setFocusable(true);
    this.ec.setOnClickListener(new ao(this));
    this.ee.setFocusable(true);
    this.ee.setOnClickListener(new ap(this));
    if (getBackground() == null)
      this.dT = true;
  }

  final void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    Rect localRect = this.dR;
    int i = getHeight();
    int j = this.ed.getLeft() - this.dP;
    int k = this.ed.getRight() + this.dP;
    int m = i - this.dL;
    localRect.set(j, m, k, i);
    super.a(paramInt, paramFloat, paramBoolean);
    this.dS = ((int)(255.0F * (2.0F * Math.abs(paramFloat - 0.5F))));
    localRect.union(this.ed.getLeft() - this.dP, m, this.ed.getRight() + this.dP, i);
    invalidate(localRect);
  }

  public final void g(int paramInt)
  {
    if (paramInt < this.dN)
      paramInt = this.dN;
    super.g(paramInt);
  }

  final int getMinHeight()
  {
    return Math.max(super.getMinHeight(), this.dO);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = this.ed.getLeft() - this.dP;
    int k = this.ed.getRight() + this.dP;
    int m = i - this.dL;
    this.dQ.setColor(this.dS << 24 | 0xFFFFFF & this.dK);
    paramCanvas.drawRect(j, m, k, i, this.dQ);
    if (this.dT)
    {
      this.dQ.setColor(0xFF000000 | 0xFFFFFF & this.dK);
      paramCanvas.drawRect(getPaddingLeft(), i - this.dV, getWidth() - getPaddingRight(), i, this.dQ);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if ((i != 0) && (this.dW))
      return false;
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      return true;
      this.dX = f1;
      this.dY = f2;
      this.dW = false;
      continue;
      if ((Math.abs(f1 - this.dX) > this.dZ) || (Math.abs(f2 - this.dY) > this.dZ))
      {
        this.dW = true;
        continue;
        if (f1 < this.ed.getLeft() - this.dP)
          this.eb.k(-1 + this.eb.W());
        else if (f1 > this.ed.getRight() + this.dP)
          this.eb.k(1 + this.eb.W());
      }
    }
  }

  public void setBackgroundColor(int paramInt)
  {
    super.setBackgroundColor(paramInt);
    if (!this.dU)
      if ((0xFF000000 & paramInt) != 0)
        break label27;
    label27: for (boolean bool = true; ; bool = false)
    {
      this.dT = bool;
      return;
    }
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (!this.dU)
      if (paramDrawable != null)
        break label24;
    label24: for (boolean bool = true; ; bool = false)
    {
      this.dT = bool;
      return;
    }
  }

  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (!this.dU)
      if (paramInt != 0)
        break label24;
    label24: for (boolean bool = true; ; bool = false)
    {
      this.dT = bool;
      return;
    }
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt4 < this.dM)
      paramInt4 = this.dM;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTabStrip
 * JD-Core Version:    0.6.2
 */