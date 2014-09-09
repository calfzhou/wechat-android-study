package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.ab.k;
import com.tencent.mm.am.a;
import com.tencent.mm.f.c;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.protocal.a.je;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bn;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.base.preference.y;
import com.tencent.mm.ui.contact.SelectContactUI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsPrivacyUI extends MMPreference
{
  private o dXi;
  private HashMap els = new HashMap();
  boolean euf = false;
  private String gwf = "";
  private boolean jMu = false;
  private boolean jMv = false;
  private int status;

  private static int Es()
  {
    String str = c.om().getValue("AutoAddFriendShow");
    if (ch.jb(str))
      str = "0";
    try
    {
      int j = Integer.parseInt(str);
      i = j;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.d("!32@/B4Tb64lLpJkrm2DE1IrT8iPuevh7UQ5", "getAutoAddDynamicConfig, autoAdd = %d", arrayOfObject);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        int i = 0;
    }
  }

  private static void Ix()
  {
    com.tencent.mm.model.bg.qX().d(new k(5));
  }

  private boolean d(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    z.d("!32@/B4Tb64lLpJkrm2DE1IrT8iPuevh7UQ5", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status = (paramInt1 | this.status);
      if (!paramBoolean)
        break label94;
    }
    label94: for (int i = 1; ; i = 2)
    {
      this.els.put(Integer.valueOf(paramInt2), Integer.valueOf(i));
      return true;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }

  private boolean fb(int paramInt)
  {
    return (paramInt & this.status) != 0;
  }

  protected final void DP()
  {
    oP(n.cfc);
    a(new eo(this));
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(q.cfc);
    z.v("!32@/B4Tb64lLpJkrm2DE1IrT8iPuevh7UQ5", "init function status: " + Integer.toBinaryString(this.status));
    ((CheckBoxPreference)this.dXi.BU("settings_need_verify")).setChecked(fb(32));
    Integer localInteger = (Integer)com.tencent.mm.model.bg.qW().oQ().get(9);
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.dXi.BU("settings_find_me_by_QQ");
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.dXi.BU("settings_recommend_qqfriends_to_me");
    boolean bool7;
    boolean bool8;
    label186: label192: CheckBoxPreference localCheckBoxPreference3;
    CheckBoxPreference localCheckBoxPreference4;
    CheckBoxPreference localCheckBoxPreference5;
    boolean bool5;
    label282: boolean bool6;
    label302: label335: boolean bool1;
    label364: CheckBoxPreference localCheckBoxPreference7;
    CheckBoxPreference localCheckBoxPreference8;
    boolean bool2;
    if ((localInteger != null) && (localInteger.intValue() != 0))
      if ((!fb(8)) || (!fb(16)))
      {
        bool7 = true;
        localCheckBoxPreference1.setChecked(bool7);
        if (fb(128))
          break label617;
        bool8 = true;
        localCheckBoxPreference2.setChecked(bool8);
        String str1 = (String)com.tencent.mm.model.bg.qW().oQ().get(6);
        localCheckBoxPreference3 = (CheckBoxPreference)this.dXi.BU("settings_find_me_by_mobile");
        localCheckBoxPreference4 = (CheckBoxPreference)this.dXi.BU("settings_recommend_mobilefriends_to_me");
        localCheckBoxPreference5 = (CheckBoxPreference)this.dXi.BU("settings_autoadd_mobilefriends");
        if ((str1 == null) || (str1.length() <= 0))
          break label675;
        if (fb(512))
          break label648;
        bool5 = true;
        localCheckBoxPreference3.setChecked(bool5);
        if (fb(256))
          break label654;
        bool6 = true;
        localCheckBoxPreference4.setChecked(bool6);
        if ((!localCheckBoxPreference4.isChecked()) || (Es() != 1))
          break label660;
        localCheckBoxPreference5.setChecked(fb(2097152));
        CheckBoxPreference localCheckBoxPreference6 = (CheckBoxPreference)this.dXi.BU("settings_find_me_by_weixin");
        if ((0x200 & x.pL()) != 0)
          break label714;
        bool1 = true;
        localCheckBoxPreference6.setChecked(bool1);
        localCheckBoxPreference7 = (CheckBoxPreference)this.dXi.BU("settings_find_me_by_google");
        localCheckBoxPreference8 = (CheckBoxPreference)this.dXi.BU("settings_find_google_contact");
        if (fb(524288))
          break label720;
        bool2 = true;
        label415: localCheckBoxPreference7.setChecked(bool2);
        if (fb(1048576))
          break label726;
      }
    label648: label654: label660: label675: label714: label720: label726: for (boolean bool3 = true; ; bool3 = false)
    {
      localCheckBoxPreference8.setChecked(bool3);
      String str2 = (String)com.tencent.mm.model.bg.qW().oQ().get(208903);
      if ((!ch.ys()) || (TextUtils.isEmpty(str2)))
      {
        this.dXi.b(localCheckBoxPreference7);
        this.dXi.b(localCheckBoxPreference8);
      }
      boolean bool4 = a.to("sns");
      int i = 0;
      if (bool4)
      {
        int j = 0x8000 & x.pO();
        i = 0;
        if (j == 0)
          i = 1;
      }
      if (i == 0)
      {
        this.dXi.R("settings_add_friends_timeline_tip", true);
        this.dXi.R("timline_outside_permiss", true);
        this.dXi.R("timeline_black_permiss", true);
        this.dXi.R("edit_timeline_group", true);
        this.dXi.R("timeline_stranger_show", true);
      }
      this.dXi.notifyDataSetChanged();
      return;
      bool7 = false;
      break;
      label617: bool8 = false;
      break label186;
      this.dXi.b(localCheckBoxPreference1);
      this.dXi.b(localCheckBoxPreference2);
      break label192;
      bool5 = false;
      break label282;
      bool6 = false;
      break label302;
      this.dXi.b(localCheckBoxPreference5);
      break label335;
      this.dXi.b(localCheckBoxPreference3);
      this.dXi.b(localCheckBoxPreference4);
      this.dXi.b(localCheckBoxPreference5);
      break label335;
      bool1 = false;
      break label364;
      bool2 = false;
      break label415;
    }
  }

  public final int DZ()
  {
    return q.cfc;
  }

  public final y a(SharedPreferences paramSharedPreferences)
  {
    return new com.tencent.mm.ui.base.preference.b(this, paramSharedPreferences);
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    int i = 1;
    String str = paramPreference.getKey();
    z.i("!32@/B4Tb64lLpJkrm2DE1IrT8iPuevh7UQ5", str + " item has been clicked!");
    SharedPreferences localSharedPreferences = aTM();
    if (str.equals("settings_need_verify"))
      return d(localSharedPreferences.getBoolean("settings_need_verify", false), 32, 4);
    if (str.equals("settings_find_me_by_QQ"))
    {
      if (!((CheckBoxPreference)paramo.BU("settings_find_me_by_QQ")).isChecked());
      int i4;
      for (int i3 = i; ; i4 = 0)
      {
        d(i3, 8, 2);
        d(i3, 16, 3);
        return i;
      }
    }
    if (str.equals("settings_recommend_qqfriends_to_me"))
    {
      boolean bool7 = ((CheckBoxPreference)paramo.BU("settings_recommend_qqfriends_to_me")).isChecked();
      boolean bool8 = false;
      if (!bool7)
        bool8 = i;
      d(bool8, 128, 6);
      return i;
    }
    if (str.equals("settings_find_me_by_weixin"))
    {
      int m = x.pL();
      boolean bool6 = localSharedPreferences.getBoolean("settings_find_me_by_weixin", false);
      int n;
      bb localbb;
      if (!bool6)
      {
        n = m | 0x200;
        com.tencent.mm.model.bg.qW().oQ().set(40, Integer.valueOf(n));
        localbb = com.tencent.mm.model.bg.qW().oS();
        if (bool6)
          break label278;
      }
      label278: int i2;
      for (int i1 = i; ; i2 = 2)
      {
        localbb.a(new bn(25, i1));
        return i;
        n = m & 0xFFFFFDFF;
        break;
      }
    }
    if (str.equals("settings_find_me_by_mobile"))
    {
      if (!localSharedPreferences.getBoolean("settings_find_me_by_mobile", false));
      while (true)
      {
        return d(i, 512, 8);
        i = 0;
      }
    }
    if (str.equals("settings_recommend_mobilefriends_to_me"))
    {
      if (!((CheckBoxPreference)paramo.BU("settings_recommend_mobilefriends_to_me")).isChecked());
      int k;
      for (int j = i; ; k = 0)
      {
        d(j, 256, 7);
        if (j != 0)
          d(false, 2097152, 32);
        DP();
        return i;
      }
    }
    if (str.equals("settings_autoadd_mobilefriends"))
      return d(((CheckBoxPreference)paramo.BU("settings_autoadd_mobilefriends")).isChecked(), 2097152, 32);
    if (str.equals("settings_about_blacklist"))
    {
      aq localaq = ag.ea(getString(n.bNd));
      Intent localIntent3 = new Intent();
      localIntent3.setClass(this, SelectContactUI.class);
      localIntent3.putExtra("need_biz_entrance", false);
      localIntent3.putExtra("Contact_GroupFilter_Type", localaq.getType());
      localIntent3.putExtra("Contact_GroupFilter_DisplayName", getString(n.cgE));
      localIntent3.putExtra("show_label", false);
      startActivity(localIntent3);
      return i;
    }
    if (str.equals("timline_outside_permiss"))
    {
      Intent localIntent1 = new Intent();
      localIntent1.putExtra("k_sns_tag_id", 4L);
      localIntent1.putExtra("k_sns_from_settings_about_sns", i);
      a.b(this, "sns", ".ui.SnsBlackDetailUI", localIntent1);
    }
    boolean bool1;
    label767: 
    do
    {
      while (true)
      {
        return false;
        if (str.equals("timeline_black_permiss"))
        {
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("k_sns_tag_id", 5L);
          localIntent2.putExtra("k_sns_from_settings_about_sns", 2);
          a.b(this, "sns", ".ui.SnsTagDetailUI", localIntent2);
        }
        else if (str.equals("edit_timeline_group"))
        {
          a.l(this, "sns", ".ui.SnsTagPartlyUI");
        }
        else
        {
          if (!str.equals("timeline_stranger_show"))
            break;
          if (!this.jMv);
          aan localaan;
          while (true)
          {
            this.jMv = i;
            if (am.ayh() != null)
              am.ayh().v(this.gwf, this.jMv);
            if (am.ayh() == null)
              break;
            localaan = am.ayh().w(this.gwf, this.jMv);
            am.ayh().a(this.gwf, localaan);
            if (localaan != null)
              break label767;
            z.e("!32@/B4Tb64lLpJkrm2DE1IrT8iPuevh7UQ5", "userinfo in null !");
            return false;
            bool1 = false;
          }
          z.d("!32@/B4Tb64lLpJkrm2DE1IrT8iPuevh7UQ5", "dancy userinfo " + localaan.toString());
          com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(51, localaan));
          Ix();
        }
      }
      if (str.equals("settings_find_me_by_google"))
      {
        boolean bool4 = ((CheckBoxPreference)paramo.BU("settings_find_me_by_google")).isChecked();
        boolean bool5 = false;
        if (!bool4)
          bool5 = bool1;
        d(bool5, 524288, 30);
        return bool1;
      }
    }
    while (!str.equals("settings_find_google_contact"));
    boolean bool2 = ((CheckBoxPreference)paramo.BU("settings_find_google_contact")).isChecked();
    boolean bool3 = false;
    if (!bool2)
      bool3 = bool1;
    d(bool3, 1048576, 29);
    return bool1;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dXi = aTL();
    this.status = x.pK();
    this.gwf = x.pG();
    DP();
  }

  public void onDestroy()
  {
    Ix();
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    com.tencent.mm.model.bg.qW().oQ().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.els.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int i = ((Integer)localEntry.getKey()).intValue();
      int j = ((Integer)localEntry.getValue()).intValue();
      je localje = new je();
      localje.iad = i;
      localje.iae = j;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje));
      z.d("!32@/B4Tb64lLpJkrm2DE1IrT8iPuevh7UQ5", "switch  " + i + " " + j);
    }
    Ix();
    this.els.clear();
  }

  protected void onResume()
  {
    super.onResume();
    aan localaan = new aan();
    if (am.ayh() != null)
      localaan = am.ayh().sf(this.gwf);
    if (localaan == null)
      z.e("!32@/B4Tb64lLpJkrm2DE1IrT8iPuevh7UQ5", "userinfo is null");
    while (true)
    {
      if (!this.euf)
      {
        String str = getIntent().getStringExtra("need_matte_high_light_item");
        if (!ch.jb(str))
        {
          int j = this.dXi.BW(str);
          setSelection(j - 3);
          new cm().postDelayed(new en(this, j), 10L);
        }
        this.euf = true;
      }
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
            break label234;
          localCheckBoxPreference.setChecked(true);
          localSharedPreferences.edit().putBoolean("timeline_stranger_show", true).commit();
          break;
        }
        label234: localCheckBoxPreference.setChecked(false);
        localSharedPreferences.edit().putBoolean("timeline_stranger_show", false).commit();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsPrivacyUI
 * JD-Core Version:    0.6.2
 */