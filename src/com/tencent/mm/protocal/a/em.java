package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class em extends com.tencent.mm.ao.a
{
  public int hUQ;
  public ws hUR;
  public int hUu;

  public static boolean a(b.a.a.a.a parama, em paramem, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramem.hUu = parama.bel();
      return true;
    case 2:
      paramem.hUQ = parama.bel();
      return true;
    case 3:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      ws localws = new ws();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = ws.a(locala, localws, locala.bet()));
      paramem.hUR = localws;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hUR == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.hUu);
    parama.by(2, this.hUQ);
    if (this.hUR != null)
    {
      parama.bv(3, this.hUR.hD());
      this.hUR.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hUu) + b.a.a.a.br(2, this.hUQ);
    if (this.hUR != null)
      i += b.a.a.a.bs(3, this.hUR.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.em
 * JD-Core Version:    0.6.2
 */