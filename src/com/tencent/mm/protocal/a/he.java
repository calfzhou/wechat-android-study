package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class he extends com.tencent.mm.ao.a
{
  public LinkedList hWR = new LinkedList();
  public int id;
  public String value;

  public static boolean a(b.a.a.a.a parama, he paramhe, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhe.id = parama.bel();
      return true;
    case 2:
      paramhe.value = parama.ben();
      return true;
    case 3:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      hb localhb = new hb();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = hb.a(locala, localhb, locala.bet()));
      paramhe.hWR.add(localhb);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.id);
    if (this.value != null)
      parama.I(2, this.value);
    parama.d(3, 8, this.hWR);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.id);
    if (this.value != null)
      i += b.a.a.b.b.a.J(2, this.value);
    return i + b.a.a.a.c(3, 8, this.hWR);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.he
 * JD-Core Version:    0.6.2
 */