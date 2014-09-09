package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class zb extends com.tencent.mm.ao.a
{
  public int isr;
  public LinkedList iss = new LinkedList();

  public static boolean a(b.a.a.a.a parama, zb paramzb, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramzb.isr = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      aba localaba = new aba();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = aba.a(locala, localaba, locala.bet()));
      paramzb.iss.add(localaba);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.isr);
    parama.d(2, 8, this.iss);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.isr) + b.a.a.a.c(2, 8, this.iss);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zb
 * JD-Core Version:    0.6.2
 */