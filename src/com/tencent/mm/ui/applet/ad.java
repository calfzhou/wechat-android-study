package com.tencent.mm.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;

final class ad
  implements DialogInterface.OnCancelListener
{
  ad(ac paramac)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(ab.b(this.iWn.iWm));
    ab.a(this.iWn.iWm, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.ad
 * JD-Core Version:    0.6.2
 */