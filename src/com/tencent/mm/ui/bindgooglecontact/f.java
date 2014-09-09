package com.tencent.mm.ui.bindgooglecontact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class f
  implements DialogInterface.OnCancelListener
{
  f(BindGoogleContactIntroUI paramBindGoogleContactIntroUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(BindGoogleContactIntroUI.c(this.jih));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.f
 * JD-Core Version:    0.6.2
 */