package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

public final class ao
{
  private static ao eKw = null;
  private am eIF = new am();
  private final HashMap eKx = new HashMap();

  public static ao PP()
  {
    if (eKw == null)
      eKw = new ao();
    return eKw;
  }

  public final am PQ()
  {
    return this.eIF;
  }

  public final int aM(long paramLong)
  {
    if (!this.eKx.containsKey(Long.valueOf(paramLong)))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      z.e("!56@/B4Tb64lLpLHXwcx366fGiAG62SzjYSvr40xQF3VvUsDPjOoPSuLtw==", "getBluetoothVersionByDeviceId Failed!!! Cannot find BLuetoothVersion by DeviceId(%d)", arrayOfObject);
      return -1;
    }
    return ((Integer)this.eKx.get(Long.valueOf(paramLong))).intValue();
  }

  public final void i(long paramLong, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(paramLong);
    arrayOfObject[1] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpLHXwcx366fGiAG62SzjYSvr40xQF3VvUsDPjOoPSuLtw==", "insertDeviceIdAndBluetoothVersion aDeviceId = %d, aBluetoothVersion = %d", arrayOfObject);
    this.eKx.put(Long.valueOf(paramLong), Integer.valueOf(paramInt));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.ao
 * JD-Core Version:    0.6.2
 */