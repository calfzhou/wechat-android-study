package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class af extends com.tencent.mm.ao.a
{
  public rt hPD;

  public static boolean a(b.a.a.a.a parama, af paramaf, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      rt localrt = new rt();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = rt.a(locala, localrt, locala.bet()));
      paramaf.hPD = localrt;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPD == null)
      throw new b("Not all required fields were included");
    if (this.hPD != null)
    {
      parama.bv(1, this.hPD.hD());
      this.hPD.a(parama);
    }
  }

  public final int hD()
  {
    rt localrt = this.hPD;
    int i = 0;
    if (localrt != null)
      i = 0 + b.a.a.a.bs(1, this.hPD.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.af
 * JD-Core Version:    0.6.2
 */