package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class is extends vo
{
  public int hEB;
  public LinkedList hEQ = new LinkedList();
  public int hEY;
  public LinkedList hEZ = new LinkedList();
  public int hEw;
  public int hEx;
  public String hsB;
  public int huF;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    parama.by(2, this.hEx);
    parama.by(3, this.hEw);
    if (this.hsB != null)
      parama.I(4, this.hsB);
    parama.by(5, this.huF);
    parama.d(6, 8, this.hEQ);
    parama.by(7, this.hEY);
    parama.d(8, 8, this.hEZ);
    parama.by(9, this.hEB);
  }

  public final is bC(byte[] paramArrayOfByte)
  {
    this.hEQ.clear();
    this.hEZ.clear();
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
          bb localbb = new bb();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = bb.a(locala4, localbb, locala4.bet()));
          this.hRz = localbb;
        }
        j = 1;
        continue;
        this.hEx = locala1.bel();
        j = 1;
        continue;
        this.hEw = locala1.bel();
        j = 1;
        continue;
        this.hsB = locala1.ben();
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
          adm localadm = new adm();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = adm.a(locala3, localadm, locala3.bet()));
          this.hEQ.add(localadm);
        }
        j = 1;
        continue;
        this.hEY = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          iv localiv = new iv();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = iv.a(locala2, localiv, locala2.bet()));
          this.hEZ.add(localiv);
        }
        j = 1;
        continue;
        this.hEB = locala1.bel();
        j = 1;
      }
    }
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    int j = i + b.a.a.a.br(2, this.hEx) + b.a.a.a.br(3, this.hEw);
    if (this.hsB != null)
      j += b.a.a.b.b.a.J(4, this.hsB);
    return j + b.a.a.a.br(5, this.huF) + b.a.a.a.c(6, 8, this.hEQ) + b.a.a.a.br(7, this.hEY) + b.a.a.a.c(8, 8, this.hEZ) + b.a.a.a.br(9, this.hEB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.is
 * JD-Core Version:    0.6.2
 */