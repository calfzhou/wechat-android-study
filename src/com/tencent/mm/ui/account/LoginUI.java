package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.e;

public class LoginUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private TextWatcher JV = new dk(this);
  private String cOh = "";
  private String dQm = null;
  private ProgressDialog dWT = null;
  private String fUq;
  private String fUt;
  private int fsH = 0;
  private SecurityImage iMR = null;
  private EditText iPS;
  private MMFormInputView iPT;
  private MMFormInputView iPU;
  private Button iPV;
  private EditText iPk;
  private di iPo = new di();
  private String iPp;
  private com.tencent.mm.pluginsdk.e.a iPu;

  private void goBack()
  {
    XF();
    com.tencent.mm.plugin.a.b.jE(this.fUt);
    finish();
  }

  protected final void DP()
  {
    this.iPT = ((MMFormInputView)findViewById(com.tencent.mm.i.aAV));
    this.iPU = ((MMFormInputView)findViewById(com.tencent.mm.i.aBa));
    this.iPS = this.iPT.aRJ();
    this.iPk = this.iPU.aRJ();
    this.iPS.requestFocus();
    this.iPV = ((Button)findViewById(com.tencent.mm.i.aAW));
    this.iPV.setEnabled(false);
    findViewById(com.tencent.mm.i.aAY).setOnClickListener(new dt(this));
    boolean bool = com.tencent.mm.z.b.yn();
    View localView = findViewById(com.tencent.mm.i.atn);
    if (!bool);
    for (int i = 8; ; i = 0)
    {
      localView.setVisibility(i);
      localView.setOnClickListener(new du(this));
      a(new dv(this));
      this.iPV.setOnClickListener(new dw(this));
      this.fUq = getIntent().getStringExtra("auth_ticket");
      if (!ch.jb(this.fUq))
      {
        this.iPS.setText(ch.ja(di.aQD()));
        this.iPk.setText(ch.ja(di.aQE()));
        new cm().postDelayed(new dx(this), 500L);
      }
      this.iPS.addTextChangedListener(this.JV);
      this.iPk.addTextChangedListener(this.JV);
      this.iPk.setOnEditorActionListener(new dy(this));
      this.iPk.setOnKeyListener(new dz(this));
      if (l.iDu)
        com.tencent.mm.plugin.a.a.dWp.f(this);
      return;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpJTKkcMldEZqYg5eKm6NcjH", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (paramx.getType() != 380)
      return;
    bg.qX().b(380, this);
    this.cOh = ((com.tencent.mm.modelsimple.i)paramx).za();
    this.iPo.iPK = ((com.tencent.mm.modelsimple.i)paramx).wC();
    this.iPo.iPM = ((com.tencent.mm.modelsimple.i)paramx).wB();
    this.iPo.iPL = ((com.tencent.mm.modelsimple.i)paramx).yZ();
    this.iPo.iPN = ((com.tencent.mm.modelsimple.i)paramx).yY();
    this.dQm = ((com.tencent.mm.modelsimple.i)paramx).wm();
    if (paramInt2 == -205)
    {
      this.fUq = ((com.tencent.mm.modelsimple.i)paramx).tR();
      this.iPp = ((com.tencent.mm.modelsimple.i)paramx).zb();
    }
    int i;
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
    {
      i = 1;
      bg.qX().d(new ce(new do(this)));
    }
    while (true)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        bg.rf();
        com.tencent.mm.platformtools.ac.jB(this.iPo.dCF);
        f.F(this);
        com.tencent.mm.platformtools.ac.a(this, new dp(this, paramx), false);
        com.tencent.mm.plugin.a.b.jF(bg.qS() + "," + getClass().getName() + ",R200_900_phone," + bg.eg("R200_900_phone") + ",4");
        return;
      }
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.ac.s(this, paramString);
        return;
      }
      if (paramInt2 == -30)
      {
        if (com.tencent.mm.protocal.a.hrq)
        {
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("rawUrl", this.cOh);
          localIntent2.putExtra("showShare", false);
          localIntent2.putExtra("show_bottom", false);
          localIntent2.putExtra("needRedirect", false);
          localIntent2.putExtra("neverGetA8Key", true);
          localIntent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.hNg);
          localIntent2.putExtra("hardcode_general_ctrl", GeneralControlWrapper.hNd);
          com.tencent.mm.plugin.a.a.dWo.h(localIntent2, this);
          return;
        }
        com.tencent.mm.plugin.a.b.jF(bg.qS() + "," + getClass().getName() + ",R400_100_login," + bg.eg("R400_100_login") + ",1");
        e.a(this, getString(com.tencent.mm.n.bQu), "", new dq(this, paramx), new dr(this));
        return;
      }
      boolean bool;
      if (com.tencent.mm.plugin.a.a.dWp.a(aPI(), paramInt1, paramInt2, paramString))
        bool = true;
      while (!bool)
      {
        if (paramInt2 != -5)
          break label1185;
        Toast.makeText(this, getString(com.tencent.mm.n.bQp), 0).show();
        return;
        if (paramInt1 == 4);
        switch (paramInt2)
        {
        default:
          com.tencent.mm.pluginsdk.e.n localn = new com.tencent.mm.pluginsdk.e.n(paramInt1, paramInt2, paramString);
          bool = this.iPu.a(this, localn);
          break;
        case -1:
          if (bg.qX().tw() == 6)
          {
            e.b(this, com.tencent.mm.n.bUe, com.tencent.mm.n.bUd);
            bool = true;
          }
          else
          {
            bool = false;
          }
          break;
        case -4:
        case -3:
          e.b(this, com.tencent.mm.n.bFW, com.tencent.mm.n.bQj);
          bool = true;
          break;
        case -9:
          e.b(this, com.tencent.mm.n.bQi, com.tencent.mm.n.bQj);
          bool = true;
          break;
        case -72:
          e.b(aPI(), com.tencent.mm.n.bYU, com.tencent.mm.n.buo);
          bool = true;
          break;
        case -75:
          com.tencent.mm.platformtools.ac.ae(aPI());
          bool = true;
          break;
        case -6:
          bg.qX().a(380, this);
          if (this.iMR == null)
            this.iMR = com.tencent.mm.ui.applet.m.a(this, com.tencent.mm.n.bZc, this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL, new ea(this), null, new dl(this), this.iPo);
          while (true)
          {
            bool = true;
            break;
            z.d("!32@/B4Tb64lLpJTKkcMldEZqYg5eKm6NcjH", "imgSid:" + this.iPo.iPK + " img len" + this.iPo.iPM.length + " " + com.tencent.mm.compatible.g.k.nL());
            this.iMR.b(this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL);
          }
        case -100:
          bg.re();
          ActionBarActivity localActionBarActivity = aPI();
          if (TextUtils.isEmpty(j.aGQ()));
          for (String str = com.tencent.mm.aq.a.p(aPI(), com.tencent.mm.n.bQZ); ; str = j.aGQ())
          {
            e.a(localActionBarActivity, str, aPI().getString(com.tencent.mm.n.buo), new dm(this), new dn(this));
            bool = true;
            break;
          }
        case -205:
          di.a(this.iPo);
          com.tencent.mm.plugin.a.b.jE("L600_100");
          Intent localIntent1 = new Intent();
          localIntent1.putExtra("auth_ticket", this.fUq);
          localIntent1.putExtra("binded_mobile", this.iPp);
          localIntent1.putExtra("from_source", 1);
          com.tencent.mm.plugin.a.a.dWo.f(this, localIntent1);
          bool = true;
          break;
        case -140:
          if (!ch.jb(this.cOh))
            com.tencent.mm.platformtools.ac.d(this, paramString, this.cOh);
          bool = true;
        }
      }
      break;
      label1185: int j = com.tencent.mm.n.bJW;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(j, arrayOfObject), 0).show();
      return;
      i = 0;
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bhk;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getString(com.tencent.mm.n.bQo);
    if (com.tencent.mm.protocal.a.hrq)
      str = getString(com.tencent.mm.n.age) + getString(com.tencent.mm.n.bsA);
    this.fsH = getIntent().getIntExtra("login_type", 0);
    Bt(str);
    com.tencent.mm.plugin.a.a.dWp.hY();
    this.fUt = com.tencent.mm.plugin.a.b.DL();
    DP();
    this.iPu = new com.tencent.mm.pluginsdk.e.a();
  }

  public void onDestroy()
  {
    if (this.iPu != null)
      this.iPu.close();
    bg.qX().b(380, this);
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

  public void onPause()
  {
    super.onPause();
    if (this.fsH == 0)
      com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",L100_100_logout," + bg.eg("L100_100_logout") + ",2");
    while (this.fsH != 1)
      return;
    com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",L400_100_login," + bg.eg("L400_100_login") + ",2");
  }

  public void onResume()
  {
    super.onResume();
    if (this.fsH == 0)
    {
      com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",L100_100_logout," + bg.eg("L100_100_logout") + ",1");
      com.tencent.mm.plugin.a.b.jD("L100_100_logout");
    }
    while (this.fsH != 1)
      return;
    com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",L400_100_login," + bg.eg("L400_100_login") + ",1");
    com.tencent.mm.plugin.a.b.jD("L400_100_login");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.LoginUI
 * JD-Core Version:    0.6.2
 */