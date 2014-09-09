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

final class bz
  implements DialogInterface.OnClickListener
{
  bz(bw parambw)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!56@/B4Tb64lLpKNhhU94SG29spf7eLCt7FyXMgJYg1JX5PtxO2xLuDbWQ==", "imgSid:" + bw.a(this.iUP).iPK + " img len" + bw.a(this.iUP).iPM.length + " " + k.nL());
    i locali = new i(bw.a(this.iUP).dCF, "", bw.a(this.iUP).iPN, bw.b(this.iUP).aRi(), bw.b(this.iUP).aRh(), bw.b(this.iUP).aRj(), 1);
    locali.hu(bw.a(this.iUP).iPJ);
    bg.qX().d(locali);
    MobileVerifyUI localMobileVerifyUI = bw.c(this.iUP);
    bw.c(this.iUP).getString(n.buo);
    e.a(localMobileVerifyUI, bw.c(this.iUP).getString(n.bQn), true, new ca(this, locali));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.bz
 * JD-Core Version:    0.6.2
 */