package com.tencent.mm.ui.base;

final class ek
  implements Runnable
{
  public MMTagPanel jcQ;

  public final void run()
  {
    if (this.jcQ != null)
      this.jcQ.Si();
    this.jcQ = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ek
 * JD-Core Version:    0.6.2
 */