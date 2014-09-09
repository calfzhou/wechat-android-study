package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class r extends com.tencent.mm.ao.a
{
  public qs hOZ;

  public static boolean a(b.a.a.a.a parama, r paramr, int paramInt)
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
      qs localqs = new qs();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = qs.a(locala, localqs, locala.bet()));
      paramr.hOZ = localqs;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOZ != null)
    {
      parama.bv(1, this.hOZ.hD());
      this.hOZ.a(parama);
    }
  }

  public final int hD()
  {
    qs localqs = this.hOZ;
    int i = 0;
    if (localqs != null)
      i = 0 + b.a.a.a.bs(1, this.hOZ.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.r
 * JD-Core Version:    0.6.2
 */