package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class fj
  implements DialogInterface.OnClickListener
{
  fj(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.b(false, bg.qS() + "," + this.iQP.getClass().getName() + ",RE200_200," + bg.eg("RE200_200") + ",2");
    b.jE("RE200_100");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fj
 * JD-Core Version:    0.6.2
 */