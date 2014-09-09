package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public final class b
  implements com.tencent.mm.plugin.exdevice.f.d
{
  private static b eIA;
  private final Map doT = new HashMap();
  private af eIB;
  private e eIC;
  private Vector eID = new Vector();
  private byte[] eIE = new byte[0];
  private am eIF = new am("ExdeviceHandlerThread");

  public static b OY()
  {
    if (eIA == null)
      eIA = new b();
    return eIA;
  }

  private void OZ()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.eID.size());
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX63JCbRbksX+vBGTGNR5U1VA==", "now watting task size is %d", arrayOfObject);
    if (!this.eID.isEmpty())
      a((ad)this.eID.remove(0));
  }

  public final af OX()
  {
    return this.eIB;
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Long.valueOf(paramLong);
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = paramString;
    arrayOfObject[4] = Integer.valueOf(this.eID.size());
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX63JCbRbksX+vBGTGNR5U1VA==", "onTaskSceneEnd, taskid =%d, errType =%d, errCode = %d, errMsg =%s, wattingtask size : %d", arrayOfObject);
    synchronized (this.eIE)
    {
      OZ();
      return;
    }
  }

  public final void a(e parame)
  {
    this.eIC = parame;
  }

  public final void a(af paramaf)
  {
    this.eIB = paramaf;
  }

  public final boolean a(ad paramad)
  {
    this.eIF.n(new d(this, paramad));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.b
 * JD-Core Version:    0.6.2
 */