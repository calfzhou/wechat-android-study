package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class fe
  implements DialogInterface.OnCancelListener
{
  fe(NewTaskUI paramNewTaskUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (NewTaskUI.jUk != null)
    {
      NewTaskUI.jUk = null;
      this.jUn.finish();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fe
 * JD-Core Version:    0.6.2
 */