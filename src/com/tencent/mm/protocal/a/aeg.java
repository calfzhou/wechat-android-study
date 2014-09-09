package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class aeg extends com.tencent.mm.ao.a
{
  public String hRk;
  public ut ixc;

  public static boolean a(b.a.a.a.a parama, aeg paramaeg, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaeg.hRk = parama.ben();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      ut localut = new ut();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = ut.a(locala, localut, locala.bet()));
      paramaeg.ixc = localut;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ixc == null)
      throw new b("Not all required fields were included");
    if (this.hRk != null)
      parama.I(1, this.hRk);
    if (this.ixc != null)
    {
      parama.bv(2, this.ixc.hD());
      this.ixc.a(parama);
    }
  }

  public final int hD()
  {
    String str = this.hRk;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hRk);
    if (this.ixc != null)
      i += b.a.a.a.bs(2, this.ixc.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aeg
 * JD-Core Version:    0.6.2
 */