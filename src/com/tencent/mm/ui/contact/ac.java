package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.ui.MMActivity;

final class ac
  implements View.OnTouchListener
{
  ac(aa paramaa)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((aa.a(this.jxZ) instanceof MMActivity))
      ((MMActivity)aa.a(this.jxZ)).XF();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ac
 * JD-Core Version:    0.6.2
 */