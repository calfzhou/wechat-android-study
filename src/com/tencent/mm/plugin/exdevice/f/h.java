package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.plugin.exdevice.a.g;
import com.tencent.mm.plugin.exdevice.b.ad;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.sdk.platformtools.z;

public final class h extends ad
{
  private g eIv;
  private a eKU;

  public h(g paramg)
  {
    this.eIv = paramg;
  }

  public final boolean a(af paramaf, d paramd)
  {
    this.eKU = new a(this.eIv, paramd);
    boolean bool = this.eKU.c(paramaf);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(bool);
    z.i("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1qZ09LnqVIZdBTYvh5c5zafxvufT1MvkQ", "send data to devide : %b", arrayOfObject);
    return bool;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.h
 * JD-Core Version:    0.6.2
 */