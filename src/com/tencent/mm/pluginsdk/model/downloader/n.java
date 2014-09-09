package com.tencent.mm.pluginsdk.model.downloader;

public abstract interface n
{
  public abstract void onDownloadError(long paramLong);

  public abstract void onDownloadFinished(long paramLong);

  public abstract void onRemoveDownloadTaskFailed(long paramLong);

  public abstract void onRemoveDownloadTaskSucceed(long paramLong);

  public abstract void onStartFailed(String paramString);

  public abstract void onStartSucceed(long paramLong, String paramString);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.n
 * JD-Core Version:    0.6.2
 */