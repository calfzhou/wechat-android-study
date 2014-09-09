package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.o;

final class bb
  implements DialogInterface.OnClickListener
{
  bb(SettingsAboutSystemUI paramSettingsAboutSystemUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jMk.aTM().edit().putBoolean("settings_voicerecorder_mode", true).commit();
    ((CheckBoxPreference)SettingsAboutSystemUI.d(this.jMk).BU("settings_voicerecorder_mode")).setChecked(true);
    SettingsAboutSystemUI.d(this.jMk).notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bb
 * JD-Core Version:    0.6.2
 */