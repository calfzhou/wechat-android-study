package com.tencent.mm.pluginsdk.ui.chat;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class aj
  implements TextView.OnEditorActionListener
{
  aj(ChatFooter paramChatFooter)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) || ((paramInt == 0) && (ChatFooter.f(this.hDT))))
    {
      ChatFooter.g(this.hDT).performClick();
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.aj
 * JD-Core Version:    0.6.2
 */