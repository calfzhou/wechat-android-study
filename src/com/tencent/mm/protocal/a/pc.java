package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class pc extends com.tencent.mm.ao.a
{
  public int ewb;
  public int hOV;
  public ws hPZ;
  public long ieZ;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPZ == null)
      throw new b("Not all required fields were included");
    parama.k(1, this.ieZ);
    parama.by(2, this.hOV);
    if (this.hPZ != null)
    {
      parama.bv(3, this.hPZ.hD());
      this.hPZ.a(parama);
    }
    parama.by(4, this.ewb);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.ieZ) + b.a.a.a.br(2, this.hOV);
    if (this.hPZ != null)
      i += b.a.a.a.bs(3, this.hPZ.hD());
    return i + b.a.a.a.br(4, this.ewb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pc
 * JD-Core Version:    0.6.2
 */