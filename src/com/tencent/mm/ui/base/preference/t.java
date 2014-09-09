package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class t
  implements ai
{
  t(MMPreference paramMMPreference)
  {
  }

  public final boolean a(Preference paramPreference, Object paramObject)
  {
    if ((!MMPreference.a(this.jhh)) && (paramPreference.isEnabled()) && (paramPreference.isSelectable()))
    {
      MMPreference.a(this.jhh, true);
      if (!(paramPreference instanceof CheckBoxPreference))
        break label163;
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)paramPreference;
      localCheckBoxPreference.setChecked(localCheckBoxPreference.isChecked());
      if (localCheckBoxPreference.isPersistent())
        MMPreference.b(this.jhh).edit().putBoolean(paramPreference.getKey(), localCheckBoxPreference.isChecked()).commit();
      MMPreference.c(this.jhh);
    }
    label163: for (int i = 1; ; i = 0)
    {
      if (paramPreference.getKey() != null)
        this.jhh.a(MMPreference.d(this.jhh), paramPreference);
      if (i != 0)
        MMPreference.d(this.jhh).notifyDataSetChanged();
      MMPreference.a(this.jhh, false);
      return i != 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.t
 * JD-Core Version:    0.6.2
 */