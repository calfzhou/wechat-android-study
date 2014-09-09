package com.tencent.mm.pluginsdk.ui.chat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.c.a.lm;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;

final class i
  implements DialogInterface.OnClickListener
{
  i(h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    lm locallm = new lm();
    locallm.cOG.cOJ = true;
    a.aGB().g(locallm);
    AppPanel.k(this.hCJ.hCI).Zd();
    paramDialogInterface.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.i
 * JD-Core Version:    0.6.2
 */