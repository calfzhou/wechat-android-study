package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;

final class s
  implements View.OnClickListener
{
  s(ChatFooter paramChatFooter)
  {
  }

  public final void onClick(View paramView)
  {
    ChatFooter.i(this.hDT).YU();
    if ((!ChatFooter.h(this.hDT).aCE()) && (ChatFooter.p(this.hDT) != null) && (ChatFooter.p(this.hDT).getVisibility() == 0))
    {
      this.hDT.aep();
      return;
    }
    this.hDT.aBO();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.s
 * JD-Core Version:    0.6.2
 */