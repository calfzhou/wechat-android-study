package com.tencent.mm.ui.account;

import android.os.CountDownTimer;
import android.widget.ListView;
import android.widget.ProgressBar;

final class hb extends CountDownTimer
{
  hb(RegByMobileWaitingSMSUI paramRegByMobileWaitingSMSUI, long paramLong)
  {
    super(paramLong, 1000L);
  }

  public final void onFinish()
  {
    RegByMobileWaitingSMSUI.b(this.iRx);
  }

  public final void onTick(long paramLong)
  {
    int i = (int)(RegByMobileWaitingSMSUI.c(this.iRx) - paramLong / 1000L);
    RegByMobileWaitingSMSUI.d(this.iRx).setProgress(i);
    if ((i % 2 == 0) && (RegByMobileWaitingSMSUI.e(this.iRx) != null))
    {
      RegByMobileWaitingSMSUI.e(this.iRx).vd(this.iRx.iRt[(i / 2 % this.iRx.iRt.length)]);
      RegByMobileWaitingSMSUI.f(this.iRx).post(new hc(this));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hb
 * JD-Core Version:    0.6.2
 */