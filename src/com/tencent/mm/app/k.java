package com.tencent.mm.app;

import android.app.ActivityManager;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class k extends Thread
{
  public k(h paramh)
  {
    super("ANR Parser");
  }

  private static ActivityManager.ProcessErrorStateInfo ic()
  {
    List localList = ((ActivityManager)ak.getContext().getSystemService("activity")).getProcessesInErrorState();
    if (localList == null)
      return null;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.ProcessErrorStateInfo localProcessErrorStateInfo = (ActivityManager.ProcessErrorStateInfo)localIterator.next();
      if ((localProcessErrorStateInfo.uid == Process.myUid()) && (localProcessErrorStateInfo.condition == 2))
        return localProcessErrorStateInfo;
    }
    return null;
  }

  public final void run()
  {
    long l = System.currentTimeMillis();
    z.i("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "ANR Parser started.");
    ActivityManager.ProcessErrorStateInfo localProcessErrorStateInfo1 = null;
    while (true)
    {
      if (this.cGs.cGn.block(10000L))
        this.cGs.cGn.close();
      try
      {
        Thread.sleep(500L);
        label45: localProcessErrorStateInfo1 = ic();
        if (localProcessErrorStateInfo1 == null)
          continue;
        if (localProcessErrorStateInfo1 == null)
        {
          localProcessErrorStateInfo1 = ic();
          if (localProcessErrorStateInfo1 == null)
          {
            z.w("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "ANR process not found, exit thread.");
            this.cGs.cGr = null;
            return;
          }
        }
        ActivityManager.ProcessErrorStateInfo localProcessErrorStateInfo2 = localProcessErrorStateInfo1;
        z.i("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "Got ANR process: " + localProcessErrorStateInfo2.processName + " @ " + localProcessErrorStateInfo2.pid);
        synchronized (this.cGs.cGj)
        {
          ArrayList localArrayList = new ArrayList(this.cGs.cGj.size());
          int i = this.cGs.cGm.lastIndexOf('.');
          if (i != -1)
          {
            String str1 = localProcessErrorStateInfo2.processName;
            String str2 = this.cGs.cGm.substring(0, i) + '_' + str1 + this.cGs.cGm.substring(i);
            if (this.cGs.cGj.remove(str2))
              localArrayList.add(str2);
          }
          if (this.cGs.cGj.remove(this.cGs.cGm))
            localArrayList.add(this.cGs.cGm);
          localArrayList.addAll(this.cGs.cGj);
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext())
          {
            String str3 = (String)localIterator.next();
            String str4 = this.cGs.cGk + '/' + str3;
            String str5 = h.a(str4, localProcessErrorStateInfo2.pid, l, localProcessErrorStateInfo2);
            if (str5 != null)
              this.cGs.d(str5, localProcessErrorStateInfo2.pid);
          }
          z.i("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "ANR Parser ended.");
          this.cGs.cGr = null;
          return;
        }
      }
      catch (Exception localException)
      {
        break label45;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.k
 * JD-Core Version:    0.6.2
 */