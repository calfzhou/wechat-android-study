package com.tencent.mm.ui.setting;

import android.os.Bundle;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;

public class SettingsPluginsNotifyUI extends MMPreference
{
  private o dXi;
  private int state;

  private void LA()
  {
    this.dXi.removeAll();
    Preference localPreference1 = new Preference(this);
    localPreference1.setTitle(n.cgl);
    localPreference1.setKey("settings_plugings_disturb_on");
    localPreference1.setLayoutResource(com.tencent.mm.k.biA);
    Preference localPreference2;
    label106: Preference localPreference3;
    if (this.state == 0)
    {
      localPreference1.setWidgetLayoutResource(com.tencent.mm.k.bjx);
      this.dXi.a(localPreference1);
      localPreference2 = new Preference(this);
      localPreference2.setTitle(n.cgm);
      localPreference2.setKey("settings_plugings_disturb_on_night");
      localPreference2.setLayoutResource(com.tencent.mm.k.biA);
      if (this.state != 1)
        break label227;
      localPreference2.setWidgetLayoutResource(com.tencent.mm.k.bjx);
      this.dXi.a(localPreference2);
      localPreference3 = new Preference(this);
      localPreference3.setTitle(n.cgk);
      localPreference3.setKey("settings_plugings_disturb_off");
      localPreference3.setLayoutResource(com.tencent.mm.k.biA);
      if (this.state != 2)
        break label237;
      localPreference3.setWidgetLayoutResource(com.tencent.mm.k.bjx);
    }
    while (true)
    {
      this.dXi.a(localPreference3);
      Preference localPreference4 = new Preference(this);
      localPreference4.setTitle(n.cgn);
      localPreference4.setLayoutResource(com.tencent.mm.k.bjr);
      this.dXi.a(localPreference4);
      this.dXi.notifyDataSetChanged();
      return;
      localPreference1.setWidgetLayoutResource(com.tencent.mm.k.bjy);
      break;
      label227: localPreference2.setWidgetLayoutResource(com.tencent.mm.k.bjy);
      break label106;
      label237: localPreference3.setWidgetLayoutResource(com.tencent.mm.k.bjy);
    }
  }

  private void qL(int paramInt)
  {
    this.state = paramInt;
    if ((this.state == 1) || (this.state == 0))
    {
      bg.qW().oQ().set(8200, Boolean.valueOf(true));
      if (this.state == 1)
      {
        bg.qW().oQ().set(8201, Integer.valueOf(22));
        bg.qW().oQ().set(8208, Integer.valueOf(8));
        bg.qW().oS().a(new bv(true, 22, 8));
      }
    }
    while (true)
    {
      bg.qX().d(new com.tencent.mm.ab.k(5));
      LA();
      return;
      bg.qW().oQ().set(8201, Integer.valueOf(0));
      bg.qW().oQ().set(8208, Integer.valueOf(0));
      bg.qW().oS().a(new bv(true, 0, 0));
      continue;
      bg.qW().oQ().set(8200, Boolean.valueOf(false));
      bg.qW().oS().a(new bv());
    }
  }

  protected final void DP()
  {
    Boolean localBoolean = Boolean.valueOf(x.pX());
    int i = x.qf();
    int j = x.qg();
    int k;
    if (localBoolean.booleanValue())
      if (i == j)
        k = 0;
    for (this.state = k; ; this.state = 2)
    {
      z.d("!56@wOBHzM1+lQUo5XYM0L8eUfEqljrwj9rQm7khRkInC3bSXceOZC19Gg==", localBoolean + "st " + i + " ed " + j + "  state " + this.state);
      this.state = this.state;
      this.dXi = aTL();
      oP(n.cgo);
      a(new el(this));
      return;
      k = 1;
      break;
    }
  }

  public final int DZ()
  {
    return -1;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str.equals("settings_plugings_disturb_on"))
      qL(0);
    if (str.equals("settings_plugings_disturb_on_night"))
      qL(1);
    if (str.equals("settings_plugings_disturb_off"))
      qL(2);
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onResume()
  {
    super.onResume();
    LA();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsPluginsNotifyUI
 * JD-Core Version:    0.6.2
 */