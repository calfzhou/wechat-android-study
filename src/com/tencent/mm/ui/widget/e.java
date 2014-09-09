package com.tencent.mm.ui.widget;

import com.tencent.mm.sdk.platformtools.z;

final class e
  implements Runnable
{
  e(MMPinProgressBtn paramMMPinProgressBtn)
  {
  }

  public final void run()
  {
    if (this.kaW.getVisibility() != 0)
    {
      z.i("!44@/B4Tb64lLpKIBJ9Tuq9FD5Dg5gDMesCqWRQeWfcTBvw=", "cur progress bar not visiable, stop auto pregress");
      return;
    }
    MMPinProgressBtn.a(this.kaW);
    if (MMPinProgressBtn.b(this.kaW) >= MMPinProgressBtn.c(this.kaW))
    {
      MMPinProgressBtn.d(this.kaW);
      z.i("!44@/B4Tb64lLpKIBJ9Tuq9FD5Dg5gDMesCqWRQeWfcTBvw=", "match auto progress max, return");
      return;
    }
    this.kaW.invalidate();
    this.kaW.postDelayed(MMPinProgressBtn.e(this.kaW), 200L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.e
 * JD-Core Version:    0.6.2
 */