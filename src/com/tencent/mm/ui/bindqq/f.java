package com.tencent.mm.ui.bindqq;

import com.tencent.mm.c.a.fs;
import com.tencent.mm.c.a.ft;
import com.tencent.mm.sdk.c.e;

public final class f extends com.tencent.mm.sdk.c.g
  implements o
{
  private fs jkU;

  public f()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof fs))
      return false;
    this.jkU = ((fs)parame);
    new g(this.jkU.cKP.cKR, this).aUj();
    return false;
  }

  public final void aUi()
  {
    if (this.jkU.cKP.cKS != null)
    {
      this.jkU.cKQ.cCM = false;
      this.jkU.cKP.cKS.run();
    }
  }

  public final boolean l(int paramInt1, int paramInt2, String paramString)
  {
    if (this.jkU.cKP.cKS == null)
      return false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.jkU.cKQ.cCM = true;
      this.jkU.cKP.cKS.run();
      return true;
    }
    this.jkU.cKQ.cCM = false;
    this.jkU.cKP.cKS.run();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.f
 * JD-Core Version:    0.6.2
 */