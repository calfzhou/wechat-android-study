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

final class cr
  implements DialogInterface.OnClickListener
{
  cr(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpL2ifO2GeMy1sPAUKApbAFH", "imgSid:" + LoginIndepPass.e(this.iPD).iPK + " img len" + LoginIndepPass.e(this.iPD).iPM.length + " " + k.nL());
    i locali = new i(LoginIndepPass.e(this.iPD).dCF, LoginIndepPass.e(this.iPD).iPI, LoginIndepPass.e(this.iPD).iPN, LoginIndepPass.f(this.iPD).aRi(), LoginIndepPass.f(this.iPD).aRh(), LoginIndepPass.f(this.iPD).aRj(), 1);
    bg.qX().d(locali);
    LoginIndepPass localLoginIndepPass1 = this.iPD;
    LoginIndepPass localLoginIndepPass2 = this.iPD;
    this.iPD.getString(n.buo);
    LoginIndepPass.a(localLoginIndepPass1, e.a(localLoginIndepPass2, this.iPD.getString(n.bQn), true, new cs(this, locali)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cr
 * JD-Core Version:    0.6.2
 */