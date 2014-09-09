package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.ui.MMActivity;

final class cq
  implements View.OnTouchListener
{
  cq(co paramco)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((co.b(this.jzO) instanceof MMActivity))
      ((MMActivity)co.b(this.jzO)).XF();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cq
 * JD-Core Version:    0.6.2
 */