package com.tencent.mm.ui.account.bind;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.friend.ct;
import com.tencent.mm.z.b;
import com.tencent.mm.z.c;

public class BindMobileUI extends MMWizardActivity
{
  private String cTZ;
  private String dmj = null;
  private String dyU = null;
  private TextView fpj;
  private LinearLayout iOT;
  private TextView iOU;
  private String iOW = null;
  private EditText iTC;
  private TextView iTD;
  private ct iTE;
  private Button iTF;
  private TextView iTG;
  private TextView iTH;
  private CheckBox iTI;
  private CheckBox iTJ;
  private LinearLayout iTK;
  private ImageView iTL;
  private boolean iTM;
  private BindWordingContent iTw;
  private int iTx;

  protected final void DP()
  {
    this.iTC = ((EditText)findViewById(com.tencent.mm.i.aiW));
    this.iOT = ((LinearLayout)findViewById(com.tencent.mm.i.aoX));
    this.iOU = ((TextView)findViewById(com.tencent.mm.i.aoY));
    this.iTD = ((TextView)findViewById(com.tencent.mm.i.aoW));
    this.fpj = ((TextView)findViewById(com.tencent.mm.i.aja));
    this.iTF = ((Button)findViewById(com.tencent.mm.i.aiI));
    this.iTG = ((TextView)findViewById(com.tencent.mm.i.aiX));
    this.fpj.setText(getString(n.bwz));
    this.iTH = ((TextView)findViewById(com.tencent.mm.i.aiJ));
    this.iTK = ((LinearLayout)findViewById(com.tencent.mm.i.aiZ));
    this.iTJ = ((CheckBox)findViewById(com.tencent.mm.i.aiS));
    this.iTI = ((CheckBox)findViewById(com.tencent.mm.i.aiR));
    this.iTL = ((ImageView)findViewById(com.tencent.mm.i.aiV));
    if (this.iTw != null)
    {
      if ((this.iTw.title != null) && (this.iTw.title.length() > 0))
        this.fpj.setText(this.iTw.title);
      if ((this.iTw.content != null) && (this.iTw.content.length() > 0))
        this.iTH.setText(this.iTw.content);
    }
    switch (this.iTw.dBZ.intValue())
    {
    default:
      switch (this.iTx)
      {
      default:
        label328: if ((ch.jb(this.dyU)) && (ch.jb(this.dmj)));
        break;
      case 0:
      case 1:
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      if ((this.dyU != null) && (!this.dyU.equals("")))
        this.iOU.setText(this.dyU);
      if ((this.dmj != null) && (!this.dmj.equals("")))
        this.iTD.setText("+" + this.dmj);
      if ((this.iOW != null) && (!this.iOW.equals("")))
        this.iTC.setText(this.iOW);
      this.iTF.setOnClickListener(new f(this));
      this.iTG.setOnClickListener(new g(this));
      if (this.iTM)
      {
        oP(n.bwe);
        this.iTL.setVisibility(8);
        this.fpj.setText(n.bwu);
        this.iTK.setVisibility(8);
        this.iTJ.setVisibility(8);
        this.iTJ.setChecked(false);
        this.iTI.setVisibility(0);
        this.iTI.setChecked(false);
        this.iTH.setVisibility(8);
        this.iTH.setText(getString(n.bwf));
        this.iTG.setVisibility(8);
        this.iTF.setText(n.bwe);
        a(new h(this));
      }
      this.iOT.setOnClickListener(new i(this));
      this.iOT.setOnClickListener(new j(this));
      return;
      this.iTL.setImageResource(com.tencent.mm.h.Sp);
      break;
      this.iTL.setImageResource(com.tencent.mm.h.Ss);
      break;
      this.iTL.setImageResource(com.tencent.mm.h.Sq);
      break;
      this.iTK.setVisibility(0);
      this.iTJ.setVisibility(0);
      this.iTH.setVisibility(8);
      break label328;
      this.iTK.setVisibility(8);
      this.iTJ.setVisibility(8);
      this.iTH.setVisibility(0);
      break label328;
      String str = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      z.d("!32@/B4Tb64lLpJ7jzBwffYq6Py9Ymp9J5pb", "tm.getSimCountryIso()" + str);
      if (ch.jb(str))
      {
        z.e("!32@/B4Tb64lLpJ7jzBwffYq6Py9Ymp9J5pb", "getDefaultCountryInfo error");
      }
      else
      {
        c localc = b.b(this, str, getString(n.aoW));
        if (localc == null)
        {
          z.e("!32@/B4Tb64lLpJ7jzBwffYq6Py9Ymp9J5pb", "getDefaultCountryInfo error");
        }
        else
        {
          this.dyU = localc.dyU;
          this.dmj = localc.dyT;
        }
      }
    }
  }

  protected final int getLayoutId()
  {
    return k.bbA;
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
    oP(n.bwA);
    this.dyU = ch.Y(getIntent().getStringExtra("country_name"), "");
    this.dmj = ch.Y(getIntent().getStringExtra("couttry_code"), "");
    this.iOW = ch.Y(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.iTw = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.iTx = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.iTM = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
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
      aQl();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.BindMobileUI
 * JD-Core Version:    0.6.2
 */