package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.c.a.bh;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.i;

final class kg
  implements DialogInterface.OnClickListener
{
  kg(hd paramhd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jtA.aVM();
    bh localbh = new bh();
    localbh.cIk.username = this.jtA.jnf.getUsername();
    a.aGB().g(localbh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kg
 * JD-Core Version:    0.6.2
 */