package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.tencent.mm.f;
import com.tencent.mm.n;

public class MMSwitchBtn extends View
{
  private Paint hMj = new Paint(1);
  private float kaX;
  private float kaY;
  private long kaZ;
  private int kba;
  private int kbb;
  private int kbc;
  private boolean kbd = false;
  private boolean kbe = false;
  private int kbf;
  private int kbg;
  private int kbh = 80;
  private int kbi = 300;
  private float kbj;
  private float kbk;
  private int kbl;
  private int kbm;
  private int kbn;
  private boolean kbo = false;
  private RectF kbp = new RectF();
  private RectF kbq = new RectF();
  private h kbr = new h(this);
  private g kbs;
  private int maxHeight;
  private int maxWidth;

  public MMSwitchBtn(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MMSwitchBtn(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public MMSwitchBtn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void aK(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  private void bbf()
  {
    if (this.kbq.left > this.kba)
    {
      gq(true);
      return;
    }
    gq(false);
  }

  private void bcr()
  {
    if (this.kbc < this.maxHeight)
      this.kbq.top = ((this.maxHeight - this.kbc) / 2 + this.kbg);
    for (this.kbq.bottom = (this.kbq.top + this.kbc - 2 * this.kbg); this.kbo; this.kbq.bottom = (this.maxHeight - this.kbg))
    {
      this.kbq.left = this.kbb;
      this.kbq.right = (this.maxWidth - this.kbg);
      return;
      this.kbq.top = this.kbg;
    }
    this.kbq.left = this.kbg;
    this.kbq.right = this.kbb;
  }

  private void bct()
  {
    if (this.kbq.left < this.kbg)
      this.kbq.left = this.kbg;
    if (this.kbq.left > this.kbb)
      this.kbq.left = this.kbb;
    this.kbq.right = (this.kbq.left + this.kbb - this.kbg);
  }

  private void gq(boolean paramBoolean)
  {
    this.kbd = true;
    this.kbr.reset();
    if (paramBoolean)
      this.kbr.kbt = (this.kbb - ()this.kbq.left);
    for (this.kbr.direction = 1; ; this.kbr.direction = 0)
    {
      this.kbr.FE = this.kbq.left;
      this.kbr.setDuration(this.kbh * this.kbr.kbt / this.kbb);
      startAnimation(this.kbr);
      return;
      this.kbr.kbt = (()this.kbq.left);
    }
  }

  private void init()
  {
    this.kbg = getResources().getDimensionPixelSize(com.tencent.mm.g.PJ);
    this.kbj = getResources().getDimensionPixelSize(com.tencent.mm.g.PP);
    this.kbk = getResources().getDimensionPixelSize(com.tencent.mm.g.PQ);
    this.kbl = getResources().getColor(f.white);
    this.kbm = getResources().getColor(f.OT);
    this.kbn = getResources().getColor(f.OU);
    this.kbf = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  }

  public final void a(g paramg)
  {
    this.kbs = paramg;
  }

  public final boolean bcq()
  {
    return this.kbo;
  }

  public final void gp(boolean paramBoolean)
  {
    if (this.kbo != paramBoolean)
    {
      clearAnimation();
      this.kbo = paramBoolean;
      bcr();
      this.kbd = false;
      invalidate();
    }
    if (paramBoolean);
    for (String str = getContext().getString(n.bAK); ; str = getContext().getString(n.bAL))
    {
      setContentDescription(str);
      return;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    this.hMj.setColor(this.kbm);
    this.hMj.setAlpha(255);
    paramCanvas.drawRoundRect(this.kbp, this.kbj, this.kbj, this.hMj);
    this.hMj.setColor(this.kbn);
    this.hMj.setAlpha(Math.min(255, (int)(255.0F * (this.kbq.left / (this.kbb - this.kbg)))));
    paramCanvas.drawRoundRect(this.kbp, this.kbj, this.kbj, this.hMj);
    this.hMj.setColor(this.kbl);
    paramCanvas.drawRoundRect(this.kbq, this.kbk, this.kbk, this.hMj);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.maxWidth = (paramInt3 - paramInt1);
    this.maxHeight = (paramInt4 - paramInt2);
    this.kbb = (this.maxWidth / 2);
    this.kba = (this.kbb / 2);
    this.kbc = getResources().getDimensionPixelSize(com.tencent.mm.g.Pn);
    if (this.kbc < this.maxHeight)
      this.kbp.top = ((this.maxHeight - this.kbc) / 2);
    for (this.kbp.bottom = (this.kbp.top + this.kbc); ; this.kbp.bottom = this.maxHeight)
    {
      this.kbp.left = 0.0F;
      this.kbp.right = this.maxWidth;
      bcr();
      this.hMj.setStyle(Paint.Style.FILL);
      this.hMj.setColor(this.kbm);
      return;
      this.kbp.top = 0.0F;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.kbd);
    while (true)
    {
      return true;
      switch (paramMotionEvent.getAction())
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
      while (this.kbe)
      {
        invalidate();
        return true;
        clearAnimation();
        this.kaX = paramMotionEvent.getX();
        this.kaY = paramMotionEvent.getY();
        this.kaZ = SystemClock.elapsedRealtime();
        this.kbe = false;
        continue;
        if (this.kbe)
        {
          aK(true);
          float f3 = paramMotionEvent.getX() - this.kaX;
          RectF localRectF = this.kbq;
          localRectF.left = (f3 + localRectF.left);
          bct();
        }
        while (true)
        {
          this.kaX = paramMotionEvent.getX();
          this.kaY = paramMotionEvent.getY();
          break;
          float f1 = paramMotionEvent.getX() - this.kaX;
          float f2 = paramMotionEvent.getY() - this.kaY;
          boolean bool2 = Math.abs(f1) < this.kbf / 10.0F;
          int i = 0;
          if (!bool2)
          {
            if (f2 == 0.0F)
              f2 = 1.0F;
            boolean bool3 = Math.abs(f1 / f2) < 3.0F;
            i = 0;
            if (bool3)
              i = 1;
          }
          if (i != 0)
          {
            this.kbe = true;
            aK(true);
          }
        }
        boolean bool1;
        if (SystemClock.elapsedRealtime() - this.kaZ < this.kbi)
          if (!this.kbo)
          {
            bool1 = true;
            label280: gq(bool1);
          }
        while (true)
        {
          aK(false);
          this.kbe = false;
          break;
          bool1 = false;
          break label280;
          bbf();
        }
        if (this.kbe)
          bbf();
        aK(false);
        this.kbe = false;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMSwitchBtn
 * JD-Core Version:    0.6.2
 */