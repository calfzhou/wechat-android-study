package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;

public final class c extends e
{
  public c(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6jxeWevDDq7rRhzQcUHGNDA==", "ExDeviceCmdAuth deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
  }

  protected final com.tencent.mm.ao.a T(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6jxeWevDDq7rRhzQcUHGNDA==", "paras body is null");
      return null;
    }
    com.tencent.mm.plugin.exdevice.c.a locala = new com.tencent.mm.plugin.exdevice.c.a();
    try
    {
      locala.U(paramArrayOfByte);
      this.eIl = locala;
      z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6jxeWevDDq7rRhzQcUHGNDA==", "------AuthRequest------ ClientVersion = " + locala.eJq + " DeviceName = " + locala.eJw + " Language = " + locala.eJv + " TimeZone = " + locala.eJu);
      return locala;
    }
    catch (IOException localIOException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localIOException.getMessage();
      z.e("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6jxeWevDDq7rRhzQcUHGNDA==", "AuthRequest.parseFrom Failed!!! %s", arrayOfObject);
    }
    return null;
  }

  public final void a(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6jxeWevDDq7rRhzQcUHGNDA==", "------setAuthResponse------ret = " + paramInt + "errMsg = " + paramString);
    com.tencent.mm.plugin.exdevice.c.b localb = new com.tencent.mm.plugin.exdevice.c.b();
    localb.eJQ = k(paramInt, paramString);
    localb.eJx = com.tencent.mm.ao.b.aO(paramArrayOfByte);
    this.eIk = localb;
    a((short)20001);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.c
 * JD-Core Version:    0.6.2
 */