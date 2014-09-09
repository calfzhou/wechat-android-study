package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class dr
  implements DialogInterface.OnClickListener
{
  dr(LoginUI paramLoginUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jF(bg.qS() + "," + this.iPW.getClass().getName() + ",R400_100_login," + bg.eg("R400_100_login") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.dr
 * JD-Core Version:    0.6.2
 */