package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class it extends com.tencent.mm.ao.a
{
  public String hZB;
  public String hZC;
  public int sk;

  public static boolean a(b.a.a.a.a parama, it paramit, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramit.hZB = parama.ben();
      return true;
    case 2:
      paramit.hZC = parama.ben();
      return true;
    case 3:
    }
    paramit.sk = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hZB == null) || (this.hZC == null))
      throw new b("Not all required fields were included");
    if (this.hZB != null)
      parama.I(1, this.hZB);
    if (this.hZC != null)
      parama.I(2, this.hZC);
    parama.by(3, this.sk);
  }

  public final int hD()
  {
    String str = this.hZB;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hZB);
    if (this.hZC != null)
      i += b.a.a.b.b.a.J(2, this.hZC);
    return i + b.a.a.a.br(3, this.sk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.it
 * JD-Core Version:    0.6.2
 */