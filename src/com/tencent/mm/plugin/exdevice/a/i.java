package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.ao.a;
import com.tencent.mm.plugin.exdevice.c.c;
import com.tencent.mm.plugin.exdevice.c.n;
import com.tencent.mm.sdk.platformtools.z;

public final class i extends k
{
  public i(int paramInt1, int paramInt2, long paramLong)
  {
    n localn = new n();
    localn.eJO = new c();
    localn.eJS = paramInt1;
    localn.eJT = paramInt2;
    this.eIk = localn;
    an(paramLong);
    a((short)30002);
  }

  public final byte[] OO()
  {
    try
    {
      byte[] arrayOfByte = this.eIk.toByteArray();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6VpYuidBB5VehOQrMSprQ1LCYpxRwpDKn", "mResp.toByteArray() Failed!!! %s", arrayOfObject);
    }
    return null;
  }

  public final int wy()
  {
    n localn = (n)this.eIk;
    if (localn == null)
    {
      z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6VpYuidBB5VehOQrMSprQ1LCYpxRwpDKn", "null = pushReq");
      return -1;
    }
    return localn.eJS;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.i
 * JD-Core Version:    0.6.2
 */