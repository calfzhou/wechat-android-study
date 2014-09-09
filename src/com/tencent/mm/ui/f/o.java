package com.tencent.mm.ui.f;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class o
  implements DialogInterface.OnDismissListener
{
  o(n paramn)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    if ((n.a(this.jZk)) && (this.jZk.jZj != null))
    {
      k.a(this.jZk.jZj).onCancel();
      this.jZk.jZj.dismiss();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.o
 * JD-Core Version:    0.6.2
 */