package com.tencent.mm.ui.tools;

final class dd
  implements Runnable
{
  dd(ImageGalleryUI paramImageGalleryUI, int paramInt)
  {
  }

  public final void run()
  {
    if (ImageGalleryUI.e(this.jSA) == null)
      return;
    bt localbt = ImageGalleryUI.e(this.jSA);
    int i = this.dtH;
    localbt.jQQ.pause(i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dd
 * JD-Core Version:    0.6.2
 */