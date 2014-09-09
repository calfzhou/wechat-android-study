package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.e.c;

final class al
  implements View.OnLongClickListener
{
  al(ChatFooter paramChatFooter)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    if (ChatFooter.k(this.hDT) != null)
    {
      String str = ChatFooter.k(this.hDT).aCJ();
      if (str != null)
        c.a(this.hDT.getContext(), this.hDT.getContext().getString(n.btR), str);
    }
    this.hDT.aep();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.al
 * JD-Core Version:    0.6.2
 */