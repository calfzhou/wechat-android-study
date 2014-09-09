package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class if extends vn
{
  public int hEB;
  public LinkedList hEC = new LinkedList();
  public int hED;
  public int hEE;
  public int hEF;
  public int hEG;
  public LinkedList hEH = new LinkedList();
  public int hEI;
  public int hEJ;
  public int hEK;
  public int hEL;
  public int hEM;
  public String hsB;
  public String hsT;
  public int huF;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hsT != null)
      parama.I(2, this.hsT);
    parama.by(3, this.huF);
    parama.d(4, 8, this.hEC);
    parama.by(5, this.hED);
    parama.by(6, this.hEE);
    if (this.hsB != null)
      parama.I(7, this.hsB);
    parama.by(8, this.hEF);
    parama.by(9, this.hEG);
    parama.d(10, 8, this.hEH);
    parama.by(11, this.hEI);
    parama.by(12, this.hEJ);
    parama.by(13, this.hEK);
    parama.by(14, this.hEL);
    parama.by(15, this.hEB);
    parama.by(16, this.hEM);
  }

  public final if bt(byte[] paramArrayOfByte)
  {
    this.hEC.clear();
    this.hEH.clear();
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
      case 14:
      case 15:
      case 16:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          ba localba = new ba();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = ba.a(locala4, localba, locala4.bet()));
          this.hRy = localba;
        }
        j = 1;
        continue;
        this.hsT = locala1.ben();
        j = 1;
        continue;
        this.huF = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          gc localgc = new gc();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = gc.a(locala3, localgc, locala3.bet()));
          this.hEC.add(localgc);
        }
        j = 1;
        continue;
        this.hED = locala1.bel();
        j = 1;
        continue;
        this.hEE = locala1.bel();
        j = 1;
        continue;
        this.hsB = locala1.ben();
        j = 1;
        continue;
        this.hEF = locala1.bel();
        j = 1;
        continue;
        this.hEG = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          ic localic = new ic();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ic.a(locala2, localic, locala2.bet()));
          this.hEH.add(localic);
        }
        j = 1;
        continue;
        this.hEI = locala1.bel();
        j = 1;
        continue;
        this.hEJ = locala1.bel();
        j = 1;
        continue;
        this.hEK = locala1.bel();
        j = 1;
        continue;
        this.hEL = locala1.bel();
        j = 1;
        continue;
        this.hEB = locala1.bel();
        j = 1;
        continue;
        this.hEM = locala1.bel();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hsT != null)
      i += b.a.a.b.b.a.J(2, this.hsT);
    int j = i + b.a.a.a.br(3, this.huF) + b.a.a.a.c(4, 8, this.hEC) + b.a.a.a.br(5, this.hED) + b.a.a.a.br(6, this.hEE);
    if (this.hsB != null)
      j += b.a.a.b.b.a.J(7, this.hsB);
    return j + b.a.a.a.br(8, this.hEF) + b.a.a.a.br(9, this.hEG) + b.a.a.a.c(10, 8, this.hEH) + b.a.a.a.br(11, this.hEI) + b.a.a.a.br(12, this.hEJ) + b.a.a.a.br(13, this.hEK) + b.a.a.a.br(14, this.hEL) + b.a.a.a.br(15, this.hEB) + b.a.a.a.br(16, this.hEM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.if
 * JD-Core Version:    0.6.2
 */