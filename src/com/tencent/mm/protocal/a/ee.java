package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ee extends com.tencent.mm.ao.a
{
  public int hUq;
  public ws hUr;

  public static boolean a(b.a.a.a.a parama, ee paramee, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramee.hUq = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      ws localws = new ws();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = ws.a(locala, localws, locala.bet()));
      paramee.hUr = localws;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hUr == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.hUq);
    if (this.hUr != null)
    {
      parama.bv(2, this.hUr.hD());
      this.hUr.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hUq);
    if (this.hUr != null)
      i += b.a.a.a.bs(2, this.hUr.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ee
 * JD-Core Version:    0.6.2
 */