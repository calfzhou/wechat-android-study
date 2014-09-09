package com.tencent.mm.plugin.safedevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.Iterator;
import java.util.List;

final class m
  implements DialogInterface.OnClickListener
{
  m(MySafeDeviceListUI paramMySafeDeviceListUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    MySafeDeviceListUI.b(this.fUe, MySafeDeviceListUI.c(this.fUe));
    if (MySafeDeviceListUI.d(this.fUe) == 1)
    {
      Iterator localIterator = MySafeDeviceListUI.e(this.fUe).iterator();
      while (localIterator.hasNext())
        ((SafeDeviceListPreference)localIterator.next()).jx(MySafeDeviceListUI.d(this.fUe));
      MySafeDeviceListUI.f(this.fUe).sendEmptyMessage(0);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.m
 * JD-Core Version:    0.6.2
 */