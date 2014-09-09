package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.widget.Button;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.cn;

final class ab
  implements Runnable
{
  ab(ChatFooter paramChatFooter)
  {
  }

  public final void run()
  {
    if (ChatFooter.C(this.hDT) != null)
    {
      ChatFooter.C(this.hDT).dismiss();
      ChatFooter.D(this.hDT).setVisibility(0);
      ChatFooter.E(this.hDT).setVisibility(8);
      ChatFooter.F(this.hDT).setVisibility(8);
      ChatFooter.w(this.hDT).setVisibility(8);
      ChatFooter.v(this.hDT).setVisibility(0);
    }
    ChatFooter.s(this.hDT).setBackgroundDrawable(a.n(this.hDT.getContext(), h.ZE));
    ChatFooter.s(this.hDT).setText(n.byr);
    ChatFooter.d(this.hDT, false);
    ChatFooter.c(this.hDT, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ab
 * JD-Core Version:    0.6.2
 */