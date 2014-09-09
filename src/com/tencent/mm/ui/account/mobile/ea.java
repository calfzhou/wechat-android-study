package com.tencent.mm.ui.account.mobile;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class ea
  implements View.OnKeyListener
{
  ea(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      MobileVerifyUI.e(this.iVq);
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ea
 * JD-Core Version:    0.6.2
 */