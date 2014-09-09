package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class uy extends com.tencent.mm.ao.a
{
  public String KH;
  public int ewb;
  public int hOi;
  public String hSF;
  public String hWo;
  public int huF;
  public String idg;
  public int ipO;
  public LinkedList ipP = new LinkedList();
  public int ipQ;
  public String ipR;
  public String ipS;
  public int ipT;
  public String ipU;
  public int ipV;
  public LinkedList ipW = new LinkedList();

  public static boolean a(b.a.a.a.a parama, uy paramuy, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramuy.ipO = parama.bel();
      return true;
    case 2:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        py localpy = new py();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = py.a(locala2, localpy, locala2.bet()));
        paramuy.ipP.add(localpy);
      }
      return true;
    case 3:
      paramuy.huF = parama.bel();
      return true;
    case 4:
      paramuy.ipQ = parama.bel();
      return true;
    case 5:
      paramuy.hWo = parama.ben();
      return true;
    case 6:
      paramuy.idg = parama.ben();
      return true;
    case 7:
      paramuy.ipR = parama.ben();
      return true;
    case 8:
      paramuy.ipS = parama.ben();
      return true;
    case 9:
      paramuy.ewb = parama.bel();
      return true;
    case 10:
      paramuy.KH = parama.ben();
      return true;
    case 11:
      paramuy.hSF = parama.ben();
      return true;
    case 12:
      paramuy.ipT = parama.bel();
      return true;
    case 13:
      paramuy.hOi = parama.bel();
      return true;
    case 14:
      paramuy.ipU = parama.ben();
      return true;
    case 15:
      paramuy.ipV = parama.bel();
      return true;
    case 16:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      fo localfo = new fo();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = fo.a(locala1, localfo, locala1.bet()));
      paramuy.ipW.add(localfo);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ipO);
    parama.d(2, 8, this.ipP);
    parama.by(3, this.huF);
    parama.by(4, this.ipQ);
    if (this.hWo != null)
      parama.I(5, this.hWo);
    if (this.idg != null)
      parama.I(6, this.idg);
    if (this.ipR != null)
      parama.I(7, this.ipR);
    if (this.ipS != null)
      parama.I(8, this.ipS);
    parama.by(9, this.ewb);
    if (this.KH != null)
      parama.I(10, this.KH);
    if (this.hSF != null)
      parama.I(11, this.hSF);
    parama.by(12, this.ipT);
    parama.by(13, this.hOi);
    if (this.ipU != null)
      parama.I(14, this.ipU);
    parama.by(15, this.ipV);
    parama.d(16, 8, this.ipW);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ipO) + b.a.a.a.c(2, 8, this.ipP) + b.a.a.a.br(3, this.huF) + b.a.a.a.br(4, this.ipQ);
    if (this.hWo != null)
      i += b.a.a.b.b.a.J(5, this.hWo);
    if (this.idg != null)
      i += b.a.a.b.b.a.J(6, this.idg);
    if (this.ipR != null)
      i += b.a.a.b.b.a.J(7, this.ipR);
    if (this.ipS != null)
      i += b.a.a.b.b.a.J(8, this.ipS);
    int j = i + b.a.a.a.br(9, this.ewb);
    if (this.KH != null)
      j += b.a.a.b.b.a.J(10, this.KH);
    if (this.hSF != null)
      j += b.a.a.b.b.a.J(11, this.hSF);
    int k = j + b.a.a.a.br(12, this.ipT) + b.a.a.a.br(13, this.hOi);
    if (this.ipU != null)
      k += b.a.a.b.b.a.J(14, this.ipU);
    return k + b.a.a.a.br(15, this.ipV) + b.a.a.a.c(16, 8, this.ipW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.uy
 * JD-Core Version:    0.6.2
 */