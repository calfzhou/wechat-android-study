package com.tencent.mm.ui.account;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.n.q;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.y;

public class LoginHistoryUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private String cOh = "";
  private ProgressDialog dWT = null;
  private SharedPreferences dkI;
  private String fUq;
  private SecurityImage iMR = null;
  private TextView iPj;
  private EditText iPk;
  private View iPl;
  private Button iPm;
  private Button iPn;
  private di iPo = new di();
  private String iPp;
  private ImageView iPq;
  private MMKeyboardUperView iPr;
  private ResizeLayout iPs;
  private String iPt;
  private com.tencent.mm.pluginsdk.e.a iPu;
  private y iPv = new bu(this);
  private int iPw = 0;

  private void f(com.tencent.mm.modelsimple.i parami)
  {
    Intent localIntent = com.tencent.mm.plugin.a.a.dWo.k(this);
    localIntent.addFlags(67108864);
    if (parami != null)
    {
      localIntent.putExtra("kstyle_show_bind_mobile_afterauth", parami.zc());
      localIntent.putExtra("kstyle_bind_recommend_show", parami.ze());
      localIntent.putExtra("kstyle_bind_wording", parami.zd());
    }
    startActivity(localIntent);
    finish();
  }

  protected final void DP()
  {
    this.iPt = bf.dkH.z("login_user_name", "");
    String str1 = bf.dkH.z("last_avatar_path", "");
    com.tencent.mm.sdk.platformtools.ch.xy(bf.dkH.z("last_bind_info", "0"));
    String str2 = getIntent().getStringExtra("email_address");
    if ((!com.tencent.mm.sdk.platformtools.ch.jb(str2)) && (!str2.equalsIgnoreCase(this.iPt)))
    {
      str1 = "";
      this.iPt = str2;
    }
    String str3 = str1;
    this.iPq = ((ImageView)findViewById(com.tencent.mm.i.azL));
    if (!com.tencent.mm.sdk.platformtools.ch.jb(str3))
    {
      Bitmap localBitmap = q.F(str3, this.iPt);
      if (localBitmap != null)
        this.iPq.setImageBitmap(Bitmap.createBitmap(localBitmap, 5, 5, -10 + localBitmap.getWidth(), -10 + localBitmap.getHeight(), null, false));
    }
    if ((bg.ra()) && (!this.iPt.equals("")))
    {
      f(null);
      return;
    }
    this.iPr = ((MMKeyboardUperView)findViewById(com.tencent.mm.i.aNb));
    this.iPj = ((TextView)findViewById(com.tencent.mm.i.aAV));
    this.iPk = ((EditText)findViewById(com.tencent.mm.i.aBa));
    this.iPl = findViewById(com.tencent.mm.i.aAY);
    this.iPl.setVisibility(0);
    this.iPm = ((Button)findViewById(com.tencent.mm.i.aAX));
    this.iPn = ((Button)findViewById(com.tencent.mm.i.aAW));
    this.iPs = ((ResizeLayout)findViewById(com.tencent.mm.i.aMj));
    if (com.tencent.mm.sdk.platformtools.ch.ji(this.iPt).booleanValue())
    {
      new be();
      String str4 = "86";
      String str5 = this.iPt;
      if (this.iPt.startsWith("+"))
      {
        str5 = str5.replace("+", "");
        str4 = be.AT(this.iPt);
        if (str4 != null)
          str5 = str5.substring(str4.length());
      }
      String str6 = be.bC(str4, str5);
      this.iPj.setText(str6);
      label381: this.iPr.an(findViewById(com.tencent.mm.i.atP));
      this.iPs.a(new ci(this));
      this.iPk.setTypeface(Typeface.DEFAULT);
      this.iPk.setTransformationMethod(new PasswordTransformationMethod());
      this.iPr.setOnTouchListener(new cj(this));
      this.iPk.setOnEditorActionListener(new ck(this));
      this.iPk.setOnKeyListener(new cl(this));
      this.iPk.addTextChangedListener(new cm(this));
      a(0, getString(com.tencent.mm.n.bQg), new cn(this));
      this.iPn.setOnClickListener(new co(this));
      if (this.iPk.getText().toString().length() <= 0)
        break label698;
      this.iPn.setEnabled(true);
    }
    while (true)
    {
      this.iPl.setOnClickListener(new br(this));
      this.iPm.setOnClickListener(new bs(this));
      this.fUq = getIntent().getStringExtra("auth_ticket");
      if (!com.tencent.mm.sdk.platformtools.ch.jb(this.fUq))
      {
        this.iPj.setText(com.tencent.mm.sdk.platformtools.ch.ja(di.aQD()));
        this.iPk.setText(com.tencent.mm.sdk.platformtools.ch.ja(di.aQE()));
        new com.tencent.mm.sdk.platformtools.cm().postDelayed(new bt(this), 500L);
      }
      if (!l.iDu)
        break;
      com.tencent.mm.plugin.a.a.dWp.f(this);
      return;
      this.iPj.setText(this.iPt);
      break label381;
      label698: this.iPn.setEnabled(false);
    }
  }

  public final void XF()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null);
    IBinder localIBinder;
    do
    {
      View localView;
      do
      {
        return;
        localView = getCurrentFocus();
      }
      while (localView == null);
      localIBinder = localView.getWindowToken();
    }
    while (localIBinder == null);
    localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    z.d("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "Scene Type " + paramx.getType());
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    this.cOh = ((com.tencent.mm.modelsimple.i)paramx).za();
    z.e("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "url " + this.cOh);
    int i;
    if (paramx.getType() == 380)
    {
      bg.qX().b(380, this);
      this.iPo.iPN = ((com.tencent.mm.modelsimple.i)paramx).yY();
      this.iPo.iPK = ((com.tencent.mm.modelsimple.i)paramx).wC();
      this.iPo.iPM = ((com.tencent.mm.modelsimple.i)paramx).wB();
      this.iPo.iPL = ((com.tencent.mm.modelsimple.i)paramx).yZ();
      if (paramInt2 == -205)
      {
        this.fUq = ((com.tencent.mm.modelsimple.i)paramx).tR();
        this.iPp = ((com.tencent.mm.modelsimple.i)paramx).zb();
      }
      if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      {
        i = 1;
        bg.qX().d(new ce(new bw(this)));
      }
    }
    while (true)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        bg.rf();
        String str1 = bf.dkH.z("login_user_name", "");
        if ((!str1.equals("")) && (!str1.equals(this.iPo.dCF)))
        {
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = str1;
          arrayOfObject1[1] = this.iPo.dCF;
          z.d("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "onSceneEnd, start launcher without show addrbook comfirm. lastAcc:%s, curAcc:%d", arrayOfObject1);
          com.tencent.mm.platformtools.ac.jB(this.iPo.dCF);
          f((com.tencent.mm.modelsimple.i)paramx);
          return;
        }
        com.tencent.mm.platformtools.ac.a(this, new bx(this, (com.tencent.mm.modelsimple.i)paramx), false);
        f.F(this);
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
        e.a(this, getString(com.tencent.mm.n.bQu), "", new by(this, paramx), new bz(this));
        return;
      }
      if (paramInt1 == 4);
      boolean bool;
      switch (paramInt2)
      {
      default:
        if (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString))
        {
          if (this.iMR != null)
            this.iMR.dismiss();
          bool = true;
        }
        break;
      case -4:
      case -3:
      }
      while (!bool)
      {
        int j = com.tencent.mm.n.bJW;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(paramInt1);
        arrayOfObject2[1] = Integer.valueOf(paramInt2);
        Toast.makeText(this, getString(j, arrayOfObject2), 0).show();
        return;
        if (this.iPw <= 0)
        {
          e.b(this, com.tencent.mm.n.bFW, com.tencent.mm.n.bQj);
          this.iPw = (1 + this.iPw);
        }
        while (true)
        {
          bool = true;
          break;
          e.a(this, getString(com.tencent.mm.n.bFX), getString(com.tencent.mm.n.bQj), getString(com.tencent.mm.n.bFY), getString(com.tencent.mm.n.bsK), new ca(this), new cc(this));
        }
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
          break;
        case -9:
          e.b(this, com.tencent.mm.n.bQi, com.tencent.mm.n.bQj);
          bool = true;
          break;
        case -72:
          e.b(this, com.tencent.mm.n.bYU, com.tencent.mm.n.buo);
          bool = true;
          break;
        case -75:
          com.tencent.mm.platformtools.ac.ae(this);
          bool = true;
          break;
        case -6:
          bg.qX().a(380, this);
          if (this.iMR == null)
            this.iMR = com.tencent.mm.ui.applet.m.a(this, com.tencent.mm.n.bZc, this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL, new cd(this), null, new cf(this), this.iPo);
          while (true)
          {
            bool = true;
            break;
            z.d("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "imgSid:" + this.iPo.iPK + " img len" + this.iPo.iPM.length + " " + com.tencent.mm.compatible.g.k.nL());
            this.iMR.b(this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL);
          }
        case -100:
          bg.re();
          if (TextUtils.isEmpty(j.aGQ()));
          for (String str2 = com.tencent.mm.aq.a.p(this, com.tencent.mm.n.bQZ); ; str2 = j.aGQ())
          {
            e.a(this, str2, getString(com.tencent.mm.n.buo), new cg(this), new ch(this));
            bool = true;
            break;
          }
        case -205:
          di.a(this.iPo);
          Intent localIntent1 = new Intent();
          localIntent1.putExtra("auth_ticket", this.fUq);
          localIntent1.putExtra("binded_mobile", this.iPp);
          localIntent1.putExtra("from_source", 2);
          com.tencent.mm.plugin.a.a.dWo.f(this, localIntent1);
          bool = true;
          break;
        case -140:
          if (!com.tencent.mm.sdk.platformtools.ch.jb(this.cOh))
            com.tencent.mm.platformtools.ac.d(this, paramString, this.cOh);
          bool = true;
        }
      }
      i = 0;
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bhl;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    aPU();
    com.tencent.mm.plugin.a.a.dWp.hY();
    this.dkI = ak.getContext().getSharedPreferences(ak.aHi(), 0);
    DP();
    this.iPu = new com.tencent.mm.pluginsdk.e.a();
  }

  public void onDestroy()
  {
    bg.qX().b(380, this);
    if (this.iPu != null)
      this.iPu.close();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Intent localIntent = com.tencent.mm.plugin.a.a.dWo.k(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    bg.qT();
    String str = bf.dkH.z("login_user_name", "");
    if ((bg.ra()) && (!str.equals("")))
      f(null);
    while (com.tencent.mm.j.a.Ac() != 2)
      return;
    ad localad = new ad(this);
    localad.pn(com.tencent.mm.n.cCQ);
    localad.BL(getString(com.tencent.mm.n.cCP));
    localad.eN(false);
    localad.d(com.tencent.mm.n.cCN, new cb(this));
    localad.aRB().show();
    com.tencent.mm.j.a.a(this, System.currentTimeMillis());
  }

  public void setRequestedOrientation(int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.LoginHistoryUI
 * JD-Core Version:    0.6.2
 */