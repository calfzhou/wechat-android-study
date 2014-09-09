package com.tencent.mm.ui.tools;

final class ai
  implements Runnable
{
  ai(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void run()
  {
    CropImageNewUI.a(this.jPx, CropImageNewUI.e(this.jPx).baa(), CropImageNewUI.e(this.jPx).bab());
    this.jPx.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ai
 * JD-Core Version:    0.6.2
 */