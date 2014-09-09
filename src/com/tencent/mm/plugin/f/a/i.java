package com.tencent.mm.plugin.f.a;

import com.tencent.mm.protocal.a.aaz;
import java.util.LinkedList;

public final class i extends com.tencent.mm.ao.a
{
  public int fSK;
  public LinkedList fSY = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.fSK);
    parama.d(2, 8, this.fSY);
  }

  public final i an(byte[] paramArrayOfByte)
  {
    this.fSY.clear();
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
        this.fSK = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList = locala1.rN(i);
        int j = localLinkedList.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(k);
          aaz localaaz = new aaz();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = aaz.a(locala2, localaaz, locala2.bet()));
          this.fSY.add(localaaz);
        }
        m = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.fSK) + b.a.a.a.c(2, 8, this.fSY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.a.i
 * JD-Core Version:    0.6.2
 */