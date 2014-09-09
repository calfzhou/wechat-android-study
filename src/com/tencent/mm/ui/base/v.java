package com.tencent.mm.ui.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class v
  implements DialogInterface.OnDismissListener
{
  v(DialogInterface.OnDismissListener paramOnDismissListener)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    if (this.iXO != null)
      this.iXO.onDismiss(paramDialogInterface);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.v
 * JD-Core Version:    0.6.2
 */