package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class ke
  implements DialogInterface.OnDismissListener
{
  ke(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    SimpleLoginUI.f(this.iSL);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ke
 * JD-Core Version:    0.6.2
 */