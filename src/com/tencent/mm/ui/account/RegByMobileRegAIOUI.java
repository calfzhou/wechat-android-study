package com.tencent.mm.ui.account;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cq;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileVerifyUI;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;
import java.util.HashMap;
import java.util.Map;

public class RegByMobileRegAIOUI extends MMActivity
  implements m
{
  private String dmj = null;
  private String dyU = null;
  private ImageView egy;
  private String fUt;
  private EditText iOS;
  private LinearLayout iOT;
  private TextView iOU;
  private String iOW = null;
  private Map iOZ = new HashMap();
  protected Map iPa = new HashMap();
  private boolean iPb = true;
  private cr iPc;
  private String iPd = null;
  private String iPe = null;
  private ResizeLayout iPs;
  private boolean iQA;
  private boolean iQB;
  private ScrollView iQC;
  private boolean iQD = false;
  private ProgressBar iQE;
  private aa iQF = null;
  private cm iQG = new fm(this);
  private ki iQH;
  private boolean iQI = false;
  private kj iQJ = new fn(this);
  private int iQK;
  private int iQL;
  private boolean iQM;
  private boolean iQN;
  private final int iQO = 128;
  private EditText iQn;
  private MMFormMobileInputView iQo;
  private int iQp;
  private String iQq;
  private String iQr;
  private TextView iQs;
  private Button iQt;
  private Button iQu;
  private MMFormInputView iQv;
  private boolean iQw = false;
  private ImageView iQx;
  private MMFormInputView iQy;
  private int iQz = 0;
  private int progress = 0;

  private void BB(String paramString)
  {
    try
    {
      if (this.iQH != null)
      {
        this.iQH.aQW();
        this.iQH = null;
      }
      if (!this.iQI)
      {
        this.iQI = true;
        Intent localIntent = new Intent();
        localIntent.putExtra("bindmcontact_mobile", this.iPd + " " + this.iOS.getText().toString());
        localIntent.putExtra("bindmcontact_shortmobile", this.iPe);
        localIntent.putExtra("country_name", this.dyU);
        localIntent.putExtra("couttry_code", this.dmj);
        localIntent.putExtra("login_type", this.iQp);
        localIntent.putExtra("mobileverify_countdownsec", this.iQK);
        localIntent.putExtra("mobileverify_countdownstyle", this.iQL);
        localIntent.putExtra("mobileverify_fb", this.iQM);
        localIntent.putExtra("mobileverify_reg_qq", this.iQN);
        localIntent.putExtra("kintent_nickname", this.iQy.getText().toString());
        localIntent.putExtra("kintent_password", this.iQv.getText().toString());
        localIntent.putExtra("kintent_hasavatar", this.iQw);
        localIntent.putExtra("mobile_verify_purpose", 2);
        if ((paramString != null) && (paramString.length() > 0))
          localIntent.putExtra("!32@/B4Tb64lLpKNhhU94SG29vC9zoVXGkMMIntent_sms_code", paramString);
        a(MobileVerifyUI.class, localIntent);
        finish();
      }
      return;
    }
    finally
    {
    }
  }

  private boolean a(Editable[] paramArrayOfEditable)
  {
    int i = paramArrayOfEditable.length;
    int j = 0;
    if (j < i)
    {
      Editable localEditable = paramArrayOfEditable[j];
      if ((localEditable != null) && (localEditable.toString().length() != 0));
    }
    for (int k = 0; ; k = 1)
    {
      if ((k != 0) && (this.iPb))
      {
        return true;
        j++;
        break;
      }
      return false;
    }
  }

  private void afq()
  {
    com.tencent.mm.plugin.a.b.jE(this.fUt);
    com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",RE200_100," + bg.eg("RE200_100") + ",2");
    finish();
  }

  private void pe(int paramInt)
  {
    switch (fp.iQm[(paramInt - 1)])
    {
    default:
      return;
    case 1:
      e.b(this, n.bYI, n.bYK);
      return;
    case 2:
      e.b(this, n.bYJ, n.bYK);
      return;
    case 3:
      e.b(this, n.cnJ, n.bti);
      return;
    case 4:
    }
    e.b(this, n.cnL, n.bti);
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
    this.iOT = ((LinearLayout)findViewById(i.aoX));
    this.iOU = ((TextView)findViewById(i.aoY));
    this.iQo = ((MMFormMobileInputView)findViewById(i.aLE));
    this.iOS = this.iQo.aRM();
    this.iQn = this.iQo.aRL();
    this.iQn.setText(getString(n.bDJ));
    this.iQs = ((TextView)findViewById(i.aeU));
    this.iQu = ((Button)findViewById(i.aLu));
    this.egy = ((ImageView)findViewById(i.aOB));
    this.iQx = ((ImageView)findViewById(i.aOD));
    this.iQv = ((MMFormInputView)findViewById(i.aLB));
    this.iQC = ((ScrollView)findViewById(i.aNb));
    this.iPs = ((ResizeLayout)findViewById(i.aMj));
    this.iQy = ((MMFormInputView)findViewById(i.aLw));
    this.iQy.aRJ().requestFocus();
    this.iPs.a(new ey(this));
    fk localfk = new fk(this);
    this.iQy.a(localfk);
    this.iQv.a(localfk);
    cq.rO();
    this.iQB = true;
    cq.rO();
    this.iQA = true;
    if (!this.iQA)
    {
      this.egy.setVisibility(8);
      this.iQx.setVisibility(8);
    }
    if (!this.iQB)
      this.iQv.setVisibility(8);
    String str1 = getString(n.bYT);
    if (com.tencent.mm.protocal.a.hrq)
      str1 = str1 + getString(n.bsA);
    Bt(str1);
    if (this.iQt != null)
      this.iQt.setOnClickListener(new fq(this));
    String str2 = getString(n.bPC);
    if (ch.aHL())
    {
      String str7 = getString(n.bPD);
      Spannable localSpannable2 = Spannable.Factory.getInstance().newSpannable(str2 + "  " + str7);
      localSpannable2.setSpan(new fr(this), str2.length() + "  ".length(), str2.length() + str7.length() + "  ".length(), 33);
      this.iQs.setText(localSpannable2);
      this.iQs.setMovementMethod(LinkMovementMethod.getInstance());
      this.iOS.addTextChangedListener(new fu(this));
      this.iQo.a(new fv(this));
      this.iQv.addTextChangedListener(new fw(this));
      this.iQy.addTextChangedListener(new ez(this));
      this.iQu.setOnClickListener(new fa(this));
      this.iQu.setEnabled(false);
      if ((ch.jb(this.dyU)) && (ch.jb(this.dmj)))
        break label1074;
      label706: if ((this.dyU != null) && (!this.dyU.equals("")))
        this.iOU.setText(this.dyU);
      if ((this.dmj != null) && (!this.dmj.equals("")))
        this.iQn.setText("+" + this.dmj);
      if ((this.iOW == null) || (this.iOW.equals("")))
        break label1186;
      this.iOS.setText(this.iOW);
    }
    while (true)
    {
      this.iOT.setOnClickListener(new fc(this));
      a(new fd(this));
      this.egy.setOnClickListener(new fe(this));
      bg.qQ().a(new ff(this));
      return;
      String str3 = getString(n.bPF);
      String str4 = getString(n.bPE);
      String str5 = getString(n.bsE);
      Spannable localSpannable1 = Spannable.Factory.getInstance().newSpannable(str2 + "  " + str3 + str5 + str4);
      localSpannable1.setSpan(new fs(this), str2.length() + "  ".length(), str2.length() + "  ".length() + str3.length(), 33);
      localSpannable1.setSpan(new ft(this), str2.length() + str3.length() + "  ".length() + str5.length(), str2.length() + str3.length() + "  ".length() + str5.length() + str4.length(), 33);
      this.iQs.setText(localSpannable1);
      break;
      label1074: String str6 = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      z.i("!44@/B4Tb64lLpLrFBPJPItazeC2EyRjy73us9HlrmPyGsI=", "tm.getSimCountryIso()" + str6);
      if (ch.jb(str6))
      {
        z.e("!44@/B4Tb64lLpLrFBPJPItazeC2EyRjy73us9HlrmPyGsI=", "getDefaultCountryInfo error");
        break label706;
      }
      com.tencent.mm.z.c localc = com.tencent.mm.z.b.b(this, str6, getString(n.aoW));
      if (localc == null)
      {
        z.e("!44@/B4Tb64lLpLrFBPJPItazeC2EyRjy73us9HlrmPyGsI=", "getDefaultCountryInfo error");
        break label706;
      }
      this.dyU = localc.dyU;
      this.dmj = localc.dyT;
      break label706;
      label1186: bg.qQ().a(new fb(this));
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpLrFBPJPItazeC2EyRjy73us9HlrmPyGsI=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iPc != null)
    {
      this.iPc.dismiss();
      this.iPc = null;
    }
    if (paramInt2 == -75)
      e.b(this, n.bsD, n.bXV);
    label752: 
    do
    {
      int i;
      do
      {
        return;
        if (paramx.getType() != 145)
          break label752;
        i = ((ai)paramx).sg();
        if (i != 12)
          break;
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
        if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
        {
          String str = ((ai)paramx).wn();
          if (!ch.jb(str))
            this.iPe = str.trim();
          this.iPe = be.AV(this.iPe);
          this.iQr = (this.iPd + this.iPe);
          com.tencent.mm.plugin.a.b.jD("RE200_100");
          com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",RE200_200," + bg.eg("RE200_200") + ",1");
          com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
          if (locala2 != null)
          {
            locala2.a(this, new fh(this), new fj(this));
            return;
          }
          getString(n.buo);
          this.iPc = e.a(this, getString(n.bYw), true, new fl(this));
          ai localai = new ai(this.iPd + this.iPe, 14, "", 0, "");
          bg.qX().d(localai);
          com.tencent.mm.plugin.a.b.jE("RE200_250");
          this.iQD = false;
          return;
        }
        if (paramInt2 == -34)
        {
          e.o(this, getString(n.bwp), "");
          return;
        }
      }
      while (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString));
      int k = n.bwP;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt1);
      arrayOfObject2[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(k, arrayOfObject2), 0).show();
      if (i == 14)
      {
        if ((paramInt2 != 0) && (paramString != null))
          break label778;
        this.iQK = ((ai)paramx).wp();
        this.iQL = ((ai)paramx).wq();
        this.iQM = ((ai)paramx).wr();
        this.iQN = ((ai)paramx).wt();
        if (this.iQH == null)
        {
          this.iQH = new ki(this, this.iQJ);
          this.iQH.aQV();
        }
        if (this.iQF != null)
          break label768;
        View localView = ((LayoutInflater)getSystemService("layout_inflater")).inflate(k.blz, null);
        this.iQE = ((ProgressBar)localView.findViewById(i.aIB));
        TextView localTextView = (TextView)localView.findViewById(i.aUC);
        this.iQF = e.a(this, false, getString(n.bwC), localView, "", "", null, null);
        localTextView.setText(this.iQn.getText().toString() + " " + this.iOS.getText().toString());
      }
      while (true)
      {
        this.progress = 0;
        this.iQE.setIndeterminate(false);
        this.iQG.sendEmptyMessage(10);
        if (!com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString))
          break;
        return;
        this.iQF.show();
      }
      if (paramInt2 == -41)
      {
        e.b(this, n.bYE, n.bYF);
        return;
      }
      if (paramInt2 == -34)
      {
        e.o(this, getString(n.bwp), "");
        return;
      }
    }
    while (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString));
    label768: label778: int j = n.bwP;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    Toast.makeText(this, getString(j, arrayOfObject1), 0).show();
  }

  protected final int getLayoutId()
  {
    return k.blC;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    default:
      Bitmap localBitmap = com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramIntent);
      if (localBitmap != null)
      {
        this.egy.setImageBitmap(localBitmap);
        this.iQw = true;
        this.iQx.setVisibility(8);
      }
      break;
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
    this.iQn.setText("+" + this.dmj);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dyU = ch.Y(getIntent().getStringExtra("country_name"), "");
    this.dmj = ch.Y(getIntent().getStringExtra("couttry_code"), "");
    this.iOW = ch.Y(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.iQp = getIntent().getIntExtra("login_type", 0);
    this.fUt = com.tencent.mm.plugin.a.b.DL();
    cq.rO();
    com.tencent.mm.plugin.a.b.eT(20);
    DP();
  }

  protected void onDestroy()
  {
    if (this.iQH != null)
    {
      this.iQH.aQW();
      this.iQH = null;
    }
    if (this.iQF != null)
      this.iQF.dismiss();
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
    com.tencent.mm.plugin.a.b.jD("RE200_100");
  }

  public void onResume()
  {
    super.onResume();
    bg.qX().a(380, this);
    bg.qX().a(145, this);
    bg.qX().a(132, this);
    com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",RE200_100," + bg.eg("RE200_100") + ",1");
    this.iQn.setSelection(this.iQn.getText().toString().length());
    aep();
    this.iQz = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByMobileRegAIOUI
 * JD-Core Version:    0.6.2
 */