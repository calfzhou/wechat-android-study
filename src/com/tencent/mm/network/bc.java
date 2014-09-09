package com.tencent.mm.network;

import com.tencent.mm.jni.platformcomm.WakerLock;
import com.tencent.mm.sdk.platformtools.cb;

final class bc extends z
  implements ac
{
  private WakerLock dTM;
  private ao dht;

  public bc(ao paramao, WakerLock paramWakerLock)
  {
    this.dht = paramao;
    this.dTM = paramWakerLock;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, ak paramak, byte[] paramArrayOfByte)
  {
  }

  public final void a(ak paramak, int paramInt1, int paramInt2, String paramString)
  {
    this.dTM.lock(1000L);
    new bd(this, paramak, paramInt1, paramInt2).b(ao.a(this.dht));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bc
 * JD-Core Version:    0.6.2
 */