package com.tencent.mm.plugin.safedevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class o
  implements DialogInterface.OnClickListener
{
  o(MySafeDeviceListUI paramMySafeDeviceListUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    MySafeDeviceListUI.b(this.fUe, MySafeDeviceListUI.c(this.fUe));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.o
 * JD-Core Version:    0.6.2
 */