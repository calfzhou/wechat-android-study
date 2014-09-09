package com.tencent.mm.ui.base;

final class cy
  implements dc
{
  cy(MMRadioGroupView paramMMRadioGroupView)
  {
  }

  public final void a(MMRadioImageButton paramMMRadioImageButton)
  {
    if (MMRadioGroupView.a(this.jbF) != -1)
      MMRadioGroupView.c(this.jbF, MMRadioGroupView.a(this.jbF));
    int i = paramMMRadioImageButton.getId();
    MMRadioGroupView.a(this.jbF, paramMMRadioImageButton);
    MMRadioGroupView.d(this.jbF, i);
  }

  public final void b(MMRadioImageButton paramMMRadioImageButton)
  {
    MMRadioGroupView.e(this.jbF, paramMMRadioImageButton.getId());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cy
 * JD-Core Version:    0.6.2
 */