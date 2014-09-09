package com.tencent.mm.protocal.a;

public final class dh extends com.tencent.mm.ao.a
{
  public int dZy;
  public int hOH;
  public String hTs;
  public long hTt;
  public int hTu;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hTs != null)
      parama.I(1, this.hTs);
    parama.k(2, this.hTt);
    parama.by(3, this.hTu);
    parama.by(4, this.hOH);
    parama.by(5, this.dZy);
  }

  public final dh bf(byte[] paramArrayOfByte)
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
        this.hTs = locala.ben();
        j = 1;
        continue;
        this.hTt = locala.ber();
        j = 1;
        continue;
        this.hTu = locala.bel();
        j = 1;
        continue;
        this.hOH = locala.bel();
        j = 1;
        continue;
        this.dZy = locala.bel();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    String str = this.hTs;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hTs);
    return i + b.a.a.a.i(2, this.hTt) + b.a.a.a.br(3, this.hTu) + b.a.a.a.br(4, this.hOH) + b.a.a.a.br(5, this.dZy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.dh
 * JD-Core Version:    0.6.2
 */