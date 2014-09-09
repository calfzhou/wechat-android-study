package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class oe
  implements Runnable
{
  oe(ShortVideoRecorderView paramShortVideoRecorderView)
  {
  }

  public final void run()
  {
    e.aw(this.jvS.getContext(), this.jvS.getContext().getString(n.cnQ));
    this.jvS.hide();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.oe
 * JD-Core Version:    0.6.2
 */