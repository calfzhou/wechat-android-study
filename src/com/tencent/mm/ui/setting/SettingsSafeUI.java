package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.modelsimple.as;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.dy;

public class SettingsSafeUI extends MMPreference
  implements m
{
  private ProgressDialog dWT;
  private o dXi;
  private View fKA;
  private TextView fKC;
  private EditText fKD;
  private final int jMA = 0;
  private final int jMB = 1;
  private final int jMC = 2;
  private int jMD = 0;
  private String jME;
  private boolean jMF;
  private final String jMx = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe";
  private final String jMy = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=1";
  private final String jMz = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=0";
  private aa jlh;

  private void fV(boolean paramBoolean)
  {
    z.d("!32@/B4Tb64lLpJkrm2DE1IrT16F+GBMX79L", "handlePassword " + paramBoolean);
    if (paramBoolean)
    {
      if (this.jlh != null)
      {
        this.jlh.show();
        return;
      }
      this.jlh = com.tencent.mm.ui.base.e.a(this, null, this.fKA, new eu(this), new ex(this));
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("kintent_hint", getString(com.tencent.mm.n.cfY));
    a.b(this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", localIntent);
  }

  protected final void DP()
  {
    oP(com.tencent.mm.n.fKk);
    this.dXi = aTL();
    this.fKA = View.inflate(this, k.bmO, null);
    this.fKC = ((TextView)this.fKA.findViewById(i.aOv));
    this.fKC.setText(getString(com.tencent.mm.n.cfH));
    this.fKD = ((EditText)this.fKA.findViewById(i.aOu));
    this.fKD.setInputType(129);
    this.jME = getString(com.tencent.mm.n.ctM);
    a(new es(this));
  }

  public final boolean DY()
  {
    return true;
  }

  public final int DZ()
  {
    return q.gQd;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!32@/B4Tb64lLpJkrm2DE1IrT16F+GBMX79L", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramx.getType());
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (paramx.getType() == 255)
      if ((paramInt1 == 0) && (paramInt2 == 0))
        fV(true);
    while (paramx.getType() != 384)
    {
      do
        return;
      while (dy.a(this, paramInt1, paramInt2, paramString, 4));
      fV(false);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bg.qW().oQ().set(77830, ((as)paramx).wm());
      return;
    }
    this.jMF = true;
    com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.cgh, com.tencent.mm.n.buo, new ey(this));
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str1 = paramPreference.getKey();
    z.i("!32@/B4Tb64lLpJkrm2DE1IrT16F+GBMX79L", str1 + " item has been clicked!");
    if (str1.equals("settings_independent_password"))
      if (this.jMF)
        fV(true);
    while (true)
    {
      return false;
      ad localad = new ad(1);
      bg.qX().d(localad);
      getString(com.tencent.mm.n.buo);
      this.dWT = com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.cfP), true, new et(this, localad));
      continue;
      if (str1.equals("settings_safe_device"))
      {
        String str3 = (String)bg.qW().oQ().get(6, "");
        String str4 = (String)bg.qW().oQ().get(4097, "");
        if (!ch.jb(str3))
        {
          a.l(this, "safedevice", ".ui.MySafeDeviceListUI");
        }
        else if (!ch.jb(str4))
        {
          Intent localIntent3 = new Intent(this, BindMContactIntroUI.class);
          localIntent3.putExtra("is_bind_for_safe_device", true);
          MMWizardActivity.j(this, localIntent3);
        }
        else
        {
          a.a(this, "safedevice", ".ui.BindSafeDeviceUI", new Intent());
        }
      }
      else
      {
        if (str1.equals("settings_room_right"))
        {
          a.l(this, "chatroom", ".ui.RoomRightUI");
          return true;
        }
        if (str1.equals("settings_phone_security"))
        {
          Intent localIntent1 = new Intent();
          if (this.jMD == 0)
            localIntent1.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe");
          while (true)
          {
            com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(this.jMD);
            localn.d(10939, arrayOfObject);
            localIntent1.putExtra("show_bottom", false);
            localIntent1.putExtra("showShare", false);
            a.b(aPI(), "webview", ".ui.tools.WebViewUI", localIntent1);
            break;
            if (this.jMD == 1)
              localIntent1.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=0");
            else if (this.jMD == 2)
              localIntent1.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=1");
          }
        }
        if (str1.equals("settings_security_center"))
        {
          ActionBarActivity localActionBarActivity = aPI();
          String str2 = this.jME;
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("rawUrl", str2);
          localIntent2.putExtra("showShare", false);
          localIntent2.putExtra("show_bottom", false);
          localIntent2.putExtra("needRedirect", false);
          localIntent2.putExtra("neverGetA8Key", true);
          localIntent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.hNg);
          localIntent2.putExtra("hardcode_general_ctrl", GeneralControlWrapper.hNd);
          a.b(localActionBarActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent2);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onPause()
  {
    super.onPause();
    bg.qX().b(255, this);
    bg.qX().b(384, this);
  }

  protected void onResume()
  {
    bg.qX().a(255, this);
    bg.qX().a(384, this);
    this.dXi.R("settings_room_right", true);
    if (!ch.aHL())
    {
      this.dXi.BV("settings_security_center");
      this.dXi.BV("settings_security_center_tip");
    }
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsSafeUI
 * JD-Core Version:    0.6.2
 */