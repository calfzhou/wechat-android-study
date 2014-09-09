package com.tencent.mm.ui.account;

import android.os.Message;
import android.widget.ProgressBar;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.aa;

final class fm extends cm
{
  fm(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if (((RegByMobileRegAIOUI.r(this.iQP) != null) && (!RegByMobileRegAIOUI.r(this.iQP).isShowing())) || (RegByMobileRegAIOUI.s(this.iQP)));
    do
    {
      return;
      RegByMobileRegAIOUI.t(this.iQP);
      RegByMobileRegAIOUI.v(this.iQP).setProgress(RegByMobileRegAIOUI.u(this.iQP));
      if (RegByMobileRegAIOUI.u(this.iQP) < RegByMobileRegAIOUI.v(this.iQP).getMax())
      {
        sendEmptyMessageDelayed(0, 10L);
        return;
      }
      RegByMobileRegAIOUI.v(this.iQP).setIndeterminate(true);
    }
    while (RegByMobileRegAIOUI.s(this.iQP));
    if (RegByMobileRegAIOUI.r(this.iQP) != null)
      RegByMobileRegAIOUI.r(this.iQP).dismiss();
    RegByMobileRegAIOUI.w(this.iQP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fm
 * JD-Core Version:    0.6.2
 */