package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class ac
  implements j
{
  ac(ab paramab, DialogPreference paramDialogPreference, Preference paramPreference)
  {
  }

  public final void aTE()
  {
    z.c(this.jhx.jhw);
    if (this.jhi.isPersistent())
      z.b(this.jhx.jhw).edit().putString(this.jhj.getKey(), this.jhi.getValue()).commit();
    z.d(this.jhx.jhw).notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.ac
 * JD-Core Version:    0.6.2
 */