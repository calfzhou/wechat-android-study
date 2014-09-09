package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class abz extends com.tencent.mm.ao.a
{
  public int hWi;
  public LinkedList hWs = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hWi);
    parama.d(2, 8, this.hWs);
  }

  public final abz cx(byte[] paramArrayOfByte)
  {
    this.hWs.clear();
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
        this.hWi = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList = locala1.rN(i);
        int j = localLinkedList.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(k);
          uc localuc = new uc();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = uc.a(locala2, localuc, locala2.bet()));
          this.hWs.add(localuc);
        }
        m = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hWi) + b.a.a.a.c(2, 8, this.hWs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.abz
 * JD-Core Version:    0.6.2
 */