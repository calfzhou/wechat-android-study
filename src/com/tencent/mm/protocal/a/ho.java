package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ho extends com.tencent.mm.ao.a
{
  public long hXl;
  public long hXm;
  public LinkedList hXn = new LinkedList();

  public static boolean a(b.a.a.a.a parama, ho paramho, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramho.hXl = parama.ber();
      return true;
    case 2:
      paramho.hXm = parama.ber();
      return true;
    case 3:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      acc localacc = new acc();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = acc.a(locala, localacc, locala.bet()));
      paramho.hXn.add(localacc);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.k(1, this.hXl);
    parama.k(2, this.hXm);
    parama.d(3, 8, this.hXn);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.i(1, this.hXl) + b.a.a.a.i(2, this.hXm) + b.a.a.a.c(3, 8, this.hXn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ho
 * JD-Core Version:    0.6.2
 */