package com.tencent.mm.ui.qrcode;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.am;
import com.tencent.mm.o.ac;

final class i
  implements DialogInterface.OnCancelListener
{
  i(g paramg, am paramam)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.hqK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.i
 * JD-Core Version:    0.6.2
 */