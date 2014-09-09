package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.account.di;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

@Deprecated
public final class ce
  implements com.tencent.mm.o.m, ed
{
  private a iOY = null;
  private di iPo = new di();
  private MobileVerifyUI iUO;

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpKNhhU94SG29mhdCBfY2C/bywst5XLPb6E=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iUO.dWT != null)
    {
      this.iUO.dWT.dismiss();
      this.iUO.dWT = null;
    }
    if (paramx.getType() == 255)
    {
      bg.qX().b(255, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        this.iUO.aRf();
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramx.getType() == 380)
          {
            this.iPo.iPN = ((i)paramx).yY();
            this.iPo.iPK = ((i)paramx).wC();
            this.iPo.iPM = ((i)paramx).wB();
            this.iPo.iPL = ((i)paramx).yZ();
          }
          if ((paramx.getType() != 380) || (this.iOY == null))
            break;
          this.iOY.a(this.iUO, paramInt1, paramInt2, paramString, paramx);
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            bg.qX().a(255, this);
            ad localad = new ad(1);
            bg.qX().d(localad);
            MobileVerifyUI localMobileVerifyUI4 = this.iUO;
            MobileVerifyUI localMobileVerifyUI5 = this.iUO;
            this.iUO.getString(n.buo);
            localMobileVerifyUI4.dWT = e.a(localMobileVerifyUI5, this.iUO.getString(n.cfP), true, new ch(this, paramx));
            return;
          }
        }
        while (paramInt2 == -140);
        if (paramInt2 == -6)
        {
          if (this.iUO.iMR == null)
          {
            this.iUO.iMR = com.tencent.mm.ui.applet.m.a(this.iUO, n.bZc, this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL, new ci(this), null, new ck(this), this.iPo);
            return;
          }
          z.d("!44@/B4Tb64lLpKNhhU94SG29mhdCBfY2C/bywst5XLPb6E=", "imgSid:" + this.iPo.iPK + " img len" + this.iPo.iPM.length + " " + k.nL());
          this.iUO.iMR.b(this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL);
          return;
        }
        if (paramx.getType() != 145)
          break;
        bg.qX().b(145, this);
      }
      while (((ai)paramx).sg() != 17);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.iPo.dCF = ((ai)paramx).getUsername();
        this.iPo.iPI = "";
        this.iPo.iPJ = ((ai)paramx).wl();
        this.iOY = new a(new cl(this), ((ai)paramx).getUsername(), ((ai)paramx).wl(), this.iUO.cTZ);
        this.iOY.e(this.iUO);
        return;
      }
      if (paramInt2 == -30)
      {
        b.jF(bg.qS() + "," + getClass().getName() + ",L200_900_phone," + bg.eg("L200_900_phone") + ",1");
        String str = com.tencent.mm.d.a.ct(paramString).desc;
        MobileVerifyUI localMobileVerifyUI3 = this.iUO;
        if (com.tencent.mm.sdk.platformtools.ch.jb(str))
          str = this.iUO.getString(n.bQr);
        e.a(localMobileVerifyUI3, str, "", this.iUO.getString(n.bQt), this.iUO.getString(n.bQs), new cm(this, paramx), new cn(this));
        return;
      }
      if (paramInt2 == -51)
      {
        com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString);
        if (locala != null)
        {
          locala.a(this.iUO, null, null);
          return;
        }
        e.b(this.iUO, n.bwQ, n.ajf);
        return;
      }
    }
    while ((this.iUO.j(paramInt1, paramInt2, paramString)) || ((paramInt1 == 0) && (paramInt2 == 0)));
    MobileVerifyUI localMobileVerifyUI1 = this.iUO;
    MobileVerifyUI localMobileVerifyUI2 = this.iUO;
    int i = n.bwP;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(localMobileVerifyUI1, localMobileVerifyUI2.getString(i, arrayOfObject), 0).show();
  }

  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    this.iUO = paramMobileVerifyUI;
  }

  public final boolean ph(int paramInt)
  {
    switch (co.iUR[(paramInt - 1)])
    {
    default:
      return false;
    case 1:
      b.jE("L200_100");
      Intent localIntent = new Intent(this.iUO, MobileInputUI.class);
      localIntent.putExtra("mobile_input_purpose", 1);
      localIntent.addFlags(67108864);
      this.iUO.startActivity(localIntent);
      this.iUO.finish();
      return false;
    case 2:
      bg.qX().a(145, this);
      ai localai3 = new ai(this.iUO.cTZ, 17, this.iUO.iTQ.getText().toString().trim(), 0, "");
      bg.qX().d(localai3);
      MobileVerifyUI localMobileVerifyUI3 = this.iUO;
      MobileVerifyUI localMobileVerifyUI4 = this.iUO;
      this.iUO.getString(n.buo);
      localMobileVerifyUI3.dWT = e.a(localMobileVerifyUI4, this.iUO.getString(n.bwO), true, new cg(this, localai3));
      return false;
    case 3:
      b.jF(bg.qS() + "," + getClass().getName() + ",R200_400," + bg.eg("R200_400") + ",1");
      bg.qX().a(145, this);
      ai localai2 = new ai(this.iUO.cTZ, 16, "", 0, "");
      bg.qX().d(localai2);
      return false;
    case 4:
    }
    b.jF(bg.qS() + "," + getClass().getName() + ",R200_350_auto," + bg.eg("R200_350_auto") + ",1");
    bg.qX().a(145, this);
    ai localai1 = new ai(this.iUO.cTZ, 17, this.iUO.iTQ.getText().toString().trim(), 0, "");
    bg.qX().d(localai1);
    MobileVerifyUI localMobileVerifyUI1 = this.iUO;
    MobileVerifyUI localMobileVerifyUI2 = this.iUO;
    this.iUO.getString(n.buo);
    localMobileVerifyUI1.dWT = e.a(localMobileVerifyUI2, this.iUO.getString(n.bwO), true, new cf(this, localai1));
    return false;
  }

  public final void start()
  {
    b.b(true, bg.qS() + "," + getClass().getName() + ",L200_400," + bg.eg("L200_400") + ",1");
    b.jD("L200_400");
    bg.qX().a(380, this);
  }

  public final void stop()
  {
    int i = 2;
    if (this.iUO.iVn != -1)
      i = this.iUO.iVn;
    b.b(false, bg.qS() + "," + getClass().getName() + ",L200_400," + bg.eg("L200_400") + "," + i);
    bg.qX().b(380, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ce
 * JD-Core Version:    0.6.2
 */