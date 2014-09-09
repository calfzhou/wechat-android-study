package com.tencent.mm.ui.tools;

final class ev
  implements Runnable
{
  ev(MaskImageButton paramMaskImageButton)
  {
  }

  public final void run()
  {
    this.jUd.setPressed(false);
    this.jUd.invalidate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ev
 * JD-Core Version:    0.6.2
 */