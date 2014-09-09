package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.z.c;
import java.util.HashMap;
import java.util.Map;

public class MobileInputUI extends MMActivity
{
  protected String dmj = null;
  protected String dyU = null;
  protected String fUt;
  protected CheckBox hHm;
  protected EditText iOS;
  protected LinearLayout iOT;
  protected TextView iOU;
  protected EditText iOV;
  protected String iOW = null;
  protected Map iOZ = new HashMap();
  protected MMFormInputView iPU;
  protected Map iPa = new HashMap();
  protected boolean iPb = true;
  protected cr iPc;
  protected String iPd = null;
  protected String iPe = null;
  protected String iPf = "";
  protected EditText iPk;
  protected MMFormMobileInputView iQo;
  protected TextView iQs;
  protected Button iQt;
  protected Button iQu;
  protected TextView iRc;
  protected Button iUm;
  protected TextView iUn;
  protected View iUo;
  protected TextView iUp;
  private int iUq = 0;
  private ba iUr;

  private boolean aRa()
  {
    return this.iUq == 2;
  }

  private void aRb()
  {
    this.iPd = this.iQo.getCountryCode();
    this.iPe = this.iQo.aRK();
    XF();
    this.iUr.pg(az.iUu);
  }

  private void goBack()
  {
    this.iUr.pg(az.iUt);
    com.tencent.mm.plugin.a.b.jE(this.fUt);
    XF();
    finish();
  }

  protected final void DP()
  {
    this.iOZ.clear();
    String[] arrayOfString1 = getString(com.tencent.mm.n.aoW).trim().split(",");
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String[] arrayOfString2 = arrayOfString1[i].trim().split(":");
      if (!this.iOZ.containsKey(arrayOfString2[0]))
        this.iOZ.put(arrayOfString2[0], arrayOfString2[1]);
      this.iPa.put(arrayOfString2[1], arrayOfString2[0]);
    }
    this.iPU = ((MMFormInputView)findViewById(i.aOF));
    this.iPk = this.iPU.aRJ();
    this.iQo = ((MMFormMobileInputView)findViewById(i.aLE));
    this.iOS = this.iQo.aRM();
    this.iOS.requestFocus();
    this.iOV = this.iQo.aRL();
    this.iOT = ((LinearLayout)findViewById(i.aoX));
    this.iOU = ((TextView)findViewById(i.aoY));
    this.iUm = ((Button)findViewById(i.aBb));
    this.iUn = ((TextView)findViewById(i.aAZ));
    this.iUo = findViewById(i.aLt);
    this.hHm = ((CheckBox)findViewById(i.aeS));
    this.iQs = ((TextView)findViewById(i.aeU));
    this.iQt = ((Button)findViewById(i.aeR));
    this.iQu = ((Button)findViewById(i.aGg));
    this.iUp = ((TextView)findViewById(i.aLJ));
    this.iRc = ((TextView)findViewById(i.aEK));
    this.iPU.setVisibility(8);
    this.iUp.setVisibility(8);
    this.iQu.setVisibility(8);
    this.iUm.setVisibility(8);
    this.iUn.setVisibility(8);
    this.iUo.setVisibility(8);
    this.hHm.setVisibility(8);
    this.hHm.setChecked(true);
    String str1 = getString(com.tencent.mm.n.bYT);
    if (a.hrq)
      str1 = getString(com.tencent.mm.n.age) + getString(com.tencent.mm.n.bsA);
    Bt(str1);
    this.iOS.addTextChangedListener(new aq(this));
    this.iOS.setOnEditorActionListener(new ar(this));
    this.iOS.setOnKeyListener(new as(this));
    this.iQo.a(new at(this));
    a(0, getString(com.tencent.mm.n.btO), new au(this));
    eB(false);
    this.iQu.setEnabled(false);
    this.iQu.setOnClickListener(new av(this));
    if ((!ch.jb(this.dyU)) || (!ch.jb(this.dmj)))
    {
      if ((this.dyU != null) && (!this.dyU.equals("")))
        this.iOU.setText(this.dyU);
      if ((this.dmj != null) && (!this.dmj.equals("")))
        this.iOV.setText("+" + this.dmj);
      if ((this.iOW == null) || (this.iOW.equals("")))
        break label822;
      this.iOS.setText(this.iOW);
    }
    while (true)
    {
      this.iOT.setOnClickListener(new aw(this));
      a(new ax(this));
      return;
      String str2 = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      z.d("!32@/B4Tb64lLpKsMp00pgLFBvwwdeoRc43I", "tm.getSimCountryIso()" + str2);
      if (ch.jb(str2))
      {
        z.e("!32@/B4Tb64lLpKsMp00pgLFBvwwdeoRc43I", "getDefaultCountryInfo error");
        break;
      }
      c localc = com.tencent.mm.z.b.b(this, str2, getString(com.tencent.mm.n.aoW));
      if (localc == null)
      {
        z.e("!32@/B4Tb64lLpKsMp00pgLFBvwwdeoRc43I", "getDefaultCountryInfo error");
        break;
      }
      this.dyU = localc.dyU;
      this.dmj = localc.dyT;
      break;
      label822: if (this.iUq != 1)
        bg.qQ().a(new ay(this));
    }
  }

  protected final int getLayoutId()
  {
    return k.bjP;
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
    this.iUq = getIntent().getIntExtra("mobile_input_purpose", 0);
    switch (this.iUq)
    {
    default:
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.iUq);
      z.e("!32@/B4Tb64lLpKsMp00pgLFBvwwdeoRc43I", "wrong purpose %s", arrayOfObject);
      finish();
      return;
    case 1:
      this.iUr = new aa();
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      this.dyU = ch.Y(getIntent().getStringExtra("country_name"), "");
      this.dmj = ch.Y(getIntent().getStringExtra("couttry_code"), "");
      this.iOW = ch.Y(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
      this.fUt = com.tencent.mm.plugin.a.b.DL();
      DP();
      this.iUr.a(this);
      return;
      this.iUr = new ag();
      continue;
      this.iUr = new h();
      continue;
      this.iUr = new ag();
      continue;
      this.iUr = new n();
    }
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
    this.iUr.stop();
  }

  public void onResume()
  {
    super.onResume();
    this.iUr.start();
    this.iOV.setSelection(this.iOV.getText().toString().length());
    aep();
  }

  public void setRequestedOrientation(int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.MobileInputUI
 * JD-Core Version:    0.6.2
 */