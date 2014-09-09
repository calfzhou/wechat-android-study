package com.tencent.mm.ui.setting;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;

final class bu
  implements TimePickerDialog.OnTimeSetListener
{
  bu(SettingsActiveTimeUI paramSettingsActiveTimeUI)
  {
  }

  public final void onTimeSet(TimePicker paramTimePicker, int paramInt1, int paramInt2)
  {
    if (SettingsActiveTimeUI.a(this.jMU))
    {
      SettingsActiveTimeUI.a(this.jMU, paramInt1);
      SettingsActiveTimeUI.b(this.jMU, paramInt2);
      SettingsActiveTimeUI.b(this.jMU);
    }
    while (true)
    {
      this.jMU.DP();
      return;
      SettingsActiveTimeUI.c(this.jMU, paramInt1);
      SettingsActiveTimeUI.d(this.jMU, paramInt2);
      SettingsActiveTimeUI.c(this.jMU);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bu
 * JD-Core Version:    0.6.2
 */