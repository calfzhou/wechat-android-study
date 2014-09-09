package com.tencent.mm.ui.friend;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.modelfriend.q;

final class aw
  implements View.OnTouchListener
{
  aw(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (FindMContactInviteUI.b(this.jIB) != null)
      FindMContactInviteUI.b(this.jIB).onTouchEvent(paramMotionEvent);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.aw
 * JD-Core Version:    0.6.2
 */