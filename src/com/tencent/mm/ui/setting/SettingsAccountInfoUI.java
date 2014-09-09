package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.f.c;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.q;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.PluginTextPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindqq.BindQQUI;
import com.tencent.mm.ui.dy;
import junit.framework.Assert;

public class SettingsAccountInfoUI extends MMPreference
  implements m, com.tencent.mm.sdk.f.as
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
  private SparseIntArray jMG = new SparseIntArray();
  private final String jMx = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe";
  private final String jMy = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=1";
  private final String jMz = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=0";
  private aa jlh;

  public SettingsAccountInfoUI()
  {
    this.jMG.put(0, com.tencent.mm.n.cfq);
    this.jMG.put(-82, com.tencent.mm.n.ceS);
    this.jMG.put(-83, com.tencent.mm.n.ceP);
    this.jMG.put(-84, com.tencent.mm.n.ceQ);
    this.jMG.put(-85, com.tencent.mm.n.ceJ);
    this.jMG.put(-86, com.tencent.mm.n.ceU);
  }

  private void aZj()
  {
    Preference localPreference = this.dXi.BU("settings_email_addr");
    Assert.assertNotNull(localPreference);
    String str = (String)bg.qW().oQ().get(5);
    Integer localInteger = (Integer)bg.qW().oQ().get(7);
    if ((localInteger != null) && ((0x2 & localInteger.intValue()) != 0))
    {
      localPreference.setSummary(com.tencent.mm.n.cfv);
      return;
    }
    if (str != null)
    {
      localPreference.setSummary(com.tencent.mm.n.cfu);
      return;
    }
    localPreference.setSummary(com.tencent.mm.n.ceI);
  }

  private void aZk()
  {
    Preference localPreference = this.dXi.BU("settings_username");
    String str1 = com.tencent.mm.model.x.pH();
    if (ch.jb(str1))
    {
      String str2 = com.tencent.mm.model.x.pG();
      if (com.tencent.mm.storage.i.yd(str2))
      {
        localPreference.setSummary(getString(com.tencent.mm.n.cgg));
        return;
      }
      localPreference.setSummary(str2);
      return;
    }
    localPreference.setSummary(str1);
  }

  private void aZl()
  {
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.dXi.BU("settings_safe_device");
    if (localIconSwitchKeyValuePreference == null)
    {
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "safedevicesate preference is null");
      return;
    }
    if (((Integer)bg.qW().oQ().get(9)).intValue() == 0)
    {
      z.d("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "not bind uin");
      this.dXi.R("settings_safe_device", true);
      return;
    }
    this.dXi.R("settings_safe_device", false);
    if (com.tencent.mm.model.x.pM())
    {
      localIconSwitchKeyValuePreference.setSummary(com.tencent.mm.n.cby);
      localIconSwitchKeyValuePreference.pW(1);
      return;
    }
    localIconSwitchKeyValuePreference.setSummary(com.tencent.mm.n.cbz);
    localIconSwitchKeyValuePreference.pW(2);
  }

  private void aZm()
  {
    Preference localPreference = this.dXi.BU("settings_facebook");
    if (localPreference == null)
    {
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "updateFacebook Preference null");
      return;
    }
    if (!com.tencent.mm.model.x.qa())
    {
      this.dXi.b(localPreference);
      return;
    }
    if (!com.tencent.mm.model.x.qc())
    {
      localPreference.setSummary(getString(com.tencent.mm.n.cfk));
      return;
    }
    localPreference.setSummary((String)bg.qW().oQ().get(65826));
  }

  private void aZn()
  {
    Preference localPreference = this.dXi.BU("settings_mobile");
    if (localPreference == null)
    {
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "updateMobile Preference null");
      return;
    }
    String str = (String)bg.qW().oQ().get(6);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "mobile :" + str);
    if ((str == null) || (str.length() <= 0))
    {
      localPreference.setSummary(getString(com.tencent.mm.n.cfk));
      return;
    }
    localPreference.setSummary(str);
  }

  private void aZo()
  {
    Preference localPreference = this.dXi.BU("settings_uin");
    if (localPreference == null)
    {
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "updateUin Preference null");
      return;
    }
    int i = ((Integer)bg.qW().oQ().get(9)).intValue();
    if (i == 0)
    {
      if (ch.ys())
      {
        this.dXi.R("settings_uin", true);
        return;
      }
      localPreference.setSummary(com.tencent.mm.n.cfk);
      return;
    }
    localPreference.setSummary(new com.tencent.mm.a.k(i));
  }

  private void aZp()
  {
    this.dXi.R("settings_room_right", true);
  }

  private void fV(boolean paramBoolean)
  {
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "handlePassword " + paramBoolean);
    if (paramBoolean)
    {
      if (this.jlh != null)
      {
        this.jlh.show();
        return;
      }
      this.jlh = com.tencent.mm.ui.base.e.a(this, null, this.fKA, new bo(this), new br(this));
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("kintent_hint", getString(com.tencent.mm.n.cfY));
    a.b(this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", localIntent);
  }

  protected final void DP()
  {
    oP(com.tencent.mm.n.cfe);
    this.dXi = aTL();
    this.fKA = View.inflate(this, com.tencent.mm.k.bmO, null);
    this.fKC = ((TextView)this.fKA.findViewById(com.tencent.mm.i.aOv));
    this.fKC.setText(getString(com.tencent.mm.n.cfH));
    this.fKD = ((EditText)this.fKA.findViewById(com.tencent.mm.i.aOu));
    this.fKD.setInputType(129);
    this.jME = getString(com.tencent.mm.n.ctM);
    a(new bk(this));
  }

  public final boolean DY()
  {
    return true;
  }

  public final int DZ()
  {
    return q.czU;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramx.getType());
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (paramx.getType() == 255)
      if ((paramInt1 == 0) && (paramInt2 == 0))
        fV(true);
    do
    {
      do
        return;
      while (dy.a(this, paramInt1, paramInt2, paramString, 4));
      fV(false);
      return;
      if (paramx.getType() == 384)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          bg.qW().oQ().set(77830, ((com.tencent.mm.modelsimple.as)paramx).wm());
          Intent localIntent = new Intent();
          localIntent.putExtra("kintent_hint", getString(com.tencent.mm.n.cfY));
          a.b(this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", localIntent);
          return;
        }
        this.jMF = true;
        com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.cgh, com.tencent.mm.n.buo, new bs(this));
        return;
      }
    }
    while ((paramx.getType() != 256) || (((paramInt1 != 0) || (paramInt2 != 0)) && (dy.a(this, paramInt1, paramInt2, paramString, 4))));
    int i = this.jMG.get(paramInt2);
    int j = com.tencent.mm.n.cfp;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    Object localObject = getString(j, arrayOfObject1);
    if (i != 0);
    try
    {
      String str = getString(i);
      localObject = str;
      com.tencent.mm.ui.base.e.aw(aPI(), (String)localObject);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(i);
        arrayOfObject2[1] = localException.getMessage();
        z.e("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "try get string by id %d, fail:%s", arrayOfObject2);
      }
    }
  }

  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    aZk();
    aZj();
    aZn();
    aZo();
    aZm();
    aZl();
    aZp();
    int i = ch.h(paramObject, 0);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Integer.valueOf(i);
    arrayOfObject1[2] = paramap;
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
    }
    while ((i != 135175) && (i != 135176))
    {
      Object[] arrayOfObject2;
      return;
    }
    aZp();
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str1 = paramPreference.getKey();
    z.i("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", str1 + " item has been clicked!");
    if (ch.jb(str1))
      return false;
    if ((str1.equals("settings_username")) && (ch.jb(com.tencent.mm.model.x.pH())))
      d(SettingsAliasUI.class);
    while (true)
    {
      return false;
      if (str1.equals("settings_facebook"))
      {
        d(FacebookAuthUI.class);
      }
      else
      {
        if (str1.equals("settings_email_addr"))
        {
          Integer localInteger = (Integer)bg.qW().oQ().get(7);
          if ((localInteger != null) && ((0x2 & localInteger.intValue()) != 0));
          for (int i = 1; ; i = 0)
          {
            String str6 = (String)bg.qW().oQ().get(5);
            if ((i == 0) && (ch.jb(str6)))
              break;
            startActivity(new Intent(aPI(), SettingsModifyEmailAddrUI.class));
            return true;
          }
          if (this.dWT != null)
          {
            z.w("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "do get email input, but tips dialog has not dismissed");
            this.dWT.dismiss();
            this.dWT = null;
          }
          String str7 = ch.Y(f.N(aPI()), "");
          com.tencent.mm.ui.base.e.a(aPI(), getString(com.tencent.mm.n.bmV), str7, getString(com.tencent.mm.n.cfV), new bl(this));
          return true;
        }
        if (str1.equals("settings_mobile"))
        {
          MMWizardActivity.j(this, new Intent(this, BindMContactIntroUI.class));
          return true;
        }
        if (str1.equals("settings_uin"))
        {
          MMWizardActivity.j(this, new Intent(this, BindQQUI.class));
          return true;
        }
        if (str1.equals("settings_about_vuser_about"))
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = y.aGW();
          String str5 = String.format("http://weixin.qq.com/cgi-bin/readtemplate?check=false&t=weixin_faq_verifyaccount&platform=android&lang=%s", arrayOfObject2);
          ch.t(aPI(), str5);
        }
        else if (str1.equals("settings_independent_password"))
        {
          if (this.jMF)
          {
            fV(true);
          }
          else
          {
            ad localad = new ad(1);
            bg.qX().d(localad);
            getString(com.tencent.mm.n.buo);
            this.dWT = com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.cfP), true, new bn(this, localad));
          }
        }
        else if (str1.equals("settings_safe_device"))
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
          if (str1.equals("settings_delete_account"))
          {
            startActivity(new Intent(this, SettingDeleteAccountAgreementUI.class));
          }
          else
          {
            if (str1.equals("settings_phone_security"))
            {
              Intent localIntent1 = new Intent();
              if (this.jMD == 0)
                localIntent1.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe");
              while (true)
              {
                com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
                Object[] arrayOfObject1 = new Object[1];
                arrayOfObject1[0] = Integer.valueOf(this.jMD);
                localn.d(10939, arrayOfObject1);
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
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    bg.qW().oQ().a(this);
    bg.qX().a(256, this);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    bg.qW().oQ().b(this);
    bg.qX().b(256, this);
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
    aZk();
    aZn();
    aZo();
    aZj();
    aZm();
    aZl();
    this.jMF = false;
    aZp();
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.dXi.BU("settings_phone_security");
    PluginTextPreference localPluginTextPreference;
    SelfVuserPreference localSelfVuserPreference;
    Preference localPreference1;
    if (localIconSwitchKeyValuePreference == null)
    {
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "phone_security preference is null");
      localPluginTextPreference = (PluginTextPreference)this.dXi.BU("settings_about_vusertitle");
      localSelfVuserPreference = (SelfVuserPreference)this.dXi.BU("settings_about_vuserinfo");
      localPreference1 = this.dXi.BU("settings_about_vuser_about");
      int i = ch.a((Integer)bg.qW().oQ().get(66049));
      if (i == 0)
        break label499;
      localPluginTextPreference.aTR();
      localPluginTextPreference.pY(com.tencent.mm.n.bDo);
      Bitmap localBitmap = com.tencent.mm.platformtools.b.c(at.qz().cI(i), 2.0F);
      localSelfVuserPreference.setIconDrawable(new BitmapDrawable(getResources(), localBitmap));
      localSelfVuserPreference.setText((String)bg.qW().oQ().get(66050));
    }
    while (true)
    {
      while (true)
      {
        Preference localPreference2 = this.dXi.BU("settings_about_domainmail");
        this.dXi.b(localPreference2);
        if (!ch.aHL())
        {
          this.dXi.BV("settings_security_center");
          this.dXi.BV("settings_security_center_tip");
        }
        super.onResume();
        return;
        try
        {
          String str = com.tencent.mm.f.e.or().getValue("ShowSecurityEntry");
          z.d("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "cfgShowSecurityEntry %s, return", new Object[] { str });
          if ((!ch.jb(str)) && (Integer.valueOf(str).intValue() == 1))
            break label386;
          this.dXi.R("settings_phone_security", true);
        }
        catch (Exception localException)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localException.getMessage();
          z.e("!44@/B4Tb64lLpJkrm2DE1IrT5lLf7UXebU7ctx2j391Ex8=", "exception in updatePhoneSecurityState, %s", arrayOfObject);
          this.dXi.R("settings_phone_security", true);
        }
      }
      break;
      label386: int j = this.jMD;
      this.dXi.R("settings_phone_security", false);
      localIconSwitchKeyValuePreference.pW(-1);
      if (u.d(aPI(), "com.tencent.qqpimsecure"))
        if (ch.am(aPI(), "com.tencent.qqpimsecure"))
        {
          localIconSwitchKeyValuePreference.setSummary(com.tencent.mm.n.bUK);
          this.jMD = 2;
        }
      while (true)
      {
        if (j == this.jMD)
          break label497;
        this.dXi.notifyDataSetChanged();
        break;
        localIconSwitchKeyValuePreference.setSummary(com.tencent.mm.n.bUL);
        this.jMD = 1;
        continue;
        localIconSwitchKeyValuePreference.setSummary(com.tencent.mm.n.bUM);
        this.jMD = 0;
      }
      label497: break;
      label499: this.dXi.b(localPluginTextPreference);
      this.dXi.b(localSelfVuserPreference);
      this.dXi.b(localPreference1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsAccountInfoUI
 * JD-Core Version:    0.6.2
 */