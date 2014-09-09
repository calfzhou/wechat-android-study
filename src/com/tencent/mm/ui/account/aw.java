package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class aw
  implements DialogInterface.OnCancelListener
{
  aw(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (FacebookLoginUI.d(this.iOr) != null)
      bg.qX().c(FacebookLoginUI.d(this.iOr));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.aw
 * JD-Core Version:    0.6.2
 */