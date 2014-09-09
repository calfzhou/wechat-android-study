package com.tencent.mm.pluginsdk.model.downloader;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.z;

@TargetApi(9)
final class d extends DownloadManager.Query
{
  private DownloadManager hvW;

  public d(Context paramContext)
  {
    this.hvW = ((DownloadManager)paramContext.getSystemService("download"));
  }

  public final Cursor cw(long paramLong)
  {
    setFilterById(new long[] { paramLong });
    if (Build.VERSION.SDK_INT >= 9)
      try
      {
        Cursor localCursor = this.hvW.query(this);
        return localCursor;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localException.toString();
        arrayOfObject[1] = Long.valueOf(paramLong);
        z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "query downloadinfo from downloadmanager failed:[%s], downloadid[%d]", arrayOfObject);
      }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.d
 * JD-Core Version:    0.6.2
 */