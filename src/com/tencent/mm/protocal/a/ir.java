package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ir extends vn
{
  public int hEG;
  public LinkedList hEH = new LinkedList();
  public int hEv;
  public int hFl;
  public String hsB;
  public String hsT;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hsT != null)
      parama.I(2, this.hsT);
    parama.by(3, this.hEv);
    if (this.hsB != null)
      parama.I(4, this.hsB);
    parama.by(5, this.hFl);
    parama.by(6, this.hEG);
    parama.d(7, 8, this.hEH);
  }

  public final ir bB(byte[] paramArrayOfByte)
  {
    this.hEH.clear();
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int m;
      switch (i)
      {
      default:
        m = 0;
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
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          ba localba = new ba();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = ba.a(locala3, localba, locala3.bet()));
          this.hRy = localba;
        }
        m = 1;
        continue;
        this.hsT = locala1.ben();
        m = 1;
        continue;
        this.hEv = locala1.bel();
        m = 1;
        continue;
        this.hsB = locala1.ben();
        m = 1;
        continue;
        this.hFl = locala1.bel();
        m = 1;
        continue;
        this.hEG = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int j = localLinkedList1.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(k);
          ic localic = new ic();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ic.a(locala2, localic, locala2.bet()));
          this.hEH.add(localic);
        }
        m = 1;
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
    int j = i + b.a.a.a.br(3, this.hEv);
    if (this.hsB != null)
      j += b.a.a.b.b.a.J(4, this.hsB);
    return j + b.a.a.a.br(5, this.hFl) + b.a.a.a.br(6, this.hEG) + b.a.a.a.c(7, 8, this.hEH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ir
 * JD-Core Version:    0.6.2
 */