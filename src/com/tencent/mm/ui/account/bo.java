package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.ui.base.e;

final class bo
  implements DialogInterface.OnClickListener
{
  bo(LoginByMobileUI paramLoginByMobileUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    LoginByMobileUI localLoginByMobileUI1 = this.iPh;
    LoginByMobileUI localLoginByMobileUI2 = this.iPh;
    this.iPh.getString(n.buo);
    LoginByMobileUI.a(localLoginByMobileUI1, e.a(localLoginByMobileUI2, this.iPh.getString(n.bYw), true, new bp(this)));
    ai localai = new ai(LoginByMobileUI.g(this.iPh) + LoginByMobileUI.h(this.iPh), 16, "", 0, "");
    bg.qX().d(localai);
    b.jF(bg.qS() + "," + this.iPh.getClass().getName() + ",L200_300," + bg.eg("L200_300") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bo
 * JD-Core Version:    0.6.2
 */