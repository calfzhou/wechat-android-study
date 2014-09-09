package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.z;

public final class a extends u
{
  private static a eId = null;

  public static a OJ()
  {
    if (eId == null)
    {
      a locala = new a();
      eId = locala;
      return locala;
    }
    return eId;
  }

  public final void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Long.valueOf(paramLong);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = Integer.valueOf(paramInt3);
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      arrayOfObject[4] = Integer.valueOf(i);
      z.i("!56@/B4Tb64lLpLHXwcx366fGrvppnZNM2fNpKaMUgCO7LBL6A4PU5QrZQ==", "------onDeviceRequest------ errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, datalength = %d", arrayOfObject);
      if (paramInt1 != 0)
        break label107;
    }
    String str;
    label107: for (int j = 1; ; j = 0)
    {
      com.tencent.mm.plugin.exdevice.d.a.g(paramLong, j);
      str = com.tencent.mm.plugin.exdevice.g.a.Z(paramArrayOfByte);
      if (str != null)
        break label113;
      z.e("!56@/B4Tb64lLpLHXwcx366fGrvppnZNM2fNpKaMUgCO7LBL6A4PU5QrZQ==", "dataIn is null!!! Just leave without process data");
      return;
      i = paramArrayOfByte.length;
      break;
    }
    label113: z.d("!56@/B4Tb64lLpLHXwcx366fGrvppnZNM2fNpKaMUgCO7LBL6A4PU5QrZQ==", "data dump = %s", new Object[] { str });
    new b(paramInt1, paramLong, paramInt2, paramInt3, paramArrayOfByte).OK();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.a
 * JD-Core Version:    0.6.2
 */