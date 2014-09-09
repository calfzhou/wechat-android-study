package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.mm.ui.base.MMTagPanelScrollView;

public class LabelContainerView extends MMTagPanelScrollView
{
  boolean jAi = true;
  boolean jAj = false;
  float jAk;
  float jAl;
  float jAm;
  float jAn;
  private int jAo;
  boolean jAp = true;
  boolean jAq = false;
  float jAr;
  float jAs;
  float jAt;
  float jAu;
  private cz jAv;

  public LabelContainerView(Context paramContext)
  {
    super(paramContext);
    aXg();
  }

  public LabelContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    aXg();
  }

  public LabelContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    aXg();
  }

  private void aXg()
  {
    int i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.jAo = (i * i);
  }

  public final void a(cz paramcz)
  {
    this.jAv = paramcz;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchTouchEvent(paramMotionEvent);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    int i = paramMotionEvent.getAction();
    int j;
    if ((i & 0xFF) == 6)
    {
      j = 1;
      if (j == 0)
        break label89;
    }
    int m;
    float f2;
    label89: for (int k = paramMotionEvent.getActionIndex(); ; k = -1)
    {
      m = paramMotionEvent.getPointerCount();
      int n = 0;
      f2 = 0.0F;
      while (n < m)
      {
        if (k != n)
        {
          f2 += paramMotionEvent.getX(n);
          f1 += paramMotionEvent.getY(n);
        }
        n++;
      }
      j = 0;
      break;
    }
    int i1;
    float f3;
    float f4;
    if (j != 0)
    {
      i1 = m - 1;
      f3 = f2 / i1;
      f4 = f1 / i1;
      switch (i)
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
    }
    while (true)
    {
      return super.onInterceptTouchEvent(paramMotionEvent);
      i1 = m;
      break;
      this.jAp = true;
      this.jAs = f3;
      this.jAr = f3;
      this.jAu = f4;
      this.jAt = f4;
      this.jAq = true;
      continue;
      int i2 = (int)(f3 - this.jAr);
      int i3 = (int)(f4 - this.jAt);
      if (i2 * i2 + i3 * i3 > this.jAo)
      {
        this.jAp = false;
        return true;
        this.jAp = true;
        this.jAq = false;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    int i = paramMotionEvent.getAction();
    int j;
    if ((i & 0xFF) == 6)
    {
      j = 1;
      if (j == 0)
        break label89;
    }
    int m;
    float f2;
    label89: for (int k = paramMotionEvent.getActionIndex(); ; k = -1)
    {
      m = paramMotionEvent.getPointerCount();
      int n = 0;
      f2 = 0.0F;
      while (n < m)
      {
        if (k != n)
        {
          f2 += paramMotionEvent.getX(n);
          f1 += paramMotionEvent.getY(n);
        }
        n++;
      }
      j = 0;
      break;
    }
    int i1;
    float f3;
    float f4;
    if (j != 0)
    {
      i1 = m - 1;
      f3 = f2 / i1;
      f4 = f1 / i1;
      switch (i)
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
    }
    while (true)
    {
      return super.onTouchEvent(paramMotionEvent);
      i1 = m;
      break;
      this.jAi = true;
      this.jAl = f3;
      this.jAk = f3;
      this.jAn = f4;
      this.jAm = f4;
      this.jAj = true;
      continue;
      if (!this.jAj)
      {
        this.jAi = true;
        this.jAl = f3;
        this.jAk = f3;
        this.jAn = f4;
        this.jAm = f4;
        this.jAj = true;
      }
      if (this.jAv != null)
        this.jAv.aiI();
      int i2 = (int)(f3 - this.jAk);
      int i3 = (int)(f4 - this.jAm);
      if (i2 * i2 + i3 * i3 > this.jAo)
      {
        this.jAi = false;
        continue;
        if (((this.jAi) || (!this.jAj)) && (this.jAv != null))
          this.jAv.aiH();
        this.jAi = true;
        this.jAj = false;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.LabelContainerView
 * JD-Core Version:    0.6.2
 */