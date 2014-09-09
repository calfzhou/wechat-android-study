package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.plugin.exdevice.a.d;
import com.tencent.mm.plugin.exdevice.service.ac;
import com.tencent.mm.plugin.exdevice.service.ag;
import com.tencent.mm.plugin.exdevice.service.ak;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class n extends ak
{
  private o eLf = null;
  private k eLg = null;

  public n(d paramd, c paramc)
  {
    Assert.assertNotNull(paramd);
    Assert.assertNotNull(paramc);
    this.eLf = new o(paramd);
    this.eLg = new k(paramc);
  }

  public final ag PK()
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    if (this.eLf == null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4WxmgmgWKSv585RIleCDCuOi0vog==", "get Req, mRequest == null ? %b", arrayOfObject);
      Assert.assertNotNull(this.eLf);
      return this.eLf;
      bool = false;
    }
  }

  public final ac PL()
  {
    Assert.assertNotNull(this.eLg);
    return this.eLg;
  }

  public final k PV()
  {
    Assert.assertNotNull(this.eLg);
    return this.eLg;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.n
 * JD-Core Version:    0.6.2
 */