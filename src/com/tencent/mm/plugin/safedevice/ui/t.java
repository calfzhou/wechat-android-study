package com.tencent.mm.plugin.safedevice.ui;

import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.safedevice.a.c;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.y;

final class t
  implements y
{
  t(SafeDeviceListPreference paramSafeDeviceListPreference)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    SafeDeviceListPreference.a(this.fUn);
    com.tencent.mm.plugin.safedevice.a.a locala = new com.tencent.mm.plugin.safedevice.a.a(this.fUn.afo().field_uid);
    bg.qX().d(locala);
    SafeDeviceListPreference.a(this.fUn, e.a(SafeDeviceListPreference.b(this.fUn), com.tencent.mm.aq.a.p(SafeDeviceListPreference.b(this.fUn), n.buA), true, new u(this, locala)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.t
 * JD-Core Version:    0.6.2
 */