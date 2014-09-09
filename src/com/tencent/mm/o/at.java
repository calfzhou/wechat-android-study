package com.tencent.mm.o;

import android.os.RemoteException;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.o;
import com.tencent.mm.network.y;
import com.tencent.mm.pointers.PString;

final class at
  implements Runnable
{
  at(ar paramar, o paramo, y paramy, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    PString localPString = new PString();
    ar localar = new ar(ar.a(this.dpu).a(new al(this.dpv), localPString), this.dpu.gQj);
    try
    {
      this.dpw.a(localar, this.dpx, this.dpy, localPString.value);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.at
 * JD-Core Version:    0.6.2
 */