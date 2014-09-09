package com.tencent.mm.ab;

import com.tencent.mm.c.a.kj;
import com.tencent.mm.model.bg;
import com.tencent.mm.protocal.a.to;
import com.tencent.mm.protocal.ar;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class s
{
  private final ay dmV = new ay(bg.qQ().getLooper(), new t(this), true);
  private final k dzQ;
  protected ar dzR;
  private int dzS;
  private boolean dzT;
  private boolean dzc = false;
  private final o dze;

  public s(k paramk)
  {
    yA();
    this.dze = new o();
    this.dzQ = paramk;
  }

  private void yA()
  {
    this.dzT = true;
    this.dzS = 0;
    this.dzR = null;
    this.dzc = false;
  }

  public final boolean b(ar paramar)
  {
    if (((paramar.hNM.hSL & k.dzw) != 0) && (!this.dzQ.to()));
    for (boolean bool = true; ; bool = false)
    {
      z.i("!44@/B4Tb64lLpIGru/HscmmoR6O74SHzsGrcKBJCWjMRvE=", "continue flag=" + paramar.hNM.hSL + ", selector=" + k.dzw + ", limit reach=" + this.dzQ.to());
      if ((!bool) && ((0x100 & paramar.hNM.hSL) != 0))
      {
        kj localkj = new kj();
        a.aGB().g(localkj);
      }
      return bool;
    }
  }

  public final void c(ar paramar)
  {
    this.dzR = paramar;
    this.dmV.cP(50L);
  }

  public final void cancel()
  {
    this.dzc = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.s
 * JD-Core Version:    0.6.2
 */