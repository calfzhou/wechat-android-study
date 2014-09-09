package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.ui.voicesearch.j;

final class ba
  implements View.OnTouchListener
{
  ba(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      if (ChatroomContactUI.f(this.jyq) != null)
        ChatroomContactUI.f(this.jyq).onTouchEvent(paramMotionEvent);
      if (ChatroomContactUI.d(this.jyq) != null)
        ChatroomContactUI.d(this.jyq).onTouchEvent(paramMotionEvent);
      return false;
      this.jyq.XF();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ba
 * JD-Core Version:    0.6.2
 */