package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class bt
  implements DialogInterface.OnDismissListener
{
  bt(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    MobileLoginOrForceReg.n(this.iUG);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.bt
 * JD-Core Version:    0.6.2
 */