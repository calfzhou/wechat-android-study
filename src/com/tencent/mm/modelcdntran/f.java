package com.tencent.mm.modelcdntran;

import java.util.Map;
import java.util.Queue;

final class f
  implements Runnable
{
  f(c paramc, int paramInt, n paramn)
  {
  }

  public final void run()
  {
    if (this.dSf != -1)
      c.a(this.drU).put(this.drV.field_mediaId, Integer.valueOf(this.dSf));
    c.b(this.drU).add(this.drV.field_mediaId);
    c.c(this.drU).put(this.drV.field_mediaId, this.drV);
    this.drU.vg();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.f
 * JD-Core Version:    0.6.2
 */