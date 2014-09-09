package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.sdk.platformtools.z;

final class v
  implements DialogInterface.OnCancelListener
{
  v(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "click cancel button");
    AppUpdaterUI.a(this.iBB, 12);
    AppUpdaterUI.i(this.iBB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.v
 * JD-Core Version:    0.6.2
 */