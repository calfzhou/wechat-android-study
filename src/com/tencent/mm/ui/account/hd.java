package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class hd
  implements DialogInterface.OnClickListener
{
  hd(RegByMobileWaitingSMSUI paramRegByMobileWaitingSMSUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    RegByMobileWaitingSMSUI.g(this.iRx);
    this.iRx.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hd
 * JD-Core Version:    0.6.2
 */