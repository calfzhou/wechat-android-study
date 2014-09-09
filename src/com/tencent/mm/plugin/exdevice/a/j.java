package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.ao.a;
import com.tencent.mm.ao.b;
import com.tencent.mm.plugin.exdevice.c.c;
import com.tencent.mm.plugin.exdevice.c.h;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import junit.framework.Assert;

public final class j extends k
{
  public j(byte[] paramArrayOfByte, long paramLong)
  {
    h localh = new h();
    localh.eJO = new c();
    localh.dZx = new b(paramArrayOfByte);
    this.eIk = localh;
    an(paramLong);
    a((short)30001);
  }

  public final byte[] OO()
  {
    Assert.assertNotNull(this.eIk);
    try
    {
      byte[] arrayOfByte = this.eIk.toByteArray();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localIOException.getMessage();
      z.e("!76@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX62S3JRJ1qNNfL+o//jhCNa3LPuOntLGn/CxJiPqGcIeU=", "mResp.toByteArray() Failed!!! %s", arrayOfObject);
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.j
 * JD-Core Version:    0.6.2
 */