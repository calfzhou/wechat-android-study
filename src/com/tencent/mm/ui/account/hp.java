package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class hp
  implements DialogInterface.OnDismissListener
{
  hp(RegByQQUI paramRegByQQUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    RegByQQUI.g(this.iRG);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hp
 * JD-Core Version:    0.6.2
 */