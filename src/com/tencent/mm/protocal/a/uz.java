package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class uz extends com.tencent.mm.ao.a
{
  public String fxG;
  public int hOR;
  public long hOY;
  public String ipX;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ipX == null)
      throw new b("Not all required fields were included");
    parama.k(1, this.hOY);
    if (this.fxG != null)
      parama.I(2, this.fxG);
    if (this.ipX != null)
      parama.I(3, this.ipX);
    parama.by(4, this.hOR);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.hOY);
    if (this.fxG != null)
      i += b.a.a.b.b.a.J(2, this.fxG);
    if (this.ipX != null)
      i += b.a.a.b.b.a.J(3, this.ipX);
    return i + b.a.a.a.br(4, this.hOR);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.uz
 * JD-Core Version:    0.6.2
 */