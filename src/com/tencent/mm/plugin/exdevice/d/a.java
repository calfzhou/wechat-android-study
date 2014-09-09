package com.tencent.mm.plugin.exdevice.d;

import com.tencent.mm.plugin.exdevice.e.b;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.f.c.n;

public final class a
{
  public static void g(long paramLong, int paramInt)
  {
    b localb = com.tencent.mm.plugin.exdevice.b.z.Pp().lP(String.valueOf(paramLong));
    if (localb == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjYZ+ecWGYRwD5c2FW4zNiPg==", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localb.field_deviceType).append(',');
    localStringBuilder.append(localb.field_deviceID).append(',');
    localStringBuilder.append(paramInt);
    n.fTF.a(false, 11232, localStringBuilder.toString());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.d.a
 * JD-Core Version:    0.6.2
 */