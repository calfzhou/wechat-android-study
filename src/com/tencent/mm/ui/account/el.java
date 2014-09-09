package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.plugin.a.b;

final class el
  implements DialogInterface.OnClickListener
{
  el(RegByEmailUI paramRegByEmailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jE(RegByEmailUI.f(this.iQk));
    this.iQk.XF();
    this.iQk.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.el
 * JD-Core Version:    0.6.2
 */