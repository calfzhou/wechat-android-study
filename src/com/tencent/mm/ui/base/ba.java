package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class ba
  implements View.OnFocusChangeListener
{
  ba(MMFormMobileInputView paramMMFormMobileInputView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if ((paramView == MMFormMobileInputView.a(this.iZc)) || (paramView == MMFormMobileInputView.b(this.iZc)))
      this.iZc.eO(paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ba
 * JD-Core Version:    0.6.2
 */