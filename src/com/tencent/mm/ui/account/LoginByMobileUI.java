package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileVerifyUI;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.widget.d;
import com.tencent.mm.z.c;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class LoginByMobileUI extends MMActivity
  implements m
{
  private String dmj = null;
  private String dyU = null;
  private String fUt;
  private EditText iOS;
  private LinearLayout iOT;
  private TextView iOU;
  private EditText iOV;
  private String iOW = null;
  private Button iOX;
  private com.tencent.mm.ui.account.mobile.a iOY = null;
  private Map iOZ = new HashMap();
  protected Map iPa = new HashMap();
  private boolean iPb = true;
  private cr iPc;
  private String iPd = null;
  private String iPe = null;
  private String iPf = "";

  private void goBack()
  {
    com.tencent.mm.plugin.a.b.jE(this.fUt);
    XF();
    finish();
  }

  protected final void DP()
  {
    this.iOZ.clear();
    String[] arrayOfString1 = getString(n.aoW).trim().split(",");
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String[] arrayOfString2 = arrayOfString1[i].trim().split(":");
      if (!this.iOZ.containsKey(arrayOfString2[0]))
        this.iOZ.put(arrayOfString2[0], arrayOfString2[1]);
      this.iPa.put(arrayOfString2[1], arrayOfString2[0]);
    }
    this.iOS = ((EditText)findViewById(i.aLD));
    this.iOT = ((LinearLayout)findViewById(i.aoX));
    this.iOU = ((TextView)findViewById(i.aoY));
    this.iOV = ((EditText)findViewById(i.aoW));
    this.iOX = ((Button)findViewById(i.aBc));
    String str1 = getString(n.bYT);
    if (com.tencent.mm.protocal.a.hrq)
      str1 = getString(n.age) + getString(n.bsA);
    Bt(str1);
    eB(false);
    this.iOS.addTextChangedListener(new d(this.iOS, null, 20));
    this.iOS.addTextChangedListener(new bg(this));
    this.iOV.addTextChangedListener(new bi(this));
    a(0, getString(n.btO), new bj(this));
    if ((!ch.jb(this.dyU)) || (!ch.jb(this.dmj)))
    {
      if ((this.dyU != null) && (!this.dyU.equals("")))
        this.iOU.setText(this.dyU);
      if ((this.dmj != null) && (!this.dmj.equals("")))
        this.iOV.setText("+" + this.dmj);
      if ((this.iOW == null) || (this.iOW.equals("")))
        break label589;
      this.iOS.setText(this.iOW);
    }
    while (true)
    {
      this.iOT.setOnClickListener(new bk(this));
      this.iOX.setVisibility(0);
      this.iOX.setOnClickListener(new bl(this));
      a(new bm(this));
      return;
      String str5 = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      z.d("!44@/B4Tb64lLpKVgPhdlV/s/nxSM0GySNow+LXO7YA0SYc=", "tm.getSimCountryIso()" + str5);
      if (ch.jb(str5))
      {
        z.e("!44@/B4Tb64lLpKVgPhdlV/s/nxSM0GySNow+LXO7YA0SYc=", "getDefaultCountryInfo error");
        break;
      }
      c localc = com.tencent.mm.z.b.b(this, str5, getString(n.aoW));
      if (localc == null)
      {
        z.e("!44@/B4Tb64lLpKVgPhdlV/s/nxSM0GySNow+LXO7YA0SYc=", "getDefaultCountryInfo error");
        break;
      }
      this.dyU = localc.dyU;
      this.dmj = localc.dyT;
      break;
      label589: String str2 = ((TelephonyManager)getSystemService("phone")).getLine1Number();
      if ((str2 != null) && (!str2.equals("")) && (!ch.jb(this.dmj)))
      {
        String str3 = str2.trim();
        if (str3.startsWith("+" + this.dmj))
        {
          String str4 = "+" + this.dmj;
          this.iOS.setText(str3.substring(str4.length()));
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpKVgPhdlV/s/nxSM0GySNow+LXO7YA0SYc=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iPc != null)
    {
      this.iPc.dismiss();
      this.iPc = null;
    }
    if ((paramx.getType() == 380) && (this.iOY != null))
      this.iOY.a(this, paramInt1, paramInt2, paramString, paramx);
    int i;
    do
    {
      do
        return;
      while (paramx.getType() != 145);
      i = ((ai)paramx).sg();
      if (i == 13)
      {
        if (paramInt2 == -41)
        {
          com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
          if (locala2 != null)
          {
            locala2.a(this, null, null);
            return;
          }
          e.b(this, n.bYE, n.bYF);
          return;
        }
        if (paramInt2 == -35)
        {
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("bindmcontact_mobile", this.iPd + " " + this.iPe);
          a(LoginIndepPass.class, localIntent2);
          return;
        }
        if (paramInt2 == -1)
        {
          int j = n.bJW;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(paramInt1);
          arrayOfObject[1] = Integer.valueOf(paramInt2);
          Toast.makeText(this, getString(j, arrayOfObject), 0).show();
          return;
        }
        if (paramInt2 == -34)
        {
          e.o(this, getString(n.bwp), "");
          return;
        }
        String str = ((ai)paramx).wn();
        if (!ch.jb(str))
          this.iPe = str.trim();
        this.iPe = be.AV(this.iPe);
        com.tencent.mm.plugin.a.b.jF(com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",L200_300," + com.tencent.mm.model.bg.eg("L200_300") + ",1");
        com.tencent.mm.d.a locala1 = com.tencent.mm.d.a.ct(paramString);
        if (locala1 != null)
        {
          locala1.a(this, new bo(this), new bq(this));
          return;
        }
        getString(n.buo);
        this.iPc = e.a(this, getString(n.bYw), true, new bh(this));
        ai localai = new ai(this.iPd + this.iPe, 16, "", 0, "");
        com.tencent.mm.model.bg.qX().d(localai);
        return;
      }
    }
    while (i != 16);
    if (paramInt2 == -41)
    {
      e.b(this, n.bYE, n.bYF);
      return;
    }
    if (paramInt2 == -75)
    {
      e.o(this, getString(n.bsC), "");
      return;
    }
    com.tencent.mm.plugin.a.b.jE("L3");
    com.tencent.mm.plugin.a.b.jF(com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",L3," + com.tencent.mm.model.bg.eg("L3") + ",1");
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("bindmcontact_mobile", this.iPd + " " + this.iOS.getText().toString());
    localIntent1.putExtra("bindmcontact_shortmobile", this.iPe);
    localIntent1.putExtra("country_name", this.dyU);
    localIntent1.putExtra("couttry_code", this.dmj);
    localIntent1.putExtra("login_type", 3);
    localIntent1.putExtra("mobileverify_countdownsec", ((ai)paramx).wp());
    localIntent1.putExtra("mobileverify_countdownstyle", ((ai)paramx).wq());
    localIntent1.putExtra("mobileverify_fb", ((ai)paramx).wr());
    a(MobileVerifyUI.class, localIntent1);
  }

  protected final int getLayoutId()
  {
    return k.bhn;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    default:
    case 100:
    }
    do
    {
      return;
      this.dyU = ch.Y(paramIntent.getStringExtra("country_name"), "");
      this.dmj = ch.Y(paramIntent.getStringExtra("couttry_code"), "");
      if (!this.dyU.equals(""))
        this.iOU.setText(this.dyU);
    }
    while (this.dmj.equals(""));
    this.iOV.setText("+" + this.dmj);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    aPU();
    this.dyU = ch.Y(getIntent().getStringExtra("country_name"), "");
    this.dmj = ch.Y(getIntent().getStringExtra("couttry_code"), "");
    this.iOW = ch.Y(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.fUt = com.tencent.mm.plugin.a.b.DL();
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
    com.tencent.mm.model.bg.qX().b(145, this);
    com.tencent.mm.model.bg.qX().b(380, this);
    com.tencent.mm.plugin.a.b.b(false, com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",L200_100," + com.tencent.mm.model.bg.eg("L200_100") + ",2");
  }

  public void onResume()
  {
    super.onResume();
    com.tencent.mm.model.bg.qX().a(380, this);
    com.tencent.mm.model.bg.qX().a(145, this);
    com.tencent.mm.plugin.a.b.b(true, com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",L200_100," + com.tencent.mm.model.bg.eg("L200_100") + ",1");
    com.tencent.mm.plugin.a.b.jD("L200_100");
    this.iOV.setSelection(this.iOV.getText().toString().length());
    aep();
  }

  public void setRequestedOrientation(int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.LoginByMobileUI
 * JD-Core Version:    0.6.2
 */