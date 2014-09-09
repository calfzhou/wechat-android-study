package com.tencent.mm.ui.applet;

import android.os.MessageQueue.IdleHandler;
import java.util.LinkedList;

final class c
  implements MessageQueue.IdleHandler
{
  c(b paramb)
  {
  }

  public final boolean queueIdle()
  {
    while (b.a(this.iVH).size() > 0)
    {
      String str = (String)b.a(this.iVH).removeFirst();
      b.b(this.iVH).gu(str);
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.c
 * JD-Core Version:    0.6.2
 */