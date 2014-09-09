package com.tencent.mm.ui.friend;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.ui.MMActivity;

final class i
  implements View.OnTouchListener
{
  i(f paramf)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((f.d(this.jIa) instanceof MMActivity))
      ((MMActivity)f.d(this.jIa)).XF();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.i
 * JD-Core Version:    0.6.2
 */