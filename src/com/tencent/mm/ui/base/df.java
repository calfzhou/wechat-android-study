package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.z;

final class df
  implements Runnable
{
  df(MMSlideDelView paramMMSlideDelView)
  {
  }

  public final void run()
  {
    this.jbZ.setPressed(false);
    z.v("!32@/B4Tb64lLpKjyuEDzIt3EXrdyszrp4wg", "onClick");
    MMSlideDelView.b(this.jbZ).j(this.jbZ, MMSlideDelView.a(this.jbZ));
    this.jbZ.aSz();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.df
 * JD-Core Version:    0.6.2
 */