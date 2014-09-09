package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class av
  implements DialogInterface.OnCancelListener
{
  av(au paramau)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    SettingsAboutSystemUI.a(this.jMl.jMk, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.av
 * JD-Core Version:    0.6.2
 */