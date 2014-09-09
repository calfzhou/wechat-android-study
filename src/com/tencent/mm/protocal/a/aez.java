package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class aez extends com.tencent.mm.ao.a
{
  public int hUl;
  public LinkedList ixK = new LinkedList();

  public static boolean a(b.a.a.a.a parama, aez paramaez, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaez.hUl = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      aey localaey = new aey();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = aey.a(locala, localaey, locala.bet()));
      paramaez.ixK.add(localaey);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hUl);
    parama.d(2, 8, this.ixK);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hUl) + b.a.a.a.c(2, 8, this.ixK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aez
 * JD-Core Version:    0.6.2
 */