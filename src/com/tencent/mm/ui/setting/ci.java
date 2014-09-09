package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class ci
  implements DialogInterface.OnCancelListener
{
  ci(ch paramch)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    SettingsChattingUI.a(this.jNj.jNi, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ci
 * JD-Core Version:    0.6.2
 */