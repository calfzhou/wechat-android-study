package com.tencent.mm.modelgeo;

import com.tencent.mm.sdk.platformtools.br;

final class f
  implements br
{
  private Addr dvn = null;

  public f(d paramd)
  {
  }

  public final boolean rD()
  {
    if ((this.dvn == null) || (this.dvn.duW == null) || (this.dvn.duW.equals("")))
      this.dvn = d.c(d.a(this.dvo).cGO, d.a(this.dvo).cGP);
    return true;
  }

  public final boolean rE()
  {
    d.a(this.dvo, this.dvn);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.f
 * JD-Core Version:    0.6.2
 */