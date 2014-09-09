package com.tencent.mm.ui.base;

final class ej
  implements Runnable
{
  ej(MMTagPanelScrollView paramMMTagPanelScrollView)
  {
  }

  public final void run()
  {
    this.jcP.scrollTo(0, this.jcP.getBottom());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ej
 * JD-Core Version:    0.6.2
 */