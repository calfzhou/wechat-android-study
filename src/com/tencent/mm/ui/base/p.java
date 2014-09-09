package com.tencent.mm.ui.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;

final class p
  implements DialogInterface.OnCancelListener
{
  p(DialogInterface.OnClickListener paramOnClickListener)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.iMP != null)
      this.iMP.onClick(paramDialogInterface, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.p
 * JD-Core Version:    0.6.2
 */