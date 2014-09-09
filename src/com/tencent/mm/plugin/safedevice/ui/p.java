package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import com.tencent.mm.aq.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.safedevice.a.b;
import com.tencent.mm.plugin.safedevice.a.c;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.x;

final class p
  implements x
{
  p(MySafeDeviceListUI paramMySafeDeviceListUI, c paramc)
  {
  }

  public final boolean o(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    for (String str = ""; str.equals(this.fUh.field_name); str = paramCharSequence.toString().trim())
      return true;
    if (str.length() <= 0)
    {
      e.aw(this.fUe.aPI(), this.fUe.getString(n.cbL));
      return false;
    }
    b localb = new b(this.fUh.field_uid, str, this.fUh.field_devicetype);
    bg.qX().d(localb);
    if (MySafeDeviceListUI.g(this.fUe) != null)
      MySafeDeviceListUI.g(this.fUe).dismiss();
    MySafeDeviceListUI.a(this.fUe, e.a(this.fUe, a.p(this.fUe, n.buA), true, new q(this, localb)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.p
 * JD-Core Version:    0.6.2
 */