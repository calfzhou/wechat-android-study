package com.tencent.mm.network;

import com.tencent.mm.jni.platformcomm.WakerLock;
import com.tencent.mm.protocal.f;
import com.tencent.mm.sdk.platformtools.cb;
import com.tencent.mm.sdk.platformtools.ch;

final class ba extends z
  implements ac
{
  private WakerLock dTM;
  private ao dht;

  public ba(ao paramao, WakerLock paramWakerLock)
  {
    this.dht = paramao;
    this.dTM = paramWakerLock;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, ak paramak, byte[] paramArrayOfByte)
  {
    if ((paramak.tO().tQ() != 0) || (paramInt2 != 0))
    {
      if (-102 == paramInt3)
      {
        ao.a(this.dht, paramInt1);
        paramak.b(ao.b(this.dht), ao.c(this.dht), 0, 0);
        return;
      }
      if (-301 == paramInt3)
        paramak.a(ao.b(this.dht), paramInt2, paramInt3);
      while (true)
      {
        ao.a(this.dht, paramInt2, paramInt3, "autoauth_errmsg_" + ch.Y(paramString, ""));
        return;
        if (-105 == paramInt3)
          paramak.a(ao.b(this.dht), paramInt2, paramInt3);
        else if (-17 == paramInt3)
          paramak.a(ao.b(this.dht), paramInt2, paramInt3);
      }
    }
    paramak.a(ao.b(this.dht), paramInt2, paramInt3);
  }

  public final void a(ak paramak, int paramInt1, int paramInt2, String paramString)
  {
    this.dTM.lock(1000L);
    new bb(this, paramak, paramInt1, paramInt2, paramString).b(ao.a(this.dht));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ba
 * JD-Core Version:    0.6.2
 */