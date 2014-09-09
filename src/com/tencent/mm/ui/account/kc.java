package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class kc
  implements DialogInterface.OnClickListener
{
  kc(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpL46PYMpl/SkTFlMftv8Nwe", "imgSid:" + SimpleLoginUI.d(this.iSL).iPK + " img len" + SimpleLoginUI.d(this.iSL).iPM.length + " " + k.nL());
    i locali = new i(SimpleLoginUI.d(this.iSL).dCF, SimpleLoginUI.d(this.iSL).iPI, SimpleLoginUI.d(this.iSL).iPN, SimpleLoginUI.e(this.iSL).aRi(), SimpleLoginUI.e(this.iSL).aRh(), SimpleLoginUI.e(this.iSL).aRj(), 0);
    bg.qX().d(locali);
    SimpleLoginUI localSimpleLoginUI1 = this.iSL;
    SimpleLoginUI localSimpleLoginUI2 = this.iSL;
    this.iSL.getString(n.buo);
    SimpleLoginUI.a(localSimpleLoginUI1, e.a(localSimpleLoginUI2, this.iSL.getString(n.bQn), true, new kd(this, locali)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.kc
 * JD-Core Version:    0.6.2
 */