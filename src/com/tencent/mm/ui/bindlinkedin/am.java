package com.tencent.mm.ui.bindlinkedin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class am
  implements DialogInterface.OnCancelListener
{
  am(ListLinkedInFriendUI paramListLinkedInFriendUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(ListLinkedInFriendUI.h(this.jjM));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.am
 * JD-Core Version:    0.6.2
 */