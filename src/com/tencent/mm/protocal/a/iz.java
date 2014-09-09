package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class iz extends com.tencent.mm.ao.a
{
  public LinkedList hZG = new LinkedList();
  public LinkedList hZH = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.d(1, 1, this.hZG);
    parama.d(2, 1, this.hZH);
  }

  public final iz bH(byte[] paramArrayOfByte)
  {
    this.hZG.clear();
    this.hZH.clear();
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala.bet();
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
          locala.beu();
        i = locala.bet();
        break;
        this.hZG.add(locala.ben());
        j = 1;
        continue;
        this.hZH.add(locala.ben());
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.c(1, 1, this.hZG) + b.a.a.a.c(2, 1, this.hZH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.iz
 * JD-Core Version:    0.6.2
 */