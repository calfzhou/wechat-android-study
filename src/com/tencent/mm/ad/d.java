package com.tencent.mm.ad;

import java.util.LinkedList;

public final class d extends com.tencent.mm.ao.a
{
  public LinkedList dAi = new LinkedList();
  public int dAj;
  public int dAk;
  public int dAl;
  public int dAm;
  public String name;

  public static boolean a(b.a.a.a.a parama, d paramd, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        e locale = new e();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = e.a(locala, locale, locala.bet()));
        paramd.dAi.add(locale);
      }
      return true;
    case 2:
      paramd.name = parama.ben();
      return true;
    case 3:
      paramd.dAj = parama.bel();
      return true;
    case 4:
      paramd.dAk = parama.bel();
      return true;
    case 5:
      paramd.dAl = parama.bel();
      return true;
    case 6:
    }
    paramd.dAm = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.d(1, 8, this.dAi);
    if (this.name != null)
      parama.I(2, this.name);
    parama.by(3, this.dAj);
    parama.by(4, this.dAk);
    parama.by(5, this.dAl);
    parama.by(6, this.dAm);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.c(1, 8, this.dAi);
    if (this.name != null)
      i += b.a.a.b.b.a.J(2, this.name);
    return i + b.a.a.a.br(3, this.dAj) + b.a.a.a.br(4, this.dAk) + b.a.a.a.br(5, this.dAl) + b.a.a.a.br(6, this.dAm);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.d
 * JD-Core Version:    0.6.2
 */