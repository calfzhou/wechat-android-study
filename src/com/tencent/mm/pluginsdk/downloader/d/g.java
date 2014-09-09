package com.tencent.mm.pluginsdk.downloader.d;

import com.tencent.mm.pluginsdk.downloader.c.d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class g extends ThreadPoolExecutor
{
  public g()
  {
    super(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.d.g
 * JD-Core Version:    0.6.2
 */