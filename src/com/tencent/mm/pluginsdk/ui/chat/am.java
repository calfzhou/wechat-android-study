package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.widget.MMEditText;

final class am
  implements View.OnClickListener
{
  am(ChatFooter paramChatFooter)
  {
  }

  public final void onClick(View paramView)
  {
    String str = ChatFooter.a(this.hDT).getText().toString();
    z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "send msg onClick");
    if ((str.trim().length() == 0) && (str.length() != 0))
    {
      z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "empty message cant be sent");
      if ((ChatFooter.l(this.hDT) == null) || (!ChatFooter.l(this.hDT).isShowing()))
        ChatFooter.a(this.hDT, e.b(this.hDT.getContext(), n.byJ, n.buo));
    }
    while (!ChatFooter.i(this.hDT).oy(str))
      return;
    ChatFooter.a(this.hDT).clearComposingText();
    ChatFooter.a(this.hDT).setText("");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.am
 * JD-Core Version:    0.6.2
 */