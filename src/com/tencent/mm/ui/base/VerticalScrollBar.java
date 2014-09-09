package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.e;

public abstract class VerticalScrollBar extends View
{
  private Paint emx;
  private TextView jcW;
  protected float jfF;
  protected int jfG;
  protected String[] jfH;
  private int jfI;
  private float jfJ;
  private float jfK;
  private cn jfL;
  private int jfM;
  private fy jfN;

  public VerticalScrollBar(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }

  public VerticalScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }

  private void init(Context paramContext)
  {
    Jy();
    setFocusable(true);
    setFocusableInTouchMode(true);
    this.jfM = e.a(paramContext, 3.0F);
    View localView = inflate(paramContext, aRk(), null);
    int i = e.a(paramContext, this.jfG);
    this.jfL = new cn(localView, i, i);
    this.jcW = ((TextView)localView.findViewById(i.aQh));
    this.emx = new Paint();
    this.emx.setAntiAlias(true);
    this.emx.setColor(-11119018);
    this.emx.setTextAlign(Paint.Align.CENTER);
  }

  protected abstract void Jy();

  public final void a(fy paramfy)
  {
    this.jfN = paramfy;
  }

  protected abstract int aRk();

  public final void aTw()
  {
    this.jfN = null;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getMeasuredHeight();
    int j = getMeasuredWidth();
    this.jfJ = (i / (this.jfH.length * this.jfF));
    this.emx.setTextSize(this.jfJ);
    for (int k = 0; k < this.jfH.length; k++)
      paramCanvas.drawText(this.jfH[k], j / 2.0F, this.jfJ + k * this.jfJ * this.jfF, this.emx);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2))
    {
      this.jfK = paramMotionEvent.getY();
      if (this.jfK < 0.0F)
        this.jfK = 0.0F;
      if (this.jfK > getMeasuredHeight())
        this.jfK = getMeasuredHeight();
      setBackgroundDrawable(a.n(getContext(), h.aac));
      int i = (int)(this.jfK / (this.jfJ * this.jfF));
      if (i >= this.jfH.length)
        i = -1 + this.jfH.length;
      this.jfI = i;
      if (this.jfI != -1)
        break label209;
      this.jcW.setText(n.ccR);
      this.jfL.showAtLocation(this, 17, 0, 0);
      if (this.jfN != null)
      {
        if (this.jfI != -1)
          break label228;
        this.jfN.kF(a.p(getContext(), n.ccR));
      }
    }
    while (true)
    {
      invalidate();
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        setBackgroundResource(0);
        this.jfL.dismiss();
      }
      return true;
      label209: this.jcW.setText(this.jfH[this.jfI]);
      break;
      label228: this.jfN.kF(this.jfH[this.jfI]);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VerticalScrollBar
 * JD-Core Version:    0.6.2
 */