package com.tencent.mm.pluginsdk.ui.chat;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.ui.widget.MMEditText;

final class ak
  implements View.OnTouchListener
{
  ak(ChatFooter paramChatFooter)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    this.hDT.dH(true);
    ChatFooter.h(this.hDT).aCD();
    ChatFooter localChatFooter = this.hDT;
    if (ChatFooter.a(this.hDT).length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      ChatFooter.b(localChatFooter, bool);
      ChatFooter.a(this.hDT, true);
      ChatFooter.i(this.hDT).YW();
      ChatFooter.j(this.hDT);
      return false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ak
 * JD-Core Version:    0.6.2
 */