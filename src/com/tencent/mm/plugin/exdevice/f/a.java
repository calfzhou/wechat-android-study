package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.plugin.exdevice.b.b;
import com.tencent.mm.plugin.exdevice.c.e;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.aj;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.sdk.platformtools.z;

public class a
  implements c
{
  protected com.tencent.mm.plugin.exdevice.a.d eKK = null;
  protected d eKL = null;
  private n eKM = null;
  private long eKb = -1L;

  public a(com.tencent.mm.plugin.exdevice.a.d paramd, d paramd1)
  {
    this.eKK = paramd;
    this.eKL = paramd1;
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, aj paramaj)
  {
    Object[] arrayOfObject1 = new Object[7];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    arrayOfObject1[3] = paramString;
    arrayOfObject1[4] = Long.valueOf(this.eKK.HW());
    arrayOfObject1[5] = Short.valueOf(this.eKK.OL());
    arrayOfObject1[6] = Short.valueOf(this.eKK.ON());
    z.i("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "------onTaskEnd------ taskId = %d, errType = %d, errCode = %d, errMsg = %s, deviceId = %d, reqCmdId = %d, respCmdId = %d", arrayOfObject1);
    long l = this.eKK.HW();
    if (paramInt1 == 0);
    for (int i = 1; ; i = 0)
    {
      com.tencent.mm.plugin.exdevice.d.a.g(l, i);
      if ((paramaj == null) || (paramaj == this.eKM))
        break;
      z.e("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "netCmd != mRemoteTask");
      return;
    }
    if ((-1 == paramInt1) && (-2 == paramInt2))
      z.e("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "Time Out in local!!!");
    if (this.eKK.OP() != null);
    for (int j = this.eKK.OP().eJz; ; j = 0)
    {
      if ((-5 == j) || (-3 == j) || (-4 == j))
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(this.eKK.OP().eJz);
        arrayOfObject2[1] = Long.valueOf(this.eKK.HW());
        z.w("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "ErrorCode = %d, destroy channel(deviceId = %d)", arrayOfObject2);
        if (!an.PO().OX().au(this.eKK.HW()))
          z.e("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "stopChannel Failed!!!");
      }
      if (this.eKL != null)
        this.eKL.a(paramLong, paramInt1, paramInt2, paramString);
      this.eKM = null;
      return;
    }
  }

  public final void a(d paramd)
  {
    this.eKL = paramd;
  }

  public final boolean c(af paramaf)
  {
    if (paramaf == null)
    {
      z.e("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "dispatcher is null");
      return false;
    }
    if (this.eKM != null)
    {
      z.e("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "Prev task is still working!!!");
      return false;
    }
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Short.valueOf(this.eKK.OL());
    arrayOfObject[1] = Short.valueOf(this.eKK.ON());
    arrayOfObject[2] = Long.valueOf(this.eKK.HW());
    z.i("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "------startTask begin------cmdReqId = %d, cmdRespId = %d, deviceId = %d", arrayOfObject);
    n localn = new n(this.eKK, this);
    long l = paramaf.a(localn);
    if (-1L == l)
    {
      z.e("!44@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6pDxj1ZsQMmw=", "dispatcher.startTask Failed!!!");
      return false;
    }
    this.eKM = localn;
    this.eKb = l;
    this.eKM.PV().PU();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a
 * JD-Core Version:    0.6.2
 */