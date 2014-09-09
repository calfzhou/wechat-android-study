package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class to extends com.tencent.mm.ao.a
{
  public int dZy;
  public int hQw;
  public int hSL;
  public ws hTq;
  public ef hTr;
  public int ioA;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hTr == null) || (this.hTq == null))
      throw new b("Not all required fields were included");
    parama.by(1, this.hQw);
    if (this.hTr != null)
    {
      parama.bv(2, this.hTr.hD());
      this.hTr.a(parama);
    }
    parama.by(3, this.hSL);
    if (this.hTq != null)
    {
      parama.bv(4, this.hTq.hD());
      this.hTq.a(parama);
    }
    parama.by(5, this.dZy);
    parama.by(6, this.ioA);
  }

  public final to ci(byte[] paramArrayOfByte)
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
      case 6:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        this.hQw = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          ef localef = new ef();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = ef.a(locala3, localef, locala3.bet()));
          this.hTr = localef;
        }
        j = 1;
        continue;
        this.hSL = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          ws localws = new ws();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ws.a(locala2, localws, locala2.bet()));
          this.hTq = localws;
        }
        j = 1;
        continue;
        this.dZy = locala1.bel();
        j = 1;
        continue;
        this.ioA = locala1.bel();
        j = 1;
      }
    }
    if ((this.hTr == null) || (this.hTq == null))
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hQw);
    if (this.hTr != null)
      i += b.a.a.a.bs(2, this.hTr.hD());
    int j = i + b.a.a.a.br(3, this.hSL);
    if (this.hTq != null)
      j += b.a.a.a.bs(4, this.hTq.hD());
    return j + b.a.a.a.br(5, this.dZy) + b.a.a.a.br(6, this.ioA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.to
 * JD-Core Version:    0.6.2
 */