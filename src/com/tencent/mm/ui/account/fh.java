package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.ui.base.e;

final class fh
  implements DialogInterface.OnClickListener
{
  fh(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    RegByMobileRegAIOUI localRegByMobileRegAIOUI1 = this.iQP;
    RegByMobileRegAIOUI localRegByMobileRegAIOUI2 = this.iQP;
    this.iQP.getString(n.buo);
    RegByMobileRegAIOUI.a(localRegByMobileRegAIOUI1, e.a(localRegByMobileRegAIOUI2, this.iQP.getString(n.bYw), true, new fi(this)));
    ai localai = new ai(RegByMobileRegAIOUI.g(this.iQP) + RegByMobileRegAIOUI.h(this.iQP), 14, "", 0, "");
    bg.qX().d(localai);
    b.jE("RE200_250");
    RegByMobileRegAIOUI.q(this.iQP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fh
 * JD-Core Version:    0.6.2
 */