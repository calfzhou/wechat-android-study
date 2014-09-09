package com.tencent.mm.ui.e;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.z;
import java.text.SimpleDateFormat;
import java.util.Date;

final class b
  implements at
{
  b(a parama)
  {
  }

  public final boolean onLog(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2)
  {
    if (paramThread == null);
    String str;
    while (true)
    {
      return false;
      long l = paramThread.getId();
      if (paramLong1 > a.a(this.jXI))
        if (paramMessage != null)
          str = "|HMonitor dispatch|msg = " + paramMessage + "|handler = " + paramMessage.getTarget() + "|threadName = " + paramThread.getName() + "|threadId = " + paramThread.getId() + "|priority = " + paramThread.getPriority() + "|usedTime = " + paramLong1 + "|cpuTime = " + paramLong2;
      while (str != null)
      {
        if (!a.c(this.jXI))
          break label330;
        z.i("!44@/B4Tb64lLpKt4OWd5OHuPC+IfVrbYXPiiFECu72P1p0=", str);
        return false;
        str = null;
        if (paramRunnable != null)
        {
          str = "|HMonitor run task|" + paramRunnable.toString();
          continue;
          boolean bool1 = paramLong1 < a.b(this.jXI);
          str = null;
          if (bool1)
          {
            boolean bool2 = l < a.lz();
            str = null;
            if (!bool2)
              if (paramMessage != null)
              {
                str = "|HMonitor dispatch|msg = " + paramMessage + "|handler = " + paramMessage.getTarget() + "|threadName = " + paramThread.getName() + "|threadId = " + paramThread.getId() + "|priority = " + paramThread.getPriority() + "|usedTime = " + paramLong1 + "|cpuTime = " + paramLong2;
              }
              else
              {
                str = null;
                if (paramRunnable != null)
                  str = "|HMonitor run task|" + paramRunnable.toString();
              }
          }
        }
      }
    }
    label330: a.a(this.jXI, a.bbK().format(new Date()) + str + "\n");
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.b
 * JD-Core Version:    0.6.2
 */