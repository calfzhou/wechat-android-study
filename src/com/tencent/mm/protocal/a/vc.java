package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class vc extends com.tencent.mm.ao.a
{
  public int huF;
  public int idn;
  public LinkedList iqd = new LinkedList();

  public static boolean a(b.a.a.a.a parama, vc paramvc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramvc.idn = parama.bel();
      return true;
    case 2:
      paramvc.huF = parama.bel();
      return true;
    case 3:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      vb localvb = new vb();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = vb.a(locala, localvb, locala.bet()));
      paramvc.iqd.add(localvb);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.idn);
    parama.by(2, this.huF);
    parama.d(3, 8, this.iqd);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.idn) + b.a.a.a.br(2, this.huF) + b.a.a.a.c(3, 8, this.iqd);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vc
 * JD-Core Version:    0.6.2
 */