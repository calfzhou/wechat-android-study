package com.tencent.mm.ui.account.bind;

import java.util.TimerTask;

final class q extends TimerTask
{
  q(BindMobileVerifyUI paramBindMobileVerifyUI)
  {
  }

  public final void run()
  {
    if (BindMobileVerifyUI.c(this.iTY) != null)
      BindMobileVerifyUI.d(this.iTY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.q
 * JD-Core Version:    0.6.2
 */