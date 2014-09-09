package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class s
  implements DialogInterface.OnCancelListener
{
  s(FacebookAuthUI paramFacebookAuthUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (FacebookAuthUI.a(this.iOi) != null)
      bg.qX().c(FacebookAuthUI.a(this.iOi));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.s
 * JD-Core Version:    0.6.2
 */