package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.ui.base.aa;

final class m
  implements DialogInterface.OnClickListener
{
  m(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((AppUpdaterUI.b(this.iBB) != null) && (!AppUpdaterUI.b(this.iBB).isShowing()))
      AppUpdaterUI.b(this.iBB).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.m
 * JD-Core Version:    0.6.2
 */