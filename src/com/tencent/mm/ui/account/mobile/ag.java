package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.plugin.accountsync.a.f;
import com.tencent.mm.plugin.accountsync.a.i;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public final class ag
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
    localMobileInputUI1.iPc = e.a(localMobileInputUI2, this.iUe.getString(n.bYw), true, new ao(this));
    com.tencent.mm.modelfriend.ai localai = new com.tencent.mm.modelfriend.ai(this.iUe.iPd + this.iUe.iPe, 14, "", 0, "");
    bg.qX().d(localai);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpKsMp00pgLFBo/Lk9EFctE5HcRP2wzgqqY=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iUe.iPc != null)
    {
      this.iUe.iPc.dismiss();
      this.iUe.iPc = null;
    }
    if (paramInt2 == -75);
    int i;
    do
    {
      e.b(this.iUe, n.bsD, n.bXV);
      do
        return;
      while (paramx.getType() != 145);
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
      i = ((com.tencent.mm.modelfriend.ai)paramx).sg();
      if (i == 12)
      {
        if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
        {
          String str = ((com.tencent.mm.modelfriend.ai)paramx).wn();
          if (!ch.jb(str))
            this.iUe.iPe = str.trim();
          this.iUe.iPe = be.AV(this.iUe.iPe);
          this.iQr = (this.iUe.iPd + this.iUe.iPe);
          b.b(true, bg.qS() + "," + getClass().getName() + ",R200_200," + bg.eg("R200_200") + ",1");
          com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
          if (locala2 != null)
          {
            locala2.a(this.iUe, new am(this), new an(this));
            return;
          }
          aQZ();
          b.b(true, bg.qS() + "," + getClass().getName() + ",R200_200," + bg.eg("R200_200") + ",2");
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
    while (i != 14);
    b.jE("R200_300");
    Intent localIntent = new Intent();
    localIntent.putExtra("bindmcontact_mobile", this.iUe.iPd + " " + this.iUe.iQo.aRK());
    localIntent.putExtra("bindmcontact_shortmobile", this.iUe.iPe);
    localIntent.putExtra("country_name", this.iUe.dyU);
    localIntent.putExtra("couttry_code", this.iUe.dmj);
    localIntent.putExtra("mobileverify_countdownsec", ((com.tencent.mm.modelfriend.ai)paramx).wp());
    localIntent.putExtra("mobileverify_countdownstyle", ((com.tencent.mm.modelfriend.ai)paramx).wq());
    localIntent.putExtra("mobileverify_fb", ((com.tencent.mm.modelfriend.ai)paramx).wr());
    localIntent.putExtra("mobileverify_reg_qq", ((com.tencent.mm.modelfriend.ai)paramx).wt());
    localIntent.putExtra("mobile_verify_purpose", 2);
    localIntent.setClass(this.iUe, MobileVerifyUI.class);
    this.iUe.startActivity(localIntent);
    f.eU(i.dWz);
  }

  public final void a(MobileInputUI paramMobileInputUI)
  {
    this.iUe = paramMobileInputUI;
    String str1 = paramMobileInputUI.getString(n.bYS);
    if (com.tencent.mm.protocal.a.hrq)
      str1 = str1 + paramMobileInputUI.getString(n.bsA);
    paramMobileInputUI.Bt(str1);
    paramMobileInputUI.eC(false);
    paramMobileInputUI.iQu.setVisibility(0);
    paramMobileInputUI.iQu.setText(n.bQt);
    paramMobileInputUI.iUo.setVisibility(0);
    if (paramMobileInputUI.iQt != null)
      paramMobileInputUI.iQt.setOnClickListener(new ah(this, paramMobileInputUI));
    String str2 = paramMobileInputUI.getString(n.bPC);
    if (ch.aHL())
    {
      String str6 = paramMobileInputUI.getString(n.bPD);
      Spannable localSpannable2 = Spannable.Factory.getInstance().newSpannable(str2 + "  " + str6);
      localSpannable2.setSpan(new ai(this, paramMobileInputUI), str2.length() + "  ".length(), str2.length() + str6.length() + "  ".length(), 33);
      paramMobileInputUI.iQs.setText(localSpannable2);
    }
    while (true)
    {
      paramMobileInputUI.iQs.setMovementMethod(LinkMovementMethod.getInstance());
      return;
      String str3 = paramMobileInputUI.getString(n.bPF);
      String str4 = paramMobileInputUI.getString(n.bPE);
      String str5 = paramMobileInputUI.getString(n.bsE);
      Spannable localSpannable1 = Spannable.Factory.getInstance().newSpannable(str2 + "  " + str3 + str5 + str4);
      localSpannable1.setSpan(new aj(this, paramMobileInputUI), str2.length() + "  ".length(), str2.length() + "  ".length() + str3.length(), 33);
      localSpannable1.setSpan(new ak(this, paramMobileInputUI), str2.length() + str3.length() + "  ".length() + str5.length(), str2.length() + str3.length() + "  ".length() + str5.length() + str4.length(), 33);
      paramMobileInputUI.iQs.setText(localSpannable1);
    }
  }

  public final void pg(int paramInt)
  {
    switch (ap.iUg[(paramInt - 1)])
    {
    default:
      return;
    case 1:
    }
    String str1 = this.iUe.iPd + this.iUe.iPe;
    if (this.iUe.iPc != null)
    {
      z.d("!44@/B4Tb64lLpKsMp00pgLFBo/Lk9EFctE5HcRP2wzgqqY=", "already checking ");
      return;
    }
    MobileInputUI localMobileInputUI1 = this.iUe;
    MobileInputUI localMobileInputUI2 = this.iUe;
    this.iUe.getString(n.buo);
    localMobileInputUI1.iPc = e.a(localMobileInputUI2, this.iUe.getString(n.bYw), true, new al(this));
    String str2 = this.iUe.iQo.aRK();
    int i;
    if ((this.iQq != null) && (this.iQr != null) && (!str2.equals(this.iQq)) && (str2.equals(this.iQr)))
      i = 1;
    while (true)
    {
      com.tencent.mm.modelfriend.ai localai = new com.tencent.mm.modelfriend.ai(str1, 12, "", 0, "");
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
    b.b(true, bg.qS() + "," + getClass().getName() + ",R200_100," + bg.eg("R200_100") + ",1");
    b.jD("R200_100");
    this.iQz = 0;
  }

  public final void stop()
  {
    bg.qX().b(145, this);
    b.b(false, bg.qS() + "," + getClass().getName() + ",R200_100," + bg.eg("R200_100") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ag
 * JD-Core Version:    0.6.2
 */