package com.tencent.mm.ui.account.mobile;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class as
  implements View.OnKeyListener
{
  as(MobileInputUI paramMobileInputUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
      return MobileInputUI.c(this.iUs);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.as
 * JD-Core Version:    0.6.2
 */