package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class aac extends com.tencent.mm.ao.a
{
  public LinkedList hQc = new LinkedList();
  public int huF;
  public String imz;
  public long itu;

  public static boolean a(b.a.a.a.a parama, aac paramaac, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaac.itu = parama.ber();
      return true;
    case 2:
      paramaac.imz = parama.ben();
      return true;
    case 3:
      paramaac.huF = parama.bel();
      return true;
    case 4:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      vt localvt = new vt();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = vt.a(locala, localvt, locala.bet()));
      paramaac.hQc.add(localvt);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.k(1, this.itu);
    if (this.imz != null)
      parama.I(2, this.imz);
    parama.by(3, this.huF);
    parama.d(4, 8, this.hQc);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.itu);
    if (this.imz != null)
      i += b.a.a.b.b.a.J(2, this.imz);
    return i + b.a.a.a.br(3, this.huF) + b.a.a.a.c(4, 8, this.hQc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aac
 * JD-Core Version:    0.6.2
 */