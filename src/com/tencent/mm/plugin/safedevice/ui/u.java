package com.tencent.mm.plugin.safedevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.safedevice.a.a;

final class u
  implements DialogInterface.OnCancelListener
{
  u(t paramt, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.fUo);
    SafeDeviceListPreference.c(this.fUp.fUn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.u
 * JD-Core Version:    0.6.2
 */