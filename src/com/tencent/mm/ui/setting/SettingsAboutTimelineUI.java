package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;

public class SettingsAboutTimelineUI extends MMPreference
{
  private o dXi;
  private String gwf = "";
  private boolean jMu = false;
  private boolean jMv = false;

  protected final void DP()
  {
    this.dXi = aTL();
    oP(n.cgj);
    a(new bj(this));
    this.gwf = x.pG();
  }

  public final int DZ()
  {
    return q.czQ;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str.equals("timline_outside_permiss"))
    {
      Intent localIntent1 = new Intent();
      localIntent1.putExtra("k_sns_tag_id", 4L);
      localIntent1.putExtra("k_sns_from_settings_about_sns", 1);
      a.b(this, "sns", ".ui.SnsBlackDetailUI", localIntent1);
    }
    if (str.equals("timeline_black_permiss"))
    {
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("k_sns_tag_id", 5L);
      localIntent2.putExtra("k_sns_from_settings_about_sns", 2);
      a.b(this, "sns", ".ui.SnsTagDetailUI", localIntent2);
    }
    if (str.equals("timeline_stranger_show"))
      if (this.jMv)
        break label156;
    label156: for (boolean bool = true; ; bool = false)
    {
      this.jMv = bool;
      if (am.ayh() != null)
        am.ayh().v(this.gwf, this.jMv);
      this.jMu = true;
      return false;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
    aan localaan;
    if ((this.jMu) && (am.ayh() != null))
    {
      localaan = am.ayh().w(this.gwf, this.jMv);
      if (localaan != null);
    }
    else
    {
      return;
    }
    z.d("!56@/B4Tb64lLpJkrm2DE1IrT8tB4jsGmGrlePlPUMuJWNd1DG+RA2CMqg==", "userinfo " + localaan.toString());
    com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(51, localaan));
    new cm(Looper.getMainLooper()).post(new bi(this));
  }

  public void onResume()
  {
    super.onResume();
    aan localaan = new aan();
    if (am.ayh() != null)
      localaan = am.ayh().sf(this.gwf);
    if (localaan == null)
      z.e("!56@/B4Tb64lLpJkrm2DE1IrT8tB4jsGmGrlePlPUMuJWNd1DG+RA2CMqg==", "userinfo is null");
    while (true)
    {
      this.dXi.notifyDataSetChanged();
      return;
      int i = localaan.itD;
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.dXi.BU("timeline_stranger_show");
      if (localCheckBoxPreference != null)
      {
        if ((i & 0x1) > 0);
        SharedPreferences localSharedPreferences;
        for (boolean bool = true; ; bool = false)
        {
          this.jMv = bool;
          localSharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
          if (this.jMv)
            break label162;
          localCheckBoxPreference.setChecked(true);
          localSharedPreferences.edit().putBoolean("timeline_stranger_show", true).commit();
          break;
        }
        label162: localCheckBoxPreference.setChecked(false);
        localSharedPreferences.edit().putBoolean("timeline_stranger_show", false).commit();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsAboutTimelineUI
 * JD-Core Version:    0.6.2
 */