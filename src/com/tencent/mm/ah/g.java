package com.tencent.mm.ah;

import android.os.Looper;
import android.os.MessageQueue;

final class g
  implements Runnable
{
  g(e parame)
  {
  }

  public final void run()
  {
    Looper.myQueue().addIdleHandler(new h(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.g
 * JD-Core Version:    0.6.2
 */