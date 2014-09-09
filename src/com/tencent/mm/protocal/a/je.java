package com.tencent.mm.protocal.a;

public final class je extends com.tencent.mm.ao.a
{
  public int iad;
  public int iae;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.iad);
    parama.by(2, this.iae);
  }

  public final je bJ(byte[] paramArrayOfByte)
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
        this.iad = locala.bel();
        j = 1;
        continue;
        this.iae = locala.bel();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.iad) + b.a.a.a.br(2, this.iae);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.je
 * JD-Core Version:    0.6.2
 */