package com.tencent.mm.ui.tools.a;

import android.os.Process;

final class ah extends Thread
{
  public ah(Runnable paramRunnable)
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
 * Qualified Name:     com.tencent.mm.ui.tools.a.ah
 * JD-Core Version:    0.6.2
 */