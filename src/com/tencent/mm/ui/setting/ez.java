package com.tencent.mm.ui.setting;

import android.view.View;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.az;

final class ez
  implements az
{
  ez(SettingsSelectBgUI paramSettingsSelectBgUI)
  {
  }

  public final boolean kJ()
  {
    if (this.jOg.findViewById(i.aPp).getWidth() <= 0)
      return true;
    SettingsSelectBgUI.a(this.jOg);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ez
 * JD-Core Version:    0.6.2
 */