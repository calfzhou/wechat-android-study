package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.plugin.exdevice.a.i;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.an;

public final class b extends a
  implements d
{
  private final d eKN;

  public b(com.tencent.mm.plugin.exdevice.a.d paramd, d paramd1)
  {
    super(paramd, paramd1);
    a(this);
    this.eKN = paramd1;
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    arrayOfObject1[3] = paramString;
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JGXJAsbh6Ip5Y/nmPtDc7g1bxuz0JpKE", "onTaskSceneEnd, SwitchViewPush taskId = %d, errType = %d, errCode = %d, errMsg = %s", arrayOfObject1);
    com.tencent.mm.plugin.exdevice.e.b localb;
    if (2 == ((i)this.eKK).wy())
    {
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JGXJAsbh6Ip5Y/nmPtDc7g1bxuz0JpKE", "Switch view push has been sended to device, now try to check close strategy");
      localb = com.tencent.mm.plugin.exdevice.b.z.Pp().lP(this.eKK.HW());
      if (localb == null)
      {
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Long.valueOf(this.eKK.HW());
        com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JGXJAsbh6Ip5Y/nmPtDc7g1bxuz0JpKE", "get hdinfo by mac failed!!!, Mac = %d", arrayOfObject5);
        if (this.eKN != null)
          this.eKN.a(paramLong, paramInt1, paramInt2, paramString);
        return;
      }
      switch (localb.field_closeStrategy)
      {
      default:
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(localb.field_closeStrategy);
        com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JGXJAsbh6Ip5Y/nmPtDc7g1bxuz0JpKE", "Error close strategy(%d)", arrayOfObject4);
      case 1:
      case 2:
      }
    }
    while (this.eKN != null)
    {
      this.eKN.a(paramLong, paramInt1, paramInt2, paramString);
      return;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(localb.field_closeStrategy);
      arrayOfObject3[1] = Long.valueOf(this.eKK.HW());
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JGXJAsbh6Ip5Y/nmPtDc7g1bxuz0JpKE", "the close Strategy is %d, stop channel(device id = %d)", arrayOfObject3);
      if (an.PO().OX() != null)
      {
        an.PO().OX().au(this.eKK.HW());
        continue;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(localb.field_closeStrategy);
        arrayOfObject2[1] = Long.valueOf(this.eKK.HW());
        com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JGXJAsbh6Ip5Y/nmPtDc7g1bxuz0JpKE", "the close Strategy is %d, Record it(%d) in the shut down device list", arrayOfObject2);
        if (!com.tencent.mm.plugin.exdevice.e.a.f("shut_down_device", this.eKK.HW()))
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JGXJAsbh6Ip5Y/nmPtDc7g1bxuz0JpKE", "MMExDeviceCore.getDeviceInfoManager().addShutDownDevice failed!!!");
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b
 * JD-Core Version:    0.6.2
 */