package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import com.tencent.mm.booter.ak;
import com.tencent.mm.c.a.fj;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.n.af;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.SwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.tools.CropImageNewUI;

public class SettingsUI extends MMPreference
  implements com.tencent.mm.sdk.f.as
{
  private com.tencent.mm.o.m dDA = null;
  private o dXi;
  private ProgressDialog hqQ = null;
  private com.tencent.mm.o.m iJL = null;
  private com.tencent.mm.k.c jLz = new fe(this);
  private ay jMe;
  private PersonalPreference jOl = null;
  private Dialog jOm = null;
  private Dialog jOn = null;

  private void aYU()
  {
    IconPreference localIconPreference = (IconPreference)this.dXi.BU("settings_about_micromsg");
    boolean bool1 = com.tencent.mm.platformtools.ap.a(Boolean.valueOf(com.tencent.mm.k.i.Ck().t(262146, 266243)), false);
    boolean bool2 = com.tencent.mm.platformtools.ap.a(Boolean.valueOf(com.tencent.mm.k.i.Ck().t(262145, 266243)), false);
    if ((!com.tencent.mm.sdk.platformtools.l.iDv) && ((bool1) || (bool2)))
    {
      localIconPreference.pT(0);
      localIconPreference.aq(getString(com.tencent.mm.n.btN), h.Xq);
      return;
    }
    localIconPreference.aq("", -1);
    localIconPreference.pT(8);
  }

  private void aZv()
  {
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.dXi.BU("settings_account_info");
    if (localIconSwitchKeyValuePreference == null)
      z.e("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "safedevicesate preference is null");
    while (((Integer)bg.qW().oQ().get(9)).intValue() == 0)
      return;
    if (x.pM())
    {
      localIconSwitchKeyValuePreference.setSummary(com.tencent.mm.n.cby);
      localIconSwitchKeyValuePreference.pW(1);
      return;
    }
    localIconSwitchKeyValuePreference.setSummary(com.tencent.mm.n.cbz);
    localIconSwitchKeyValuePreference.pW(2);
  }

  private void aZw()
  {
    ab localab = aa.wb();
    SwitchKeyValuePreference localSwitchKeyValuePreference = (SwitchKeyValuePreference)this.dXi.BU("settings_bind_mobile");
    boolean bool;
    if (localSwitchKeyValuePreference != null)
    {
      if ((localab != ab.dtS) && (localab != ab.dtT))
        break label70;
      bool = true;
      localSwitchKeyValuePreference.fc(bool);
      if ((localab != ab.dtS) && (localab != ab.dtT))
        break label75;
    }
    label70: label75: for (int i = com.tencent.mm.n.cgs; ; i = com.tencent.mm.n.cgr)
    {
      localSwitchKeyValuePreference.setSummary(i);
      return;
      bool = false;
      break;
    }
  }

  private void aZx()
  {
    ak.lA();
    bg.qW().oQ().b(this);
    fj localfj = new fj();
    localfj.cKH.status = 0;
    localfj.cKH.cKI = 0;
    com.tencent.mm.sdk.c.a.aGB().g(localfj);
    com.tencent.mm.c.a.m localm = new com.tencent.mm.c.a.m();
    localm.cHo.cHp = true;
    com.tencent.mm.sdk.c.a.aGB().g(localm);
    com.tencent.mm.sdk.platformtools.as.AP("show_whatsnew");
    getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.g.m.nN()).edit().putBoolean("settings_fully_exit", true).commit();
    Intent localIntent = new Intent(this, LauncherUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("Intro_Switch", true);
    aPI().startActivity(localIntent);
    com.tencent.mm.modelsimple.f.G(this);
    finish();
  }

  protected final void DP()
  {
    oP(com.tencent.mm.n.chf);
    this.dXi = aTL();
    Preference localPreference = this.dXi.BU("settings_push_software");
    if (localPreference != null)
      this.dXi.b(localPreference);
    a(new fq(this));
    new fr(this);
    aZw();
    aYU();
    String str = com.tencent.mm.f.e.or().getValue("HideCloseWeixinAppEntry");
    if ((!com.tencent.mm.platformtools.ap.jb(str)) && (str.equals("1")))
    {
      this.dXi.R("settings_logout_option", false);
      this.dXi.R("settings_logout", true);
      return;
    }
    this.dXi.R("settings_logout_option", true);
    this.dXi.R("settings_logout", false);
  }

  public final int DZ()
  {
    return com.tencent.mm.q.czS;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    int i = com.tencent.mm.platformtools.ap.R(paramObject);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Integer.valueOf(i);
    arrayOfObject1[2] = paramap;
    z.d("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
    }
    do
    {
      return;
      if (4 == i)
      {
        bg.qW().oQ().get(2);
        bg.qW().oQ().get(4);
      }
      if (6 == i)
      {
        aZw();
        return;
      }
    }
    while (64 != i);
    aZv();
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str1 = paramPreference.getKey();
    z.i("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", str1 + " item has been clicked!");
    if ("settings_account_info".equals(str1))
    {
      d(SettingsAccountInfoUI.class);
      return true;
    }
    if ("settings_account".equals(str1))
    {
      aPI().startActivity(new Intent(this, SettingsPersonalInfoUI.class));
      return true;
    }
    if (str1.equals("settings_bind_mobile"))
    {
      MMWizardActivity.j(this, new Intent(this, BindMContactIntroUI.class));
      return true;
    }
    if (str1.equals("settings_about_privacy"))
    {
      startActivity(new Intent(this, SettingsPrivacyUI.class));
      return true;
    }
    if (str1.equals("settings_about_system"))
    {
      startActivity(new Intent(this, SettingsAboutSystemUI.class));
      return true;
    }
    if (str1.equals("settings_push_software"))
    {
      String str3 = com.tencent.mm.platformtools.ap.ja((String)bg.qW().oQ().get(12308));
      Intent localIntent = new Intent();
      localIntent.putExtra("title", getString(com.tencent.mm.n.cgF));
      localIntent.putExtra("rawUrl", str3);
      localIntent.putExtra("showShare", false);
      com.tencent.mm.am.a.b(aPI(), "webview", ".ui.tools.WebViewUI", localIntent);
      return true;
    }
    if (str1.equals("settings_about_micromsg"))
    {
      com.tencent.mm.k.i.Ck().K(262145, 266243);
      com.tencent.mm.k.i.Ck().K(262146, 266243);
      aPI().startActivity(new Intent(this, SettingsAboutMicroMsgUI.class));
      new cm().postDelayed(new fs(this), 100L);
      return true;
    }
    if (str1.equals("settings_logout"))
    {
      com.tencent.mm.plugin.f.c.n localn3 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Integer.valueOf(1);
      localn3.e(11053, arrayOfObject5);
      if (com.tencent.mm.z.b.ys())
      {
        z.i("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "oversea user logout");
        com.tencent.mm.ui.base.e.a(aPI(), true, getResources().getString(com.tencent.mm.n.cfR), "", getResources().getString(com.tencent.mm.n.cfQ), getString(com.tencent.mm.n.bsK), new fh(this), null);
        return true;
      }
      ad localad = new ad(aPI());
      View localView = View.inflate(aPI(), k.bho, null);
      localView.findViewById(com.tencent.mm.i.aDS).setOnClickListener(new fv(this));
      localView.findViewById(com.tencent.mm.i.aDR).setOnClickListener(new fw(this));
      localad.ao(localView);
      this.jOn = localad.aRB();
      this.jOn.show();
      return true;
    }
    if (str1.equals("settings_logout_option"))
    {
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(1);
      localn2.e(11305, arrayOfObject4);
      if (this.jOm != null)
      {
        this.jOm.show();
        return true;
      }
      this.jOm = com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.cfR), "", getString(com.tencent.mm.n.cfQ), getString(com.tencent.mm.n.fJC), new ft(this), new fu(this));
      return true;
    }
    if (str1.equals("settings_like_facebook"))
    {
      int k = com.tencent.mm.platformtools.ap.a((Integer)bg.qP().get(1));
      String str2 = y.aGV();
      StringBuilder localStringBuilder = new StringBuilder();
      int m = com.tencent.mm.n.cfL;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(k);
      startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(m, arrayOfObject3) + "&countrycode=" + str2.toUpperCase())));
      return true;
    }
    if (str1.equals("settings_follow_twitter"))
    {
      int i = com.tencent.mm.platformtools.ap.a((Integer)bg.qP().get(1));
      int j = com.tencent.mm.n.cfE;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(i);
      startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(j, arrayOfObject2))));
      return true;
    }
    if (str1.equals("settings_notification_preference"))
    {
      startActivity(new Intent(this, SettingsNotificationUI.class));
      return true;
    }
    if (str1.equals("settings_chatting"))
    {
      d(SettingsChattingUI.class);
      return true;
    }
    if (str1.equals("settings_active_time"))
    {
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(1);
      arrayOfObject1[1] = Integer.valueOf(0);
      localn1.e(11351, arrayOfObject1);
      d(SettingsActiveTimeUI.class);
      return true;
    }
    if (str1.equals("settings_safe"))
    {
      d(SettingsSafeUI.class);
      return true;
    }
    return false;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    z.v("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "settings handle");
    switch (paramInt1)
    {
    default:
    case 5:
    case 3:
    case 2:
    case 4:
    }
    do
    {
      String str2;
      do
      {
        do
        {
          String str3;
          do
          {
            do
              return;
            while (paramInt2 != -1);
            aZx();
            return;
            str3 = bc.a(getApplicationContext(), paramIntent, bg.qW().pa());
          }
          while (str3 == null);
          Intent localIntent2 = new Intent();
          localIntent2.setClass(aPI(), CropImageNewUI.class);
          localIntent2.putExtra("CropImageMode", 1);
          localIntent2.putExtra("CropImage_OutputPath", str3);
          localIntent2.putExtra("CropImage_ImgPath", str3);
          startActivityForResult(localIntent2, 4);
          return;
        }
        while (paramIntent == null);
        str2 = bc.a(getApplicationContext(), paramIntent, bg.qW().pa());
      }
      while (str2 == null);
      Intent localIntent1 = new Intent();
      localIntent1.setClass(aPI(), CropImageNewUI.class);
      localIntent1.putExtra("CropImageMode", 1);
      localIntent1.putExtra("CropImage_OutputPath", af.sh().g(x.pG(), true));
      localIntent1.putExtra("CropImage_ImgPath", str2);
      com.tencent.mm.ui.tools.l.b(this, paramIntent, localIntent1, bg.qW().pa(), 4);
      return;
    }
    while (paramIntent == null);
    String str1 = paramIntent.getStringExtra("CropImage_OutputPath");
    if (str1 == null)
      z.e("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "crop picture failed");
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      new com.tencent.mm.pluginsdk.model.q(aPI(), str1).mh(1);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    bg.qW().oQ().a(this);
    com.tencent.mm.k.i.Ck().a(this.jLz);
  }

  protected void onDestroy()
  {
    if (bg.oE())
    {
      bg.qW().oQ().b(this);
      com.tencent.mm.k.i.Ck().b(this.jLz);
    }
    if (this.dDA != null)
      bg.qX().b(281, this.dDA);
    if (this.iJL != null)
      bg.qX().b(255, this.iJL);
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
  }

  public void onResume()
  {
    PersonalPreference localPersonalPreference = (PersonalPreference)this.dXi.BU("settings_account");
    if (localPersonalPreference != null)
      localPersonalPreference.Dg(x.pG());
    if (!com.tencent.mm.z.b.yn())
    {
      Preference localPreference1 = this.dXi.BU("settings_like_facebook");
      this.dXi.b(localPreference1);
      Preference localPreference2 = this.dXi.BU("settings_follow_twitter");
      this.dXi.b(localPreference2);
    }
    aZv();
    aZw();
    aYU();
    z.v("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "on resume");
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsUI
 * JD-Core Version:    0.6.2
 */