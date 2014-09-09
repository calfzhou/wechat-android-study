package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.ui.BasePanelKeybordLayout;

public class ChattingUILayout extends BasePanelKeybordLayout
{
  private ChatFooterBottom hEe;

  public ChattingUILayout(Context paramContext)
  {
    super(paramContext);
  }

  public ChattingUILayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private ChatFooterBottom c(ViewGroup paramViewGroup)
  {
    if (this.hEe != null)
      return this.hEe;
    if ((paramViewGroup == null) || (paramViewGroup.getChildCount() <= 0))
      return this.hEe;
    for (int i = 0; i < paramViewGroup.getChildCount(); i++)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ChatFooterBottom))
      {
        this.hEe = ((ChatFooterBottom)localView);
        return this.hEe;
      }
      if (((localView instanceof ViewGroup)) && (c((ViewGroup)localView) != null))
        return this.hEe;
    }
    return this.hEe;
  }

  protected final View aot()
  {
    return c(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChattingUILayout
 * JD-Core Version:    0.6.2
 */