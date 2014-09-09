package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ib extends vo
{
  public int hEw;
  public int hEx;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    parama.by(2, this.hEw);
    parama.by(3, this.hEx);
  }

  public final ib bq(byte[] paramArrayOfByte)
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
          bb localbb = new bb();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = bb.a(locala2, localbb, locala2.bet()));
          this.hRz = localbb;
        }
        j = 1;
        continue;
        this.hEw = locala1.bel();
        j = 1;
        continue;
        this.hEx = locala1.bel();
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
    return i + b.a.a.a.br(2, this.hEw) + b.a.a.a.br(3, this.hEx);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ib
 * JD-Core Version:    0.6.2
 */