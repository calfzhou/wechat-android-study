package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.z;

final class u
  implements DialogInterface.OnClickListener
{
  u(AppUpdaterUI paramAppUpdaterUI, g paramg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "click download button");
    AppUpdaterUI.a(this.iBB, 11);
    if (this.iBE != null)
      this.iBE.aMv();
    ar localar = AppUpdaterUI.e(this.iBB);
    localar.iCE = true;
    localar.Oj();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.u
 * JD-Core Version:    0.6.2
 */