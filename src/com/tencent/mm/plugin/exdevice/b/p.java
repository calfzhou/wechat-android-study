package com.tencent.mm.plugin.exdevice.b;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class p
  implements DialogInterface.OnCancelListener
{
  p(o paramo, s params, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.eIY);
    o.a(this.eJa).dismiss();
    if (this.eIZ != null)
      this.eIZ.aP(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.p
 * JD-Core Version:    0.6.2
 */