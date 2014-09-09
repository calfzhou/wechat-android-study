package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomFitTextView extends TextView
{
  private Paint jQf;
  private String jQg;
  private Rect jQh = new Rect();
  private LinkedList jQi = new LinkedList();
  private int jQj;
  private Drawable jQk;
  private boolean jQl;
  private boolean jQm;
  private int jQn = 0;
  private int maxLines;

  public CustomFitTextView(Context paramContext)
  {
    super(paramContext);
  }

  public CustomFitTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CustomFitTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void Dl(String paramString)
  {
    if ((this.jQi == null) || (paramString == null) || ("".equals(paramString)))
      return;
    this.jQi.add(paramString);
  }

  private int a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 <= paramInt1)
      paramInt2 = paramInt1 + 1;
    while (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 < paramInt4)
      return paramInt2;
    int i = paramString.length();
    while (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 > paramInt4)
      paramInt2 = paramInt2 + paramInt1 >> 1;
    while ((paramInt2 <= i) && (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 < paramInt4))
      paramInt2++;
    int j = -1 + Math.min(i, paramInt2);
    for (int k = j; (k >= 0) && (ch.m(paramString.charAt(k))); k--);
    if ((k < 0) || (k == j))
      return paramInt2 - 1;
    return k + 1;
  }

  private int aZW()
  {
    Paint.FontMetrics localFontMetrics = getPaint().getFontMetrics();
    return (int)(this.jQi.size() * (localFontMetrics.bottom - localFontMetrics.top + localFontMetrics.leading) + getPaddingTop() + getPaddingBottom()) + Math.max(0, -1 + this.jQi.size()) * this.jQn;
  }

  private boolean ax(String paramString, int paramInt)
  {
    int i;
    int j;
    int k;
    int m;
    float f;
    int n;
    if ((this.jQm) && (paramInt > 0) && (paramString != null) && (!"".equals(paramString)))
    {
      this.jQi.clear();
      i = 0;
      j = paramString.length();
      k = paramInt - getPaddingLeft() - getPaddingRight();
      if (this.jQl)
      {
        m = this.jQk.getIntrinsicWidth();
        f = getPaint().measureText(paramString, 0, j) + m;
        n = this.maxLines;
        if (Float.compare(f, k * this.maxLines) >= 0)
          break label226;
      }
    }
    label226: for (int i1 = (int)Math.ceil(f / k); ; i1 = n)
    {
      int i2 = 0;
      label123: if (i2 < i1)
        if (i2 == i1 - 1)
          Dl(paramString.substring(i, a(paramString, i, j, m, k)).trim());
      while (true)
      {
        i2++;
        break label123;
        m = 0;
        break;
        int i3 = a(paramString, i, j, 0, k);
        Dl(paramString.substring(i, i3).trim());
        if (i3 >= j)
        {
          z.w("!44@/B4Tb64lLpJOk4QDbWrMa+lh3fOOuJPEBieCQF4yBy8=", "not match last line, but match text length end");
          return true;
          return false;
        }
        i = i3;
      }
    }
  }

  public final void d(String paramString, boolean paramBoolean, int paramInt)
  {
    this.maxLines = 2;
    this.jQg = paramString;
    if (this.jQg == null)
    {
      z.w("!44@/B4Tb64lLpJOk4QDbWrMa+lh3fOOuJPEBieCQF4yBy8=", "ori text is null");
      this.jQg = "";
    }
    if (this.maxLines <= 0)
    {
      z.w("!44@/B4Tb64lLpJOk4QDbWrMa+lh3fOOuJPEBieCQF4yBy8=", "maxLines is invalid");
      this.maxLines = 2;
    }
    this.jQn = getResources().getDimensionPixelSize(g.Pj);
    this.jQl = paramBoolean;
    this.jQj = paramInt;
    if (this.jQl)
      this.jQk = getResources().getDrawable(this.jQj);
    this.jQf = new Paint();
    this.jQf.set(getPaint());
    this.jQf.setAntiAlias(true);
    this.jQf.setColor(getCurrentTextColor());
    ax(this.jQg, getWidth());
    setHeight(Math.max(aZW(), a.fromDPToPix(getContext(), 32)));
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (!this.jQm);
    Paint.FontMetrics localFontMetrics;
    float f1;
    float f4;
    do
    {
      do
        return;
      while ((this.jQg == null) || ("".equals(this.jQg)) || (this.jQi.size() == 0));
      localFontMetrics = getPaint().getFontMetrics();
      f1 = localFontMetrics.descent - localFontMetrics.ascent;
      float f2 = getPaddingLeft();
      float f3 = getPaddingTop();
      Iterator localIterator = this.jQi.iterator();
      float f5;
      for (f4 = f3; localIterator.hasNext(); f4 = f5)
      {
        String str = (String)localIterator.next();
        f5 = f4 + (f1 + localFontMetrics.leading);
        paramCanvas.drawText(str, f2, f5, this.jQf);
      }
    }
    while (!this.jQl);
    getPaint().getTextBounds((String)this.jQi.getLast(), 0, ((String)this.jQi.getLast()).length(), this.jQh);
    int i = getPaddingLeft() + this.jQh.right;
    int j = i + this.jQk.getIntrinsicWidth();
    int k = (int)(f4 - f1 - localFontMetrics.leading);
    int m = k + this.jQk.getIntrinsicHeight();
    this.jQk.setBounds(i, k, j, m);
    this.jQk.draw(paramCanvas);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = a.fromDPToPix(getContext(), 32);
    if (ax(this.jQg, i))
      j = Math.max(aZW(), j);
    setMeasuredDimension(i, j);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4));
    for (boolean bool = true; ; bool = false)
    {
      this.jQm = bool;
      if (this.jQm)
        ax(this.jQg, paramInt1);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CustomFitTextView
 * JD-Core Version:    0.6.2
 */