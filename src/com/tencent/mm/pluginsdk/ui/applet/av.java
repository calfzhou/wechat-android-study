package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.ui.base.aa;

final class av
  implements DialogInterface.OnClickListener
{
  av(ar paramar)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (ar.b(this.hBY) != null)
    {
      ar.b(this.hBY).dismiss();
      ar.c(this.hBY);
    }
    ar.f(this.hBY);
    if (ar.g(this.hBY) != null)
      ar.g(this.hBY).aF(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.av
 * JD-Core Version:    0.6.2
 */