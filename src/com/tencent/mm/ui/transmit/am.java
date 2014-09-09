package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class am
  implements DialogInterface.OnCancelListener
{
  am(ShareImageSelectorUI paramShareImageSelectorUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    ShareImageSelectorUI.b(this.jYO);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.am
 * JD-Core Version:    0.6.2
 */