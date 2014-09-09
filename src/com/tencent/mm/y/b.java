package com.tencent.mm.y;

import android.net.TrafficStats;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class b
  implements az
{
  b(a parama)
  {
  }

  public final boolean kJ()
  {
    long l1 = TrafficStats.getUidRxBytes(a.a(this.dwS));
    long l2 = TrafficStats.getUidTxBytes(a.a(this.dwS));
    long l3 = l1 - a.b(this.dwS) + (l2 - a.c(this.dwS));
    z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "delta of data: " + l3 / 1024L);
    if (l3 <= 20480L)
    {
      a.d(this.dwS);
      this.dwS.start();
    }
    while (true)
    {
      return true;
      a.a(this.dwS, l1);
      a.b(this.dwS, l2);
      a.e(this.dwS).cP(1000L);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.b
 * JD-Core Version:    0.6.2
 */