package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class h
  implements DialogInterface.OnCancelListener
{
  h(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    e.a(this.jYo, n.bTe, n.buo, n.buB, n.btP, new i(this), new j(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.h
 * JD-Core Version:    0.6.2
 */