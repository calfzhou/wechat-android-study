package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.pluginsdk.ui.EmojiView;

public final class gy
{
  public static void aG(View paramView)
  {
    if ((paramView instanceof ViewGroup))
    {
      int i = ((ViewGroup)paramView).getChildCount();
      for (int j = 0; j < i; j++)
        aG(((ViewGroup)paramView).getChildAt(j));
    }
    if ((paramView instanceof EmojiView))
      ((EmojiView)paramView).aAb();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gy
 * JD-Core Version:    0.6.2
 */