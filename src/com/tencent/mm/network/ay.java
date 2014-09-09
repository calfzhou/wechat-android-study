package com.tencent.mm.network;

import com.tencent.mm.sdk.platformtools.cb;

final class ay extends cb
{
  ay(ao paramao, Object paramObject)
  {
    super(3000L, paramObject);
  }

  public final Object run()
  {
    Java2C.onNetworkChange();
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ay
 * JD-Core Version:    0.6.2
 */