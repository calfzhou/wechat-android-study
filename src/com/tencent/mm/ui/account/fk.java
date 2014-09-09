package com.tencent.mm.ui.account;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class fk
  implements View.OnFocusChangeListener
{
  fk(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
      RegByMobileRegAIOUI.a(this.iQP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fk
 * JD-Core Version:    0.6.2
 */