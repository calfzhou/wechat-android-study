package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class dn
  implements DialogInterface.OnCancelListener
{
  dn(LoginUI paramLoginUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    LoginUI.g(this.iPW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.dn
 * JD-Core Version:    0.6.2
 */