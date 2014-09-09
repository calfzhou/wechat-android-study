package com.tencent.mm.plugin.safedevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.o.ac;

final class j
  implements DialogInterface.OnCancelListener
{
  j(MySafeDeviceListUI paramMySafeDeviceListUI, ab paramab)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.fUf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.j
 * JD-Core Version:    0.6.2
 */