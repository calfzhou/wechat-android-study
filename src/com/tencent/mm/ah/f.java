package com.tencent.mm.ah;

import android.os.MessageQueue.IdleHandler;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.z;

final class f
  implements MessageQueue.IdleHandler
{
  f(e parame)
  {
  }

  public final boolean queueIdle()
  {
    if (bg.qX().tv())
    {
      z.w("!12@nLQl5Xo8bwA=", "skiped resume speex uploader, not foreground");
      return false;
    }
    z.d("!12@nLQl5Xo8bwA=", "now resume speex uploader");
    e.a(this.dDB).em(false);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.f
 * JD-Core Version:    0.6.2
 */