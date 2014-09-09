package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class b
  implements DialogInterface.OnClickListener
{
  b(AppInstallerUI paramAppInstallerUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpK4dsObr+ZXlbJd1YO/EjJD", "getBtn (ok button) is click");
    if (AppInstallerUI.b(this.iBu) == 2)
      an.u(this.iBu, 3);
    String str = g.AB(AppInstallerUI.c(this.iBu));
    z.d("!32@/B4Tb64lLpK4dsObr+ZXlbJd1YO/EjJD", str);
    if (str != null)
    {
      au.iCK.s(1, true);
      AppInstallerUI.a(this.iBu, str);
      return;
    }
    z.e("!32@/B4Tb64lLpK4dsObr+ZXlbJd1YO/EjJD", "pack not found!");
    e.aw(this.iBu, this.iBu.getString(n.cmQ));
    an.aMQ();
    this.iBu.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.b
 * JD-Core Version:    0.6.2
 */