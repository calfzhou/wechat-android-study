package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ht extends com.tencent.mm.ao.a
{
  public LinkedList eOn = new LinkedList();
  public LinkedList hZk = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.d(1, 8, this.eOn);
    parama.d(2, 8, this.hZk);
  }

  public final ht bo(byte[] paramArrayOfByte)
  {
    this.eOn.clear();
    this.hZk.clear();
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
          sn localsn = new sn();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = sn.a(locala3, localsn, locala3.bet()));
          this.eOn.add(localsn);
        }
        m = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int j = localLinkedList1.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(k);
          sq localsq = new sq();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = sq.a(locala2, localsq, locala2.bet()));
          this.hZk.add(localsq);
        }
        m = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.c(1, 8, this.eOn) + b.a.a.a.c(2, 8, this.hZk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ht
 * JD-Core Version:    0.6.2
 */