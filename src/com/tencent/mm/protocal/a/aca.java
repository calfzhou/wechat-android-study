package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class aca extends com.tencent.mm.ao.a
{
  public int hWi;
  public LinkedList hWj = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hWi);
    parama.d(2, 8, this.hWj);
  }

  public final aca cy(byte[] paramArrayOfByte)
  {
    this.hWj.clear();
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
          vt localvt = new vt();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = vt.a(locala2, localvt, locala2.bet()));
          this.hWj.add(localvt);
        }
        m = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hWi) + b.a.a.a.c(2, 8, this.hWj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aca
 * JD-Core Version:    0.6.2
 */