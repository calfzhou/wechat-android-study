package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.cn;

final class gd
  implements View.OnTouchListener
{
  gd(gb paramgb)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      gb.c(this.jrc);
      gb.a(this.jrc, paramView.getScrollY());
      gb.b(this.jrc, gb.a(this.jrc));
      gb.b(this.jrc).removeMessages(0);
      if (gb.d(this.jrc))
      {
        gb.a(this.jrc, false);
        gb.b(this.jrc, true);
      }
    }
    while ((paramMotionEvent.getAction() == 2) || ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1) && (paramMotionEvent.getAction() != 4)))
      return false;
    if (Math.abs(gb.e(this.jrc) - paramView.getScrollY()) > 3)
      gb.b(this.jrc).sendMessage(gb.b(this.jrc).obtainMessage(0, paramView));
    if ((gb.f(this.jrc) < 800L) && (Math.abs(gb.e(this.jrc) - paramView.getScrollY()) <= 3) && (!gb.g(this.jrc)) && (gb.h(this.jrc) != null) && (gb.h(this.jrc).isShowing()))
    {
      gb.b(this.jrc).removeMessages(0);
      gb.i(this.jrc);
      gb.h(this.jrc).dismiss();
    }
    gb.b(this.jrc, false);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gd
 * JD-Core Version:    0.6.2
 */