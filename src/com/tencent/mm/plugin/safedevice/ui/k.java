package com.tencent.mm.plugin.safedevice.ui;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.preference.o;

final class k extends cm
{
  k(MySafeDeviceListUI paramMySafeDeviceListUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    MySafeDeviceListUI.b(this.fUe).notifyDataSetChanged();
    super.handleMessage(paramMessage);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.k
 * JD-Core Version:    0.6.2
 */