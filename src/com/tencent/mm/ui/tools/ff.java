package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class ff
  implements DialogInterface.OnDismissListener
{
  ff(NewTaskUI paramNewTaskUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    NewTaskUI.c(this.jUn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ff
 * JD-Core Version:    0.6.2
 */