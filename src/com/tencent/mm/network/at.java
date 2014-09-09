package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.mm.sdk.platformtools.cb;

final class at extends cb
{
  at(ao paramao, Integer paramInteger, ak paramak, ac paramac)
  {
    super(3000L, paramInteger);
  }

  private Integer Dd()
  {
    try
    {
      Integer localInteger = Integer.valueOf(ao.a(this.dTs, this.dTw, this.dTy));
      return localInteger;
    }
    catch (RemoteException localRemoteException)
    {
      ao.d(this.dTs);
    }
    return Integer.valueOf(-1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.at
 * JD-Core Version:    0.6.2
 */