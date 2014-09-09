package com.tencent.mm.o;

import android.os.RemoteException;
import com.tencent.mm.network.y;

final class au
  implements Runnable
{
  au(ar paramar, y paramy, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    ar localar = new ar(new w(), this.dpu.gQj);
    try
    {
      this.dpw.a(localar, this.dpx, this.dpy, "");
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.au
 * JD-Core Version:    0.6.2
 */