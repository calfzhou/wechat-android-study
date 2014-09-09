package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class bq
  implements DialogInterface.OnClickListener
{
  bq(LoginByMobileUI paramLoginByMobileUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jF(bg.qS() + "," + this.iPh.getClass().getName() + ",L200_300," + bg.eg("L200_300") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bq
 * JD-Core Version:    0.6.2
 */