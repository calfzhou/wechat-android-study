package com.tencent.mm.protocal.a;

public final class tf extends com.tencent.mm.ao.a
{
  public int hOO;
  public int hOR;
  public long hOY;
  public String hPq;
  public String hPs;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPq != null)
      parama.I(1, this.hPq);
    if (this.hPs != null)
      parama.I(2, this.hPs);
    parama.by(3, this.hOO);
    parama.by(4, this.hOR);
    parama.k(5, this.hOY);
  }

  public final tf cf(byte[] paramArrayOfByte)
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
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        if (j == 0)
          locala.beu();
        i = locala.bet();
        break;
        this.hPq = locala.ben();
        j = 1;
        continue;
        this.hPs = locala.ben();
        j = 1;
        continue;
        this.hOO = locala.bel();
        j = 1;
        continue;
        this.hOR = locala.bel();
        j = 1;
        continue;
        this.hOY = locala.ber();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    String str = this.hPq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPq);
    if (this.hPs != null)
      i += b.a.a.b.b.a.J(2, this.hPs);
    return i + b.a.a.a.br(3, this.hOO) + b.a.a.a.br(4, this.hOR) + b.a.a.a.i(5, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tf
 * JD-Core Version:    0.6.2
 */