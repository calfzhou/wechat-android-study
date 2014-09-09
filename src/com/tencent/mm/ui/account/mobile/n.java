package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.account.di;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public final class n
  implements com.tencent.mm.o.m, ba
{
  private String cOh;
  private String dCF;
  private String fUq;
  private SecurityImage iMR = null;
  private MobileInputUI iUe;

  private void bF(String paramString1, String paramString2)
  {
    if (ch.jb(paramString1))
    {
      e.b(this.iUe, com.tencent.mm.n.cnO, com.tencent.mm.n.bQj);
      return;
    }
    if (ch.jb(paramString2))
    {
      e.b(this.iUe, com.tencent.mm.n.cnK, com.tencent.mm.n.bQj);
      return;
    }
    this.iUe.iPk.setText(paramString2);
    this.iUe.XF();
    bg.qX().a(380, this);
    i locali = new i(paramString1, paramString2, null, 1);
    bg.qX().d(locali);
    MobileInputUI localMobileInputUI1 = this.iUe;
    MobileInputUI localMobileInputUI2 = this.iUe;
    this.iUe.getString(com.tencent.mm.n.buo);
    localMobileInputUI1.iPc = e.a(localMobileInputUI2, this.iUe.getString(com.tencent.mm.n.bQn), true, new t(this, locali));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpKsMp00pgLFBmZKkAE77UfTgxohSwLgerQ=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iUe.iPc != null)
    {
      this.iUe.iPc.dismiss();
      this.iUe.iPc = null;
    }
    di localdi;
    if (paramx.getType() == 380)
    {
      this.cOh = ((i)paramx).za();
      localdi = new di();
      bg.qX().b(380, this);
      localdi.iPK = ((i)paramx).wC();
      localdi.iPM = ((i)paramx).wB();
      localdi.iPL = ((i)paramx).yZ();
      localdi.iPN = ((i)paramx).yY();
      localdi.dCF = this.dCF;
      localdi.iPI = this.iUe.iPk.getText().toString();
      if (paramInt2 != -75)
        break label202;
      com.tencent.mm.platformtools.ac.ae(this.iUe);
    }
    label202: 
    do
    {
      return;
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.ac.s(this.iUe, paramString);
        return;
      }
      if (paramInt2 == -205)
      {
        this.fUq = ((i)paramx).tR();
        String str2 = ((i)paramx).zb();
        di.a(localdi);
        Intent localIntent = new Intent();
        localIntent.putExtra("auth_ticket", this.fUq);
        localIntent.putExtra("binded_mobile", str2);
        localIntent.putExtra("from_source", 6);
        com.tencent.mm.plugin.a.a.dWo.f(this.iUe, localIntent);
        return;
      }
      if (paramInt2 != -140)
        break;
    }
    while (ch.jb(this.cOh));
    com.tencent.mm.platformtools.ac.d(this.iUe, paramString, this.cOh);
    return;
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      bg.qX().d(new ce(new u(this)));
    for (int i = 1; ; i = 0)
    {
      if (paramInt2 == -6)
      {
        bg.qX().a(380, this);
        if (this.iMR == null)
        {
          this.iMR = com.tencent.mm.ui.applet.m.a(this.iUe, com.tencent.mm.n.bZc, localdi.iPN, localdi.iPM, localdi.iPK, localdi.iPL, new v(this, localdi), null, new x(this), localdi);
          return;
        }
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpKsMp00pgLFBmZKkAE77UfTgxohSwLgerQ=", "imgSid:" + localdi.iPK + " img len" + localdi.iPM.length + " " + k.nL());
        this.iMR.b(localdi.iPN, localdi.iPM, localdi.iPK, localdi.iPL);
        return;
      }
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        bg.rf();
        com.tencent.mm.platformtools.ac.jB(localdi.dCF);
        f.F(this.iUe);
        com.tencent.mm.platformtools.ac.a(this.iUe, new y(this), false);
        return;
      }
      int j;
      if (com.tencent.mm.plugin.a.a.dWp.a(this.iUe, paramInt1, paramInt2, paramString))
        j = 1;
      while ((j == 0) && ((paramInt1 != 0) || (paramInt2 != 0)))
      {
        MobileInputUI localMobileInputUI1 = this.iUe;
        MobileInputUI localMobileInputUI2 = this.iUe;
        int k = com.tencent.mm.n.bJW;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        Toast.makeText(localMobileInputUI1, localMobileInputUI2.getString(k, arrayOfObject), 0).show();
        return;
        if (paramInt1 == 4);
        switch (paramInt2)
        {
        default:
          j = 0;
          break;
        case -1:
          if (bg.qX().tw() == 6)
          {
            e.b(this.iUe, com.tencent.mm.n.bUe, com.tencent.mm.n.bUd);
            j = 1;
          }
          else
          {
            j = 0;
          }
          break;
        case -4:
        case -3:
          e.b(this.iUe, com.tencent.mm.n.bFW, com.tencent.mm.n.bQj);
          j = 1;
          break;
        case -9:
          e.b(this.iUe, com.tencent.mm.n.bQi, com.tencent.mm.n.bQj);
          j = 1;
          break;
        case -100:
          bg.re();
          MobileInputUI localMobileInputUI3 = this.iUe;
          if (TextUtils.isEmpty(j.aGQ()));
          for (String str1 = com.tencent.mm.aq.a.p(this.iUe, com.tencent.mm.n.bQZ); ; str1 = j.aGQ())
          {
            e.a(localMobileInputUI3, str1, this.iUe.getString(com.tencent.mm.n.buo), new z(this), new p(this));
            j = 1;
            break;
          }
        case -140:
          if (!ch.jb(this.cOh))
            com.tencent.mm.platformtools.ac.d(this.iUe, paramString, this.cOh);
          j = 1;
        }
      }
      break;
    }
  }

  public final void a(MobileInputUI paramMobileInputUI)
  {
    this.iUe = paramMobileInputUI;
    paramMobileInputUI.oP(com.tencent.mm.n.bSN);
    paramMobileInputUI.iQu.setVisibility(0);
    paramMobileInputUI.iPU.setVisibility(0);
    paramMobileInputUI.iUm.setVisibility(0);
    paramMobileInputUI.iUn.setVisibility(0);
    paramMobileInputUI.u(0, false);
    paramMobileInputUI.iUm.setOnClickListener(new o(this, paramMobileInputUI));
    paramMobileInputUI.iUn.setOnClickListener(new r(this, paramMobileInputUI));
    this.fUq = paramMobileInputUI.getIntent().getStringExtra("auth_ticket");
    if (!ch.jb(this.fUq))
      new cm().postDelayed(new s(this), 500L);
  }

  public final void pg(int paramInt)
  {
    switch (q.iUg[(paramInt - 1)])
    {
    default:
    case 1:
    }
    do
      return;
    while ((ch.jb(this.iUe.iPd)) || (ch.jb(this.iUe.iPe)));
    this.dCF = be.AV(this.iUe.iPd + this.iUe.iPe);
    bF(this.dCF, this.iUe.iPk.getText().toString());
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
 * Qualified Name:     com.tencent.mm.ui.account.mobile.n
 * JD-Core Version:    0.6.2
 */