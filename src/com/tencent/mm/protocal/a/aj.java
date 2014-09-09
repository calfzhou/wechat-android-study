package com.tencent.mm.protocal.a;

import com.tencent.mm.ao.b;
import java.util.LinkedList;

public final class aj extends com.tencent.mm.ao.a
{
  public int hOH;
  public int hOV;
  public int hOi;
  public String hPI;
  public int hPJ;
  public String hPK;
  public b hPL;
  public int hPM;
  public b hPN;
  public int hPO;
  public int hPP;
  public int hPQ;
  public vt hPR;
  public int hPS;
  public int hPT;

  public static boolean a(b.a.a.a.a parama, aj paramaj, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaj.hPI = parama.ben();
      return true;
    case 2:
      paramaj.hPK = parama.ben();
      return true;
    case 3:
      paramaj.hPL = parama.bes();
      return true;
    case 4:
      paramaj.hPM = parama.bel();
      return true;
    case 5:
      paramaj.hPN = parama.bes();
      return true;
    case 6:
      paramaj.hOi = parama.bel();
      return true;
    case 7:
      paramaj.hOV = parama.bel();
      return true;
    case 8:
      paramaj.hPJ = parama.bel();
      return true;
    case 9:
      paramaj.hPO = parama.bel();
      return true;
    case 10:
      paramaj.hOH = parama.bel();
      return true;
    case 11:
      paramaj.hPP = parama.bel();
      return true;
    case 12:
      paramaj.hPQ = parama.bel();
      return true;
    case 13:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        vt localvt = new vt();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = vt.a(locala, localvt, locala.bet()));
        paramaj.hPR = localvt;
      }
      return true;
    case 14:
      paramaj.hPS = parama.bel();
      return true;
    case 15:
    }
    paramaj.hPT = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPI != null)
      parama.I(1, this.hPI);
    if (this.hPK != null)
      parama.I(2, this.hPK);
    if (this.hPL != null)
      parama.c(3, this.hPL);
    parama.by(4, this.hPM);
    if (this.hPN != null)
      parama.c(5, this.hPN);
    parama.by(6, this.hOi);
    parama.by(7, this.hOV);
    parama.by(8, this.hPJ);
    parama.by(9, this.hPO);
    parama.by(10, this.hOH);
    parama.by(11, this.hPP);
    parama.by(12, this.hPQ);
    if (this.hPR != null)
    {
      parama.bv(13, this.hPR.hD());
      this.hPR.a(parama);
    }
    parama.by(14, this.hPS);
    parama.by(15, this.hPT);
  }

  public final int hD()
  {
    String str = this.hPI;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPI);
    if (this.hPK != null)
      i += b.a.a.b.b.a.J(2, this.hPK);
    if (this.hPL != null)
      i += b.a.a.a.a(3, this.hPL);
    int j = i + b.a.a.a.br(4, this.hPM);
    if (this.hPN != null)
      j += b.a.a.a.a(5, this.hPN);
    int k = j + b.a.a.a.br(6, this.hOi) + b.a.a.a.br(7, this.hOV) + b.a.a.a.br(8, this.hPJ) + b.a.a.a.br(9, this.hPO) + b.a.a.a.br(10, this.hOH) + b.a.a.a.br(11, this.hPP) + b.a.a.a.br(12, this.hPQ);
    if (this.hPR != null)
      k += b.a.a.a.bs(13, this.hPR.hD());
    return k + b.a.a.a.br(14, this.hPS) + b.a.a.a.br(15, this.hPT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aj
 * JD-Core Version:    0.6.2
 */