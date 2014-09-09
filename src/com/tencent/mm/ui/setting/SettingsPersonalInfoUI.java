package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.cs;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n.af;
import com.tencent.mm.n.m;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.DialogPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.tools.CropImageNewUI;
import com.tencent.mm.ui.tools.MultiStageCitySelectUI;
import com.tencent.mm.ui.tools.l;

public class SettingsPersonalInfoUI extends MMPreference
  implements as
{
  private int cOn = -1;
  private o dXi;
  private boolean jip;

  private void IB()
  {
    HeadImgNewPreference localHeadImgNewPreference = (HeadImgNewPreference)this.dXi.BU("settings_change_avatar");
    localHeadImgNewPreference.Df(x.pG());
    localHeadImgNewPreference.i(new eh(this));
  }

  private void aZk()
  {
    Preference localPreference = this.dXi.BU("settings_username");
    String str1 = x.pH();
    if (com.tencent.mm.platformtools.ap.jb(str1))
    {
      String str2 = x.pG();
      if (i.yd(str2))
      {
        localPreference.setSummary(getString(com.tencent.mm.n.cgg));
        return;
      }
      localPreference.setSummary(str2);
      return;
    }
    localPreference.setSummary(str1);
  }

  private void aZu()
  {
    Preference localPreference = this.dXi.BU("settings_signature");
    String str = com.tencent.mm.platformtools.ap.ja((String)com.tencent.mm.model.bg.qW().oQ().get(12291));
    if (str.length() <= 0)
      str = getString(com.tencent.mm.n.cgV);
    localPreference.setSummary(com.tencent.mm.ar.b.e(this, str, -2));
  }

  protected final void DP()
  {
    oP(com.tencent.mm.n.cgi);
    com.tencent.mm.model.bg.qW().oQ().a(this);
    this.dXi = aTL();
    ((DialogPreference)this.dXi.BU("settings_sex")).a(new ef(this));
    a(new eg(this));
  }

  public final int DZ()
  {
    return com.tencent.mm.q.czY;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    int i = com.tencent.mm.platformtools.ap.R(paramObject);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Integer.valueOf(i);
    arrayOfObject1[2] = paramap;
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != com.tencent.mm.model.bg.qW().oQ()) || (i <= 0))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
      return;
    }
    if (12291 == i)
      aZu();
    aZk();
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str1 = paramPreference.getKey();
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=", "key = " + str1);
    String str2 = x.pG();
    if (str1.equals("settings_change_avatar"))
      return com.tencent.mm.plugin.a.a.dWp.e(this);
    if ((str1.equals("settings_username")) && (com.tencent.mm.platformtools.ap.jb(x.pH())) && (i.yd(str2)))
    {
      d(SettingsAliasUI.class);
      return true;
    }
    if (str1.equals("settings_name"))
    {
      Intent localIntent1 = new Intent();
      localIntent1.setClass(this, SettingsModifyNameUI.class);
      startActivity(localIntent1);
      return true;
    }
    if (str1.equals("settings_district"))
    {
      d(MultiStageCitySelectUI.class);
      return true;
    }
    if (str1.equals("settings_signature"))
    {
      aPI().startActivity(new Intent(this, EditSignatureUI.class));
      return true;
    }
    if (str1.equals("settings_qrcode"))
    {
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(2);
      localn.d(11264, arrayOfObject);
      aPI().startActivity(new Intent(this, SelfQRCodeUI.class));
    }
    do
    {
      return false;
      if (str1.equals("settings_address"))
      {
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("launch_from_webview", false);
        com.tencent.mm.am.a.a(aPI(), "address", ".ui.WalletSelectAddrUI", localIntent2, true);
        return true;
      }
    }
    while (!str1.equals("settings_linkedin"));
    Intent localIntent3 = new Intent();
    localIntent3.putExtra("oversea_entry", true);
    com.tencent.mm.am.a.b(this, "accountsync", "com.tencent.mm.ui.bindlinkedin.BindLinkedInUI", localIntent3);
    return true;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.i("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=", "onAcvityResult requestCode:%d, resultCode:%d", arrayOfObject);
    if (paramInt2 != -1)
      if ((paramInt1 == 3) || (paramInt1 == 2) || (paramInt1 == 4))
        new cm(Looper.getMainLooper()).post(new ei(this));
    do
    {
      String str2;
      do
      {
        do
        {
          return;
          switch (paramInt1)
          {
          default:
            return;
          case 2:
          case 3:
          case 4:
          }
        }
        while (paramIntent == null);
        Intent localIntent2 = new Intent();
        localIntent2.setClass(this, CropImageNewUI.class);
        localIntent2.putExtra("CropImageMode", 1);
        localIntent2.putExtra("CropImage_Filter", true);
        localIntent2.putExtra("CropImage_OutputPath", af.sh().g(x.pG() + ".crop", true));
        localIntent2.putExtra("CropImage_ImgPath", null);
        l.b(this, paramIntent, localIntent2, com.tencent.mm.model.bg.qW().pa(), 4);
        return;
        str2 = bc.a(getApplicationContext(), paramIntent, com.tencent.mm.model.bg.qW().pa());
      }
      while (str2 == null);
      Intent localIntent1 = new Intent();
      localIntent1.setClass(this, CropImageNewUI.class);
      localIntent1.putExtra("CropImageMode", 1);
      localIntent1.putExtra("CropImage_OutputPath", str2);
      localIntent1.putExtra("CropImage_ImgPath", str2);
      startActivityForResult(localIntent1, 4);
      return;
      new cm(Looper.getMainLooper()).post(new ej(this));
    }
    while (paramIntent == null);
    String str1 = paramIntent.getStringExtra("CropImage_OutputPath");
    if (str1 == null)
    {
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=", "crop picture failed");
      return;
    }
    new com.tencent.mm.pluginsdk.model.q(aPI(), str1).a(1, new ek(this));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    if (getIntent().getBooleanExtra("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=intent_set_avatar", false))
    {
      this.jip = getIntent().getBooleanExtra("KEnterFromBanner", false);
      com.tencent.mm.plugin.a.a.dWp.e(this);
    }
  }

  public void onDestroy()
  {
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=", "SettingsPersonalInfoUI.onDestroy()");
    if (com.tencent.mm.model.bg.oE())
      com.tencent.mm.model.bg.qW().oQ().b(this);
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    cs localcs = cs.rQ();
    if (this.cOn != -1)
      localcs.bj(this.cOn);
    com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(1, cs.a(localcs)));
    com.tencent.mm.model.bg.qX().d(new k(5));
  }

  public void onResume()
  {
    boolean bool1 = true;
    aZk();
    IB();
    String str1 = (String)com.tencent.mm.model.bg.qW().oQ().get(4);
    if ((str1 != null) && (str1.length() > 0))
      this.dXi.BU("settings_name").setSummary(com.tencent.mm.ar.b.e(this, str1, -2));
    int i = com.tencent.mm.platformtools.ap.a((Integer)com.tencent.mm.model.bg.qW().oQ().get(12290), 0);
    DialogPreference localDialogPreference = (DialogPreference)this.dXi.BU("settings_sex");
    boolean bool3;
    label228: boolean bool4;
    switch (i)
    {
    default:
      localDialogPreference.setValue("unknown");
      cs localcs = cs.rQ();
      String str2 = com.tencent.mm.platformtools.ap.ja(localcs.jp());
      String str3 = com.tencent.mm.platformtools.ap.ja(localcs.jq());
      this.dXi.BU("settings_district").setSummary(y.dX(str2) + " " + str3);
      aZu();
      boolean bool2 = ch.ys();
      this.dXi.R("settings_address", bool2);
      if ((0x1000000 & x.pO()) == 0)
      {
        bool3 = bool1;
        String str4 = com.tencent.mm.f.e.or().getValue("LinkedinPluginClose");
        if ((!com.tencent.mm.platformtools.ap.jb(str4)) && (Integer.valueOf(str4).intValue() != 0))
          break label317;
        bool4 = bool1;
        label261: if ((bool3) && (bool4))
          break label323;
        this.dXi.R("settings_linkedin", bool1);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      super.onResume();
      return;
      localDialogPreference.setValue("male");
      break;
      localDialogPreference.setValue("female");
      break;
      bool3 = false;
      break label228;
      label317: bool4 = false;
      break label261;
      label323: Preference localPreference = this.dXi.BU("settings_linkedin");
      if (!com.tencent.mm.platformtools.ap.jb((String)com.tencent.mm.model.bg.qW().oQ().get(286721)));
      while (true)
      {
        if (bool1)
          break label382;
        localPreference.setSummary(getString(com.tencent.mm.n.cfM));
        break;
        bool1 = false;
      }
      label382: if ((0x400000 & x.pK()) == 0)
        localPreference.setSummary(getString(com.tencent.mm.n.cfN));
      else
        localPreference.setSummary(getString(com.tencent.mm.n.cfO));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsPersonalInfoUI
 * JD-Core Version:    0.6.2
 */