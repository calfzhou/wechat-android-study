package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class gf extends com.tencent.mm.ao.a
{
  public String ID;
  public int hQk;
  public int hQw;
  public int hUu;
  public String hVM;
  public ws hVN;

  public static boolean a(b.a.a.a.a parama, gf paramgf, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgf.hQw = parama.bel();
      return true;
    case 2:
      paramgf.hUu = parama.bel();
      return true;
    case 3:
      paramgf.hQk = parama.bel();
      return true;
    case 4:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        ws localws = new ws();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = ws.a(locala, localws, locala.bet()));
        paramgf.hVN = localws;
      }
      return true;
    case 5:
      paramgf.hVM = parama.ben();
      return true;
    case 6:
    }
    paramgf.ID = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVN == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.hQw);
    parama.by(2, this.hUu);
    parama.by(3, this.hQk);
    if (this.hVN != null)
    {
      parama.bv(4, this.hVN.hD());
      this.hVN.a(parama);
    }
    if (this.hVM != null)
      parama.I(5, this.hVM);
    if (this.ID != null)
      parama.I(6, this.ID);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hQw) + b.a.a.a.br(2, this.hUu) + b.a.a.a.br(3, this.hQk);
    if (this.hVN != null)
      i += b.a.a.a.bs(4, this.hVN.hD());
    if (this.hVM != null)
      i += b.a.a.b.b.a.J(5, this.hVM);
    if (this.ID != null)
      i += b.a.a.b.b.a.J(6, this.ID);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gf
 * JD-Core Version:    0.6.2
 */