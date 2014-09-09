package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class w
  implements n
{
  w(u paramu, EditPreference paramEditPreference, Preference paramPreference)
  {
  }

  public final void aTE()
  {
    MMPreference.c(this.jhk.jhh);
    if (this.jhl.isPersistent())
      MMPreference.b(this.jhk.jhh).edit().putString(this.jhj.getKey(), this.jhl.getValue()).commit();
    MMPreference.d(this.jhk.jhh).notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.w
 * JD-Core Version:    0.6.2
 */