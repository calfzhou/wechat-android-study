package com.tencent.mm.ui.bindgooglecontact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class m
  implements DialogInterface.OnCancelListener
{
  m(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    BindGoogleContactUI.f(this.jiq);
    if (BindGoogleContactUI.g(this.jiq) != null)
      bg.qX().c(BindGoogleContactUI.g(this.jiq));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.m
 * JD-Core Version:    0.6.2
 */