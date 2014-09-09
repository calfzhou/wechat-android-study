package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ou extends com.tencent.mm.ao.a
{
  public String KH;
  public LinkedList hUT = new LinkedList();

  public static boolean a(b.a.a.a.a parama, ou paramou, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramou.KH = parama.ben();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      rt localrt = new rt();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = rt.a(locala, localrt, locala.bet()));
      paramou.hUT.add(localrt);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.KH != null)
      parama.I(1, this.KH);
    parama.d(2, 8, this.hUT);
  }

  public final int hD()
  {
    String str = this.KH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.KH);
    return i + b.a.a.a.c(2, 8, this.hUT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ou
 * JD-Core Version:    0.6.2
 */