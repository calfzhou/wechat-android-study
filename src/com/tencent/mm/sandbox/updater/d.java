package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;

final class d
  implements DialogInterface.OnClickListener
{
  d(AppInstallerUI paramAppInstallerUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpK4dsObr+ZXlbJd1YO/EjJD", "install dialog had been canceled");
    if ((AppInstallerUI.e(this.iBu) != null) && (AppInstallerUI.e(this.iBu).isShowing()))
      AppInstallerUI.e(this.iBu).dismiss();
    au.iCK.s(2, true);
    if (AppInstallerUI.b(this.iBu) == 2)
      an.u(this.iBu, 4);
    an.aMK();
    AppInstallerUI.d(this.iBu);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.d
 * JD-Core Version:    0.6.2
 */