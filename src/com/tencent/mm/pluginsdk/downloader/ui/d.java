package com.tencent.mm.pluginsdk.downloader.ui;

import android.widget.ProgressBar;
import com.tencent.mm.pluginsdk.model.downloader.n;
import com.tencent.mm.sdk.platformtools.z;

final class d
  implements n
{
  d(ProgressDialogUI paramProgressDialogUI)
  {
  }

  public final void onDownloadError(long paramLong)
  {
    z.i("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", "onDownloadError" + paramLong);
    if (paramLong == this.htR.htC)
      this.htR.finish();
  }

  public final void onDownloadFinished(long paramLong)
  {
    z.i("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", "onDownloadFinished" + paramLong);
    if (paramLong == this.htR.htC)
    {
      if (this.htR.eBw != null)
        this.htR.eBw.setProgress(100);
      this.htR.finish();
    }
  }

  public final void onRemoveDownloadTaskFailed(long paramLong)
  {
    z.i("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", "onRemoveDownloadTaskFailed" + paramLong);
    if (paramLong == this.htR.htC)
      this.htR.finish();
  }

  public final void onRemoveDownloadTaskSucceed(long paramLong)
  {
    z.i("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", "onRemoveDownloadTaskSucceed" + paramLong);
    if (paramLong == this.htR.htC)
      this.htR.finish();
  }

  public final void onStartFailed(String paramString)
  {
    z.i("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", "onStartFailed" + paramString);
    this.htR.finish();
  }

  public final void onStartSucceed(long paramLong, String paramString)
  {
    z.i("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", "onStartSucceed");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.ui.d
 * JD-Core Version:    0.6.2
 */