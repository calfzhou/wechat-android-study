package com.tencent.mm.ui.setting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.ui.base.aa;

final class gd
  implements View.OnTouchListener
{
  gd(gc paramgc)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) && (gc.b(this.jOu) != null) && (gc.b(this.jOu).isShowing()))
      gc.b(this.jOu).dismiss();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.gd
 * JD-Core Version:    0.6.2
 */