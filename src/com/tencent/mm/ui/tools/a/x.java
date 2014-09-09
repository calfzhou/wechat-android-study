package com.tencent.mm.ui.tools.a;

import android.os.Process;
import com.tencent.mm.sdk.platformtools.cm;
import java.lang.ref.ReferenceQueue;

final class x extends Thread
{
  private final cm gQj;
  private final ReferenceQueue jXc;

  x(ReferenceQueue paramReferenceQueue, cm paramcm)
  {
    this.jXc = paramReferenceQueue;
    this.gQj = paramcm;
    setDaemon(true);
    setName("!12@Lf5YQiC4qMQ=refQueue");
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      while (true)
      {
        b localb = (b)this.jXc.remove();
        this.gQj.sendMessage(this.gQj.obtainMessage(3, localb.jWw));
      }
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    catch (Exception localException)
    {
      this.gQj.post(new y(this, localException));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.x
 * JD-Core Version:    0.6.2
 */