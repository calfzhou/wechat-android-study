package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.account.di;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class br
  implements DialogInterface.OnClickListener
{
  br(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!44@kCDfVf11b5ODuKlWMsaJVoc4C30kOcNmvf8lIbZ2/oI=", "imgSid:" + MobileLoginOrForceReg.l(this.iUG).iPK + " img len" + MobileLoginOrForceReg.l(this.iUG).iPM.length + " " + k.nL());
    i locali = new i(MobileLoginOrForceReg.l(this.iUG).dCF, "", MobileLoginOrForceReg.l(this.iUG).iPN, MobileLoginOrForceReg.m(this.iUG).aRi(), MobileLoginOrForceReg.m(this.iUG).aRh(), MobileLoginOrForceReg.m(this.iUG).aRj(), 1);
    locali.hu(MobileLoginOrForceReg.l(this.iUG).iPJ);
    bg.qX().d(locali);
    MobileLoginOrForceReg localMobileLoginOrForceReg = this.iUG;
    this.iUG.getString(n.buo);
    e.a(localMobileLoginOrForceReg, this.iUG.getString(n.bQn), true, new bs(this, locali));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.br
 * JD-Core Version:    0.6.2
 */