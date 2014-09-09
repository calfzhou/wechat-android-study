package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.ui.base.e;

final class gd
  implements DialogInterface.OnClickListener
{
  gd(RegByMobileRegUI paramRegByMobileRegUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    RegByMobileRegUI localRegByMobileRegUI1 = this.iQU;
    RegByMobileRegUI localRegByMobileRegUI2 = this.iQU;
    this.iQU.getString(n.buo);
    RegByMobileRegUI.a(localRegByMobileRegUI1, e.a(localRegByMobileRegUI2, this.iQU.getString(n.bYw), true, new ge(this)));
    String str = RegByMobileRegUI.f(this.iQU) + RegByMobileRegUI.g(this.iQU);
    int i;
    if (this.dpe == -3)
    {
      i = 8;
      ai localai = new ai(str, i, "", 0, "");
      bg.qX().d(localai);
      if (RegByMobileRegUI.m(this.iQU) != 0)
        break label197;
      b.b(true, bg.qS() + "," + this.iQU.getClass().getName() + ",R200_200," + bg.eg("R200_200") + ",2");
    }
    label197: 
    while (RegByMobileRegUI.m(this.iQU) != 2)
    {
      return;
      i = 14;
      break;
    }
    b.b(true, bg.qS() + "," + this.iQU.getClass().getName() + ",F200_200," + bg.eg("F200_200") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gd
 * JD-Core Version:    0.6.2
 */