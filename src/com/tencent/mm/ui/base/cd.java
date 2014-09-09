package com.tencent.mm.ui.base;

final class cd
  implements Runnable
{
  private cd(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void run()
  {
    if ((MMListPopupWindow.a(this.jay) != null) && (MMListPopupWindow.a(this.jay).getCount() > MMListPopupWindow.a(this.jay).getChildCount()) && (MMListPopupWindow.a(this.jay).getChildCount() <= this.jay.pd))
    {
      MMListPopupWindow.b(this.jay).setInputMethodMode(2);
      this.jay.show();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cd
 * JD-Core Version:    0.6.2
 */