package com.tencent.mm.app;

import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.z;

final class y
  implements Runnable
{
  y(WorkerProfile paramWorkerProfile)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis();
    z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "start time check appOnCreate init through thread");
    this.cGV.H(true);
    boolean bool = this.cGV.io().cGY.quit();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
    arrayOfObject[1] = Boolean.valueOf(bool);
    z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "start time check appOnCreate init through thread end, use time %d, result %b", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.y
 * JD-Core Version:    0.6.2
 */