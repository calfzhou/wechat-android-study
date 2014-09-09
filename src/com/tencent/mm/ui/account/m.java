package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.al;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class m
  implements DialogInterface.OnClickListener
{
  m(l paraml)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    al localal = new al(EmailVerifyUI.a(this.iOc.iOb), EmailVerifyUI.b(this.iOc.iOb));
    bg.qX().d(localal);
    EmailVerifyUI localEmailVerifyUI1 = this.iOc.iOb;
    EmailVerifyUI localEmailVerifyUI2 = this.iOc.iOb;
    this.iOc.iOb.getString(com.tencent.mm.n.buo);
    EmailVerifyUI.a(localEmailVerifyUI1, e.a(localEmailVerifyUI2, this.iOc.iOb.getString(com.tencent.mm.n.bYp), true, new n(this, localal)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.m
 * JD-Core Version:    0.6.2
 */