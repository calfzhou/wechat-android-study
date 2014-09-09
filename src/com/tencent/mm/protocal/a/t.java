package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class t extends com.tencent.mm.ao.a
{
  public ae hPd;
  public LinkedList hPe = new LinkedList();
  public String hPf;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPd == null)
      throw new b("Not all required fields were included");
    if (this.hPd != null)
    {
      parama.bv(1, this.hPd.hD());
      this.hPd.a(parama);
    }
    parama.d(2, 8, this.hPe);
    if (this.hPf != null)
      parama.I(3, this.hPf);
  }

  public final t aY(byte[] paramArrayOfByte)
  {
    this.hPe.clear();
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
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          ae localae = new ae();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = ae.a(locala3, localae, locala3.bet()));
          this.hPd = localae;
        }
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          ou localou = new ou();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ou.a(locala2, localou, locala2.bet()));
          this.hPe.add(localou);
        }
        j = 1;
        continue;
        this.hPf = locala1.ben();
        j = 1;
      }
    }
    if (this.hPd == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    ae localae = this.hPd;
    int i = 0;
    if (localae != null)
      i = 0 + b.a.a.a.bs(1, this.hPd.hD());
    int j = i + b.a.a.a.c(2, 8, this.hPe);
    if (this.hPf != null)
      j += b.a.a.b.b.a.J(3, this.hPf);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.t
 * JD-Core Version:    0.6.2
 */