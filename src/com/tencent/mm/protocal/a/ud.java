package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ud extends com.tencent.mm.ao.a
{
  public String KH;
  public int dZv;
  public ws hPu;
  public int hWU;
  public String hWb;
  public String hWc;
  public int hWt;
  public ws ipc;

  public static boolean a(b.a.a.a.a parama, ud paramud, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramud.hWU = parama.bel();
      return true;
    case 2:
      paramud.hWt = parama.bel();
      return true;
    case 3:
      paramud.KH = parama.ben();
      return true;
    case 4:
      paramud.dZv = parama.bel();
      return true;
    case 5:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        ws localws2 = new ws();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = ws.a(locala2, localws2, locala2.bet()));
        paramud.hPu = localws2;
      }
      return true;
    case 6:
      paramud.hWc = parama.ben();
      return true;
    case 7:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        ws localws1 = new ws();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = ws.a(locala1, localws1, locala1.bet()));
        paramud.ipc = localws1;
      }
      return true;
    case 8:
    }
    paramud.hWb = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hWU);
    parama.by(2, this.hWt);
    if (this.KH != null)
      parama.I(3, this.KH);
    parama.by(4, this.dZv);
    if (this.hPu != null)
    {
      parama.bv(5, this.hPu.hD());
      this.hPu.a(parama);
    }
    if (this.hWc != null)
      parama.I(6, this.hWc);
    if (this.ipc != null)
    {
      parama.bv(7, this.ipc.hD());
      this.ipc.a(parama);
    }
    if (this.hWb != null)
      parama.I(8, this.hWb);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hWU) + b.a.a.a.br(2, this.hWt);
    if (this.KH != null)
      i += b.a.a.b.b.a.J(3, this.KH);
    int j = i + b.a.a.a.br(4, this.dZv);
    if (this.hPu != null)
      j += b.a.a.a.bs(5, this.hPu.hD());
    if (this.hWc != null)
      j += b.a.a.b.b.a.J(6, this.hWc);
    if (this.ipc != null)
      j += b.a.a.a.bs(7, this.ipc.hD());
    if (this.hWb != null)
      j += b.a.a.b.b.a.J(8, this.hWb);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ud
 * JD-Core Version:    0.6.2
 */