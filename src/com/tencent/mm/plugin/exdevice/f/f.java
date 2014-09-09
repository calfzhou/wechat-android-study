package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.ao.b;
import com.tencent.mm.plugin.exdevice.b.ad;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.n;

public final class f extends ad
{
  private com.tencent.mm.plugin.exdevice.a.f eKQ;
  private a eKR;
  private int ejr;

  public f(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.eKQ = new com.tencent.mm.plugin.exdevice.a.f(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.ejr = paramInt1;
  }

  public final boolean a(af paramaf, d paramd)
  {
    if (!an.PN().aF(this.eKQ.HW()))
    {
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Long.valueOf(this.eKQ.HW());
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGs8wj2e4UXPuzVqBwxnxHAc1qLJY8AKwgw==", "This device send other cmd before do auth, device id = %d", arrayOfObject5);
      this.eKQ.a(-2, "", new byte[0], new byte[0], 0, 0);
      this.eKR = new a(this.eKQ, paramd);
      boolean bool3 = this.eKR.c(paramaf);
      Object[] arrayOfObject6 = new Object[1];
      arrayOfObject6[0] = Boolean.valueOf(bool3);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGs8wj2e4UXPuzVqBwxnxHAc1qLJY8AKwgw==", "init start task : %b", arrayOfObject6);
      return bool3;
    }
    if ((-5 == this.ejr) || (-3 == this.ejr) || (-4 == this.ejr))
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.ejr);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGs8wj2e4UXPuzVqBwxnxHAc1qLJY8AKwgw==", "Error Code = %d, reply errorcode to device and close channel", arrayOfObject1);
      this.eKQ.a(-1, "", new byte[0], new byte[0], 0, 0);
      this.eKR = new a(this.eKQ, paramd);
      boolean bool1 = this.eKR.c(paramaf);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(bool1);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGs8wj2e4UXPuzVqBwxnxHAc1qLJY8AKwgw==", "init start task : %b", arrayOfObject2);
      return bool1;
    }
    com.tencent.mm.plugin.exdevice.c.f localf = (com.tencent.mm.plugin.exdevice.c.f)this.eKQ.OQ();
    if (localf == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGs8wj2e4UXPuzVqBwxnxHAc1qLJY8AKwgw==", "Init Request parse failed, Tell device before stop this task");
      this.eKQ.a(-4, "", new byte[0], new byte[0], 0, 0);
      this.eKR = new a(this.eKQ, paramd);
      boolean bool2 = this.eKR.c(paramaf);
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Boolean.valueOf(bool2);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGs8wj2e4UXPuzVqBwxnxHAc1qLJY8AKwgw==", "init start task : %b", arrayOfObject4);
      return bool2;
    }
    if (localf.eJC != null);
    for (byte[] arrayOfByte1 = localf.eJC.toByteArray(); ; arrayOfByte1 = null)
    {
      if (localf.eJB != null);
      for (byte[] arrayOfByte2 = localf.eJB.toByteArray(); ; arrayOfByte2 = null)
      {
        com.tencent.mm.plugin.exdevice.b.z.Pr();
        int i = com.tencent.mm.plugin.exdevice.b.f.Pb();
        switch (i)
        {
        default:
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(i);
          com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGs8wj2e4UXPuzVqBwxnxHAc1qLJY8AKwgw==", "initScene = %d, Cannot start init response", arrayOfObject3);
        case 1:
        case 2:
        }
        this.eKQ.a(0, null, arrayOfByte2, arrayOfByte1, i, (int)(com.tencent.mm.plugin.exdevice.g.a.PY() / 1000L));
        this.eKR = new a(this.eKQ, paramd);
        return this.eKR.c(paramaf);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.f
 * JD-Core Version:    0.6.2
 */