package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.mm.network.a.a;
import com.tencent.mm.network.a.c;

final class i
  implements Runnable
{
  i(int paramInt1, c paramc, a parama, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public final void run()
  {
    try
    {
      if (this.dSZ > 0)
      {
        this.dTa.a(4, 0, "", this.dSZ, "wifiRecv:" + this.dSZ, true);
        this.dTb.a(4, "", Integer.valueOf(this.dSZ));
      }
      if (this.dTc > 0)
      {
        this.dTa.a(5, 0, "", this.dTc, "wifiSend:" + this.dTc, true);
        this.dTb.a(5, "", Integer.valueOf(this.dTc));
      }
      if (this.dTd > 0)
      {
        this.dTa.a(4, 0, "", this.dTd, "mobileRecv:" + this.dTd, false);
        this.dTb.a(4, "", Integer.valueOf(this.dTd));
      }
      if (this.dTe > 0)
      {
        this.dTa.a(5, 0, "", this.dTe, "mobileSend:" + this.dTe, false);
        this.dTb.a(5, "", Integer.valueOf(this.dTe));
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.i
 * JD-Core Version:    0.6.2
 */