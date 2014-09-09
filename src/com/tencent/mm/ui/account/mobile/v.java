package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.account.di;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class v
  implements DialogInterface.OnClickListener
{
  v(n paramn, di paramdi)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!44@/B4Tb64lLpKsMp00pgLFBmZKkAE77UfTgxohSwLgerQ=", "imgSid:" + this.iOs.iPK + " img len" + this.iOs.iPM.length + " " + k.nL());
    i locali = new i(this.iOs.dCF, this.iOs.iPI, this.iOs.iPN, n.a(this.iUi).aRi(), n.a(this.iUi).aRh(), n.a(this.iUi).aRj(), 1);
    bg.qX().d(locali);
    MobileInputUI localMobileInputUI1 = n.b(this.iUi);
    MobileInputUI localMobileInputUI2 = n.b(this.iUi);
    n.b(this.iUi).getString(com.tencent.mm.n.buo);
    localMobileInputUI1.iPc = e.a(localMobileInputUI2, n.b(this.iUi).getString(com.tencent.mm.n.bQn), true, new w(this, locali));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.v
 * JD-Core Version:    0.6.2
 */