package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.mm.sdk.platformtools.cb;

final class bb extends cb
{
  bb(ba paramba, ak paramak, int paramInt1, int paramInt2, String paramString)
  {
    super(1000L, null);
  }

  protected final Object run()
  {
    try
    {
      ao localao = ba.a(this.dTP);
      ak localak = this.dTN;
      ao.a(localao, localak, this.dTO);
      label32: return null;
    }
    catch (RemoteException localRemoteException)
    {
      break label32;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bb
 * JD-Core Version:    0.6.2
 */