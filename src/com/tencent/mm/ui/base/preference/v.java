package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class v
  implements j
{
  v(u paramu, DialogPreference paramDialogPreference, Preference paramPreference)
  {
  }

  public final void aTE()
  {
    MMPreference.c(this.jhk.jhh);
    if (this.jhi.isPersistent())
      MMPreference.b(this.jhk.jhh).edit().putString(this.jhj.getKey(), this.jhi.getValue()).commit();
    MMPreference.d(this.jhk.jhh).notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.v
 * JD-Core Version:    0.6.2
 */