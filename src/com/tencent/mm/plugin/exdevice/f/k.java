package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.exdevice.service.ad;
import com.tencent.mm.plugin.exdevice.service.aj;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.cm;
import junit.framework.Assert;

public final class k extends ad
{
  private final long dpj = 15000L;
  private c eKY = null;
  private boolean eKZ = false;
  private boolean eLa = false;
  private Runnable eLb = new l(this);

  public k(c paramc)
  {
    Assert.assertNotNull(paramc);
    this.eKY = paramc;
  }

  public final void PU()
  {
    this.eKZ = false;
    this.eLa = false;
    bg.qQ().bcy().postDelayed(this.eLb, 15000L);
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, aj paramaj)
  {
    if (this.eLa);
    while (this.eKZ)
      return;
    bg.qQ().bcy().removeCallbacks(this.eLb);
    bg.qQ().bcy().post(new m(this, paramLong, paramInt1, paramInt2, paramString, paramaj));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.k
 * JD-Core Version:    0.6.2
 */