package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.ui.MMActivity;

final class ag
  implements View.OnTouchListener
{
  ag(BizContactEntranceView paramBizContactEntranceView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((BizContactEntranceView.a(this.jyi) instanceof MMActivity))
      ((MMActivity)BizContactEntranceView.a(this.jyi)).XF();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ag
 * JD-Core Version:    0.6.2
 */