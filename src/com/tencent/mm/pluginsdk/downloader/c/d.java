package com.tencent.mm.pluginsdk.downloader.c;

import java.util.concurrent.ThreadFactory;

public final class d
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    return new c(paramRunnable);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.c.d
 * JD-Core Version:    0.6.2
 */