package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.ui.base.aa;

final class at
  implements DialogInterface.OnClickListener
{
  at(ar paramar)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (ar.b(this.hBY) != null)
    {
      ar.b(this.hBY).dismiss();
      ar.c(this.hBY);
    }
    new ay(new au(this), false).cP(500L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.at
 * JD-Core Version:    0.6.2
 */