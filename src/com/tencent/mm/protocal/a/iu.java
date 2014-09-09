package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class iu extends com.tencent.mm.ao.a
{
  public int hZD;
  public LinkedList hZE = new LinkedList();

  public static boolean a(b.a.a.a.a parama, iu paramiu, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramiu.hZD = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      it localit = new it();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = it.a(locala, localit, locala.bet()));
      paramiu.hZE.add(localit);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hZD);
    parama.d(2, 8, this.hZE);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hZD) + b.a.a.a.c(2, 8, this.hZE);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.iu
 * JD-Core Version:    0.6.2
 */