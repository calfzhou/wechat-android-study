package com.tencent.mm.ui.bindlinkedin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ar
  implements DialogInterface.OnClickListener
{
  ar(ListLinkedInFriendUI paramListLinkedInFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    ListLinkedInFriendUI.d(this.jjM);
    ListLinkedInFriendUI.e(this.jjM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.ar
 * JD-Core Version:    0.6.2
 */