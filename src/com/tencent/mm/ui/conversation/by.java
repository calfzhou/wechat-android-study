package com.tencent.mm.ui.conversation;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.mm.sdk.platformtools.z;

final class by
  implements MessageQueue.IdleHandler
{
  by(aj paramaj)
  {
  }

  public final boolean queueIdle()
  {
    z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "dkuploadAddrBook idleHandler");
    aj.aYw();
    Looper.myQueue().removeIdleHandler(aj.f(this.jGZ));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.by
 * JD-Core Version:    0.6.2
 */