package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.ui.base.aa;

final class e
  implements DialogInterface.OnClickListener
{
  e(AppInstallerUI paramAppInstallerUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((AppInstallerUI.e(this.iBu) != null) && (!AppInstallerUI.e(this.iBu).isShowing()))
      AppInstallerUI.e(this.iBu).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.e
 * JD-Core Version:    0.6.2
 */