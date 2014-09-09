package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.account.di;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

public final class bw
  implements com.tencent.mm.o.m, ed
{
  private SecurityImage iMR = null;
  private a iOY = null;
  private di iPo = null;
  private MobileVerifyUI iUO;

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!56@/B4Tb64lLpKNhhU94SG29spf7eLCt7FyXMgJYg1JX5PtxO2xLuDbWQ==", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iUO.dWT != null)
    {
      this.iUO.dWT.dismiss();
      this.iUO.dWT = null;
    }
    if (this.iPo == null)
      this.iPo = new di();
    if ((paramx.getType() == 380) && (this.iOY != null))
    {
      bg.qX().b(380, this);
      this.iPo.iPK = ((i)paramx).wC();
      this.iPo.iPM = ((i)paramx).wB();
      this.iPo.iPL = ((i)paramx).yZ();
      this.iPo.iPN = ((i)paramx).yY();
      if (paramInt2 == -6)
      {
        bg.qX().a(380, this);
        if (this.iMR == null)
          this.iMR = com.tencent.mm.ui.applet.m.a(this.iUO, n.bZc, this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL, new bz(this), null, new cb(this), this.iPo);
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          z.d("!56@/B4Tb64lLpKNhhU94SG29spf7eLCt7FyXMgJYg1JX5PtxO2xLuDbWQ==", "imgSid:" + this.iPo.iPK + " img len" + this.iPo.iPM.length + " " + k.nL());
          this.iMR.b(this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL);
          return;
          this.iOY.a(this.iUO, paramInt1, paramInt2, paramString, paramx);
        }
        while ((paramInt1 != 0) || (paramInt2 != 0));
        this.iUO.aRf();
        return;
        if (paramx.getType() != 145)
          break;
        this.iPo.dCF = ((ai)paramx).getUsername();
        this.iPo.iPJ = ((ai)paramx).wl();
        bg.qX().b(145, this);
      }
      while (((ai)paramx).sg() != 9);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bg.qX().a(380, this);
        this.iOY = new a(new cc(this), ((ai)paramx).getUsername(), ((ai)paramx).wl(), this.iUO.cTZ);
        this.iOY.e(this.iUO);
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
    switch (cd.iUR[(paramInt - 1)])
    {
    default:
      return false;
    case 1:
      bg.qX().a(145, this);
      ai localai3 = new ai(this.iUO.cTZ, 9, this.iUO.iTQ.getText().toString().trim(), 0, "");
      bg.qX().d(localai3);
      MobileVerifyUI localMobileVerifyUI3 = this.iUO;
      MobileVerifyUI localMobileVerifyUI4 = this.iUO;
      this.iUO.getString(n.buo);
      localMobileVerifyUI3.dWT = e.a(localMobileVerifyUI4, this.iUO.getString(n.bwO), true, new by(this, localai3));
      return false;
    case 2:
      b.jF(bg.qS() + "," + getClass().getName() + ",R200_400," + bg.eg("R200_400") + ",1");
      bg.qX().a(145, this);
      ai localai2 = new ai(this.iUO.cTZ, 8, "", 0, "");
      bg.qX().d(localai2);
      return false;
    case 3:
    }
    b.jF(bg.qS() + "," + getClass().getName() + ",R200_350_auto," + bg.eg("R200_350_auto") + ",1");
    bg.qX().a(145, this);
    ai localai1 = new ai(this.iUO.cTZ, 9, this.iUO.iTQ.getText().toString().trim(), 0, "");
    bg.qX().d(localai1);
    MobileVerifyUI localMobileVerifyUI1 = this.iUO;
    MobileVerifyUI localMobileVerifyUI2 = this.iUO;
    this.iUO.getString(n.buo);
    localMobileVerifyUI1.dWT = e.a(localMobileVerifyUI2, this.iUO.getString(n.bwO), true, new bx(this, localai1));
    return false;
  }

  public final void start()
  {
    b.b(true, bg.qS() + "," + getClass().getName() + ",F200_300," + bg.eg("F200_300") + ",1");
    b.jD("F200_300");
  }

  public final void stop()
  {
    int i = 2;
    if (this.iUO.iVn != -1)
      i = this.iUO.iVn;
    b.b(false, bg.qS() + "," + getClass().getName() + ",F200_300," + bg.eg("F200_300") + "," + i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.bw
 * JD-Core Version:    0.6.2
 */