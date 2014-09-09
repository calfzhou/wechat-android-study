package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class i
  implements DialogInterface.OnCancelListener
{
  i(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppUpdaterUI.i(this.iBB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.i
 * JD-Core Version:    0.6.2
 */