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

final class cd
  implements DialogInterface.OnClickListener
{
  cd(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "imgSid:" + LoginHistoryUI.h(this.iPx).iPK + " img len" + LoginHistoryUI.h(this.iPx).iPM.length + " " + k.nL());
    i locali = new i(LoginHistoryUI.h(this.iPx).dCF, LoginHistoryUI.h(this.iPx).iPI, LoginHistoryUI.h(this.iPx).iPN, LoginHistoryUI.j(this.iPx).aRi(), LoginHistoryUI.j(this.iPx).aRh(), LoginHistoryUI.j(this.iPx).aRj(), 0);
    bg.qX().d(locali);
    LoginHistoryUI localLoginHistoryUI1 = this.iPx;
    LoginHistoryUI localLoginHistoryUI2 = this.iPx;
    this.iPx.getString(n.buo);
    LoginHistoryUI.a(localLoginHistoryUI1, e.a(localLoginHistoryUI2, this.iPx.getString(n.bQn), true, new ce(this, locali)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cd
 * JD-Core Version:    0.6.2
 */