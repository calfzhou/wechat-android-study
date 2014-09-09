package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.n;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileVerifyUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

public class LoginIndepPass extends MMActivity
  implements com.tencent.mm.o.m
{
  private String cOh;
  private String dCF;
  private ProgressDialog dWT = null;
  private String fUq;
  private String fUt;
  private SecurityImage iMR = null;
  private Button iOX;
  private EditText iPB;
  private String iPC;
  private com.tencent.mm.ui.base.cr iPc;
  private di iPo = new di();
  private String iPp;

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool;
    if (com.tencent.mm.plugin.a.a.dWp.a(aPI(), paramInt1, paramInt2, paramString))
      bool = true;
    int i;
    do
    {
      do
      {
        return bool;
        bool = false;
      }
      while (paramInt1 != 4);
      switch (paramInt2)
      {
      default:
        return false;
      case -140:
        if (!ch.jb(this.cOh))
          com.tencent.mm.platformtools.ac.d(aPI(), paramString, this.cOh);
        return true;
      case -1:
        i = bg.qX().tw();
        bool = false;
      case -4:
      case -3:
      case -9:
      case -100:
      }
    }
    while (i != 6);
    e.b(this, n.bUe, n.bUd);
    return true;
    e.b(this, n.bFW, n.bQj);
    return true;
    e.b(this, n.bQi, n.bQj);
    return true;
    bg.re();
    ActionBarActivity localActionBarActivity = aPI();
    if (TextUtils.isEmpty(j.aGQ()));
    for (String str = com.tencent.mm.aq.a.p(aPI(), n.bQZ); ; str = j.aGQ())
    {
      e.a(localActionBarActivity, str, aPI().getString(n.buo), new cv(this), new cw(this));
      return true;
    }
  }

  protected final void DP()
  {
    this.iPB = ((EditText)findViewById(com.tencent.mm.i.ayt));
    this.iOX = ((Button)findViewById(com.tencent.mm.i.aBc));
    eB(false);
    a(0, getString(n.bQm), new cp(this));
    this.iPB.addTextChangedListener(new cx(this));
    this.iPB.setOnEditorActionListener(new cy(this));
    this.iPB.setOnKeyListener(new cz(this));
    this.iOX.setText(getString(n.bQq));
    this.iOX.setOnClickListener(new da(this));
    a(new de(this));
    this.fUq = getIntent().getStringExtra("auth_ticket");
    if (!ch.jb(this.fUq))
      new cm().postDelayed(new df(this), 500L);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpL2ifO2GeMy1sPAUKApbAFH", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (this.iPc != null)
    {
      this.iPc.dismiss();
      this.iPc = null;
    }
    if (paramx.getType() == 380)
    {
      this.cOh = ((com.tencent.mm.modelsimple.i)paramx).za();
      bg.qX().b(380, this);
      this.iPo.iPK = ((com.tencent.mm.modelsimple.i)paramx).wC();
      this.iPo.iPM = ((com.tencent.mm.modelsimple.i)paramx).wB();
      this.iPo.iPL = ((com.tencent.mm.modelsimple.i)paramx).yZ();
      this.iPo.iPN = ((com.tencent.mm.modelsimple.i)paramx).yY();
      this.iPo.dCF = this.dCF;
      this.iPo.iPI = this.iPB.getText().toString();
      if (paramInt2 == -75)
        com.tencent.mm.platformtools.ac.ae(aPI());
      do
      {
        return;
        if (paramInt2 == -106)
        {
          com.tencent.mm.platformtools.ac.s(this, paramString);
          return;
        }
        if (paramInt2 == -205)
        {
          this.fUq = ((com.tencent.mm.modelsimple.i)paramx).tR();
          this.iPp = ((com.tencent.mm.modelsimple.i)paramx).zb();
          di.a(this.iPo);
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("auth_ticket", this.fUq);
          localIntent2.putExtra("binded_mobile", this.iPp);
          localIntent2.putExtra("from_source", 5);
          com.tencent.mm.plugin.a.a.dWo.f(this, localIntent2);
          return;
        }
        if (paramInt2 != -140)
          break;
      }
      while (ch.jb(this.cOh));
      com.tencent.mm.platformtools.ac.d(this, paramString, this.cOh);
      return;
      if ((paramInt1 != 4) || ((paramInt2 != -16) && (paramInt2 != -17)))
        break label980;
      bg.qX().d(new ce(new cq(this)));
    }
    label980: for (int j = 1; ; j = 0)
    {
      if (paramInt2 == -6)
      {
        bg.qX().a(380, this);
        if (this.iMR == null)
        {
          this.iMR = com.tencent.mm.ui.applet.m.a(aPI(), n.bZc, this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL, new cr(this), null, new ct(this), this.iPo);
          return;
        }
        z.d("!32@/B4Tb64lLpL2ifO2GeMy1sPAUKApbAFH", "imgSid:" + this.iPo.iPK + " img len" + this.iPo.iPM.length + " " + com.tencent.mm.compatible.g.k.nL());
        this.iMR.b(this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL);
        return;
      }
      if ((j != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        bg.rf();
        com.tencent.mm.platformtools.ac.jB(this.iPo.dCF);
        f.F(this);
        com.tencent.mm.platformtools.ac.a(this, new cu(this), false);
        return;
      }
      if (j(paramInt1, paramInt2, paramString))
        break;
      int k = n.bJW;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt1);
      arrayOfObject2[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(k, arrayOfObject2), 0).show();
      return;
      if (paramx.getType() == 145)
      {
        bg.qX().b(145, this);
        String str = ((ai)paramx).wn();
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
        b.jE("L3");
        b.b(true, bg.qS() + "," + getClass().getName() + ",L3," + bg.eg("L3") + ",1");
        Intent localIntent1 = new Intent();
        localIntent1.putExtra("bindmcontact_mobile", this.iPC);
        localIntent1.putExtra("bindmcontact_shortmobile", str);
        localIntent1.putExtra("mobile_verify_purpose", 1);
        localIntent1.putExtra("login_type", 3);
        localIntent1.putExtra("mobileverify_countdownsec", ((ai)paramx).wp());
        localIntent1.putExtra("mobileverify_countdownstyle", ((ai)paramx).wq());
        localIntent1.putExtra("mobileverify_fb", ((ai)paramx).wr());
        a(MobileVerifyUI.class, localIntent1);
        return;
      }
      if ((j(paramInt1, paramInt2, paramString)) || ((paramInt1 == 0) && (paramInt2 == 0)))
        break;
      int i = n.bJW;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(i, arrayOfObject1), 0).show();
      return;
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bhm;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getString(n.bQk);
    if (com.tencent.mm.protocal.a.hrq)
      str = getString(n.age) + getString(n.bsA);
    Bt(str);
    this.iPC = getIntent().getStringExtra("bindmcontact_mobile");
    if (this.iPC != null)
      this.dCF = be.AV(this.iPC);
    com.tencent.mm.plugin.a.a.dWp.hY();
    this.fUt = b.DL();
    DP();
  }

  public void onDestroy()
  {
    bg.qX().b(380, this);
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    b.b(false, bg.qS() + "," + getClass().getName() + ",L200_200," + bg.eg("L200_200") + ",2");
  }

  public void onResume()
  {
    super.onResume();
    b.b(true, bg.qS() + "," + getClass().getName() + ",L200_200," + bg.eg("L200_200") + ",1");
    b.jD("L200_200");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.LoginIndepPass
 * JD-Core Version:    0.6.2
 */