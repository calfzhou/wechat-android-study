package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aw;

final class f
  implements aw
{
  f(AppPanel paramAppPanel)
  {
  }

  public final void al(int paramInt1, int paramInt2)
  {
    z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "onMeasure width:" + paramInt1 + " height:" + paramInt2 + " isMeasured:" + AppPanel.a(this.hCI));
    if ((AppPanel.a(this.hCI)) || (paramInt2 == 0) || (paramInt1 == 0))
    {
      if ((paramInt2 == 0) || (paramInt1 == 0))
        z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "onMeasure, width or height is 0");
      return;
    }
    if (AppPanel.b(this.hCI) == 2)
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "landspace");
    while (true)
    {
      AppPanel.c(this.hCI);
      AppPanel.a(this.hCI, paramInt2);
      AppPanel.b(this.hCI, paramInt1);
      AppPanel.d(this.hCI);
      return;
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "portrait");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.f
 * JD-Core Version:    0.6.2
 */