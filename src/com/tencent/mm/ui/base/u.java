package com.tencent.mm.ui.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class u
  implements DialogInterface.OnCancelListener
{
  u(DialogInterface.OnCancelListener paramOnCancelListener)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.iCt != null)
      this.iCt.onCancel(paramDialogInterface);
    fk.a(false, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.u
 * JD-Core Version:    0.6.2
 */