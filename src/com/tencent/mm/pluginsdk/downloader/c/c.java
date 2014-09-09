package com.tencent.mm.pluginsdk.downloader.c;

import android.os.Process;

final class c extends Thread
{
  public c(Runnable paramRunnable)
  {
    super(paramRunnable);
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.c.c
 * JD-Core Version:    0.6.2
 */