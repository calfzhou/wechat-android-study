package com.tencent.mm.ui.tools;

final class ft
  implements Runnable
{
  ft(fj paramfj)
  {
  }

  public final void run()
  {
    if (fj.f(this.jUD) == null)
      com.tencent.mm.sdk.platformtools.z.w(fj.c(this.jUD), "post do expand search menu, but search menu item is null");
    do
    {
      return;
      if (fj.e(this.jUD))
      {
        android.support.v4.view.z.d(fj.f(this.jUD));
        return;
      }
    }
    while (fj.g(this.jUD) == null);
    fj.g(this.jUD).baO();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ft
 * JD-Core Version:    0.6.2
 */