package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.f.c;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.n;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;

public class SettingsAboutSystemUI extends MMPreference
{
  private o dXi;
  private boolean ekQ = false;
  private ProgressDialog hqQ = null;

  private void a(LinearLayout paramLinearLayout, int paramInt, float paramFloat1, float paramFloat2, View.OnClickListener paramOnClickListener)
  {
    TextView localTextView = (TextView)View.inflate(aPI(), k.bkQ, null);
    localTextView.setText(paramInt);
    localTextView.setTextSize(1, SetTextSizeUI.ae(paramFloat1));
    localTextView.setTag(Float.valueOf(paramFloat1));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramFloat1 == paramFloat2)
      localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZL, 0);
  }

  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    TextView localTextView = (TextView)View.inflate(aPI(), k.bkQ, null);
    localTextView.setText(paramInt1);
    localTextView.setTag(Integer.valueOf(paramInt2));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramBoolean)
      localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZL, 0);
  }

  private void aYU()
  {
    boolean bool = ch.a((Boolean)com.tencent.mm.model.bg.qW().oQ().get(-2046825377), false);
    IconPreference localIconPreference = (IconPreference)this.dXi.BU("settings_plugins");
    if (bool)
    {
      localIconPreference.pT(0);
      localIconPreference.aq(getString(n.btN), h.Xq);
    }
    while (true)
    {
      this.dXi.notifyDataSetChanged();
      return;
      localIconPreference.pT(8);
      localIconPreference.aq("", -1);
    }
  }

  private void aZg()
  {
    Preference localPreference = this.dXi.BU("settings_text_size");
    if (localPreference != null)
      localPreference.setSummary(getString(SetTextSizeUI.cC(this)));
    this.dXi.notifyDataSetChanged();
  }

  private void aZh()
  {
    boolean bool1 = true;
    if (ch.xy(com.tencent.mm.f.e.or().getValue("SilentDownloadApkAtWiFi")) != 0);
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      if ((0x1 & l.cFr) != 0)
      {
        z.d("!44@/B4Tb64lLpJkrm2DE1IrT+BSAsOwccJqRYDj4eEZzt8=", "channel pack, not silence download.");
        bool2 = bool1;
      }
      if (!bool2)
        break;
      this.dXi.R("settings_silence_update_mode", bool1);
      return;
    }
    this.dXi.R("settings_silence_update_mode", false);
    Preference localPreference;
    if ((0x1000000 & ((Integer)com.tencent.mm.model.bg.qW().oQ().get(7, Integer.valueOf(0))).intValue()) == 0)
    {
      localPreference = this.dXi.BU("settings_silence_update_mode");
      if (!bool1)
        break label142;
    }
    label142: for (int i = n.cgY; ; i = n.cgX)
    {
      localPreference.setSummary(getString(i));
      this.dXi.notifyDataSetChanged();
      return;
      bool1 = false;
      break;
    }
  }

  private void aZi()
  {
    int i = ch.a((Integer)com.tencent.mm.model.bg.qW().oQ().get(327681), 1);
    int j;
    if ((1 == i) || (3 == i))
      j = n.cez;
    while (true)
    {
      Preference localPreference = this.dXi.BU("settings_auto_get_img");
      if ((localPreference != null) && (j != 0))
        localPreference.setSummary(getString(j));
      this.dXi.notifyDataSetChanged();
      return;
      if (2 == i)
      {
        j = n.cex;
      }
      else
      {
        j = 0;
        if (4 == i)
          j = n.cew;
      }
    }
  }

  protected final void DP()
  {
    oP(n.cfd);
    this.dXi = aTL();
    if (!com.tencent.mm.am.a.to("scanner"))
      this.dXi.R("settings_WebWX", true);
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences(ak.aHi(), 0);
    if (v.dNC.dLk == 1);
    for (boolean bool = false; ; bool = true)
    {
      if (!localSharedPreferences.contains("settings_voicerecorder_mode"))
      {
        localSharedPreferences.edit().putBoolean("settings_voicerecorder_mode", bool).commit();
        ((CheckBoxPreference)this.dXi.BU("settings_voicerecorder_mode")).setChecked(bool);
        this.dXi.notifyDataSetChanged();
      }
      a(new at(this));
      this.dXi.R("settings_WebWX", com.tencent.mm.am.a.aCl());
      if (!com.tencent.mm.am.a.to("backup"))
        this.dXi.R("settings_bak_chat", true);
      aYU();
      this.dXi.R("settings_traffic_statistic", com.tencent.mm.am.a.aCl());
      return;
    }
  }

  public final int DZ()
  {
    return q.cAa;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str.equals("settings_landscape_mode"))
      if (aTM().getBoolean("settings_landscape_mode", false))
        setRequestedOrientation(-1);
    CheckBoxPreference localCheckBoxPreference;
    do
    {
      while (true)
      {
        return true;
        setRequestedOrientation(1);
        return true;
        if (!str.equals("settings_voicerecorder_mode"))
          break;
        int i3 = v.dNC.dLk;
        boolean bool12 = false;
        if (i3 == 1);
        while (!aTM().getBoolean("settings_voicerecorder_mode", bool12))
        {
          com.tencent.mm.ui.base.e.a(aPI(), n.chz, n.buo, new ba(this), new bb(this));
          return true;
          bool12 = true;
        }
      }
      if (str.equals("settings_voice_play_mode"))
      {
        boolean bool9 = ((Boolean)com.tencent.mm.model.bg.qW().oQ().get(26, Boolean.valueOf(false))).booleanValue();
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Boolean.valueOf(bool9);
        if (!bool9);
        for (boolean bool10 = true; ; bool10 = false)
        {
          arrayOfObject2[1] = Boolean.valueOf(bool10);
          z.d("!44@/B4Tb64lLpJkrm2DE1IrT+BSAsOwccJqRYDj4eEZzt8=", "set voice mode from %B to %B", arrayOfObject2);
          com.tencent.mm.storage.e locale = com.tencent.mm.model.bg.qW().oQ();
          boolean bool11 = false;
          if (!bool9)
            bool11 = true;
          locale.set(26, Boolean.valueOf(bool11));
          return true;
        }
      }
      if (!str.equals("settings_enter_button_send"))
        break;
      localCheckBoxPreference = (CheckBoxPreference)this.dXi.BU("settings_enter_button_send");
    }
    while (localCheckBoxPreference == null);
    boolean bool8 = localCheckBoxPreference.isChecked();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Boolean.valueOf(bool8);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT+BSAsOwccJqRYDj4eEZzt8=", "set enter button send : %s", arrayOfObject1);
    com.tencent.mm.model.bg.qW().oQ().set(66832, Boolean.valueOf(bool8));
    return true;
    if (str.equals("settings_nav_tab_pos"))
    {
      ad localad1 = new ad(aPI());
      localad1.e(n.bsK, null);
      localad1.pn(n.cEc);
      View localView1 = View.inflate(aPI(), k.bim, null);
      localView1.findViewById(i.aSX).setVisibility(8);
      LinearLayout localLinearLayout1 = (LinearLayout)localView1.findViewById(i.aSn);
      bc localbc = new bc(this, localLinearLayout1);
      boolean bool1 = getSharedPreferences(ak.aHi(), 0).getBoolean("settings_nav_tab_pos", true);
      int i = n.cEe;
      if (!bool1);
      for (boolean bool2 = true; ; bool2 = false)
      {
        a(localLinearLayout1, i, 0, bool2, localbc);
        a(localLinearLayout1, n.cEd, 1, bool1, localbc);
        localad1.ao(localView1);
        aa localaa1 = localad1.aRB();
        localLinearLayout1.setTag(localaa1);
        localaa1.show();
        a(localaa1);
        return true;
      }
    }
    if (str.equals("settings_silence_update_mode"))
    {
      ad localad2 = new ad(aPI());
      localad2.e(n.bsK, null);
      localad2.pn(n.cgW);
      View localView2 = View.inflate(aPI(), k.bim, null);
      localView2.findViewById(i.aSX).setVisibility(8);
      LinearLayout localLinearLayout2 = (LinearLayout)localView2.findViewById(i.aSn);
      be localbe = new be(this, localLinearLayout2);
      boolean bool3;
      int j;
      if ((0x1000000 & ((Integer)com.tencent.mm.model.bg.qW().oQ().get(7, Integer.valueOf(0))).intValue()) == 0)
      {
        bool3 = true;
        a(localLinearLayout2, n.cgY, 0, bool3, localbe);
        j = n.cgX;
        if (bool3)
          break label720;
      }
      label720: for (boolean bool4 = true; ; bool4 = false)
      {
        a(localLinearLayout2, j, 1, bool4, localbe);
        localad2.ao(localView2);
        aa localaa2 = localad2.aRB();
        localLinearLayout2.setTag(localaa2);
        localaa2.show();
        a(localaa2);
        return true;
        bool3 = false;
        break;
      }
    }
    if (str.equals("settings_language"))
    {
      startActivity(new Intent(aPI(), SettingsLanguageUI.class));
      return true;
    }
    if (str.equals("settings_text_size"))
    {
      ad localad3 = new ad(aPI());
      localad3.e(n.bsK, null);
      localad3.BK(getString(n.che));
      View localView3 = View.inflate(aPI(), k.bim, null);
      localView3.findViewById(i.aSX).setVisibility(8);
      LinearLayout localLinearLayout3 = (LinearLayout)localView3.findViewById(i.aSn);
      float f = SetTextSizeUI.cB(aPI());
      ay localay = new ay(this, localLinearLayout3, f);
      a(localLinearLayout3, n.ceG, 0.875F, f, localay);
      a(localLinearLayout3, n.ceF, 1.0F, f, localay);
      a(localLinearLayout3, n.ceE, 1.125F, f, localay);
      a(localLinearLayout3, n.ceH, 1.25F, f, localay);
      a(localLinearLayout3, n.ceD, 1.375F, f, localay);
      localad3.ao(localView3);
      aa localaa3 = localad3.aRB();
      localLinearLayout3.setTag(localaa3);
      localaa3.show();
      a(localaa3);
      return true;
    }
    if (str.equals("settings_auto_get_img"))
    {
      ad localad4 = new ad(aPI());
      localad4.eN(false);
      localad4.e(n.bsK, null);
      localad4.pn(n.cfi);
      View localView4 = View.inflate(aPI(), k.bim, null);
      LinearLayout localLinearLayout4 = (LinearLayout)localView4.findViewById(i.aSn);
      ((TextView)localView4.findViewById(i.aSX)).setText(n.cey);
      int k = ch.a((Integer)com.tencent.mm.model.bg.qW().oQ().get(327681), 1);
      if (3 == k)
        k = 1;
      bg localbg = new bg(this, localLinearLayout4, k);
      int m = n.cew;
      boolean bool5;
      boolean bool6;
      label1151: int i1;
      if (4 == k)
      {
        bool5 = true;
        a(localLinearLayout4, m, 4, bool5, localbg);
        int n = n.cez;
        if (1 != k)
          break label1232;
        bool6 = true;
        a(localLinearLayout4, n, 1, bool6, localbg);
        i1 = n.cex;
        if (2 != k)
          break label1238;
      }
      label1232: label1238: for (boolean bool7 = true; ; bool7 = false)
      {
        a(localLinearLayout4, i1, 2, bool7, localbg);
        localad4.ao(localView4);
        aa localaa4 = localad4.aRB();
        localLinearLayout4.setTag(localaa4);
        localaa4.show();
        a(localaa4);
        return true;
        bool5 = false;
        break;
        bool6 = false;
        break label1151;
      }
    }
    if (str.equals("settings_bak_chat"))
    {
      int i2 = ((Integer)com.tencent.mm.model.bg.qW().oQ().get(68416, new Integer(0))).intValue();
      Intent localIntent4 = new Intent().setClassName(aPI(), "com.tencent.mm.plugin.backup.ui.BakChatUI");
      localIntent4.putExtra("downloadUin", i2);
      a(new ax(this), localIntent4, 10000);
      return true;
    }
    if (str.equals("settings_chatting_bg"))
    {
      Intent localIntent1 = new Intent();
      localIntent1.setClass(this, SettingsChattingBackgroundUI.class);
      aPI().startActivity(localIntent1);
      return true;
    }
    if (str.equals("settings_plugins"))
    {
      com.tencent.mm.model.bg.qW().oQ().set(-2046825377, Boolean.valueOf(false));
      Intent localIntent3 = new Intent();
      localIntent3.setClass(this, SettingsPluginsUI.class);
      startActivity(localIntent3);
      return true;
    }
    if (str.equals("settings_WebWX"))
    {
      if (com.tencent.mm.model.bg.qW().oJ())
      {
        com.tencent.mm.am.a.l(this, "webwx", ".ui.WebWXLogoutUI");
        return true;
      }
      com.tencent.mm.am.a.l(this, "webwx", ".ui.WebWeiXinIntroductionUI");
      return true;
    }
    if (str.equals("settings_reset"))
    {
      com.tencent.mm.ui.base.e.a(aPI(), getResources().getString(n.cgM), "", getString(n.bsM), getString(n.bsK), new au(this), null);
      return true;
    }
    if (str.equals("settings_emoji_manager"))
    {
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("10931", 2);
      com.tencent.mm.am.a.b(aPI(), "emoji", ".ui.EmojiMineUI", localIntent2);
      return true;
    }
    if (str.equals("settngs_clean"))
    {
      if (!com.tencent.mm.model.bg.qW().isSDCardAvailable())
      {
        en.cp(aPI());
        return true;
      }
      com.tencent.mm.am.a.b(aPI(), "clean", ".ui.CleanListUI", new Intent());
      return true;
    }
    if (str.equals("settings_traffic_statistic"))
    {
      startActivity(new Intent(this, SettingsNetStatUI.class));
      return true;
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onResume()
  {
    super.onResume();
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.dXi.BU("settings_voice_play_mode");
    if (localCheckBoxPreference1 != null)
    {
      localCheckBoxPreference1.setChecked(((Boolean)com.tencent.mm.model.bg.qW().oQ().get(26, Boolean.valueOf(false))).booleanValue());
      localCheckBoxPreference1.aTS();
    }
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.dXi.BU("settings_enter_button_send");
    if (localCheckBoxPreference2 != null)
    {
      localCheckBoxPreference2.setChecked(((Boolean)com.tencent.mm.model.bg.qW().oQ().get(66832, Boolean.valueOf(false))).booleanValue());
      localCheckBoxPreference2.aTS();
    }
    Preference localPreference = this.dXi.BU("settings_language");
    if (localPreference != null)
      localPreference.setSummary(SettingsLanguageUI.h(this));
    aZg();
    aYU();
    aZi();
    aZh();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsAboutSystemUI
 * JD-Core Version:    0.6.2
 */