package com.tencent.mm.ui.tools;

import com.tencent.mm.sdk.platformtools.z;

final class fk
  implements i
{
  fk(fj paramfj)
  {
  }

  public final void aZE()
  {
    if (!fj.b(this.jUD))
    {
      z.v(fj.c(this.jUD), "onVoiceSearchRequired, but not in searching");
      return;
    }
    this.jUD.aFi();
  }

  public final void vt(String paramString)
  {
    if (!fj.b(this.jUD))
      z.v(fj.c(this.jUD), "onSearchTextChange %s, but not in searching", new Object[] { paramString });
    while (fj.d(this.jUD) == null)
      return;
    fj.d(this.jUD).jH(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fk
 * JD-Core Version:    0.6.2
 */