package com.tencent.mm.plugin.exdevice.a;

import android.os.Message;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import junit.framework.Assert;

public final class l
  implements m
{
  private static l eIp = null;
  private final HashMap eIo = new HashMap();
  private cm mHandler = null;

  public static l OR()
  {
    if (eIp != null)
      return eIp;
    l locall = new l();
    eIp = locall;
    return locall;
  }

  public final void OS()
  {
    bg.qX().b(538, this);
    eIp = null;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "******onSceneEnd******\r\n errType = " + paramInt1 + "errCode = " + paramInt2 + " errMsg =" + paramString);
    n localn = new n((byte)0);
    localn.eIg = paramInt2;
    localn.eIr = paramInt1;
    localn.eIs = paramString;
    localn.eIt = paramx;
    this.mHandler.obtainMessage(2, localn).sendToTarget();
  }

  public final void b(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    g localg = new g(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.mHandler.obtainMessage(1, paramInt1, 0, localg).sendToTarget();
  }

  public final void d(long paramLong, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.i("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "Recivce sendDataToManufacturerResponse, sessionId = %d", arrayOfObject);
    if (paramLong >= 0L);
    while (true)
    {
      Assert.assertTrue(bool);
      o localo = new o((byte)0);
      localo.ein = paramLong;
      localo.mData = paramArrayOfByte;
      this.mHandler.obtainMessage(3, localo).sendToTarget();
      return;
      bool = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.l
 * JD-Core Version:    0.6.2
 */