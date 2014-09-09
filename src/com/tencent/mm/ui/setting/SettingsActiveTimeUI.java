package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.mm.pluginsdk.e.m;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import java.sql.Time;
import java.text.DateFormat;

public class SettingsActiveTimeUI extends MMPreference
{
  private o dXi;
  private boolean gqY = false;
  private int jMM;
  private int jMN;
  private int jMO;
  private int jMP;
  private boolean jMQ = false;
  private Preference jMR;
  private Preference jMS;
  private final TimePickerDialog.OnTimeSetListener jMT = new bu(this);

  private static String d(Context paramContext, int paramInt1, int paramInt2)
  {
    if (paramInt1 > 12);
    for (int i = paramInt1 - 12; ; i = paramInt1)
    {
      String str1 = y.e(paramContext.getSharedPreferences(ak.aHi(), 0));
      String str2 = y.aGW();
      if ((str1.equalsIgnoreCase("zh_CN")) || ((str1.equalsIgnoreCase("language_default")) && ("zh_CN".equalsIgnoreCase(str2))))
        break;
      return DateFormat.getTimeInstance(3, y.xa(str1)).format(new Time(i, paramInt2, 0));
    }
    StringBuilder localStringBuilder = new StringBuilder().append(m.h(paramContext, 3600000L * paramInt1 + 60000L * paramInt2));
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    return String.format("%02d:%02d", arrayOfObject);
  }

  protected final void DP()
  {
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(q.czV);
    SharedPreferences localSharedPreferences1 = aTM();
    this.jMS = this.dXi.BU("settings_active_begin_time");
    this.jMM = localSharedPreferences1.getInt("settings_active_end_time_hour", 23);
    this.jMN = localSharedPreferences1.getInt("settings_active_end_time_min", 0);
    this.jMS.setSummary(d(this, this.jMM, this.jMN));
    this.jMR = this.dXi.BU("settings_active_end_time");
    this.jMO = localSharedPreferences1.getInt("settings_active_begin_time_hour", 8);
    this.jMP = localSharedPreferences1.getInt("settings_active_begin_time_min", 0);
    this.jMR.setSummary(d(this, this.jMO, this.jMP));
    SharedPreferences localSharedPreferences2 = aTM();
    if (localSharedPreferences2.contains("settings_active_silence_time"))
    {
      this.gqY = localSharedPreferences2.getBoolean("settings_active_silence_time", false);
      if (!this.gqY)
        break label317;
      this.jMS.setEnabled(true);
      this.jMR.setEnabled(true);
    }
    while (true)
    {
      if (!this.gqY)
      {
        this.dXi.b(this.jMS);
        this.dXi.b(this.jMR);
      }
      this.dXi.R("settings_active_time_full", true);
      this.dXi.notifyDataSetChanged();
      a(new bt(this));
      return;
      if (!localSharedPreferences2.getBoolean("settings_active_time_full", true));
      for (boolean bool = true; ; bool = false)
      {
        this.gqY = bool;
        ((CheckBoxPreference)this.dXi.BU("settings_active_silence_time")).setChecked(this.gqY);
        break;
      }
      label317: this.jMS.setEnabled(false);
      this.jMR.setEnabled(false);
    }
  }

  public final int DZ()
  {
    return q.czV;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    if (paramPreference.getKey().equals("settings_active_begin_time"))
    {
      this.jMQ = true;
      showDialog(1);
      return true;
    }
    if (paramPreference.getKey().equals("settings_active_end_time"))
    {
      this.jMQ = false;
      showDialog(1);
      return true;
    }
    if (paramPreference.getKey().equals("settings_active_silence_time"))
    {
      SharedPreferences localSharedPreferences = aTM();
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.dXi.BU("settings_active_silence_time");
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      boolean bool;
      com.tencent.mm.plugin.f.c.n localn;
      Object[] arrayOfObject;
      if (!localCheckBoxPreference.isChecked())
      {
        bool = true;
        localEditor.putBoolean("settings_active_time_full", bool).commit();
        localn = com.tencent.mm.plugin.f.c.n.fTF;
        arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(0);
        if (!localCheckBoxPreference.isChecked())
          break label178;
      }
      label178: for (int i = 1; ; i = 2)
      {
        arrayOfObject[1] = Integer.valueOf(i);
        localn.e(11351, arrayOfObject);
        DP();
        return true;
        bool = false;
        break;
      }
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(com.tencent.mm.n.cff);
    this.dXi = aTL();
    DP();
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
    }
    if (this.jMQ)
      return new TimePickerDialog(aPI(), this.jMT, this.jMM, this.jMN, false);
    return new TimePickerDialog(aPI(), this.jMT, this.jMO, this.jMP, false);
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default:
      return;
    case 1:
    }
    if (this.jMQ)
    {
      ((TimePickerDialog)paramDialog).updateTime(this.jMM, this.jMN);
      return;
    }
    ((TimePickerDialog)paramDialog).updateTime(this.jMO, this.jMP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsActiveTimeUI
 * JD-Core Version:    0.6.2
 */