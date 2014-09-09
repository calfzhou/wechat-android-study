package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.ao.a;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;

public abstract class e extends d
{
  protected a eIl = null;
  private short eIm = -1;
  private short eIn = -1;

  public e(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6HNGwNxOTK8BMNjhNDsegTc0D8/m5lKjv", "onDeviceRequest deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    an(paramLong);
    this.eIm = ((short)paramInt2);
    this.eIn = ((short)paramInt1);
    T(paramArrayOfByte);
  }

  public final short OL()
  {
    return this.eIm;
  }

  public final short OM()
  {
    return this.eIn;
  }

  public final byte[] OO()
  {
    try
    {
      byte[] arrayOfByte = this.eIk.toByteArray();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localIOException.getMessage();
      z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6HNGwNxOTK8BMNjhNDsegTc0D8/m5lKjv", "mResp.toByteArray() Failed!!! %s", arrayOfObject);
    }
    return null;
  }

  public final a OQ()
  {
    return this.eIl;
  }

  protected abstract a T(byte[] paramArrayOfByte);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.e
 * JD-Core Version:    0.6.2
 */