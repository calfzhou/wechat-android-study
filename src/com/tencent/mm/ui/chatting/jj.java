package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;

final class jj
  implements View.OnTouchListener
{
  jj(hd paramhd)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    hd.J(this.jtA);
    if (!this.jtA.jsp)
      return false;
    this.jtA.fpD.aCp();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jj
 * JD-Core Version:    0.6.2
 */