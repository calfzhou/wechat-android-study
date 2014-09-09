package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.plugin.exdevice.a.j;
import com.tencent.mm.plugin.exdevice.b.ad;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.n;
import com.tencent.mm.sdk.platformtools.z;

public final class g extends ad
{
  private com.tencent.mm.plugin.exdevice.a.d eKS;
  private a eKT;

  public g(byte[] paramArrayOfByte, long paramLong)
  {
    this.eKS = new j(paramArrayOfByte, paramLong);
  }

  public final boolean a(af paramaf, d paramd)
  {
    if (!an.PN().aF(this.eKS.HW()))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(this.eKS.HW());
      z.e("!76@/B4Tb64lLpLHXwcx366fGpXLwCwAhyrauoVjXXFmpyxAFXO9zZGKDkSWDXDBg9JmEbpgCpI3+Bg=", "Service push data to device before it do auth, device id = %d", arrayOfObject);
      return true;
    }
    this.eKT = new a(this.eKS, paramd);
    return this.eKT.c(paramaf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.g
 * JD-Core Version:    0.6.2
 */