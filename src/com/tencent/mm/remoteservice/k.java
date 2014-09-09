package com.tencent.mm.remoteservice;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.List;

final class k
  implements ServiceConnection
{
  k(j paramj)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    j.a(this.ibE, g.y(paramIBinder));
    Runnable[] arrayOfRunnable = (Runnable[])j.a(this.ibE).toArray(new Runnable[j.a(this.ibE).size()]);
    int i = arrayOfRunnable.length;
    for (int j = 0; j < i; j++)
      arrayOfRunnable[j].run();
    j.a(this.ibE).clear();
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    j.a(this.ibE, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.k
 * JD-Core Version:    0.6.2
 */