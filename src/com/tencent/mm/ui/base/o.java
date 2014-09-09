package com.tencent.mm.ui.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;

final class o
  implements DialogInterface.OnCancelListener
{
  o(DialogInterface.OnClickListener paramOnClickListener)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.iMP != null)
      this.iMP.onClick(paramDialogInterface, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.o
 * JD-Core Version:    0.6.2
 */