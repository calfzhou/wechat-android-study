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

final class ci
  implements DialogInterface.OnClickListener
{
  ci(ce paramce)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!44@/B4Tb64lLpKNhhU94SG29mhdCBfY2C/bywst5XLPb6E=", "imgSid:" + ce.a(this.iUS).iPK + " img len" + ce.a(this.iUS).iPM.length + " " + k.nL());
    i locali = new i(ce.a(this.iUS).dCF, "", ce.a(this.iUS).iPN, ce.b(this.iUS).iMR.aRi(), ce.b(this.iUS).iMR.aRh(), ce.b(this.iUS).iMR.aRj(), 1);
    locali.hu(ce.a(this.iUS).iPJ);
    bg.qX().d(locali);
    MobileVerifyUI localMobileVerifyUI1 = ce.b(this.iUS);
    MobileVerifyUI localMobileVerifyUI2 = ce.b(this.iUS);
    ce.b(this.iUS).getString(n.buo);
    localMobileVerifyUI1.dWT = e.a(localMobileVerifyUI2, ce.b(this.iUS).getString(n.bQn), true, new cj(this, locali));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ci
 * JD-Core Version:    0.6.2
 */