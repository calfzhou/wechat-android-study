package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mm.sdk.platformtools.as;

final class dg
  implements DialogInterface.OnDismissListener
{
  dg(DialogInterface.OnClickListener paramOnClickListener)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    as.AP("show_wap_adviser");
    if (this.iMP != null)
      this.iMP.onClick(paramDialogInterface, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dg
 * JD-Core Version:    0.6.2
 */