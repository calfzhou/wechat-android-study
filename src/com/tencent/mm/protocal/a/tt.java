package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class tt extends com.tencent.mm.ao.a
{
  public com.tencent.mm.ao.b hPL;
  public int ioG;
  public String ioH;
  public ws ioI;

  public static boolean a(b.a.a.a.a parama, tt paramtt, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramtt.ioG = parama.bel();
      return true;
    case 2:
      paramtt.hPL = parama.bes();
      return true;
    case 3:
      paramtt.ioH = parama.ben();
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
      paramtt.ioI = localws;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ioI == null)
      throw new b.a.a.b("Not all required fields were included");
    parama.by(1, this.ioG);
    if (this.hPL != null)
      parama.c(2, this.hPL);
    if (this.ioH != null)
      parama.I(3, this.ioH);
    if (this.ioI != null)
    {
      parama.bv(4, this.ioI.hD());
      this.ioI.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ioG);
    if (this.hPL != null)
      i += b.a.a.a.a(2, this.hPL);
    if (this.ioH != null)
      i += b.a.a.b.b.a.J(3, this.ioH);
    if (this.ioI != null)
      i += b.a.a.a.bs(4, this.ioI.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tt
 * JD-Core Version:    0.6.2
 */