package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import java.util.LinkedList;
import java.util.List;

public class SettingsNotificationUI extends MMPreference
{
  private o dXi;

  private void aZt()
  {
    Preference localPreference = this.dXi.BU("settings_notification_ringtone");
    if (localPreference != null)
      localPreference.setSummary(aTM().getString("settings.ringtone.name", getString(n.cge)));
    this.dXi.notifyDataSetChanged();
  }

  private boolean fX(boolean paramBoolean)
  {
    Preference localPreference1 = this.dXi.BU("settings_sound");
    Preference localPreference2 = this.dXi.BU("settings_shake");
    Preference localPreference3 = this.dXi.BU("settings_show_detail");
    if (localPreference1 != null)
      localPreference1.setEnabled(paramBoolean);
    if (localPreference2 != null)
      localPreference2.setEnabled(paramBoolean);
    if (localPreference3 != null)
      localPreference3.setEnabled(paramBoolean);
    return true;
  }

  protected final void DP()
  {
    oP(n.cgd);
    this.dXi = aTL();
    SharedPreferences localSharedPreferences = aTM();
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(q.czX);
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.dXi.BU("settings_new_msg_notification");
    if (localSharedPreferences.getBoolean(localCheckBoxPreference1.getKey(), true))
    {
      localSharedPreferences.edit().putBoolean(localCheckBoxPreference1.getKey(), true).commit();
      localCheckBoxPreference1.setChecked(true);
    }
    fX(localCheckBoxPreference1.isChecked());
    label297: int i;
    if (localCheckBoxPreference1.isChecked())
    {
      CheckBoxPreference localCheckBoxPreference3 = (CheckBoxPreference)this.dXi.BU("settings_sound");
      if (localSharedPreferences.getBoolean(localCheckBoxPreference3.getKey(), true))
      {
        localSharedPreferences.edit().putBoolean(localCheckBoxPreference3.getKey(), true).commit();
        localCheckBoxPreference3.setChecked(true);
        aZt();
        CheckBoxPreference localCheckBoxPreference4 = (CheckBoxPreference)this.dXi.BU("settings_shake");
        if (localSharedPreferences.getBoolean(localCheckBoxPreference4.getKey(), true))
        {
          localSharedPreferences.edit().putBoolean(localCheckBoxPreference4.getKey(), true).commit();
          localCheckBoxPreference4.setChecked(true);
        }
        CheckBoxPreference localCheckBoxPreference5 = (CheckBoxPreference)this.dXi.BU("settings_show_detail");
        if (localSharedPreferences.getBoolean(localCheckBoxPreference5.getKey(), true))
        {
          localSharedPreferences.edit().putBoolean(localCheckBoxPreference5.getKey(), true).commit();
          localCheckBoxPreference5.setChecked(true);
        }
        CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.dXi.BU("settings_sns_notify");
        if ((!a.to("sns")) || ((0x8000 & x.pO()) != 0))
          break label473;
        i = 1;
        label333: if (i == 0)
          break label479;
        if (localSharedPreferences.getBoolean(localCheckBoxPreference2.getKey(), true))
        {
          localSharedPreferences.edit().putBoolean(localCheckBoxPreference2.getKey(), true).commit();
          localCheckBoxPreference2.setChecked(true);
        }
      }
    }
    while (true)
    {
      a(new ed(this));
      return;
      this.dXi.BV("settings_notification_ringtone");
      break;
      this.dXi.BV("settings_show_detail");
      this.dXi.BV("settings_sound");
      this.dXi.BV("settings_notification_ringtone");
      this.dXi.BV("settings_shake");
      this.dXi.BV("settings_active_time");
      break label297;
      label473: i = 0;
      break label333;
      label479: this.dXi.R("settings_sns_notify", true);
    }
  }

  public final int DZ()
  {
    return q.czX;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    int i = 1;
    String str = paramPreference.getKey();
    if (str.equals("settings_new_msg_notification"))
    {
      DP();
      i = fX(((CheckBoxPreference)paramPreference).isChecked());
    }
    do
    {
      return i;
      if (str.equals("settings_sound"))
      {
        DP();
        return i;
      }
      if (str.equals("settings_shake"))
      {
        ap.a(this, aTM().getBoolean("settings_shake", false));
        return i;
      }
    }
    while (str.equals("settings_show_detail"));
    if (str.equals("settings_notification_ringtone"))
    {
      startActivity(new Intent(aPI(), SettingsRingtoneUI.class));
      return i;
    }
    if (str.equals("settings_sns_notify"))
    {
      boolean bool = aTM().getBoolean("settings_sns_notify", i);
      bg.qW().oQ().set(68384, Boolean.valueOf(bool));
      return i;
    }
    if (str.equals("settings_active_time"))
    {
      startActivity(new Intent(this, SettingsActiveTimeUI.class));
      return i;
    }
    LinkedList localLinkedList;
    Boolean localBoolean;
    int j;
    int k;
    if (str.equals("settings_plugings_notify"))
    {
      localLinkedList = new LinkedList();
      localLinkedList.add(getString(n.cgl));
      localLinkedList.add(getString(n.cgm));
      localLinkedList.add(getString(n.cgk));
      localBoolean = Boolean.valueOf(x.pX());
      j = x.qf();
      k = x.qg();
      if (!localBoolean.booleanValue())
        break label381;
      if (j == k)
        i = 0;
    }
    label381: int n;
    for (int m = i; ; n = 2)
    {
      z.d("!44@/B4Tb64lLpJkrm2DE1IrTyB0wNbgu9zylVvDj1PECA8=", localBoolean + "st " + j + " ed " + k + "  state " + m);
      com.tencent.mm.ui.base.e.a(aPI(), getString(n.cgo), localLinkedList, m, getString(n.cgn), new ee(this, m));
      return false;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    boolean bool = ap.a((Boolean)bg.qW().oQ().get(68384), true);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrTyB0wNbgu9zylVvDj1PECA8=", "sns Notify " + bool);
    DP();
  }

  public void onResume()
  {
    super.onResume();
    aZt();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsNotificationUI
 * JD-Core Version:    0.6.2
 */