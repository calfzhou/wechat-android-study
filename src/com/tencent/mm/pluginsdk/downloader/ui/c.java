package com.tencent.mm.pluginsdk.downloader.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class c
  implements DialogInterface.OnCancelListener
{
  c(ProgressDialogUI paramProgressDialogUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.htR.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.ui.c
 * JD-Core Version:    0.6.2
 */