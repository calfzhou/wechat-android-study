package com.tencent.mm.ui.account.mobile;

import android.database.ContentObserver;
import com.tencent.mm.sdk.platformtools.cm;

public final class ee extends ContentObserver
{
  public ee(MobileVerifyUI paramMobileVerifyUI)
  {
    super(cm.fetchFreeHandler());
  }

  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    if ((MobileVerifyUI.f(this.iVq) != 3) && (MobileVerifyUI.f(this.iVq) != 1))
      MobileVerifyUI.j(this.iVq);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ee
 * JD-Core Version:    0.6.2
 */