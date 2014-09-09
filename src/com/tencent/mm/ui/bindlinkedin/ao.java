package com.tencent.mm.ui.bindlinkedin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ao
  implements DialogInterface.OnClickListener
{
  ao(ListLinkedInFriendUI paramListLinkedInFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ListLinkedInFriendUI.i(this.jjM);
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    ListLinkedInFriendUI.d(this.jjM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.ao
 * JD-Core Version:    0.6.2
 */