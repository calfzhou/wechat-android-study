package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;

final class cp
  implements az
{
  cp(MMProgressBar paramMMProgressBar)
  {
  }

  public final boolean kJ()
  {
    int i = MMProgressBar.a(this.jaQ) - MMProgressBar.b(this.jaQ);
    int j;
    MMProgressBar localMMProgressBar;
    if (i > 0)
    {
      j = (int)(0.6D * i);
      localMMProgressBar = this.jaQ;
      if (j <= 0)
        break label90;
    }
    while (true)
    {
      MMProgressBar.a(localMMProgressBar, j);
      MMProgressBar.b(this.jaQ, MMProgressBar.b(this.jaQ));
      MMProgressBar.d(this.jaQ).cP(40 * (MMProgressBar.c(this.jaQ) - i) / MMProgressBar.c(this.jaQ));
      return false;
      label90: j = 1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cp
 * JD-Core Version:    0.6.2
 */