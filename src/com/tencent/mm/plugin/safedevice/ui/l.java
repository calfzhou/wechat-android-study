package com.tencent.mm.plugin.safedevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class l
  implements DialogInterface.OnClickListener
{
  l(MySafeDeviceListUI paramMySafeDeviceListUI, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    MySafeDeviceListUI.a(this.fUe, this.fUg);
    MySafeDeviceListUI.b(this.fUe, MySafeDeviceListUI.c(this.fUe));
    MySafeDeviceListUI.afn();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.l
 * JD-Core Version:    0.6.2
 */