package com.tencent.mm.storage;

import java.util.LinkedList;

public final class x extends com.tencent.mm.ao.a
{
  public int iio;
  public LinkedList iip = new LinkedList();
  public LinkedList iiq = new LinkedList();
  public LinkedList iir = new LinkedList();
  public LinkedList iis = new LinkedList();
  public LinkedList iit = new LinkedList();
  public LinkedList iiu = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.iio);
    parama.d(2, 2, this.iip);
    parama.d(3, 2, this.iiq);
    parama.d(4, 2, this.iir);
    parama.d(5, 3, this.iis);
    parama.d(6, 3, this.iit);
    parama.d(7, 3, this.iiu);
  }

  public final x cI(byte[] paramArrayOfByte)
  {
    this.iip.clear();
    this.iiq.clear();
    this.iir.clear();
    this.iis.clear();
    this.iit.clear();
    this.iiu.clear();
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
      case 6:
      case 7:
      }
      while (true)
      {
        if (j == 0)
          locala.beu();
        i = locala.bet();
        break;
        this.iio = locala.bel();
        j = 1;
        continue;
        this.iip.add(Integer.valueOf(locala.bel()));
        j = 1;
        continue;
        this.iiq.add(Integer.valueOf(locala.bel()));
        j = 1;
        continue;
        this.iir.add(Integer.valueOf(locala.bel()));
        j = 1;
        continue;
        this.iis.add(Long.valueOf(locala.ber()));
        j = 1;
        continue;
        this.iit.add(Long.valueOf(locala.ber()));
        j = 1;
        continue;
        this.iiu.add(Long.valueOf(locala.ber()));
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.iio) + b.a.a.a.c(2, 2, this.iip) + b.a.a.a.c(3, 2, this.iiq) + b.a.a.a.c(4, 2, this.iir) + b.a.a.a.c(5, 3, this.iis) + b.a.a.a.c(6, 3, this.iit) + b.a.a.a.c(7, 3, this.iiu);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.x
 * JD-Core Version:    0.6.2
 */