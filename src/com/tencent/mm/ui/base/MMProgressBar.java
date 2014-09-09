package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ay;

public class MMProgressBar extends LinearLayout
{
  private ay hiu = new ay(new cp(this), false);
  private int jaL = 0;
  private int jaM = 0;
  private TextView jaN;
  private TextView jaO;
  private cq jaP;
  private int max = 100;

  public MMProgressBar(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    inflate(getContext(), k.bjD, this);
    this.jaN = ((TextView)findViewById(i.aEr));
    this.jaO = ((TextView)findViewById(i.aEs));
  }

  public final void a(cq paramcq)
  {
    this.jaP = paramcq;
  }

  public final void eQ(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.hiu.cP(40L);
      return;
    }
    this.hiu.aNu();
  }

  public final void setProgress(int paramInt)
  {
    if (paramInt > this.max)
      paramInt = this.max;
    this.jaM = paramInt;
    if (this.hiu.aNx())
      eQ(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMProgressBar
 * JD-Core Version:    0.6.2
 */