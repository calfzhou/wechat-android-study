package com.tencent.mm.plugin.exdevice.a;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

final class p
  implements Runnable
{
  private long eIu = -1L;

  public p(l paraml, long paramLong)
  {
    if (paramLong >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.eIu = paramLong;
      return;
    }
  }

  public final void run()
  {
    z.w("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "Time Out Sequnence = " + this.eIu);
    l.a(this.eIq).obtainMessage(0, Long.valueOf(this.eIu)).sendToTarget();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.p
 * JD-Core Version:    0.6.2
 */