package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.am;
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
public class RegByMobileRegUI extends MMActivity
  implements m
{
  private String dmj = null;
  private String dyU = null;
  private String fAX = null;
  private String fUt;
  private CheckBox hHm;
  private EditText iOS;
  private LinearLayout iOT;
  private TextView iOU;
  private EditText iOV;
  private String iOW = null;
  private Button iOX;
  private Map iOZ = new HashMap();
  protected Map iPa = new HashMap();
  private boolean iPb = true;
  private cr iPc;
  private String iPd = null;
  private String iPe = null;
  private String iPf = "";
  private String iQR = "";
  private int iQS = 2;
  private boolean iQT = false;
  private int iQp;
  private String iQq;
  private String iQr;
  private TextView iQs;
  private Button iQt;
  private int iQz = 0;

  private void afq()
  {
    com.tencent.mm.plugin.a.b.jE(this.fUt);
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
    this.iOV.setText(getString(n.bDJ));
    this.iOX = ((Button)findViewById(i.aBc));
    this.hHm = ((CheckBox)findViewById(i.aeS));
    this.iQs = ((TextView)findViewById(i.aeU));
    this.iQt = ((Button)findViewById(i.aeR));
    String str1 = getString(n.bYT);
    if (com.tencent.mm.protocal.a.hrq)
      str1 = str1 + getString(n.bsA);
    Bt(str1);
    this.hHm.setVisibility(8);
    this.hHm.setChecked(true);
    if (this.iQt != null)
      this.iQt.setOnClickListener(new fx(this));
    String str2 = getString(n.bPC);
    if (ch.aHL())
    {
      String str7 = getString(n.bPD);
      Spannable localSpannable2 = Spannable.Factory.getInstance().newSpannable(str2 + "  " + str7);
      localSpannable2.setSpan(new gh(this), str2.length() + "  ".length(), str2.length() + str7.length() + "  ".length(), 33);
      this.iQs.setText(localSpannable2);
      this.iQs.setMovementMethod(LinkMovementMethod.getInstance());
      this.iOS.addTextChangedListener(new d(this.iOS, null, 20));
      this.iOS.addTextChangedListener(new gk(this));
      this.iOS.setOnEditorActionListener(new gl(this));
      this.iOS.setOnKeyListener(new gm(this));
      this.iOV.addTextChangedListener(new gn(this));
      a(0, getString(n.btO), new go(this));
      eB(false);
      if ((ch.jb(this.dyU)) && (ch.jb(this.dmj)))
        break label949;
      label563: if ((this.dyU != null) && (!this.dyU.equals("")))
        this.iOU.setText(this.dyU);
      if ((this.dmj != null) && (!this.dmj.equals("")))
        this.iOV.setText("+" + this.dmj);
      if ((this.iOW == null) || (this.iOW.equals("")))
        break label1058;
      this.iOS.setText(this.iOW);
      label669: this.iOT.setOnClickListener(new fz(this));
      this.iOX.setVisibility(8);
      if ((this.iQp != 2) && (this.iQp != 1))
        break label1076;
      this.iOX.setVisibility(4);
      this.iQt.setVisibility(8);
      this.iQs.setVisibility(8);
    }
    while (true)
    {
      a(new gb(this));
      return;
      String str3 = getString(n.bPF);
      String str4 = getString(n.bPE);
      String str5 = getString(n.bsE);
      Spannable localSpannable1 = Spannable.Factory.getInstance().newSpannable(str2 + "  " + str3 + str5 + str4);
      localSpannable1.setSpan(new gi(this), str2.length() + "  ".length(), str2.length() + "  ".length() + str3.length(), 33);
      localSpannable1.setSpan(new gj(this), str2.length() + str3.length() + "  ".length() + str5.length(), str2.length() + str3.length() + "  ".length() + str5.length() + str4.length(), 33);
      this.iQs.setText(localSpannable1);
      break;
      label949: String str6 = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      z.d("!44@/B4Tb64lLpLrFBPJPItazaNmgOXmIzWtmmL1w55PObM=", "tm.getSimCountryIso()" + str6);
      if (ch.jb(str6))
      {
        z.e("!44@/B4Tb64lLpLrFBPJPItazaNmgOXmIzWtmmL1w55PObM=", "getDefaultCountryInfo error");
        break label563;
      }
      c localc = com.tencent.mm.z.b.b(this, str6, getString(n.aoW));
      if (localc == null)
      {
        z.e("!44@/B4Tb64lLpLrFBPJPItazaNmgOXmIzWtmmL1w55PObM=", "getDefaultCountryInfo error");
        break label563;
      }
      this.dyU = localc.dyU;
      this.dmj = localc.dyT;
      break label563;
      label1058: bg.qQ().a(new fy(this));
      break label669;
      label1076: if (this.iQp == 0)
        if (com.tencent.mm.z.b.ys())
        {
          if ((ch.xF("2013-11-30 00:00:00") >= 0L) || (ch.aHO() % 2 == 0))
          {
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Long.valueOf(System.currentTimeMillis());
            z.i("!44@/B4Tb64lLpLrFBPJPItazaNmgOXmIzWtmmL1w55PObM=", "has overtime:[%d]", arrayOfObject);
            this.iOX.setVisibility(4);
          }
          else
          {
            this.iQT = true;
            this.iOX.setText(n.bYC);
            this.iOX.setOnClickListener(new ga(this));
          }
        }
        else
          this.iOX.setVisibility(8);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpLrFBPJPItazaNmgOXmIzWtmmL1w55PObM=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iPc != null)
    {
      this.iPc.dismiss();
      this.iPc = null;
    }
    if (paramx.getType() == 132)
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (((ak)paramx).sg() == 1)
        {
          if (this.iQp != 2)
            break label292;
          com.tencent.mm.plugin.a.b.jE("L3");
        }
    label291: label292: int i;
    label1008: 
    do
    {
      do
      {
        do
        {
          break label291;
          break label291;
          break label291;
          Intent localIntent3 = new Intent();
          localIntent3.putExtra("bindmcontact_mobile", this.iPd + " " + this.iOS.getText().toString());
          localIntent3.putExtra("bindmcontact_shortmobile", this.iOS.getText().toString().trim());
          localIntent3.putExtra("country_name", this.dyU);
          localIntent3.putExtra("couttry_code", this.dmj);
          localIntent3.putExtra("login_type", this.iQp);
          if (this.iQp == 2)
            localIntent3.putExtra("mobile_verify_purpose", 3);
          while (true)
          {
            localIntent3.putExtra("regsetinfo_ticket", this.fAX);
            localIntent3.putExtra("regsetinfo_NextStep", this.iQR);
            localIntent3.putExtra("regsetinfo_NextStyle", this.iQS);
            a(MobileVerifyUI.class, localIntent3);
            finish();
            return;
            if (this.iQp != 0)
              break;
            com.tencent.mm.plugin.a.b.jE("R200_300");
            break;
            if (this.iQp == 0)
              localIntent3.putExtra("mobile_verify_purpose", 2);
          }
          int m = n.bwP;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(paramInt1);
          arrayOfObject2[1] = Integer.valueOf(paramInt2);
          Toast.makeText(this, getString(m, arrayOfObject2), 0).show();
          return;
          if (paramInt2 == -75)
          {
            e.b(this, n.bsD, n.bXV);
            return;
          }
        }
        while (paramx.getType() != 145);
        i = ((ai)paramx).sg();
        if (i != 12)
          break label1008;
        if ((paramInt2 == -41) || (paramInt2 == -59))
        {
          com.tencent.mm.d.a locala1 = com.tencent.mm.d.a.ct(paramString);
          if (locala1 != null)
          {
            locala1.a(this, null, null);
            return;
          }
          e.b(this, n.bYE, n.bYF);
          return;
        }
        if ((paramInt2 != -36) && (paramInt2 != -35) && (paramInt2 != -3))
          break;
        String str1 = ((ai)paramx).wn();
        if (!ch.jb(str1))
          this.iPe = str1.trim();
        this.iPe = be.AV(this.iPe);
        this.iQr = (this.iPd + this.iPe);
        if (this.iQp == 0)
          com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",R200_200," + bg.eg("R200_200") + ",1");
        while (true)
        {
          com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
          if (locala2 == null)
            break;
          locala2.a(this, new gd(this, paramInt2), new gf(this));
          return;
          if (this.iQp == 2)
            com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",F200_200," + bg.eg("F200_200") + ",1");
        }
        getString(n.buo);
        this.iPc = e.a(this, getString(n.bYw), true, new gg(this));
        String str2 = this.iPd + this.iPe;
        if (paramInt2 == -3);
        for (int j = 8; ; j = 14)
        {
          ai localai = new ai(str2, j, "", 0, "");
          bg.qX().d(localai);
          if (this.iQp != 0)
            break;
          com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",R200_200," + bg.eg("R200_200") + ",2");
          return;
        }
      }
      while (this.iQp != 2);
      com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",F200_200," + bg.eg("F200_200") + ",2");
      return;
      if (paramInt2 == -34)
      {
        e.o(this, getString(n.bwp), "");
        return;
      }
      int k = n.bwP;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(k, arrayOfObject1), 0).show();
      if (i == 14)
      {
        if (paramInt2 == -41)
        {
          e.b(this, n.bYE, n.bYF);
          return;
        }
        com.tencent.mm.plugin.a.b.jE("R200_300");
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("bindmcontact_mobile", this.iPd + " " + this.iOS.getText().toString());
        localIntent2.putExtra("bindmcontact_shortmobile", this.iPe);
        localIntent2.putExtra("country_name", this.dyU);
        localIntent2.putExtra("couttry_code", this.dmj);
        localIntent2.putExtra("login_type", this.iQp);
        localIntent2.putExtra("mobileverify_countdownsec", ((ai)paramx).wp());
        localIntent2.putExtra("mobileverify_countdownstyle", ((ai)paramx).wq());
        localIntent2.putExtra("mobileverify_fb", ((ai)paramx).wr());
        localIntent2.putExtra("mobileverify_reg_qq", ((ai)paramx).wt());
        localIntent2.putExtra("mobile_verify_purpose", 2);
        a(MobileVerifyUI.class, localIntent2);
      }
    }
    while (i != 8);
    if (paramInt2 == 0)
    {
      Intent localIntent1 = new Intent();
      localIntent1.putExtra("bindmcontact_mobile", this.iPd + " " + this.iOS.getText().toString());
      localIntent1.putExtra("bindmcontact_shortmobile", this.iPe);
      localIntent1.putExtra("country_name", this.dyU);
      localIntent1.putExtra("couttry_code", this.dmj);
      localIntent1.putExtra("login_type", this.iQp);
      localIntent1.putExtra("mobileverify_countdownsec", ((ai)paramx).wp());
      localIntent1.putExtra("mobileverify_countdownstyle", ((ai)paramx).wq());
      localIntent1.putExtra("mobileverify_fb", ((ai)paramx).wr());
      localIntent1.putExtra("mobileverify_reg_qq", ((ai)paramx).wt());
      localIntent1.putExtra("mobile_verify_purpose", 2);
      a(MobileVerifyUI.class, localIntent1);
      return;
    }
    e.b(this, n.bYE, n.bYF);
  }

  protected final int getLayoutId()
  {
    return k.blB;
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
    this.dyU = ch.Y(getIntent().getStringExtra("country_name"), "");
    this.dmj = ch.Y(getIntent().getStringExtra("couttry_code"), "");
    this.iOW = ch.Y(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.iQp = getIntent().getIntExtra("login_type", 0);
    this.fAX = getIntent().getStringExtra("regsetinfo_ticket");
    this.iQR = getIntent().getStringExtra("regsetinfo_NextStep");
    this.iQS = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
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
      afq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
    bg.qX().b(380, this);
    bg.qX().b(145, this);
    bg.qX().b(132, this);
    if (this.iQp == 0)
      if (this.iQT)
        com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",R1_with_email_entry," + bg.eg("R1_with_email_entry") + ",2");
    while (this.iQp != 2)
    {
      return;
      com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",R200_100," + bg.eg("R200_100") + ",2");
      return;
    }
    com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",F200_100," + bg.eg("F200_100") + ",2");
  }

  public void onResume()
  {
    super.onResume();
    bg.qX().a(380, this);
    bg.qX().a(145, this);
    bg.qX().a(132, this);
    if (this.iQp == 0)
      if (this.iQT)
      {
        com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",R1_with_email_entry," + bg.eg("R1_with_email_entry") + ",1");
        com.tencent.mm.plugin.a.b.jD("R1_with_email_entry");
      }
    while (true)
    {
      this.iOV.setSelection(this.iOV.getText().toString().length());
      aep();
      this.iQz = 0;
      return;
      com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",R200_100," + bg.eg("R200_100") + ",1");
      com.tencent.mm.plugin.a.b.jD("R200_100");
      continue;
      if (this.iQp == 2)
      {
        com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",F200_100," + bg.eg("F200_100") + ",1");
        com.tencent.mm.plugin.a.b.jD("F200_100");
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByMobileRegUI
 * JD-Core Version:    0.6.2
 */