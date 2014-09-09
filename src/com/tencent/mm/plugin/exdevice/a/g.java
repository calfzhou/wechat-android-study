package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.ao.a;
import com.tencent.mm.ao.b;
import com.tencent.mm.plugin.exdevice.c.k;
import com.tencent.mm.plugin.exdevice.c.l;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;

public final class g extends e
{
  public g(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    z.i("!76@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6QIC9aBxJ7fXcaAjFMY2WK3SFcc3IITWEM4QBXI6noVQ=", "ExDeviceCmdSendDataToManufacturer deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
  }

  protected final a T(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6QIC9aBxJ7fXcaAjFMY2WK3SFcc3IITWEM4QBXI6noVQ=", "data is null");
      return null;
    }
    k localk = new k();
    try
    {
      localk.W(paramArrayOfByte);
      this.eIl = localk;
      z.i("!76@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6QIC9aBxJ7fXcaAjFMY2WK3SFcc3IITWEM4QBXI6noVQ=", "SendDataToManufacturerSvrRequest cmd has been received");
      return localk;
    }
    catch (IOException localIOException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localIOException.getMessage();
      z.e("!76@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6QIC9aBxJ7fXcaAjFMY2WK3SFcc3IITWEM4QBXI6noVQ=", "SendDataToManufacturerSvrRequest.parseFrom Failed!!! %s", arrayOfObject);
    }
    return null;
  }

  public final void b(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    z.i("!76@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6QIC9aBxJ7fXcaAjFMY2WK3SFcc3IITWEM4QBXI6noVQ=", "setSendDataToManufacturerResponse ret = " + paramInt + paramString);
    l locall = new l();
    locall.eJQ = k(paramInt, paramString);
    if (paramArrayOfByte == null)
      paramArrayOfByte = new byte[0];
    locall.dZx = new b(paramArrayOfByte);
    this.eIk = locall;
    a((short)20002);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.g
 * JD-Core Version:    0.6.2
 */