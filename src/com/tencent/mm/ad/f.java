package com.tencent.mm.ad;

import java.util.LinkedList;

public final class f extends com.tencent.mm.ao.a
{
  public LinkedList dAp = new LinkedList();
  public double dAq;

  public final void a(b.a.a.c.a parama)
  {
    parama.d(1, 8, this.dAp);
    parama.a(2, this.dAq);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.c(1, 8, this.dAp);
    return i + (8 + b.a.a.b.b.a.rV(2));
  }

  public final f u(byte[] paramArrayOfByte)
  {
    this.dAp.clear();
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
          d locald = new d();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = d.a(locala2, locald, locala2.bet()));
          this.dAp.add(locald);
        }
        j = 1;
        continue;
        this.dAq = locala1.bep();
        j = 1;
      }
    }
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.f
 * JD-Core Version:    0.6.2
 */