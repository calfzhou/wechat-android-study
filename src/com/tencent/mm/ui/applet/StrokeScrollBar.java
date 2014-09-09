package com.tencent.mm.ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.VerticalScrollBar;

public class StrokeScrollBar extends VerticalScrollBar
{
  public StrokeScrollBar(Context paramContext)
  {
    super(paramContext);
  }

  public StrokeScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected final void Jy()
  {
    this.jfH = new String[18];
    for (int i = 0; i < this.jfH.length; i++)
      this.jfH[i] = (Integer.toString(i + 3) + "劃");
    this.jfF = 2.0F;
    this.jfG = 79;
  }

  protected final int aRk()
  {
    return k.bnq;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.StrokeScrollBar
 * JD-Core Version:    0.6.2
 */