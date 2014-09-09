package com.tencent.mm.plugin.safedevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.aq.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.safedevice.a.b;
import com.tencent.mm.sdk.platformtools.ch;

final class d
  implements MenuItem.OnMenuItemClickListener
{
  d(ModSafeDeviceNameUI paramModSafeDeviceNameUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ModSafeDeviceNameUI.a(this.fTV, ModSafeDeviceNameUI.a(this.fTV).getText().toString());
    if (ch.jb(ModSafeDeviceNameUI.b(this.fTV)))
      return true;
    this.fTV.XF();
    b localb = new b(ModSafeDeviceNameUI.c(this.fTV), ModSafeDeviceNameUI.b(this.fTV), ModSafeDeviceNameUI.d(this.fTV));
    bg.qX().d(localb);
    ModSafeDeviceNameUI.a(this.fTV, com.tencent.mm.ui.base.e.a(this.fTV, a.p(this.fTV, n.buA), true, new e(this, localb)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.d
 * JD-Core Version:    0.6.2
 */