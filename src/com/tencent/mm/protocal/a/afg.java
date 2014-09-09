package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class afg extends com.tencent.mm.ao.a
{
  public int hPS;
  public ws hPZ;
  public int hQv;
  public int hUq;

  public static boolean a(b.a.a.a.a parama, afg paramafg, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramafg.hUq = parama.bel();
      return true;
    case 2:
      paramafg.hQv = parama.bel();
      return true;
    case 3:
      paramafg.hPS = parama.bel();
      return true;
    case 4:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      ws localws = new ws();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = ws.a(locala, localws, locala.bet()));
      paramafg.hPZ = localws;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPZ == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.hUq);
    parama.by(2, this.hQv);
    parama.by(3, this.hPS);
    if (this.hPZ != null)
    {
      parama.bv(4, this.hPZ.hD());
      this.hPZ.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hUq) + b.a.a.a.br(2, this.hQv) + b.a.a.a.br(3, this.hPS);
    if (this.hPZ != null)
      i += b.a.a.a.bs(4, this.hPZ.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afg
 * JD-Core Version:    0.6.2
 */