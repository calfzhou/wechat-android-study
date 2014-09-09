package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class eo extends com.tencent.mm.ao.a
{
  public String cCD;
  public String hOh;
  public int hUS;
  public LinkedList hUT = new LinkedList();
  public String hwQ;

  public static boolean a(b.a.a.a.a parama, eo parameo, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parameo.hwQ = parama.ben();
      return true;
    case 2:
      parameo.hUS = parama.bel();
      return true;
    case 3:
      parameo.cCD = parama.ben();
      return true;
    case 4:
      parameo.hOh = parama.ben();
      return true;
    case 5:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      rt localrt = new rt();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = rt.a(locala, localrt, locala.bet()));
      parameo.hUT.add(localrt);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hwQ != null)
      parama.I(1, this.hwQ);
    parama.by(2, this.hUS);
    if (this.cCD != null)
      parama.I(3, this.cCD);
    if (this.hOh != null)
      parama.I(4, this.hOh);
    parama.d(5, 8, this.hUT);
  }

  public final int hD()
  {
    String str = this.hwQ;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hwQ);
    int j = i + b.a.a.a.br(2, this.hUS);
    if (this.cCD != null)
      j += b.a.a.b.b.a.J(3, this.cCD);
    if (this.hOh != null)
      j += b.a.a.b.b.a.J(4, this.hOh);
    return j + b.a.a.a.c(5, 8, this.hUT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.eo
 * JD-Core Version:    0.6.2
 */