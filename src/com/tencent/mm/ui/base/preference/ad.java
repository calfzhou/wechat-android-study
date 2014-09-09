package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class ad
  implements n
{
  ad(ab paramab, EditPreference paramEditPreference, Preference paramPreference)
  {
  }

  public final void aTE()
  {
    z.c(this.jhx.jhw);
    if (this.jhl.isPersistent())
      z.b(this.jhx.jhw).edit().putString(this.jhj.getKey(), this.jhl.getValue()).commit();
    z.d(this.jhx.jhw).notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.ad
 * JD-Core Version:    0.6.2
 */