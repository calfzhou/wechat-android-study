package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.mm.sdk.platformtools.cb;

final class bd extends cb
{
  bd(bc parambc, ak paramak, int paramInt1, int paramInt2)
  {
    super(1000L, null);
  }

  protected final Object run()
  {
    try
    {
      ao localao = bc.a(this.dTR);
      ak localak = this.dTQ;
      ao.a(localao, localak);
      label28: return null;
    }
    catch (RemoteException localRemoteException)
    {
      break label28;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bd
 * JD-Core Version:    0.6.2
 */