package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.plugin.exdevice.a.d;
import com.tencent.mm.plugin.exdevice.service.ah;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class o extends ah
{
  private d eKK = null;

  public o(d paramd)
  {
    Assert.assertNotNull(paramd);
    this.eKK = paramd;
  }

  public final long HW()
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGjmelM4WxmgmgWKSv585RIlrgpF0ZC0dcYFwLbKeyc63", "getDeviceId : " + this.eKK.HW());
    return this.eKK.HW();
  }

  public final byte[] PG()
  {
    return this.eKK.OO();
  }

  public final int PH()
  {
    return this.eKK.OL();
  }

  public final int PI()
  {
    return this.eKK.ON();
  }

  public final int PJ()
  {
    return this.eKK.OM();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.o
 * JD-Core Version:    0.6.2
 */