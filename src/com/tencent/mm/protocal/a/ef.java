package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ef extends com.tencent.mm.ao.a
{
  public LinkedList hQc = new LinkedList();
  public int huF;

  public static boolean a(b.a.a.a.a parama, ef paramef, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramef.huF = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      ee localee = new ee();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = ee.a(locala, localee, locala.bet()));
      paramef.hQc.add(localee);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.huF);
    parama.d(2, 8, this.hQc);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.huF) + b.a.a.a.c(2, 8, this.hQc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ef
 * JD-Core Version:    0.6.2
 */