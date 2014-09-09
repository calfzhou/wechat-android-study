package com.tencent.mm.pluginsdk.ui.chat;

import android.os.Message;
import com.tencent.mm.compatible.a.b;
import com.tencent.mm.sdk.platformtools.cm;

final class ad
  implements b
{
  ad(ChatFooter paramChatFooter, boolean paramBoolean)
  {
  }

  public final void run()
  {
    Message localMessage = new Message();
    localMessage.what = 1002;
    localMessage.obj = Boolean.valueOf(this.hDU);
    ChatFooter.H(this.hDT).sendMessage(localMessage);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ad
 * JD-Core Version:    0.6.2
 */