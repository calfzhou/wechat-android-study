package com.tencent.mm.e.a.a;

import java.util.LinkedList;

public final class a extends com.tencent.mm.ao.a
{
  public int cGN;
  public int cLj;
  public LinkedList dJw = new LinkedList();
  public String dJx;
  public int dJy;
  public int status;
  public int type;
  public int yz;

  public final void a(b.a.a.c.a parama)
  {
    parama.d(1, 8, this.dJw);
    parama.by(2, this.cGN);
    parama.by(3, this.type);
    parama.by(4, this.status);
    parama.by(5, this.yz);
    if (this.dJx != null)
      parama.I(6, this.dJx);
    parama.by(7, this.cLj);
    parama.by(8, this.dJy);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.c(1, 8, this.dJw) + b.a.a.a.br(2, this.cGN) + b.a.a.a.br(3, this.type) + b.a.a.a.br(4, this.status) + b.a.a.a.br(5, this.yz);
    if (this.dJx != null)
      i += b.a.a.b.b.a.J(6, this.dJx);
    return i + b.a.a.a.br(7, this.cLj) + b.a.a.a.br(8, this.dJy);
  }

  public final a k(byte[] paramArrayOfByte)
  {
    this.dJw.clear();
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
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
      case 8:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList = locala1.rN(i);
        int k = localLinkedList.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(m);
          b localb = new b();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = b.a(locala2, localb, locala2.bet()));
          this.dJw.add(localb);
        }
        j = 1;
        continue;
        this.cGN = locala1.bel();
        j = 1;
        continue;
        this.type = locala1.bel();
        j = 1;
        continue;
        this.status = locala1.bel();
        j = 1;
        continue;
        this.yz = locala1.bel();
        j = 1;
        continue;
        this.dJx = locala1.ben();
        j = 1;
        continue;
        this.cLj = locala1.bel();
        j = 1;
        continue;
        this.dJy = locala1.bel();
        j = 1;
      }
    }
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.a.a.a
 * JD-Core Version:    0.6.2
 */