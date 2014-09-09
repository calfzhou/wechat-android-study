package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ig extends vo
{
  public int hEB;
  public int hEN;
  public String hEO;
  public int hEP;
  public LinkedList hEQ = new LinkedList();
  public String hER;
  public String hES;
  public int hEw;
  public int hEx;
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
    parama.by(2, this.hEN);
    if (this.hEO != null)
      parama.I(3, this.hEO);
    parama.by(4, this.hEP);
    parama.by(5, this.hEx);
    parama.by(6, this.hEw);
    parama.by(7, this.huF);
    parama.d(8, 8, this.hEQ);
    if (this.hER != null)
      parama.I(11, this.hER);
    if (this.hES != null)
      parama.I(12, this.hES);
    parama.by(13, this.hEB);
  }

  public final ig bu(byte[] paramArrayOfByte)
  {
    this.hEQ.clear();
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      case 9:
      case 10:
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
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          bb localbb = new bb();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = bb.a(locala3, localbb, locala3.bet()));
          this.hRz = localbb;
        }
        j = 1;
        continue;
        this.hEN = locala1.bel();
        j = 1;
        continue;
        this.hEO = locala1.ben();
        j = 1;
        continue;
        this.hEP = locala1.bel();
        j = 1;
        continue;
        this.hEx = locala1.bel();
        j = 1;
        continue;
        this.hEw = locala1.bel();
        j = 1;
        continue;
        this.huF = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          adm localadm = new adm();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = adm.a(locala2, localadm, locala2.bet()));
          this.hEQ.add(localadm);
        }
        j = 1;
        continue;
        this.hER = locala1.ben();
        j = 1;
        continue;
        this.hES = locala1.ben();
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
    int j = i + b.a.a.a.br(2, this.hEN);
    if (this.hEO != null)
      j += b.a.a.b.b.a.J(3, this.hEO);
    int k = j + b.a.a.a.br(4, this.hEP) + b.a.a.a.br(5, this.hEx) + b.a.a.a.br(6, this.hEw) + b.a.a.a.br(7, this.huF) + b.a.a.a.c(8, 8, this.hEQ);
    if (this.hER != null)
      k += b.a.a.b.b.a.J(11, this.hER);
    if (this.hES != null)
      k += b.a.a.b.b.a.J(12, this.hES);
    return k + b.a.a.a.br(13, this.hEB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ig
 * JD-Core Version:    0.6.2
 */