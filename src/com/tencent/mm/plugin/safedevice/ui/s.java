package com.tencent.mm.plugin.safedevice.ui;

import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.o;

final class s
  implements w, x
{
  private s(MySafeDeviceListUI paramMySafeDeviceListUI)
  {
  }

  public final void pW(String paramString)
  {
    MySafeDeviceListUI.b(this.fUe).BV(paramString);
    MySafeDeviceListUI.f(this.fUe).sendEmptyMessage(0);
    this.fUe.a(0, this.fUe.getString(n.cbK), MySafeDeviceListUI.h(this.fUe));
    MySafeDeviceListUI.a(this.fUe, 0xFFFFFFFF ^ MySafeDeviceListUI.d(this.fUe));
    MySafeDeviceListUI.b(this.fUe, MySafeDeviceListUI.c(this.fUe));
  }

  public final void pX(String paramString)
  {
    z.e("!44@/B4Tb64lLpK17Cy+IK1HH08djXQCkIZFwr3WucVnP+g=", "delete safedevice failed" + paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.s
 * JD-Core Version:    0.6.2
 */