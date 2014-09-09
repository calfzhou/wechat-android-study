package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.az;

final class c
  implements az
{
  c(b paramb)
  {
  }

  public final boolean kJ()
  {
    String str = b.a(this.gSC);
    n localn = f.arG().tk(str);
    if ((localn == null) || (!localn.BK()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "Get info Failed file:" + b.a(this.gSC));
      b.a(this.gSC, 10000 + k.nJ());
      b.b(this.gSC).a(3, -1, "doScene failed", this.gSC);
    }
    do
    {
      return false;
      if ((3 != localn.field_status) && (8 != localn.field_status))
      {
        long l = System.currentTimeMillis();
        if (l / 1000L - localn.field_lastmodifytime > 30L)
        {
          com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "Error ModifyTime in Read file:" + b.a(this.gSC));
          b.a(this.gSC, 10000 + k.nJ());
          b.b(this.gSC).a(3, -1, "doScene failed", this.gSC);
          return false;
        }
        if (l - b.c(this.gSC) < 2000L)
        {
          com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "TimerExpired :" + b.a(this.gSC) + " but last send time:" + (l - b.c(this.gSC)));
          return true;
        }
        e locale = o.th(b.a(this.gSC)).lo(localn.field_offset);
        com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "pusher doscene:" + b.a(this.gSC) + " readByte:" + locale.ddA + " stat:" + localn.field_status);
        if (locale.ddA < 2000)
          return true;
      }
    }
    while (this.gSC.a(b.d(this.gSC), b.b(this.gSC)) != -1);
    b.a(this.gSC, 10000 + k.nJ());
    b.b(this.gSC).a(3, -1, "doScene failed", this.gSC);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.c
 * JD-Core Version:    0.6.2
 */