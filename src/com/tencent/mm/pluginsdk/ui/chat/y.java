package com.tencent.mm.pluginsdk.ui.chat;

import android.text.Editable;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.mm.h;
import com.tencent.mm.ui.widget.MMEditText;

final class y
  implements bq
{
  y(ChatFooter paramChatFooter)
  {
  }

  public final void aCB()
  {
    ChatFooter.o(this.hDT).reset();
    ChatFooter.a(this.hDT).setText("");
    ChatFooter.a(this.hDT, true);
  }

  public final void aCC()
  {
    ChatFooter.o(this.hDT).reset();
    ChatFooter.g(this.hDT).performClick();
  }

  public final void vG(String paramString)
  {
    if (this.hDT.aCk())
    {
      ChatFooter.z(this.hDT);
      ChatFooter.A(this.hDT).setVisibility(0);
      ChatFooter.s(this.hDT).setVisibility(8);
      ChatFooter.a(this.hDT, true);
      ChatFooter.a(this.hDT, h.TY);
      ChatFooter.a(this.hDT).DC(paramString);
      if (ChatFooter.a(this.hDT).getText().length() > 0)
        ChatFooter.o(this.hDT).aCM();
      return;
    }
    ChatFooter.o(this.hDT).reset();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.y
 * JD-Core Version:    0.6.2
 */