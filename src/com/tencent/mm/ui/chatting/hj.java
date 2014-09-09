package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.c.a.lm;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.i;

final class hj
  implements DialogInterface.OnClickListener
{
  hj(hd paramhd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    lm locallm = new lm();
    locallm.cOG.cOJ = true;
    a.aGB().g(locallm);
    hd.b(this.jtA, this.jtA.jnf.getUsername());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hj
 * JD-Core Version:    0.6.2
 */