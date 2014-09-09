package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.n;

final class v
  implements View.OnKeyListener
{
  v(ChatFooter paramChatFooter)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    do
    {
      do
        return false;
      while (((paramInt != 23) && (paramInt != 66)) || (ChatFooter.u(this.hDT)) || (ChatFooter.t(this.hDT)));
      ChatFooter.d(this.hDT, true);
      ChatFooter.s(this.hDT).setBackgroundDrawable(a.n(this.hDT.getContext(), h.ZF));
      ChatFooter.s(this.hDT).setText(n.bys);
      ChatFooter.i(this.hDT).YT();
      ChatFooter.s(this.hDT).setContentDescription(this.hDT.getContext().getString(n.fgT));
      return false;
    }
    while ((paramInt != 23) && (paramInt != 66));
    ChatFooter.s(this.hDT).setBackgroundDrawable(a.n(this.hDT.getContext(), h.ZE));
    ChatFooter.s(this.hDT).setText(n.byr);
    ChatFooter.i(this.hDT).YQ();
    ChatFooter.d(this.hDT, false);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.v
 * JD-Core Version:    0.6.2
 */