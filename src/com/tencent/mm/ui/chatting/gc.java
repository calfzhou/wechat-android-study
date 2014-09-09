package com.tencent.mm.ui.chatting;

import android.os.Message;
import android.view.View;
import com.tencent.mm.sdk.platformtools.cm;

final class gc extends cm
{
  gc(gb paramgb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    View localView = (View)paramMessage.obj;
    if (gb.a(this.jrc) != localView.getScrollY())
    {
      gb.a(this.jrc, true);
      gb.b(this.jrc).sendMessageDelayed(gb.b(this.jrc).obtainMessage(0, localView), 5L);
      gb.a(this.jrc, localView.getScrollY());
      return;
    }
    gb.a(this.jrc, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gc
 * JD-Core Version:    0.6.2
 */