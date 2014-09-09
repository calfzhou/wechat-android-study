package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class hr
  implements DialogInterface.OnClickListener
{
  hr(RegByQQUI paramRegByQQUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jF(bg.qS() + "," + this.iRG.getClass().getName() + ",L400_100_signup," + bg.eg("L400_100_signup") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hr
 * JD-Core Version:    0.6.2
 */