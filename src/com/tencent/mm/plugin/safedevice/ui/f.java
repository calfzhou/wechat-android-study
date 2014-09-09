package com.tencent.mm.plugin.safedevice.ui;

import android.widget.EditText;
import com.tencent.mm.ui.widget.c;

final class f
  implements c
{
  f(ModSafeDeviceNameUI paramModSafeDeviceNameUI)
  {
  }

  public final void afm()
  {
    if (ModSafeDeviceNameUI.a(this.fTV).getText().toString().trim().length() > 0)
    {
      this.fTV.eB(true);
      return;
    }
    this.fTV.eB(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.f
 * JD-Core Version:    0.6.2
 */