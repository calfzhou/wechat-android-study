package com.tencent.mm.ui.setting;

import com.tencent.mm.c.a.lp;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;

final class ej
  implements Runnable
{
  ej(SettingsPersonalInfoUI paramSettingsPersonalInfoUI)
  {
  }

  public final void run()
  {
    lp locallp = new lp();
    locallp.cOL.cON = true;
    a.aGB().g(locallp);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ej
 * JD-Core Version:    0.6.2
 */