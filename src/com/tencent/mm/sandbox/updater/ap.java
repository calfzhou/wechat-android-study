package com.tencent.mm.sandbox.updater;

import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class ap
  implements DialogInterface.OnCancelListener
{
  ap(Context paramContext, Updater paramUpdater, DialogInterface.OnCancelListener paramOnCancelListener)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    ((NotificationManager)this.dLL.getSystemService("notification")).cancel(99);
    Updater.oo(2);
    this.iCs.cancel();
    if ((!Updater.a(this.iCs)) && (this.iCt != null))
      this.iCt.onCancel(paramDialogInterface);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.ap
 * JD-Core Version:    0.6.2
 */