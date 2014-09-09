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

final class ea
  implements DialogInterface.OnClickListener
{
  ea(LoginUI paramLoginUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (LoginUI.d(this.iPW) == null)
    {
      z.e("!32@/B4Tb64lLpJTKkcMldEZqYg5eKm6NcjH", "secimg is null!");
      return;
    }
    z.d("!32@/B4Tb64lLpJTKkcMldEZqYg5eKm6NcjH", "imgSid:" + LoginUI.e(this.iPW).iPK + " img len" + LoginUI.e(this.iPW).iPM.length + " " + k.nL());
    i locali = new i(LoginUI.e(this.iPW).dCF, LoginUI.e(this.iPW).iPI, LoginUI.e(this.iPW).iPN, LoginUI.d(this.iPW).aRi(), LoginUI.d(this.iPW).aRh(), LoginUI.d(this.iPW).aRj(), 2);
    bg.qX().d(locali);
    LoginUI localLoginUI1 = this.iPW;
    LoginUI localLoginUI2 = this.iPW;
    this.iPW.getString(n.buo);
    LoginUI.a(localLoginUI1, e.a(localLoginUI2, this.iPW.getString(n.bQn), true, new eb(this, locali)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ea
 * JD-Core Version:    0.6.2
 */