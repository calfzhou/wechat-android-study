package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.k;

public class AlphabetScrollBar extends VerticalScrollBar
{
  public AlphabetScrollBar(Context paramContext)
  {
    super(paramContext);
  }

  public AlphabetScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void Jy()
  {
    this.jfH = new String[] { "↑", "☆", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.jfF = 1.3F;
    this.jfG = 79;
  }

  protected final int aRk()
  {
    return k.bnp;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.AlphabetScrollBar
 * JD-Core Version:    0.6.2
 */