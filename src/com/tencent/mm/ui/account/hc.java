package com.tencent.mm.ui.account;

import android.os.Build.VERSION;
import android.widget.ListView;

final class hc
  implements Runnable
{
  hc(hb paramhb)
  {
  }

  public final void run()
  {
    if (Build.VERSION.SDK_INT >= 8)
    {
      RegByMobileWaitingSMSUI.f(this.iRy.iRx).smoothScrollToPosition(-1 + RegByMobileWaitingSMSUI.e(this.iRy.iRx).getCount());
      return;
    }
    RegByMobileWaitingSMSUI.f(this.iRy.iRx).setSelection(-1 + RegByMobileWaitingSMSUI.e(this.iRy.iRx).getCount());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hc
 * JD-Core Version:    0.6.2
 */