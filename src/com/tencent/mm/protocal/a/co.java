package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class co extends com.tencent.mm.ao.a
{
  public int hSA;
  public int hSB;
  public int hSC;
  public LinkedList hSD = new LinkedList();
  public LinkedList hSE = new LinkedList();

  public static boolean a(b.a.a.a.a parama, co paramco, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramco.hSA = parama.bel();
      return true;
    case 2:
      paramco.hSB = parama.bel();
      return true;
    case 5:
      paramco.hSC = parama.bel();
      return true;
    case 3:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        cn localcn2 = new cn();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = cn.a(locala2, localcn2, locala2.bet()));
        paramco.hSD.add(localcn2);
      }
      return true;
    case 4:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      cn localcn1 = new cn();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = cn.a(locala1, localcn1, locala1.bet()));
      paramco.hSE.add(localcn1);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hSA);
    parama.by(2, this.hSB);
    parama.by(5, this.hSC);
    parama.d(3, 8, this.hSD);
    parama.d(4, 8, this.hSE);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hSA) + b.a.a.a.br(2, this.hSB) + b.a.a.a.br(5, this.hSC) + b.a.a.a.c(3, 8, this.hSD) + b.a.a.a.c(4, 8, this.hSE);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.co
 * JD-Core Version:    0.6.2
 */