package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.ui.base.aa;

final class j
  implements DialogInterface.OnClickListener
{
  j(h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (MsgRetransmitUI.b(this.jYp.jYo) != null)
      MsgRetransmitUI.b(this.jYp.jYo).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.j
 * JD-Core Version:    0.6.2
 */