package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.sdk.platformtools.z;

final class ay
{
  private long eKb = 0L;

  public final long Pz()
  {
    if (9223372036854775807L == this.eKb)
    {
      z.w("!24@/B4Tb64lLpJfNpkGRDdy3Q==", "TaskId Data-overrun!!!");
      this.eKb = 0L;
    }
    long l = this.eKb;
    this.eKb = (1L + l);
    return l;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.ay
 * JD-Core Version:    0.6.2
 */