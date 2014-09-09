package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class gf
  implements DialogInterface.OnClickListener
{
  gf(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (RegByMobileRegUI.m(this.iQU) == 0)
      b.b(true, bg.qS() + "," + this.iQU.getClass().getName() + ",R200_200," + bg.eg("R200_200") + ",2");
    while (RegByMobileRegUI.m(this.iQU) != 2)
      return;
    b.b(true, bg.qS() + "," + this.iQU.getClass().getName() + ",F200_200," + bg.eg("F200_200") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gf
 * JD-Core Version:    0.6.2
 */