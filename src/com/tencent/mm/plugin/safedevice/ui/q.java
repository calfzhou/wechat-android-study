package com.tencent.mm.plugin.safedevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.safedevice.a.b;

final class q
  implements DialogInterface.OnCancelListener
{
  q(p paramp, b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.fTW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.q
 * JD-Core Version:    0.6.2
 */