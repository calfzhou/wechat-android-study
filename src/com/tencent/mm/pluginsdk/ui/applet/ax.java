package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class ax
  implements DialogInterface.OnCancelListener
{
  ax(ar paramar)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    ar.f(this.hBY);
    if (ar.g(this.hBY) != null)
      ar.g(this.hBY).aF(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ax
 * JD-Core Version:    0.6.2
 */