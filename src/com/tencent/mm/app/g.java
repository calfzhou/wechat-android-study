package com.tencent.mm.app;

import android.os.HandlerThread;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.LauncherUI;

final class g
  implements Runnable
{
  g(f paramf)
  {
  }

  public final void run()
  {
    z.i("!24@/B4Tb64lLpKk4tudMInS/w==", "start time check post run: " + (System.currentTimeMillis() - LauncherUI.iJC));
    if (!WorkerProfile.jdMethod_if().in())
    {
      WorkerProfile localWorkerProfile = WorkerProfile.jdMethod_if();
      ai localai1 = localWorkerProfile.io();
      if ((localai1.cGY == null) || (!localai1.cGY.isAlive()))
        z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "setHighPriority failed thread is dead");
      while (true)
      {
        ai localai2 = localWorkerProfile.io();
        y localy = new y(localWorkerProfile);
        localai2.gQj.post(localy);
        z.i("!24@/B4Tb64lLpKk4tudMInS/w==", "start time check notifyALLinit not hascreate: " + (System.currentTimeMillis() - LauncherUI.iJC));
        if (e.a(this.cGa.cFZ))
          this.cGa.cFZ.hP();
        return;
        int i = localai1.cGY.getThreadId();
        try
        {
          if (-8 != Process.getThreadPriority(i))
            break label203;
          z.w("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "setHighPriority No Need.");
        }
        catch (Exception localException)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(i);
          z.w("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "thread:%d setHighPriority failed", arrayOfObject1);
        }
        continue;
        label203: Process.setThreadPriority(i, -8);
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(i);
        arrayOfObject2[1] = Integer.valueOf(Process.getThreadPriority(i));
        z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "InitThreadController:%d setHighPriority to %d", arrayOfObject2);
      }
    }
    WorkerProfile.jdMethod_if().ie();
    z.i("!24@/B4Tb64lLpKk4tudMInS/w==", "start time check notifyALLinit  hascreate: " + (System.currentTimeMillis() - LauncherUI.iJC));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.g
 * JD-Core Version:    0.6.2
 */