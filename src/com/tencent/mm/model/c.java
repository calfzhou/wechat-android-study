package com.tencent.mm.model;

import com.tencent.mm.as.f;
import com.tencent.mm.as.i;
import com.tencent.mm.modelstat.j;
import com.tencent.mm.modelstat.r;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class c
  implements i
{
  c(b paramb)
  {
  }

  public final void pA()
  {
    if (b.a(this.dkb) != null)
      b.a(this.dkb);
  }

  public final void pB()
  {
    if (b.a(this.dkb) != null)
      b.a(this.dkb).pB();
  }

  public final void pz()
  {
    if (b.a(this.dkb) != null)
      b.a(this.dkb).aKS();
    if (b.b(this.dkb) != null)
    {
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "summer preCloseCallback userConfigStg: " + b.b(this.dkb));
      b.b(this.dkb).Ai();
    }
    j localj = r.Ap();
    if (localj != null)
    {
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "summer preCloseCallback netStatStg: " + localj);
      localj.Ai();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c
 * JD-Core Version:    0.6.2
 */