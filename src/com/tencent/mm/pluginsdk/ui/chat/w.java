package com.tencent.mm.pluginsdk.ui.chat;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.mm.ui.widget.MMEditText;

final class w
  implements com.tencent.mm.pluginsdk.ui.h
{
  w(ChatFooter paramChatFooter)
  {
  }

  public final void aou()
  {
    ChatFooter.z(this.hDT);
    ChatFooter.A(this.hDT).setVisibility(0);
    ChatFooter.s(this.hDT).setVisibility(8);
    ChatFooter.a(this.hDT, true);
    ChatFooter.a(this.hDT, com.tencent.mm.h.TY);
    if (ChatFooter.g(this.hDT) != null)
      ChatFooter.g(this.hDT).performClick();
  }

  public final void aov()
  {
    ChatFooter.z(this.hDT);
    ChatFooter.A(this.hDT).setVisibility(0);
    ChatFooter.s(this.hDT).setVisibility(8);
    ChatFooter.a(this.hDT, true);
    ChatFooter.a(this.hDT, com.tencent.mm.h.TY);
    ChatFooter.a(this.hDT).bco().sendKeyEvent(new KeyEvent(0, 67));
    ChatFooter.a(this.hDT).bco().sendKeyEvent(new KeyEvent(1, 67));
  }

  public final void append(String paramString)
  {
    ChatFooter.z(this.hDT);
    ChatFooter.A(this.hDT).setVisibility(0);
    ChatFooter.s(this.hDT).setVisibility(8);
    ChatFooter.a(this.hDT, true);
    ChatFooter.a(this.hDT, com.tencent.mm.h.TY);
    try
    {
      ChatFooter.a(this.hDT).DC(paramString);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void cs(boolean paramBoolean)
  {
    ChatFooter.z(this.hDT);
    ChatFooter.A(this.hDT).setVisibility(0);
    ChatFooter.s(this.hDT).setVisibility(8);
    ChatFooter.a(this.hDT, com.tencent.mm.h.TY);
    if (ChatFooter.a(this.hDT) != null)
      this.hDT.dH(paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.w
 * JD-Core Version:    0.6.2
 */