package com.tencent.mm.ah;

import android.os.MessageQueue.IdleHandler;

final class h
  implements MessageQueue.IdleHandler
{
  h(g paramg)
  {
  }

  public final boolean queueIdle()
  {
    this.dDC.dDB.b(new i(this));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.h
 * JD-Core Version:    0.6.2
 */