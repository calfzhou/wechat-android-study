package com.tencent.mm.ui.setting;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.tencent.mm.modelstat.f;
import com.tencent.mm.modelstat.j;
import com.tencent.mm.modelstat.r;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SettingsNetStatUI extends MMPreference
{
  private o dXi;
  private long period;

  private void aZs()
  {
    f localf = r.Ap().ez((int)(this.period / 86400000L));
    if (localf == null)
      localf = new f();
    this.period = r.Ap().Af();
    Preference localPreference1 = this.dXi.BU("settings_netstat_info");
    String str = DateFormat.format(getString(n.bKo, new Object[] { "" }), this.period).toString();
    localPreference1.setTitle(getString(n.chh, new Object[] { str }));
    Preference localPreference2 = this.dXi.BU("settings_netstat_mobile");
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(localf.dEr);
    arrayOfObject1[1] = Integer.valueOf(localf.dEf);
    z.i("!44@/B4Tb64lLpJkrm2DE1IrTzDabJZyhIiv0gLIhMT7ZrE=", "dknetflow updateFlowStatistic mobile out:%d in:%d", arrayOfObject1);
    localPreference2.setSummary(i(this, localf.dEr + localf.dEf));
    Preference localPreference3 = this.dXi.BU("settings_netstat_wifi");
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(localf.dEs);
    arrayOfObject2[1] = Integer.valueOf(localf.dEg);
    z.i("!44@/B4Tb64lLpJkrm2DE1IrTzDabJZyhIiv0gLIhMT7ZrE=", "dknetflow updateFlowStatistic wifi out:%d in:%d", arrayOfObject2);
    localPreference3.setSummary(i(this, localf.dEs + localf.dEg));
    ((NetStatPreference)this.dXi.BU("settings_netstat_mobile_detail")).fU(false);
    ((NetStatPreference)this.dXi.BU("settings_netstat_wifi_detail")).fU(true);
    this.dXi.notifyDataSetChanged();
  }

  private static String i(Context paramContext, long paramLong)
  {
    int i = n.chg;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ap.Z(paramLong);
    return paramContext.getString(i, arrayOfObject);
  }

  protected final void DP()
  {
    oP(n.chi);
    r.Ap().Ae();
    this.dXi = aTL();
    this.period = r.Ap().Af();
    Preference localPreference = this.dXi.BU("settings_netstat_info");
    String str = new SimpleDateFormat(getString(n.bKo), Locale.US).format(new Date(this.period));
    localPreference.setTitle(getString(n.chh, new Object[] { str }));
    z.i("!44@/B4Tb64lLpJkrm2DE1IrTzDabJZyhIiv0gLIhMT7ZrE=", "title datatime = " + str);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrTzDabJZyhIiv0gLIhMT7ZrE=", "title datatime = " + str);
    a(new dz(this));
    a(0, getString(n.chj), new ea(this));
  }

  protected final boolean DY()
  {
    return false;
  }

  public final int DZ()
  {
    return q.czW;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
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
    aZs();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsNetStatUI
 * JD-Core Version:    0.6.2
 */