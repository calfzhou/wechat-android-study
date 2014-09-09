package com.tencent.mm.protocal.a;

public final class n extends com.tencent.mm.ao.a
{
  public int ewb;
  public int hOF;
  public int hOG;
  public int hOH;
  public int hOI;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hOF);
    parama.by(2, this.ewb);
    parama.by(3, this.hOG);
    parama.by(4, this.hOH);
    parama.by(5, this.hOI);
  }

  public final n aW(byte[] paramArrayOfByte)
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
        this.hOF = locala.bel();
        j = 1;
        continue;
        this.ewb = locala.bel();
        j = 1;
        continue;
        this.hOG = locala.bel();
        j = 1;
        continue;
        this.hOH = locala.bel();
        j = 1;
        continue;
        this.hOI = locala.bel();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hOF) + b.a.a.a.br(2, this.ewb) + b.a.a.a.br(3, this.hOG) + b.a.a.a.br(4, this.hOH) + b.a.a.a.br(5, this.hOI);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.n
 * JD-Core Version:    0.6.2
 */