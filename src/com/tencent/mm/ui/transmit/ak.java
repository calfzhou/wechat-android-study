package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ak
  implements DialogInterface.OnClickListener
{
  ak(ShareImageSelectorUI paramShareImageSelectorUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (ShareImageSelectorUI.bbX() == 1)
      ShareImageSelectorUI.c(this.jYO);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.ak
 * JD-Core Version:    0.6.2
 */