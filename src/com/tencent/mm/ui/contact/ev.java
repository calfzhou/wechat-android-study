package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class ev
  implements DialogInterface.OnCancelListener
{
  ev(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    SelectContactUI.M(this.jBX);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ev
 * JD-Core Version:    0.6.2
 */