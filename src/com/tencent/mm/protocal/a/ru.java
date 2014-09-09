package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ru extends com.tencent.mm.ao.a
{
  public int dnc;
  public String hOJ;
  public int ihL;
  public int ilA;
  public long ilB;
  public int ilC;
  public LinkedList ilD = new LinkedList();
  public int ilE;
  public int ilF;
  public int ilw;
  public int ilx;
  public LinkedList ily = new LinkedList();
  public LinkedList ilz = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ilw);
    parama.by(2, this.ilx);
    parama.by(3, this.ihL);
    if (this.hOJ != null)
      parama.I(4, this.hOJ);
    parama.d(5, 8, this.ily);
    parama.d(6, 8, this.ilz);
    parama.by(7, this.ilA);
    parama.by(8, this.dnc);
    parama.k(9, this.ilB);
    parama.by(10, this.ilC);
    parama.d(11, 3, this.ilD);
    parama.by(12, this.ilE);
    parama.by(13, this.ilF);
  }

  public final ru bU(byte[] paramArrayOfByte)
  {
    this.ily.clear();
    this.ilz.clear();
    this.ilD.clear();
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
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        this.ilw = locala1.bel();
        j = 1;
        continue;
        this.ilx = locala1.bel();
        j = 1;
        continue;
        this.ihL = locala1.bel();
        j = 1;
        continue;
        this.hOJ = locala1.ben();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          rb localrb = new rb();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = rb.a(locala3, localrb, locala3.bet()));
          this.ily.add(localrb);
        }
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          aaq localaaq = new aaq();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = aaq.a(locala2, localaaq, locala2.bet()));
          this.ilz.add(localaaq);
        }
        j = 1;
        continue;
        this.ilA = locala1.bel();
        j = 1;
        continue;
        this.dnc = locala1.bel();
        j = 1;
        continue;
        this.ilB = locala1.ber();
        j = 1;
        continue;
        this.ilC = locala1.bel();
        j = 1;
        continue;
        this.ilD.add(Long.valueOf(locala1.ber()));
        j = 1;
        continue;
        this.ilE = locala1.bel();
        j = 1;
        continue;
        this.ilF = locala1.bel();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ilw) + b.a.a.a.br(2, this.ilx) + b.a.a.a.br(3, this.ihL);
    if (this.hOJ != null)
      i += b.a.a.b.b.a.J(4, this.hOJ);
    return i + b.a.a.a.c(5, 8, this.ily) + b.a.a.a.c(6, 8, this.ilz) + b.a.a.a.br(7, this.ilA) + b.a.a.a.br(8, this.dnc) + b.a.a.a.i(9, this.ilB) + b.a.a.a.br(10, this.ilC) + b.a.a.a.c(11, 3, this.ilD) + b.a.a.a.br(12, this.ilE) + b.a.a.a.br(13, this.ilF);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ru
 * JD-Core Version:    0.6.2
 */