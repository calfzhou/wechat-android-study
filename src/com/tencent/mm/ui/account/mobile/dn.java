package com.tencent.mm.ui.account.mobile;

import android.widget.TextView;
import java.util.TimerTask;

final class dn extends TimerTask
{
  dn(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final void run()
  {
    this.iVq.iVb.post(new do(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.dn
 * JD-Core Version:    0.6.2
 */