package com.tencent.mm.pluginsdk.downloader.intentservice;

import android.app.NotificationManager;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.app.aj;

public class DownloadReceiver extends ResultReceiver
{
  private static final String TAG = DownloadReceiver.class.getSimpleName();
  private final NotificationManager htO;
  private aj htP;

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    super.onReceiveResult(paramInt, paramBundle);
    if (paramInt == 4657)
    {
      int i = paramBundle.getInt("progress");
      if (i < 100)
      {
        this.htP.c(100, i).b("Download in progress:" + i);
        this.htO.notify(4657, this.htP.build());
      }
    }
    else
    {
      return;
    }
    this.htP.c(0, 0).b("Download Complete");
    this.htO.notify(4658, this.htP.build());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.intentservice.DownloadReceiver
 * JD-Core Version:    0.6.2
 */