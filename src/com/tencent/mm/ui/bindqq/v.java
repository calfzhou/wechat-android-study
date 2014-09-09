package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ao;
import com.tencent.mm.o.ac;

final class v
  implements DialogInterface.OnCancelListener
{
  v(QQGroupUI paramQQGroupUI, ao paramao)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jle);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.v
 * JD-Core Version:    0.6.2
 */