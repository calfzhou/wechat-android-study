package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;

final class ac
  implements View.OnClickListener
{
  ac(ChatFooter paramChatFooter)
  {
  }

  public final void onClick(View paramView)
  {
    if (ChatFooter.G(this.hDT) != null)
      ChatFooter.G(this.hDT).dK(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ac
 * JD-Core Version:    0.6.2
 */