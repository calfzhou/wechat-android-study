package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class afe extends com.tencent.mm.ao.a
{
  public String hPq;
  public int hUq;
  public ws hUr;

  public static boolean a(b.a.a.a.a parama, afe paramafe, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramafe.hUq = parama.bel();
      return true;
    case 2:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        ws localws = new ws();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = ws.a(locala, localws, locala.bet()));
        paramafe.hUr = localws;
      }
      return true;
    case 3:
    }
    paramafe.hPq = parama.ben();
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
    if (this.hPq != null)
      parama.I(3, this.hPq);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hUq);
    if (this.hUr != null)
      i += b.a.a.a.bs(2, this.hUr.hD());
    if (this.hPq != null)
      i += b.a.a.b.b.a.J(3, this.hPq);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afe
 * JD-Core Version:    0.6.2
 */