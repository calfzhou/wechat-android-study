package com.tencent.mm.pluginsdk.downloader.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger;

final class b
  implements DialogInterface.OnClickListener
{
  b(ProgressDialogUI paramProgressDialogUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    FileDownloadManger.cu(this.htR.htC);
    com.tencent.mm.pluginsdk.downloader.c.bcs().htF = com.tencent.mm.pluginsdk.downloader.a.c.htI;
    this.htR.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.ui.b
 * JD-Core Version:    0.6.2
 */