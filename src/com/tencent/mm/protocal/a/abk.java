package com.tencent.mm.protocal.a;

public final class abk extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hTx;
  public int hUP;
  public int ipY;

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hTx != null)
      parama.I(2, this.hTx);
    parama.by(3, this.ipY);
    parama.by(4, this.hUP);
  }

  public final abk cw(byte[] paramArrayOfByte)
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
        this.hTx = locala.ben();
        j = 1;
        continue;
        this.ipY = locala.bel();
        j = 1;
        continue;
        this.hUP = locala.bel();
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
    if (this.hTx != null)
      i += b.a.a.b.b.a.J(2, this.hTx);
    return i + b.a.a.a.br(3, this.ipY) + b.a.a.a.br(4, this.hUP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.abk
 * JD-Core Version:    0.6.2
 */