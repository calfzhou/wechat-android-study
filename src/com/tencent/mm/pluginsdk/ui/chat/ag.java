package com.tencent.mm.pluginsdk.ui.chat;

import android.os.Message;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.compatible.g.n;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.cm;

final class ag extends cm
{
  ag(ChatFooter paramChatFooter)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
      return;
    case 4097:
    }
    ChatFooter.f(this.hDT, true);
    ViewGroup.LayoutParams localLayoutParams = ChatFooter.h(this.hDT).getLayoutParams();
    int i = ChatFooter.h(this.hDT).getBottom() - ChatFooter.h(this.hDT).getTop();
    if (this.hDT.aCk())
    {
      if (ChatFooter.p(this.hDT) != null)
        ChatFooter.p(this.hDT).setVisibility(8);
      ChatFooter.m(this.hDT).setVisibility(8);
      ChatFooter.h(this.hDT).setVisibility(4);
    }
    if (i <= 3)
    {
      ChatFooter.f(this.hDT, false);
      ChatFooter.h(this.hDT).setVisibility(8);
      ChatFooter.b(this.hDT, n.R(this.hDT.getContext()));
      return;
    }
    localLayoutParams.height = Math.max(i - 60, 1);
    ChatFooter.h(this.hDT).setLayoutParams(localLayoutParams);
    ChatFooter.I(this.hDT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ag
 * JD-Core Version:    0.6.2
 */