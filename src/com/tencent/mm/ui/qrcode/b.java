package com.tencent.mm.ui.qrcode;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class b
  implements DialogInterface.OnCancelListener
{
  b(GetQRCodeInfoUI paramGetQRCodeInfoUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.jKZ.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.b
 * JD-Core Version:    0.6.2
 */