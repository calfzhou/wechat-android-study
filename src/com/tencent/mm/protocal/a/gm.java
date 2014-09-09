package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class gm extends com.tencent.mm.ao.a
{
  public LinkedList hQc = new LinkedList();
  public String hWb;
  public int huF;

  public static boolean a(b.a.a.a.a parama, gm paramgm, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgm.hWb = parama.ben();
      return true;
    case 2:
      paramgm.huF = parama.bel();
      return true;
    case 3:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      qg localqg = new qg();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = qg.a(locala, localqg, locala.bet()));
      paramgm.hQc.add(localqg);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hWb != null)
      parama.I(1, this.hWb);
    parama.by(2, this.huF);
    parama.d(3, 8, this.hQc);
  }

  public final int hD()
  {
    String str = this.hWb;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hWb);
    return i + b.a.a.a.br(2, this.huF) + b.a.a.a.c(3, 8, this.hQc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gm
 * JD-Core Version:    0.6.2
 */