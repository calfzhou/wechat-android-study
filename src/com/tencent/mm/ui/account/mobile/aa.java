package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public final class aa
  implements m, ba
{
  private SecurityImage iMR = null;
  private a iOY = null;
  private MobileInputUI iUe;

  private void BF(String paramString)
  {
    MobileInputUI localMobileInputUI1 = this.iUe;
    MobileInputUI localMobileInputUI2 = this.iUe;
    this.iUe.getString(n.buo);
    localMobileInputUI1.iPc = e.a(localMobileInputUI2, this.iUe.getString(n.bYw), true, new ab(this));
    ai localai = new ai(paramString, 16, "", 0, "");
    bg.qX().d(localai);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpKsMp00pgLFBmZKkAE77UfTgxohSwLgerQ=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iUe.iPc != null)
    {
      this.iUe.iPc.dismiss();
      this.iUe.iPc = null;
    }
    if ((paramx.getType() == 380) && (this.iOY != null))
      this.iOY.a(this.iUe, paramInt1, paramInt2, paramString, paramx);
    int i;
    do
    {
      do
        return;
      while (paramx.getType() != 145);
      i = ((ai)paramx).sg();
      if (i == 13)
      {
        if (paramInt2 == -41)
        {
          com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
          if (locala2 != null)
          {
            locala2.a(this.iUe, null, null);
            return;
          }
          e.b(this.iUe, n.bYE, n.bYF);
          return;
        }
        if (paramInt2 == -35)
        {
          this.iUe.iPd = this.iUe.iQo.getCountryCode();
          this.iUe.iPe = this.iUe.iQo.aRK();
          String str2 = this.iUe.iPd + this.iUe.iPe;
          this.iUe.XF();
          BF(str2);
          return;
        }
        if (paramInt2 == -1)
        {
          MobileInputUI localMobileInputUI1 = this.iUe;
          MobileInputUI localMobileInputUI2 = this.iUe;
          int j = n.bJW;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(paramInt1);
          arrayOfObject[1] = Integer.valueOf(paramInt2);
          Toast.makeText(localMobileInputUI1, localMobileInputUI2.getString(j, arrayOfObject), 0).show();
          return;
        }
        if (paramInt2 == -34)
        {
          e.o(this.iUe, this.iUe.getString(n.bwp), "");
          return;
        }
        String str1 = ((ai)paramx).wn();
        if (!ch.jb(str1))
          this.iUe.iPe = str1.trim();
        this.iUe.iPe = be.AV(this.iUe.iPe);
        b.jF(bg.qS() + "," + getClass().getName() + ",L200_300," + bg.eg("L200_300") + ",1");
        com.tencent.mm.d.a locala1 = com.tencent.mm.d.a.ct(paramString);
        if (locala1 != null)
        {
          locala1.a(this.iUe, new ad(this), new ae(this));
          return;
        }
        BF(this.iUe.iPd + this.iUe.iPe);
        return;
      }
    }
    while (i != 16);
    if (paramInt2 == -41)
    {
      e.b(this.iUe, n.bYE, n.bYF);
      return;
    }
    if (paramInt2 == -75)
    {
      e.o(this.iUe, this.iUe.getString(n.bsC), "");
      return;
    }
    b.jE("L3");
    b.jF(bg.qS() + "," + getClass().getName() + ",L3," + bg.eg("L3") + ",1");
    Intent localIntent = new Intent();
    localIntent.putExtra("mobile_verify_purpose", 1);
    localIntent.putExtra("bindmcontact_mobile", this.iUe.iPd + " " + this.iUe.iQo.aRK());
    localIntent.putExtra("bindmcontact_shortmobile", this.iUe.iPe);
    localIntent.putExtra("country_name", this.iUe.dyU);
    localIntent.putExtra("couttry_code", this.iUe.dmj);
    localIntent.putExtra("mobileverify_countdownsec", ((ai)paramx).wp());
    localIntent.putExtra("mobileverify_countdownstyle", ((ai)paramx).wq());
    localIntent.putExtra("mobileverify_fb", ((ai)paramx).wr());
    localIntent.setClass(this.iUe, MobileVerifyUI.class);
    this.iUe.startActivity(localIntent);
  }

  public final void a(MobileInputUI paramMobileInputUI)
  {
    this.iUe = paramMobileInputUI;
    paramMobileInputUI.oP(n.bSM);
    paramMobileInputUI.iQu.setVisibility(8);
  }

  public final void pg(int paramInt)
  {
    switch (af.iUg[(paramInt - 1)])
    {
    default:
      return;
    case 1:
    }
    String str = this.iUe.iPd + this.iUe.iPe;
    this.iUe.XF();
    MobileInputUI localMobileInputUI1 = this.iUe;
    MobileInputUI localMobileInputUI2 = this.iUe;
    this.iUe.getString(n.buo);
    localMobileInputUI1.iPc = e.a(localMobileInputUI2, this.iUe.getString(n.bYw), true, new ac(this));
    ai localai = new ai(str, 13, "", 0, "");
    bg.qX().d(localai);
  }

  public final void start()
  {
    bg.qX().a(380, this);
    bg.qX().a(145, this);
    b.b(true, bg.qS() + "," + getClass().getName() + ",L200_100," + bg.eg("L200_100") + ",1");
    b.jD("L200_100");
  }

  public final void stop()
  {
    bg.qX().b(380, this);
    bg.qX().b(145, this);
    b.b(false, bg.qS() + "," + getClass().getName() + ",L200_100," + bg.eg("L200_100") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.aa
 * JD-Core Version:    0.6.2
 */