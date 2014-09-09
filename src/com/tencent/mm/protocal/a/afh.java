package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class afh extends com.tencent.mm.ao.a
{
  public int hSC;
  public int huF;
  public LinkedList ixX = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.huF);
    parama.d(2, 8, this.ixX);
    parama.by(3, this.hSC);
  }

  public final afh cD(byte[] paramArrayOfByte)
  {
    this.ixX.clear();
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
        this.huF = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList = locala1.rN(i);
        int k = localLinkedList.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(m);
          afg localafg = new afg();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = afg.a(locala2, localafg, locala2.bet()));
          this.ixX.add(localafg);
        }
        j = 1;
        continue;
        this.hSC = locala1.bel();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.huF) + b.a.a.a.c(2, 8, this.ixX) + b.a.a.a.br(3, this.hSC);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afh
 * JD-Core Version:    0.6.2
 */