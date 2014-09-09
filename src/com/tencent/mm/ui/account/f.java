package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class f
  implements DialogInterface.OnCancelListener
{
  f(BindFacebookUI paramBindFacebookUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (BindFacebookUI.a(this.iNR) != null)
      bg.qX().c(BindFacebookUI.a(this.iNR));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.f
 * JD-Core Version:    0.6.2
 */