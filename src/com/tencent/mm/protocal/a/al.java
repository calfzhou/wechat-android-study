package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class al extends com.tencent.mm.ao.a
{
  public LinkedList hQc = new LinkedList();
  public int huF;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.huF);
    parama.d(2, 8, this.hQc);
  }

  public final al bb(byte[] paramArrayOfByte)
  {
    this.hQc.clear();
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
        this.huF = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList = locala1.rN(i);
        int j = localLinkedList.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(k);
          ak localak = new ak();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = ak.a(locala2, localak, locala2.bet()));
          this.hQc.add(localak);
        }
        m = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.huF) + b.a.a.a.c(2, 8, this.hQc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.al
 * JD-Core Version:    0.6.2
 */