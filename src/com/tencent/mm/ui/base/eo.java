package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.az;

final class eo
  implements az
{
  eo(en paramen)
  {
  }

  public final boolean kJ()
  {
    if (en.a(this.jcX) == -1L)
    {
      this.jcX.show();
      return true;
    }
    en.b(this.jcX);
    if (en.c(this.jcX) >= 0)
    {
      this.jcX.show();
      return true;
    }
    this.jcX.cancel();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.eo
 * JD-Core Version:    0.6.2
 */