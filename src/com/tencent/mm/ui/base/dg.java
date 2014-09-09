package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.z;

final class dg extends dn
  implements Runnable
{
  private dg(MMSlideDelView paramMMSlideDelView)
  {
    super(paramMMSlideDelView, (byte)0);
  }

  public final void run()
  {
    if ((aAv()) && (!MMSlideDelView.e(this.jbZ)))
    {
      z.i("!32@/B4Tb64lLpKjyuEDzIt3EXrdyszrp4wg", "is long press");
      if (this.jbZ.getParent() != null)
      {
        MMSlideDelView.f(this.jbZ);
        this.jbZ.performLongClick();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.dg
 * JD-Core Version:    0.6.2
 */