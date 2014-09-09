package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class rt extends com.tencent.mm.ao.a
{
  public String cCD;
  public int dDN;
  public int ewb;
  public String gCe;
  public int guZ;
  public String hOh;
  public String hPl;
  public String hwQ;
  public int ihI;
  public String ihJ;
  public int ihK;
  public int ihL;
  public rv ihM;
  public String ihN;
  public int ihO;
  public int ihP;

  public static boolean a(b.a.a.a.a parama, rt paramrt, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramrt.hPl = parama.ben();
      return true;
    case 2:
      paramrt.ewb = parama.bel();
      return true;
    case 3:
      paramrt.hwQ = parama.ben();
      return true;
    case 4:
      paramrt.hOh = parama.ben();
      return true;
    case 5:
      paramrt.ihI = parama.bel();
      return true;
    case 6:
      paramrt.ihJ = parama.ben();
      return true;
    case 7:
      paramrt.ihK = parama.bel();
      return true;
    case 8:
      paramrt.ihL = parama.bel();
      return true;
    case 9:
      paramrt.cCD = parama.ben();
      return true;
    case 10:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        rv localrv = new rv();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = rv.a(locala, localrv, locala.bet()));
        paramrt.ihM = localrv;
      }
      return true;
    case 11:
      paramrt.ihN = parama.ben();
      return true;
    case 12:
      paramrt.ihO = parama.bel();
      return true;
    case 13:
      paramrt.guZ = parama.bel();
      return true;
    case 14:
      paramrt.ihP = parama.bel();
      return true;
    case 15:
      paramrt.gCe = parama.ben();
      return true;
    case 16:
    }
    paramrt.dDN = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPl != null)
      parama.I(1, this.hPl);
    parama.by(2, this.ewb);
    if (this.hwQ != null)
      parama.I(3, this.hwQ);
    if (this.hOh != null)
      parama.I(4, this.hOh);
    parama.by(5, this.ihI);
    if (this.ihJ != null)
      parama.I(6, this.ihJ);
    parama.by(7, this.ihK);
    parama.by(8, this.ihL);
    if (this.cCD != null)
      parama.I(9, this.cCD);
    if (this.ihM != null)
    {
      parama.bv(10, this.ihM.hD());
      this.ihM.a(parama);
    }
    if (this.ihN != null)
      parama.I(11, this.ihN);
    parama.by(12, this.ihO);
    parama.by(13, this.guZ);
    parama.by(14, this.ihP);
    if (this.gCe != null)
      parama.I(15, this.gCe);
    parama.by(16, this.dDN);
  }

  public final int hD()
  {
    String str = this.hPl;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPl);
    int j = i + b.a.a.a.br(2, this.ewb);
    if (this.hwQ != null)
      j += b.a.a.b.b.a.J(3, this.hwQ);
    if (this.hOh != null)
      j += b.a.a.b.b.a.J(4, this.hOh);
    int k = j + b.a.a.a.br(5, this.ihI);
    if (this.ihJ != null)
      k += b.a.a.b.b.a.J(6, this.ihJ);
    int m = k + b.a.a.a.br(7, this.ihK) + b.a.a.a.br(8, this.ihL);
    if (this.cCD != null)
      m += b.a.a.b.b.a.J(9, this.cCD);
    if (this.ihM != null)
      m += b.a.a.a.bs(10, this.ihM.hD());
    if (this.ihN != null)
      m += b.a.a.b.b.a.J(11, this.ihN);
    int n = m + b.a.a.a.br(12, this.ihO) + b.a.a.a.br(13, this.guZ) + b.a.a.a.br(14, this.ihP);
    if (this.gCe != null)
      n += b.a.a.b.b.a.J(15, this.gCe);
    return n + b.a.a.a.br(16, this.dDN);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rt
 * JD-Core Version:    0.6.2
 */