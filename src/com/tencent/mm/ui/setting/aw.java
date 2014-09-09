package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.cd;

final class aw
  implements cd
{
  aw(au paramau)
  {
  }

  public final void rv()
  {
    if (SettingsAboutSystemUI.b(this.jMl.jMk) != null)
    {
      SettingsAboutSystemUI.b(this.jMl.jMk).dismiss();
      SettingsAboutSystemUI.a(this.jMl.jMk, null);
    }
  }

  public final boolean rw()
  {
    return SettingsAboutSystemUI.a(this.jMl.jMk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.aw
 * JD-Core Version:    0.6.2
 */