package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.h;
import com.tencent.mm.k.i;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.q;
import com.tencent.mm.sandbox.updater.Updater;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSummaryPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;

public class SettingsAboutMicroMsgUI extends MMPreference
  implements m
{
  private o dXi;
  private ProgressDialog hqQ;
  private m iJL = null;
  private boolean jMa = false;
  private boolean jMb = false;
  private int jMc = 0;
  Intent jMd = null;
  private ay jMe;

  private void aZe()
  {
    this.dXi = aTL();
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(q.czT);
    SettingsAboutMMHeaderPreference localSettingsAboutMMHeaderPreference = (SettingsAboutMMHeaderPreference)this.dXi.BU("settings_about_mm_header");
    String str1 = l.v(aPI(), com.tencent.mm.protocal.a.hrn);
    if (com.tencent.mm.protocal.a.hrq)
      str1 = str1 + getString(n.bsA);
    localSettingsAboutMMHeaderPreference.setVersion(str1);
    if (l.iDv)
    {
      this.dXi.R("settings_update", true);
      this.dXi.R("settings_system_notice", true);
    }
    IconPreference localIconPreference1 = (IconPreference)this.dXi.BU("settings_update");
    IconPreference localIconPreference2;
    if (this.jMa)
    {
      localIconPreference1.pT(0);
      localIconPreference1.aq(getString(n.btN), h.Xq);
      int i = ap.a((Integer)bg.qW().oQ().get(12304));
      localIconPreference2 = (IconPreference)this.dXi.BU("settings_system_notice");
      if (i <= 0)
        break label453;
      localIconPreference2.pT(0);
      localIconPreference2.aq(String.valueOf(i), h.acu);
      label222: IconSummaryPreference localIconSummaryPreference = (IconSummaryPreference)this.dXi.BU("funtion_update");
      if ((!this.jMb) || (l.iDv))
        break label472;
      localIconSummaryPreference.aTF();
      String str2 = l.v(null, this.jMc);
      localIconSummaryPreference.aq(getString(n.btN), h.Xq);
      localIconSummaryPreference.setSummary(str2);
      localIconSummaryPreference.aTH();
      this.dXi.BV("funtion_check_update");
    }
    while (true)
    {
      Preference localPreference = this.dXi.BU("settings_market_ratings");
      if (localPreference != null)
      {
        this.jMd = new Intent("android.intent.action.VIEW", Uri.parse(l.iDr));
        if ((this.jMd == null) || (!ap.i(this, this.jMd)))
        {
          boolean bool = this.dXi.b(localPreference);
          z.d("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "removePreference settings_market_ratings :" + bool + " :" + localPreference.getSummary());
        }
      }
      if (!MMAppMgr.aCx())
        this.dXi.R("funtion_about_wechat", true);
      this.dXi.notifyDataSetChanged();
      return;
      localIconPreference1.aq("", -1);
      localIconPreference1.pT(8);
      break;
      label453: localIconPreference2.pT(8);
      localIconPreference2.aq("", -1);
      break label222;
      label472: this.dXi.BV("funtion_update");
    }
  }

  private boolean aZf()
  {
    try
    {
      if (this.jMd != null)
        aPI().startActivity(this.jMd);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
        z.e("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "start market activity.");
    }
  }

  protected final void DP()
  {
    oP(n.chB);
    a(new aj(this));
    aZe();
  }

  public final int DZ()
  {
    return q.czT;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "onSceneEnd " + paramInt2 + " errType " + paramInt1);
    com.tencent.mm.sandbox.a.a locala = (com.tencent.mm.sandbox.a.a)paramx;
    z.d("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "updateInfo.getDownloadUrls() " + locala.aMq());
    z.d("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "updateInfo.getPackVersion() " + locala.aMo());
    z.d("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "updateInfo.now getPackVersion() " + com.tencent.mm.protocal.a.hrn);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.jMc = locala.aMo();
      if ((this.jMc > 0) && (this.jMc > com.tencent.mm.protocal.a.hrn))
      {
        this.jMb = true;
        if (bg.qW().oD() != 0)
          i.Ck().d(262145, true);
      }
      while (true)
      {
        aZe();
        return;
        z.e("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "SubCoreHub.getNewBandage() uin not ready!");
        continue;
        this.jMb = false;
        if (bg.qW().oD() != 0)
          i.Ck().d(262145, false);
        else
          z.e("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "SubCoreHub.getNewBandage() uin not ready!");
      }
    }
    aZe();
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str1 = paramPreference.getKey();
    z.i("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", str1 + " item has been clicked!");
    if (str1.equals("settings_update"))
    {
      if (bg.qW().oD() != 0)
        i.Ck().d(262146, false);
      while (true)
      {
        int n = n.cfF;
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = y.aGW();
        arrayOfObject3[1] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
        String str4 = getString(n, arrayOfObject3);
        Intent localIntent5 = new Intent();
        localIntent5.putExtra("rawUrl", str4);
        localIntent5.putExtra("showShare", false);
        localIntent5.putExtra("show_bottom", false);
        com.tencent.mm.am.a.b(aPI(), "webview", ".ui.tools.WebViewUI", localIntent5);
        return true;
        z.e("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "SubCoreHub.getNewBandage() uin not ready!");
      }
    }
    if (str1.equals("funtion_update"))
    {
      int m = n.cfG;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = y.aGW();
      arrayOfObject2[1] = Integer.valueOf(this.jMc);
      String str3 = getString(m, arrayOfObject2);
      Intent localIntent4 = new Intent();
      localIntent4.putExtra("rawUrl", str3);
      localIntent4.putExtra("showShare", false);
      localIntent4.putExtra("show_bottom", false);
      com.tencent.mm.am.a.b(aPI(), "webview", ".ui.tools.WebViewUI", localIntent4);
      return true;
    }
    if (str1.equals("funtion_check_update"))
    {
      Updater.oo(16);
      if ((0x1 & l.cFr) != 0)
      {
        z.e("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "package has set external update mode");
        Uri localUri = Uri.parse(l.iDr);
        Intent localIntent3 = new Intent("android.intent.action.VIEW", localUri).addFlags(268435456);
        if ((localUri == null) || (localIntent3 == null) || (!ap.i(aPI(), localIntent3)))
        {
          z.e("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "parse market uri failed, jump to weixin.qq.com");
          startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456));
        }
        while (true)
        {
          return true;
          z.i("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "parse market uri ok");
          startActivity(localIntent3);
        }
      }
      com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", ap.CL()).commit();
      Updater.a(this, new as(this)).update(3);
      return true;
    }
    if (str1.equals("funtion_about_wechat"))
    {
      com.tencent.mm.sdk.platformtools.as.AP("show_whatsnew");
      MMAppMgr.f(this, 57005);
      return true;
    }
    if (str1.equals("settings_market_ratings"))
      return aZf();
    if (str1.equals("settings_system_notice"))
    {
      int i = ap.a((Integer)bg.qP().get(1));
      int j = ap.a((Integer)bg.qW().oQ().get(12304));
      int k = n.chd;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(i);
      arrayOfObject1[1] = Integer.valueOf(j);
      String str2 = getString(k, arrayOfObject1);
      if (str2 == null)
        return true;
      bg.qW().oQ().set(12304, Integer.valueOf(0));
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("title", getString(n.chc));
      localIntent2.putExtra("rawUrl", str2);
      localIntent2.putExtra("showShare", false);
      com.tencent.mm.am.a.b(aPI(), "webview", ".ui.tools.WebViewUI", localIntent2);
      return true;
    }
    if (str1.equals("settings_feedback"))
    {
      if ((!l.iDv) && (y.aGW().equals("zh_CN")))
      {
        z.d("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "using faq webpage");
        Intent localIntent1 = new Intent();
        localIntent1.putExtra("showShare", false);
        localIntent1.putExtra("rawUrl", getString(n.ctL));
        localIntent1.putExtra("show_feedback", true);
        com.tencent.mm.am.a.b(aPI(), "webview", ".ui.tools.WebViewUI", localIntent1);
      }
      while (true)
      {
        return true;
        aPI().startActivity(new Intent(this, SendFeedBackUI.class));
      }
    }
    if (str1.equals("settings_quit_wechat"))
    {
      com.tencent.mm.ui.base.e.a(aPI(), n.bRd, n.bRc, n.buB, n.btP, new ak(this), null);
      return true;
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (bg.qW().oD() != 0)
      this.jMa = i.Ck().cC(262146);
    while (true)
    {
      DP();
      bg.qX().a(11, this);
      com.tencent.mm.sandbox.a.a locala = new com.tencent.mm.sandbox.a.a(2);
      bg.qX().d(locala);
      return;
      z.e("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "SubCoreHub.getNewBandage() uin not ready!");
    }
  }

  public void onDestroy()
  {
    bg.qX().b(11, this);
    super.onDestroy();
  }

  public void onResume()
  {
    super.onResume();
    if (bg.qW().oD() != 0)
      this.jMa = i.Ck().cC(262146);
    while (true)
    {
      aZe();
      return;
      z.e("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "SubCoreHub.getNewBandage() uin not ready!");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsAboutMicroMsgUI
 * JD-Core Version:    0.6.2
 */