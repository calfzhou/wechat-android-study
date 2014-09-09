package com.tencent.mm.network;

import com.tencent.mm.sdk.platformtools.cb;

final class aw extends cb
{
  aw(ao paramao, Object paramObject, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(3000L, paramObject);
  }

  public final Object run()
  {
    Java2C.setDebugIP(this.dTF, this.dTG, this.dTH, this.dTI);
    Java2C.onNetworkChange();
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.aw
 * JD-Core Version:    0.6.2
 */