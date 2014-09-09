package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.cd;

final class cj
  implements cd
{
  cj(ch paramch)
  {
  }

  public final void rv()
  {
    if (SettingsChattingUI.b(this.jNj.jNi) != null)
    {
      SettingsChattingUI.b(this.jNj.jNi).dismiss();
      SettingsChattingUI.a(this.jNj.jNi, null);
    }
  }

  public final boolean rw()
  {
    return SettingsChattingUI.a(this.jNj.jNi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.cj
 * JD-Core Version:    0.6.2
 */