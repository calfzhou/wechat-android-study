package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.c;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cq;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.widget.d;
import java.util.Timer;

public class MobileVerifyUI extends MMActivity
{
  protected String cTZ;
  private ContentResolver contentResolver;
  int dCP;
  protected ProgressDialog dWT = null;
  String dkB;
  String fUt;
  protected Button fqA;
  private Timer gXT;
  private String[] hda;
  SecurityImage iMR = null;
  private com.tencent.mm.pluginsdk.e.a iPu;
  private int iRq = 30;
  protected EditText iTQ;
  protected TextView iUA;
  String iUC;
  protected MMFormInputView iUZ;
  private int iUq;
  protected TextView iVa;
  protected TextView iVb;
  protected TextView iVc;
  protected ScrollView iVd;
  private ee iVe;
  private long iVf = 0L;
  private boolean iVg = false;
  private String iVh;
  private boolean iVi = false;
  Boolean iVj;
  Boolean iVk;
  protected boolean iVl = false;
  protected boolean iVm = false;
  protected int iVn = -1;
  private ed iVo;
  String iVp;

  private void aRd()
  {
    if (!this.iVg)
    {
      this.gXT = new Timer();
      this.iVg = true;
      this.iVf = this.iRq;
      dn localdn = new dn(this);
      this.gXT.schedule(localdn, 1000L, 1000L);
    }
  }

  private void aRe()
  {
    this.iVi = false;
    this.iVa.setEnabled(false);
    this.iVb.setVisibility(0);
    TextView localTextView = this.iVb;
    Resources localResources = getResources();
    int i = l.bqP;
    int j = this.iRq;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.iRq);
    localTextView.setText(localResources.getQuantityString(i, j, arrayOfObject));
    this.iVa.setVisibility(8);
    aRd();
    this.iVo.ph(ec.iVA);
    e.aw(this, getString(com.tencent.mm.n.bSG));
  }

  private void avZ()
  {
    XF();
    if (this.iTQ.getText().toString().trim().equals(""))
    {
      e.b(this, com.tencent.mm.n.bwW, com.tencent.mm.n.buo);
      return;
    }
    this.iVo.ph(ec.iVz);
  }

  private void goBack()
  {
    b.jE(this.fUt);
    if (!this.iVo.ph(ec.iVy))
      finish();
  }

  protected final void DP()
  {
    z.d("!32@/B4Tb64lLpKNhhU94SG29vC9zoVXGkMM", "init getintent mobile:" + this.cTZ);
    this.iUZ = ((MMFormInputView)findViewById(i.aje));
    this.iUZ.aRH();
    this.iUZ.aRI();
    this.iTQ = this.iUZ.aRJ();
    this.iVa = ((TextView)findViewById(i.aEP));
    this.iVb = ((TextView)findViewById(i.aEO));
    this.iUA = ((TextView)findViewById(i.ajc));
    this.iUA.setText(this.cTZ);
    this.cTZ = be.AV(this.cTZ);
    this.iVa.setText(getString(com.tencent.mm.n.bST));
    this.iVc = ((TextView)findViewById(i.ajf));
    this.fqA = ((Button)findViewById(i.aGg));
    this.iVd = ((ScrollView)findViewById(i.aNa));
    this.hda = getResources().getStringArray(c.ND);
    String str = getString(com.tencent.mm.n.bYD);
    this.iVc.setText(Html.fromHtml(str));
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new ds(this);
    this.iVb.setVisibility(0);
    TextView localTextView = this.iVb;
    Resources localResources = getResources();
    int i = l.bqP;
    int j = this.iRq;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.iRq);
    localTextView.setText(localResources.getQuantityString(i, j, arrayOfObject));
    aRd();
    this.iVi = false;
    this.iTQ.setFilters(arrayOfInputFilter);
    this.iTQ.addTextChangedListener(new d(this.iTQ, null, 12));
    this.fqA.setOnClickListener(new dt(this));
    this.fqA.setEnabled(false);
    this.iTQ.setTextSize(15.0F);
    this.iTQ.addTextChangedListener(new du(this));
    this.iVa.setOnClickListener(new dv(this));
    this.iVa.setEnabled(false);
    a(new dy(this));
    this.iTQ.setOnEditorActionListener(new dz(this));
    this.iTQ.setOnKeyListener(new ea(this));
  }

  public final void aPG()
  {
    if (aPF() == 1)
    {
      this.iVd.scrollTo(0, this.iVd.getChildAt(0).getMeasuredHeight() - this.iVd.getMeasuredHeight());
      return;
    }
    this.iVd.scrollTo(0, 0);
  }

  protected final void aRf()
  {
    Intent localIntent = new Intent(this, RegByMobileSetPwdUI.class);
    localIntent.putExtra("kintent_hint", getString(com.tencent.mm.n.cfY));
    startActivityForResult(localIntent, 0);
  }

  protected final int getLayoutId()
  {
    return k.bjR;
  }

  protected final boolean j(int paramInt1, int paramInt2, String paramString)
  {
    com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString);
    if ((locala != null) && (locala.cCB != 4))
    {
      locala.a(this, null, null);
      return true;
    }
    if (paramInt1 == 4);
    int i;
    switch (paramInt2)
    {
    default:
      switch (paramInt2)
      {
      default:
        i = 0;
      case -34:
      case -43:
      case -41:
      case -36:
      case -32:
      case -33:
      case -100:
      }
      break;
    case -1:
    case -75:
    }
    while (i != 0)
    {
      return true;
      if (bg.qX().tw() == 6)
      {
        e.b(this, com.tencent.mm.n.bUe, com.tencent.mm.n.bUd);
        return true;
      }
      com.tencent.mm.platformtools.ac.ae(this);
      return true;
      Toast.makeText(this, com.tencent.mm.n.bwp, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, com.tencent.mm.n.bwm, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, com.tencent.mm.n.bwo, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, com.tencent.mm.n.bwr, 0).show();
      i = 1;
      continue;
      e.a(this, getString(com.tencent.mm.n.bwS), "", new eb(this));
      i = 1;
      continue;
      e.a(this, com.tencent.mm.n.bwQ, com.tencent.mm.n.ajf, new dp(this));
      i = 1;
      continue;
      bg.re();
      ActionBarActivity localActionBarActivity = aPI();
      if (TextUtils.isEmpty(j.aGQ()));
      for (String str = com.tencent.mm.aq.a.p(aPI(), com.tencent.mm.n.bQZ); ; str = j.aGQ())
      {
        e.a(localActionBarActivity, str, aPI().getString(com.tencent.mm.n.buo), new dq(this), new dr(this));
        i = 1;
        break;
      }
    }
    com.tencent.mm.pluginsdk.e.n localn = new com.tencent.mm.pluginsdk.e.n(paramInt1, paramInt2, paramString);
    return this.iPu.a(this, localn);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cq.rO();
    this.iVk = Boolean.valueOf(true);
    this.iUq = getIntent().getIntExtra("mobile_verify_purpose", 0);
    this.iVp = getIntent().getStringExtra("!32@/B4Tb64lLpKNhhU94SG29vC9zoVXGkMMIntent_sms_code");
    this.iUC = getIntent().getStringExtra("kintent_password");
    this.dkB = getIntent().getStringExtra("kintent_nickname");
    this.iVj = Boolean.valueOf(getIntent().getBooleanExtra("kintent_hasavatar", false));
    switch (this.iUq)
    {
    default:
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.iUq);
      z.e("!32@/B4Tb64lLpKNhhU94SG29vC9zoVXGkMM", "wrong purpose %s", arrayOfObject);
      finish();
      return;
    case 1:
      this.iVo = new ce();
      String str = getString(com.tencent.mm.n.bwF);
      if (com.tencent.mm.protocal.a.hrq)
        str = getString(com.tencent.mm.n.age) + getString(com.tencent.mm.n.bsA);
      Bt(str);
      this.iRq = getIntent().getIntExtra("mobileverify_countdownsec", 30);
      this.iVl = getIntent().getBooleanExtra("mobileverify_fb", false);
      this.iVm = getIntent().getBooleanExtra("mobileverify_reg_qq", false);
      this.cTZ = getIntent().getExtras().getString("bindmcontact_mobile");
      this.fUt = b.DL();
      DP();
      this.iVo.a(this);
      if (this.iVp != null)
      {
        this.iTQ.setText(this.iVp);
        avZ();
      }
      break;
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      this.iPu = new com.tencent.mm.pluginsdk.e.a();
      return;
      this.iVo = new ct();
      if ((this.iUC != null) && (this.iUC.length() >= 4))
      {
        this.dCP = 1;
        break;
      }
      this.dCP = 4;
      break;
      this.iVo = new bw();
      break;
      this.iVo = new cp();
      break;
      this.iVe = new ee(this);
      getContentResolver().registerContentObserver(Uri.parse("content://sms/"), true, this.iVe);
    }
  }

  public void onDestroy()
  {
    if (this.iVe != null)
    {
      getContentResolver().unregisterContentObserver(this.iVe);
      this.iVe = null;
    }
    if (this.iPu != null)
      this.iPu.close();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (paramIntent != null)
    {
      String str = paramIntent.getStringExtra("nofification_type");
      z.d("!32@/B4Tb64lLpKNhhU94SG29vC9zoVXGkMM", "[oneliang][notificationType]%s", new Object[] { str });
      if ((str != null) && (str.equals("no_reg_notification")))
        aRe();
    }
  }

  public void onPause()
  {
    super.onPause();
    this.iVo.stop();
  }

  public void onResume()
  {
    super.onResume();
    this.iVo.start();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.MobileVerifyUI
 * JD-Core Version:    0.6.2
 */