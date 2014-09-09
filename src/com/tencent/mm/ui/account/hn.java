package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class hn
  implements DialogInterface.OnClickListener
{
  hn(RegByQQUI paramRegByQQUI, x paramx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpJpocFQ/FMhC2mYmE9Mq2Y1", "imgSid:" + RegByQQUI.e(this.iRG).iPK + " img len" + RegByQQUI.e(this.iRG).iPM.length + " " + k.nL());
    i locali = new i(RegByQQUI.e(this.iRG).dCF, RegByQQUI.e(this.iRG).iPI, RegByQQUI.e(this.iRG).iPN, RegByQQUI.f(this.iRG).aRi(), RegByQQUI.f(this.iRG).aRh(), RegByQQUI.f(this.iRG).aRj(), ((i)this.dpb).getInputType());
    bg.qX().d(locali);
    RegByQQUI localRegByQQUI1 = this.iRG;
    RegByQQUI localRegByQQUI2 = this.iRG;
    this.iRG.getString(n.buo);
    RegByQQUI.a(localRegByQQUI1, e.a(localRegByQQUI2, this.iRG.getString(n.bQn), true, new ho(this, locali)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hn
 * JD-Core Version:    0.6.2
 */