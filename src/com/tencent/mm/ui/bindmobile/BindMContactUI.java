package com.tencent.mm.ui.bindmobile;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.friend.ct;
import java.util.Map;

public class BindMContactUI extends MMWizardActivity
{
  private String cTZ;
  private String dmj = null;
  private String dyU = null;
  private LinearLayout iOT;
  private TextView iOU;
  private String iOW = null;
  private EditText iTC;
  private TextView iTD;
  private ct iTE;
  private CheckBox iTI;
  private boolean iTU = false;
  private boolean iTW = false;
  private boolean jip = false;
  private boolean jjY = false;
  private TextView jki;
  private LinearLayout jkj;
  private boolean jkk = false;

  private void aUe()
  {
    if ((this.iTU) || (this.jjY))
    {
      iNc.clear();
      aQl();
      return;
    }
    int i;
    if (this.jkk)
    {
      i = n.cBS;
      if (!this.jkk)
        break label73;
    }
    label73: for (int j = n.cBT; ; j = n.bwt)
    {
      com.tencent.mm.ui.base.e.a(this, i, j, new ac(this), null);
      return;
      i = n.bws;
      break;
    }
  }

  protected final void DP()
  {
    this.iTU = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.jjY = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.iTW = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    this.jkk = getIntent().getBooleanExtra("is_bind_for_change_mobile", false);
    this.jip = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.iTC = ((EditText)findViewById(i.aiW));
    this.iOT = ((LinearLayout)findViewById(i.aoX));
    this.iOU = ((TextView)findViewById(i.aoY));
    this.iTD = ((TextView)findViewById(i.aoW));
    this.iTI = ((CheckBox)findViewById(i.aiT));
    this.jkj = ((LinearLayout)findViewById(i.aiU));
    this.jki = ((TextView)findViewById(i.aOP));
    String str1;
    String str2;
    String str3;
    if (this.jkk)
    {
      str1 = (String)bg.qW().oQ().get(6);
      if (!ch.jb(str1))
      {
        if (!str1.startsWith("+"))
          break label455;
        String str5 = be.AT(str1);
        str2 = str1.substring(1 + str5.length());
        str3 = str5;
        new be();
        String str4 = be.bC(str3, str2);
        this.jki.setText(getString(n.bwh, new Object[] { str4 }));
      }
    }
    if ((this.dyU != null) && (!this.dyU.equals("")))
      this.iOU.setText(this.dyU);
    if ((this.dmj != null) && (!this.dmj.equals("")))
      this.iTD.setText("+" + this.dmj);
    if ((this.iOW != null) && (!this.iOW.equals("")))
      this.iTC.setText(this.iOW);
    while (true)
    {
      if (com.tencent.mm.z.b.ys())
      {
        this.jkj.setVisibility(4);
        this.iTI.setChecked(true);
      }
      a(0, getString(n.btO), new ae(this));
      this.iTC.requestFocus();
      a(new af(this));
      this.iOT.setOnClickListener(new ag(this));
      return;
      label455: str2 = str1;
      str3 = "86";
      break;
      bg.qQ().a(new ad(this));
    }
  }

  protected final int getLayoutId()
  {
    return k.bbG;
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
    this.iTD.setText("+" + this.dmj);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bwC);
    this.dyU = ch.Y(getIntent().getStringExtra("country_name"), "");
    this.dmj = ch.Y(getIntent().getStringExtra("couttry_code"), "");
    this.iOW = ch.Y(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.iTE != null)
    {
      getContentResolver().unregisterContentObserver(this.iTE);
      this.iTE.recycle();
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      aUe();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.BindMContactUI
 * JD-Core Version:    0.6.2
 */