package com.tencent.mm.pluginsdk.ui.chat;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.widget.MMEditText;

final class aa extends cm
{
  aa(ChatFooter paramChatFooter)
  {
  }

  @SuppressLint({"NewApi"})
  @TargetApi(11)
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1002:
    }
    do
      return;
    while ((ChatFooter.a(this.hDT) == null) || (paramMessage.obj == null));
    boolean bool = ((Boolean)paramMessage.obj).booleanValue();
    if (bool)
      ChatFooter.a(this.hDT).setAlpha(1.0F);
    while (true)
    {
      ChatFooter.a(this.hDT, bool);
      return;
      ChatFooter.a(this.hDT).setAlpha(0.5F);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.aa
 * JD-Core Version:    0.6.2
 */