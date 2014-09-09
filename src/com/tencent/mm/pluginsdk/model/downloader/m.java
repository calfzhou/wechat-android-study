package com.tencent.mm.pluginsdk.model.downloader;

import android.os.Build.VERSION;

public final class m
{
  private static l hwm;

  public static l azp()
  {
    if (Build.VERSION.SDK_INT >= 9)
      if (hwm == null)
        hwm = new i();
    while (true)
    {
      return hwm;
      if (hwm == null)
        hwm = new j();
    }
  }

  public static l azq()
  {
    j localj = new j();
    hwm = localj;
    return localj;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.m
 * JD-Core Version:    0.6.2
 */