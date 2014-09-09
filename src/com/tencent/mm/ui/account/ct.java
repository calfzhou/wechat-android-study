package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class ct
  implements DialogInterface.OnDismissListener
{
  ct(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    LoginIndepPass.g(this.iPD);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ct
 * JD-Core Version:    0.6.2
 */