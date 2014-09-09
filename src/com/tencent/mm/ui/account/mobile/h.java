package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public final class h
  implements m, ba
{
  private String iQq;
  private String iQr;
  private int iQz = 0;
  private MobileInputUI iUe;

  private void aQZ()
  {
    MobileInputUI localMobileInputUI1 = this.iUe;
    MobileInputUI localMobileInputUI2 = this.iUe;
    this.iUe.getString(n.buo);
    localMobileInputUI1.iPc = e.a(localMobileInputUI2, this.iUe.getString(n.bYw), true, new l(this));
    ai localai = new ai(this.iUe.iPd + this.iUe.iPe, 8, "", 0, "");
    bg.qX().d(localai);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!56@/B4Tb64lLpKsMp00pgLFBsZYpsv1uT3yfw2cwIJseLbhc3CqnDEQew==", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iUe.iPc != null)
    {
      this.iUe.iPc.dismiss();
      this.iUe.iPc = null;
    }
    if (paramInt2 == -75)
      e.b(this.iUe, n.bsD, n.bXV);
    int i;
    do
    {
      do
      {
        return;
        if ((paramInt2 == -41) || (paramInt2 == -59))
        {
          com.tencent.mm.d.a locala1 = com.tencent.mm.d.a.ct(paramString);
          if (locala1 != null)
          {
            locala1.a(this.iUe, null, null);
            return;
          }
          e.b(this.iUe, n.bYE, n.bYF);
          return;
        }
      }
      while (paramx.getType() != 145);
      i = ((ai)paramx).sg();
      if (i == 12)
      {
        if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
        {
          String str = ((ai)paramx).wn();
          if (!ch.jb(str))
            this.iUe.iPe = str.trim();
          this.iUe.iPe = be.AV(this.iUe.iPe);
          this.iQr = (this.iUe.iPd + this.iUe.iPe);
          b.b(true, bg.qS() + "," + getClass().getName() + ",F200_200," + bg.eg("F200_200") + ",1");
          com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
          if (locala2 != null)
          {
            locala2.a(this.iUe, new j(this), new k(this));
            return;
          }
          aQZ();
          b.b(true, bg.qS() + "," + getClass().getName() + ",F200_200," + bg.eg("F200_200") + ",2");
          return;
        }
        if (paramInt2 == -34)
        {
          e.o(this.iUe, this.iUe.getString(n.bwp), "");
          return;
        }
        MobileInputUI localMobileInputUI1 = this.iUe;
        MobileInputUI localMobileInputUI2 = this.iUe;
        int j = n.bwP;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        Toast.makeText(localMobileInputUI1, localMobileInputUI2.getString(j, arrayOfObject), 0).show();
      }
    }
    while ((i != 8) || (paramInt2 != 0));
    Intent localIntent = new Intent();
    localIntent.putExtra("bindmcontact_mobile", this.iUe.iPd + " " + this.iUe.iQo.aRK());
    localIntent.putExtra("bindmcontact_shortmobile", this.iUe.iPe);
    localIntent.putExtra("country_name", this.iUe.dyU);
    localIntent.putExtra("couttry_code", this.iUe.dmj);
    localIntent.putExtra("mobileverify_countdownsec", ((ai)paramx).wp());
    localIntent.putExtra("mobileverify_countdownstyle", ((ai)paramx).wq());
    localIntent.putExtra("mobileverify_fb", ((ai)paramx).wr());
    localIntent.putExtra("mobileverify_reg_qq", ((ai)paramx).wt());
    localIntent.putExtra("mobile_verify_purpose", 3);
    localIntent.setClass(this.iUe, MobileVerifyUI.class);
    this.iUe.startActivity(localIntent);
  }

  public final void a(MobileInputUI paramMobileInputUI)
  {
    this.iUe = paramMobileInputUI;
    paramMobileInputUI.iOS.requestFocus();
    paramMobileInputUI.aep();
    String str = paramMobileInputUI.getString(n.bYT);
    if (com.tencent.mm.protocal.a.hrq)
      str = str + paramMobileInputUI.getString(n.bsA);
    paramMobileInputUI.Bt(str);
    paramMobileInputUI.iUo.setVisibility(8);
    paramMobileInputUI.iQt.setVisibility(8);
    paramMobileInputUI.iQs.setVisibility(8);
  }

  public final void pg(int paramInt)
  {
    switch (m.iUg[(paramInt - 1)])
    {
    default:
      return;
    case 1:
    }
    String str1 = this.iUe.iPd + this.iUe.iPe;
    if (this.iUe.iPc != null)
    {
      z.d("!56@/B4Tb64lLpKsMp00pgLFBsZYpsv1uT3yfw2cwIJseLbhc3CqnDEQew==", "already checking ");
      return;
    }
    MobileInputUI localMobileInputUI1 = this.iUe;
    MobileInputUI localMobileInputUI2 = this.iUe;
    this.iUe.getString(n.buo);
    localMobileInputUI1.iPc = e.a(localMobileInputUI2, this.iUe.getString(n.bYw), true, new i(this));
    String str2 = this.iUe.iQo.aRK();
    int i;
    if ((this.iQq != null) && (this.iQr != null) && (!str2.equals(this.iQq)) && (str2.equals(this.iQr)))
      i = 1;
    while (true)
    {
      ai localai = new ai(str1, 12, "", 0, "");
      localai.dz(this.iQz);
      localai.dA(i);
      bg.qX().d(localai);
      this.iQq = this.iUe.iQo.aRK();
      this.iQz = (1 + this.iQz);
      return;
      if ((this.iQq != null) && (this.iQr != null) && (!this.iQr.equals(this.iQq)) && (!str2.equals(this.iQr)))
        i = 2;
      else
        i = 0;
    }
  }

  public final void start()
  {
    bg.qX().a(145, this);
    b.b(true, bg.qS() + "," + getClass().getName() + ",F200_100," + bg.eg("F200_100") + ",1");
    b.jD("F200_100");
    this.iQz = 0;
  }

  public final void stop()
  {
    bg.qX().b(145, this);
    b.b(false, bg.qS() + "," + getClass().getName() + ",F200_100," + bg.eg("F200_100") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.h
 * JD-Core Version:    0.6.2
 */