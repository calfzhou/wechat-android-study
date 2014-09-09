package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class HardDeviceChattingItemView extends LinearLayout
{
  private boolean eZm;

  public HardDeviceChattingItemView(Context paramContext)
  {
    super(paramContext);
  }

  public HardDeviceChattingItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    if (!this.eZm)
      this.eZm = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.HardDeviceChattingItemView
 * JD-Core Version:    0.6.2
 */