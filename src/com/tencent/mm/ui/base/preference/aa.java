package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class aa
  implements ai
{
  aa(z paramz)
  {
  }

  public final boolean a(Preference paramPreference, Object paramObject)
  {
    if ((!z.a(this.jhw)) && (paramPreference.isEnabled()) && (paramPreference.isSelectable()))
    {
      z.a(this.jhw, true);
      if (!(paramPreference instanceof CheckBoxPreference))
        break label168;
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)paramPreference;
      localCheckBoxPreference.setChecked(localCheckBoxPreference.isChecked());
      if (localCheckBoxPreference.isPersistent())
        z.b(this.jhw).edit().putBoolean(paramPreference.getKey(), localCheckBoxPreference.isChecked()).commit();
      z.c(this.jhw);
    }
    label168: for (int i = 1; ; i = 0)
    {
      if (paramPreference.getKey() != null)
      {
        z localz = this.jhw;
        z.d(this.jhw);
        localz.e(paramPreference);
      }
      if (i != 0)
        z.d(this.jhw).notifyDataSetChanged();
      z.a(this.jhw, false);
      return i != 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.aa
 * JD-Core Version:    0.6.2
 */