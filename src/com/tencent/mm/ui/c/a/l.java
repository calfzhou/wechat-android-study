package com.tencent.mm.ui.c.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class l
  implements DialogInterface.OnDismissListener
{
  l(k paramk)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    if ((k.a(this.jHS)) && (this.jHS.jHQ != null))
    {
      i.a(this.jHS.jHQ).onCancel();
      this.jHS.jHQ.dismiss();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.l
 * JD-Core Version:    0.6.2
 */