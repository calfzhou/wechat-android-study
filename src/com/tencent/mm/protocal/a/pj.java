package com.tencent.mm.protocal.a;

public final class pj extends com.tencent.mm.ao.a
{
  public String gnq;
  public int ifp;

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    parama.by(2, this.ifp);
  }

  public final pj bQ(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      default:
        j = 0;
      case 1:
      case 2:
      }
      while (true)
      {
        if (j == 0)
          locala.beu();
        i = locala.bet();
        break;
        this.gnq = locala.ben();
        j = 1;
        continue;
        this.ifp = locala.bel();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    return i + b.a.a.a.br(2, this.ifp);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pj
 * JD-Core Version:    0.6.2
 */