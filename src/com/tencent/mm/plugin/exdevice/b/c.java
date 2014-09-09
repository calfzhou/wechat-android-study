package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.sdk.platformtools.az;

final class c
  implements az
{
  private long dpg = 10L;

  c(b paramb)
  {
  }

  public final boolean kJ()
  {
    if (b.a(this.eIG) == null)
    {
      long l = this.dpg;
      this.dpg = (l - 1L);
      if (l > 0L)
        return true;
    }
    b.b(this.eIG);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.c
 * JD-Core Version:    0.6.2
 */