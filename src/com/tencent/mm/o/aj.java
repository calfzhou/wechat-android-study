package com.tencent.mm.o;

import com.tencent.mm.sdk.platformtools.az;

final class aj
  implements az
{
  private long dpg = 10L;

  aj(ac paramac)
  {
  }

  public final boolean kJ()
  {
    if (ac.f(this.doZ) == null)
    {
      long l = this.dpg;
      this.dpg = (l - 1L);
      if (l > 0L)
        return true;
    }
    ac.j(this.doZ);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.aj
 * JD-Core Version:    0.6.2
 */