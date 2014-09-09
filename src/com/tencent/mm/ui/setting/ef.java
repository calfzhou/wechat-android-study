package com.tencent.mm.ui.setting;

import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.ai;

final class ef
  implements ai
{
  ef(SettingsPersonalInfoUI paramSettingsPersonalInfoUI)
  {
  }

  public final boolean a(Preference paramPreference, Object paramObject)
  {
    String str = (String)paramObject;
    if ("male".equalsIgnoreCase(str))
      SettingsPersonalInfoUI.a(this.jNM, 1);
    while (true)
    {
      return false;
      if ("female".equalsIgnoreCase(str))
        SettingsPersonalInfoUI.a(this.jNM, 2);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ef
 * JD-Core Version:    0.6.2
 */