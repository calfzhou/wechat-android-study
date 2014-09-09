package com.tencent.mm.ui.bindgooglecontact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class x
  implements DialogInterface.OnCancelListener
{
  x(GoogleFriendUI paramGoogleFriendUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    GoogleFriendUI.c(this.jiK);
    bg.qX().c(GoogleFriendUI.d(this.jiK));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.x
 * JD-Core Version:    0.6.2
 */