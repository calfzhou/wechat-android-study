package com.tencent.mm.ui.e;

import android.content.SharedPreferences;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;

final class l
  implements Runnable
{
  l(k paramk)
  {
  }

  public final void run()
  {
    if (k.a(this.jYa))
    {
      z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer update isUpdating and ret");
      return;
    }
    long l1 = k.b(this.jYa).getLong("trace_config_last_update_time", 0L);
    long l2 = System.currentTimeMillis();
    if ((l2 - l1 > 86400000L) || (l1 > l2))
    {
      k.c(this.jYa);
      k.d(this.jYa);
      bg.qX().a(159, this.jYa);
      bg.qX().a(160, this.jYa);
      com.tencent.mm.ad.k localk = new com.tencent.mm.ad.k(21);
      bg.qX().d(localk);
      return;
    }
    z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer last update time: " + l1 + " current time: " + l2 + " in same day");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.l
 * JD-Core Version:    0.6.2
 */