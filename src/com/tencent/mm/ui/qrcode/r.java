package com.tencent.mm.ui.qrcode;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.af.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class r
  implements DialogInterface.OnCancelListener
{
  r(ShowQRCodeStep1UI paramShowQRCodeStep1UI, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jLh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.r
 * JD-Core Version:    0.6.2
 */