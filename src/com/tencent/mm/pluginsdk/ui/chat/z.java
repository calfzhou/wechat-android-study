package com.tencent.mm.pluginsdk.ui.chat;

import android.os.Message;
import android.widget.Button;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.cn;

final class z extends cm
{
  z(ChatFooter paramChatFooter)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (ChatFooter.C(this.hDT) != null)
    {
      ChatFooter.C(this.hDT).dismiss();
      ChatFooter.s(this.hDT).setBackgroundDrawable(a.n(this.hDT.getContext(), h.ZE));
      ChatFooter.s(this.hDT).setEnabled(true);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.z
 * JD-Core Version:    0.6.2
 */