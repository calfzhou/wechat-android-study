package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class rw extends com.tencent.mm.ao.a
{
  public int dnc;
  public String hwQ;
  public int ihL;
  public int ilF;
  public rr ilJ;
  public int ilK;
  public LinkedList ilL = new LinkedList();
  public int ilM;
  public String ilN;
  public String ilO;
  public int ilw;
  public int ilx;
  public String token;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ilw);
    parama.by(2, this.ilx);
    parama.by(3, this.ihL);
    if (this.ilJ != null)
    {
      parama.bv(4, this.ilJ.hD());
      this.ilJ.a(parama);
    }
    parama.by(5, this.ilK);
    parama.d(6, 8, this.ilL);
    parama.by(7, this.dnc);
    parama.by(8, this.ilM);
    if (this.hwQ != null)
      parama.I(9, this.hwQ);
    if (this.ilN != null)
      parama.I(10, this.ilN);
    if (this.token != null)
      parama.I(11, this.token);
    if (this.ilO != null)
      parama.I(12, this.ilO);
    parama.by(13, this.ilF);
  }

  public final rw bV(byte[] paramArrayOfByte)
  {
    this.ilL.clear();
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
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          rr localrr2 = new rr();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = rr.a(locala3, localrr2, locala3.bet()));
          this.ilJ = localrr2;
        }
        j = 1;
        continue;
        this.ilK = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          rr localrr1 = new rr();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = rr.a(locala2, localrr1, locala2.bet()));
          this.ilL.add(localrr1);
        }
        j = 1;
        continue;
        this.dnc = locala1.bel();
        j = 1;
        continue;
        this.ilM = locala1.bel();
        j = 1;
        continue;
        this.hwQ = locala1.ben();
        j = 1;
        continue;
        this.ilN = locala1.ben();
        j = 1;
        continue;
        this.token = locala1.ben();
        j = 1;
        continue;
        this.ilO = locala1.ben();
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
    if (this.ilJ != null)
      i += b.a.a.a.bs(4, this.ilJ.hD());
    int j = i + b.a.a.a.br(5, this.ilK) + b.a.a.a.c(6, 8, this.ilL) + b.a.a.a.br(7, this.dnc) + b.a.a.a.br(8, this.ilM);
    if (this.hwQ != null)
      j += b.a.a.b.b.a.J(9, this.hwQ);
    if (this.ilN != null)
      j += b.a.a.b.b.a.J(10, this.ilN);
    if (this.token != null)
      j += b.a.a.b.b.a.J(11, this.token);
    if (this.ilO != null)
      j += b.a.a.b.b.a.J(12, this.ilO);
    return j + b.a.a.a.br(13, this.ilF);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rw
 * JD-Core Version:    0.6.2
 */