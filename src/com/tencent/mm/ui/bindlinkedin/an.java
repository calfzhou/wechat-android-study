package com.tencent.mm.ui.bindlinkedin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class an
  implements DialogInterface.OnClickListener
{
  an(ListLinkedInFriendUI paramListLinkedInFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramDialogInterface != null)
    {
      paramDialogInterface.dismiss();
      this.jjM.finish();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.an
 * JD-Core Version:    0.6.2
 */