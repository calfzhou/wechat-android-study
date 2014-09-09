package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class st extends com.tencent.mm.ao.a
{
  public int dZy;
  public int hOO;
  public vt hOP;
  public vt hOQ;
  public long hOY;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hOP == null) || (this.hOQ == null))
      throw new b("Not all required fields were included");
    parama.by(1, this.hOO);
    if (this.hOP != null)
    {
      parama.bv(2, this.hOP.hD());
      this.hOP.a(parama);
    }
    if (this.hOQ != null)
    {
      parama.bv(3, this.hOQ.hD());
      this.hOQ.a(parama);
    }
    parama.by(4, this.dZy);
    parama.k(5, this.hOY);
  }

  public final st ca(byte[] paramArrayOfByte)
  {
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
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        this.hOO = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          vt localvt2 = new vt();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = vt.a(locala3, localvt2, locala3.bet()));
          this.hOP = localvt2;
        }
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          vt localvt1 = new vt();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = vt.a(locala2, localvt1, locala2.bet()));
          this.hOQ = localvt1;
        }
        j = 1;
        continue;
        this.dZy = locala1.bel();
        j = 1;
        continue;
        this.hOY = locala1.ber();
        j = 1;
      }
    }
    if ((this.hOP == null) || (this.hOQ == null))
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hOO);
    if (this.hOP != null)
      i += b.a.a.a.bs(2, this.hOP.hD());
    if (this.hOQ != null)
      i += b.a.a.a.bs(3, this.hOQ.hD());
    return i + b.a.a.a.br(4, this.dZy) + b.a.a.a.i(5, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.st
 * JD-Core Version:    0.6.2
 */