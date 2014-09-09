package com.tencent.mm.ah;

import android.os.Looper;
import android.os.MessageQueue;

final class l
  implements Runnable
{
  l(k paramk)
  {
  }

  public final void run()
  {
    Looper.myQueue().addIdleHandler(new m(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.l
 * JD-Core Version:    0.6.2
 */