package com.tencent.mm.booter;

import android.os.MessageQueue.IdleHandler;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;

final class ae
  implements MessageQueue.IdleHandler
{
  ae(ac paramac)
  {
  }

  public final boolean queueIdle()
  {
    ac localac = this.diM;
    bg.qQ().n(new af(localac));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ae
 * JD-Core Version:    0.6.2
 */