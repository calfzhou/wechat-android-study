package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.ak.a;

final class k
  implements DialogInterface.OnCancelListener
{
  k(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.jYo.jYn != null)
      this.jYo.jYn.cancel();
    this.jYo.jYm = true;
    this.jYo.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.k
 * JD-Core Version:    0.6.2
 */