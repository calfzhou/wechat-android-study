package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;

final class l
  implements DialogInterface.OnClickListener
{
  l(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "update dialog had been canceled");
    if ((AppUpdaterUI.b(this.iBB) != null) && (AppUpdaterUI.b(this.iBB).isShowing()))
      AppUpdaterUI.b(this.iBB).dismiss();
    AppUpdaterUI.a(this.iBB, 6);
    AppUpdaterUI.e(this.iBB).cancel();
    AppUpdaterUI.e(this.iBB).s(2, true);
    AppUpdaterUI.f(this.iBB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.l
 * JD-Core Version:    0.6.2
 */