package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class cf
  implements DialogInterface.OnDismissListener
{
  cf(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    LoginHistoryUI.k(this.iPx);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cf
 * JD-Core Version:    0.6.2
 */