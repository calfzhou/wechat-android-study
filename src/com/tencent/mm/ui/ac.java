package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;

final class ac
  implements DialogInterface.OnCancelListener
{
  ac(ExposeUI paramExposeUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(ExposeUI.d(this.iIX));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ac
 * JD-Core Version:    0.6.2
 */