package com.tencent.mm.ah;

import android.os.MessageQueue.IdleHandler;
import com.tencent.mm.sdk.platformtools.z;

final class m
  implements MessageQueue.IdleHandler
{
  m(l paraml)
  {
  }

  public final boolean queueIdle()
  {
    z.d("!12@nLQl5Xo8bwA=", "queueIdle  ");
    e.zQ().b(this.dDJ.dDI);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.m
 * JD-Core Version:    0.6.2
 */