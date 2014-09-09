package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class iy extends com.tencent.mm.ao.a
{
  public LinkedList hZF = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.d(1, 8, this.hZF);
  }

  public final iy bG(byte[] paramArrayOfByte)
  {
    this.hZF.clear();
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      switch (i)
      {
      default:
      case 1:
      }
      for (int m = 0; ; m = 1)
      {
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList = locala1.rN(i);
        int j = localLinkedList.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(k);
          iu localiu = new iu();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = iu.a(locala2, localiu, locala2.bet()));
          this.hZF.add(localiu);
        }
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.c(1, 8, this.hZF);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.iy
 * JD-Core Version:    0.6.2
 */