package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.model.cq;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.RegByMobileRegAIOUI;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;
import com.tencent.mm.ui.account.di;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;
import java.io.File;

public class MobileLoginOrForceReg extends MMActivity
  implements com.tencent.mm.o.m
{
  private String cOh;
  private String cTZ;
  private int dCP;
  private String dQm;
  protected ProgressDialog dWT = null;
  private String duA;
  private ImageView egy;
  private TextView ekE;
  private cm gQj = new bb(this);
  private String goU;
  private String iMF;
  private SecurityImage iMR = null;
  private a iOY = null;
  private di iPo = null;
  private com.tencent.mm.pluginsdk.e.a iPu;
  private TextView iUA;
  private int iUB;
  private String iUC;
  private boolean iUD;
  private String iUE;
  private String iUF;
  private Button iUw;
  private Button iUx;
  private LinearLayout iUy;
  private LinearLayout iUz;
  private String username;

  private void goBack()
  {
    b.jE("R200_100");
    cq.rO();
    Intent localIntent = new Intent(this, RegByMobileRegAIOUI.class);
    localIntent.putExtra("mobile_input_purpose", 2);
    localIntent.addFlags(67108864);
    startActivity(localIntent);
    b.jD(this.iMF);
    b.b(false, com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",R200_600," + com.tencent.mm.model.bg.eg("R200_600") + ",2");
    finish();
  }

  public final void DP()
  {
    this.iUw = ((Button)findViewById(com.tencent.mm.i.aoR));
    this.iUx = ((Button)findViewById(com.tencent.mm.i.auu));
    this.iUy = ((LinearLayout)findViewById(com.tencent.mm.i.axg));
    this.iUz = ((LinearLayout)findViewById(com.tencent.mm.i.aGo));
    this.egy = ((ImageView)findViewById(com.tencent.mm.i.ahd));
    this.ekE = ((TextView)findViewById(com.tencent.mm.i.aGn));
    this.iUA = ((TextView)findViewById(com.tencent.mm.i.ajc));
    new be();
    String str1;
    if (this.cTZ.startsWith("+"))
    {
      String str3 = be.AT(this.cTZ);
      if (!ch.jb(str3))
      {
        String str4 = this.cTZ.substring(1 + str3.length());
        str1 = "+" + str3 + " " + be.bC(str3, str4);
      }
    }
    while (true)
    {
      this.iUA.setText(str1);
      if ((!ch.jb(this.duA)) || (!ch.jb(this.goU)))
        break;
      this.iUz.setVisibility(0);
      this.iUy.setVisibility(8);
      this.iUw.setOnClickListener(new bn(this));
      this.iUx.setOnClickListener(new bp(this));
      oP(com.tencent.mm.n.bSL);
      a(new bq(this));
      return;
      str1 = this.cTZ;
      continue;
      str1 = "+86 " + be.bC("86", this.cTZ);
    }
    this.iUz.setVisibility(8);
    this.iUy.setVisibility(0);
    if (ch.jb(this.duA))
      this.ekE.setVisibility(8);
    while (true)
    {
      Bitmap localBitmap = com.tencent.mm.pluginsdk.ui.c.azD().hK();
      if (localBitmap != null)
        this.egy.setImageBitmap(localBitmap);
      if (ch.jb(this.goU))
        break;
      String str2 = this.goU;
      com.tencent.mm.model.bg.qQ().n(new bm(this, str2));
      break;
      this.ekE.setText(this.duA);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (this.iPo == null)
      this.iPo = new di();
    if (paramx.getType() == 255)
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Intent localIntent2 = new Intent(this, RegByMobileSetPwdUI.class);
        localIntent2.putExtra("kintent_hint", getString(com.tencent.mm.n.cfY));
        startActivityForResult(localIntent2, 0);
      }
    do
    {
      return;
      if ((paramx.getType() != 380) || (this.iOY == null))
        break;
      if (paramInt2 == -6)
      {
        this.iPo.dCF = this.username;
        this.iPo.iPJ = this.iUF;
        this.iPo.iPK = ((com.tencent.mm.modelsimple.i)paramx).wC();
        this.iPo.iPM = ((com.tencent.mm.modelsimple.i)paramx).wB();
        this.iPo.iPL = ((com.tencent.mm.modelsimple.i)paramx).yZ();
        this.iPo.iPN = ((com.tencent.mm.modelsimple.i)paramx).yY();
        if (this.iMR == null)
        {
          this.iMR = com.tencent.mm.ui.applet.m.a(this, com.tencent.mm.n.bZc, this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL, new br(this), null, new bt(this), this.iPo);
          return;
        }
        z.d("!44@kCDfVf11b5ODuKlWMsaJVoc4C30kOcNmvf8lIbZ2/oI=", "imgSid:" + this.iPo.iPK + " img len" + this.iPo.iPM.length + " " + com.tencent.mm.compatible.g.k.nL());
        this.iMR.b(this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL);
        return;
      }
      this.cOh = ((com.tencent.mm.modelsimple.i)paramx).za();
      this.iOY.a(this, paramInt1, paramInt2, paramString, paramx);
    }
    while ((paramInt1 != 0) || (paramInt2 != 0));
    com.tencent.mm.modelsimple.ad localad = new com.tencent.mm.modelsimple.ad(1);
    com.tencent.mm.model.bg.qX().d(localad);
    getString(com.tencent.mm.n.buo);
    this.dWT = e.a(this, getString(com.tencent.mm.n.cfP), true, new bu(this, localad));
    return;
    if ((paramx.getType() == 126) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      String str2 = this.cTZ;
      Boolean localBoolean = Boolean.valueOf(this.iUD);
      String str3 = this.iUF;
      String str4 = this.iUE;
      com.tencent.mm.model.bg.rf();
      com.tencent.mm.model.bg.S(true);
      if (localBoolean.booleanValue())
      {
        String str5 = h.dOS + "temp.avatar";
        String str6 = h.dOS + "temp.avatar.hd";
        new File(str5).renameTo(new File(str6));
        com.tencent.mm.a.c.deleteFile(str5);
        com.tencent.mm.sdk.platformtools.i.a(str6, 96, 96, Bitmap.CompressFormat.JPEG, 90, str5, true);
        new q(this, h.dOS + "temp.avatar").a(new bv(this, paramx, str2), new bc(this, paramx, str2));
      }
      while (paramInt2 == -6)
        if (this.iMR == null)
        {
          this.iMR = com.tencent.mm.ui.applet.m.a(this, com.tencent.mm.n.bZc, false, ((ae)paramx).wB(), ((ae)paramx).wC(), "", new bd(this, str3, str4, paramx, localBoolean), null, new bf(this), new bg(this, str3, str4, paramx, localBoolean));
          return;
          this.dQm = ((ae)paramx).zA();
          com.tencent.mm.model.bf.dkH.y("login_user_name", str2);
          Intent localIntent1 = com.tencent.mm.plugin.a.a.dWo.k(this);
          localIntent1.addFlags(67108864);
          localIntent1.putExtra("LauncherUI.enter_from_reg", true);
          startActivity(localIntent1);
          finish();
          b.jE("RE900_100");
          b.b(false, com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",R200_600," + com.tencent.mm.model.bg.eg("R200_600") + ",4");
        }
        else
        {
          this.iMR.b(false, ((ae)paramx).wB(), ((ae)paramx).wC(), "");
          return;
        }
    }
    com.tencent.mm.pluginsdk.e.n localn = new com.tencent.mm.pluginsdk.e.n(paramInt1, paramInt2, paramString);
    int i;
    if (this.iPu.a(this, localn))
      i = 1;
    label925: ActionBarActivity localActionBarActivity1;
    while ((i == 0) && ((paramInt1 != 0) || (paramInt2 != 0)))
    {
      ActionBarActivity localActionBarActivity2 = aPI();
      int j = com.tencent.mm.n.bwP;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      Toast.makeText(localActionBarActivity2, getString(j, arrayOfObject), 0).show();
      return;
      switch (paramInt2)
      {
      default:
        i = 0;
        break;
      case -140:
        if (!ch.jb(this.cOh))
          com.tencent.mm.platformtools.ac.d(aPI(), paramString, this.cOh);
        i = 1;
        break;
      case -34:
        Toast.makeText(this, com.tencent.mm.n.bwp, 0).show();
        i = 1;
        break;
      case -43:
        Toast.makeText(this, com.tencent.mm.n.bwm, 0).show();
        i = 1;
        break;
      case -41:
        Toast.makeText(this, com.tencent.mm.n.bwo, 0).show();
        i = 1;
        break;
      case -36:
        Toast.makeText(this, com.tencent.mm.n.bwr, 0).show();
        i = 1;
        break;
      case -32:
        e.a(this, getString(com.tencent.mm.n.bwS), "", new bh(this));
        i = 1;
        break;
      case -33:
        e.a(this, com.tencent.mm.n.bwQ, com.tencent.mm.n.ajf, new bi(this));
        i = 1;
        break;
      case -75:
        e.b(this, com.tencent.mm.n.bsD, com.tencent.mm.n.bXV);
        i = 1;
        break;
      case -100:
        com.tencent.mm.model.bg.re();
        localActionBarActivity1 = aPI();
        if (!TextUtils.isEmpty(j.aGQ()))
          break label1314;
      }
    }
    label1314: for (String str1 = com.tencent.mm.aq.a.p(aPI(), com.tencent.mm.n.bQZ); ; str1 = j.aGQ())
    {
      e.a(localActionBarActivity1, str1, aPI().getString(com.tencent.mm.n.buo), new bj(this), new bk(this));
      i = 1;
      break label925;
      break;
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bjQ;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iMF = b.DL();
    com.tencent.mm.model.bg.qX().a(380, this);
    com.tencent.mm.model.bg.qX().a(126, this);
    com.tencent.mm.model.bg.qX().a(255, this);
    this.dQm = getIntent().getStringExtra("ticket");
    this.cTZ = getIntent().getStringExtra("moble");
    this.iUB = getIntent().getIntExtra("next_controll", 0);
    this.username = getIntent().getStringExtra("username");
    this.iUC = getIntent().getStringExtra("password");
    this.duA = getIntent().getStringExtra("nickname");
    this.goU = getIntent().getStringExtra("avatar_url");
    this.iUD = getIntent().getBooleanExtra("kintent_hasavatar", false);
    this.iUE = getIntent().getStringExtra("kintent_nickname");
    this.iUF = getIntent().getStringExtra("kintent_password");
    if ((this.iUF != null) && (this.iUF.length() >= 4));
    for (this.dCP = 1; ; this.dCP = 4)
    {
      DP();
      this.iPu = new com.tencent.mm.pluginsdk.e.a();
      return;
    }
  }

  public void onDestroy()
  {
    com.tencent.mm.model.bg.qX().b(380, this);
    com.tencent.mm.model.bg.qX().b(126, this);
    com.tencent.mm.model.bg.qX().b(255, this);
    if (this.iPu != null)
      this.iPu.close();
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
  }

  public void onResume()
  {
    super.onResume();
    b.jF(com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",R200_600," + com.tencent.mm.model.bg.eg("R200_600") + ",1");
    b.jD("R200_600");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.MobileLoginOrForceReg
 * JD-Core Version:    0.6.2
 */