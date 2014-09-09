package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class dl
  implements DialogInterface.OnDismissListener
{
  dl(LoginUI paramLoginUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    LoginUI.f(this.iPW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.dl
 * JD-Core Version:    0.6.2
 */