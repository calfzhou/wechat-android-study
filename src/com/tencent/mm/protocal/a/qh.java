package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class qh extends com.tencent.mm.ao.a
{
  public String Ks;
  public String Kt;
  public int dtf;
  public String dtg;
  public String dti;
  public String dtm;
  public String dtn;
  public String gnq;
  public int hOT;
  public String hTy;
  public String hTz;
  public String hwV;
  public String iaD;
  public String idA;
  public String ifN;
  public int ifO;
  public String ifP;
  public String ifQ;
  public String ifR;
  public int ifS;
  public int ifT;
  public aan ifU;
  public ev ifV;

  public static boolean a(b.a.a.a.a parama, qh paramqh, int paramInt)
  {
    switch (paramInt)
    {
    case 16:
    case 17:
    case 18:
    default:
      return false;
    case 1:
      paramqh.gnq = parama.ben();
      return true;
    case 2:
      paramqh.hwV = parama.ben();
      return true;
    case 3:
      paramqh.Ks = parama.ben();
      return true;
    case 4:
      paramqh.Kt = parama.ben();
      return true;
    case 5:
      paramqh.dtg = parama.ben();
      return true;
    case 6:
      paramqh.ifN = parama.ben();
      return true;
    case 7:
      paramqh.dtf = parama.bel();
      return true;
    case 8:
      paramqh.hOT = parama.bel();
      return true;
    case 9:
      paramqh.ifO = parama.bel();
      return true;
    case 10:
      paramqh.ifP = parama.ben();
      return true;
    case 11:
      paramqh.idA = parama.ben();
      return true;
    case 12:
      paramqh.dti = parama.ben();
      return true;
    case 13:
      paramqh.ifQ = parama.ben();
      return true;
    case 14:
      paramqh.ifR = parama.ben();
      return true;
    case 15:
      paramqh.ifS = parama.bel();
      return true;
    case 19:
      paramqh.ifT = parama.bel();
      return true;
    case 20:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        aan localaan = new aan();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = aan.a(locala2, localaan, locala2.bet()));
        paramqh.ifU = localaan;
      }
      return true;
    case 21:
      paramqh.dtm = parama.ben();
      return true;
    case 22:
      paramqh.hTy = parama.ben();
      return true;
    case 23:
      paramqh.hTz = parama.ben();
      return true;
    case 24:
      paramqh.dtn = parama.ben();
      return true;
    case 25:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        ev localev = new ev();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = ev.a(locala1, localev, locala1.bet()));
        paramqh.ifV = localev;
      }
      return true;
    case 26:
    }
    paramqh.iaD = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hwV != null)
      parama.I(2, this.hwV);
    if (this.Ks != null)
      parama.I(3, this.Ks);
    if (this.Kt != null)
      parama.I(4, this.Kt);
    if (this.dtg != null)
      parama.I(5, this.dtg);
    if (this.ifN != null)
      parama.I(6, this.ifN);
    parama.by(7, this.dtf);
    parama.by(8, this.hOT);
    parama.by(9, this.ifO);
    if (this.ifP != null)
      parama.I(10, this.ifP);
    if (this.idA != null)
      parama.I(11, this.idA);
    if (this.dti != null)
      parama.I(12, this.dti);
    if (this.ifQ != null)
      parama.I(13, this.ifQ);
    if (this.ifR != null)
      parama.I(14, this.ifR);
    parama.by(15, this.ifS);
    parama.by(19, this.ifT);
    if (this.ifU != null)
    {
      parama.bv(20, this.ifU.hD());
      this.ifU.a(parama);
    }
    if (this.dtm != null)
      parama.I(21, this.dtm);
    if (this.hTy != null)
      parama.I(22, this.hTy);
    if (this.hTz != null)
      parama.I(23, this.hTz);
    if (this.dtn != null)
      parama.I(24, this.dtn);
    if (this.ifV != null)
    {
      parama.bv(25, this.ifV.hD());
      this.ifV.a(parama);
    }
    if (this.iaD != null)
      parama.I(26, this.iaD);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(2, this.hwV);
    if (this.Ks != null)
      i += b.a.a.b.b.a.J(3, this.Ks);
    if (this.Kt != null)
      i += b.a.a.b.b.a.J(4, this.Kt);
    if (this.dtg != null)
      i += b.a.a.b.b.a.J(5, this.dtg);
    if (this.ifN != null)
      i += b.a.a.b.b.a.J(6, this.ifN);
    int j = i + b.a.a.a.br(7, this.dtf) + b.a.a.a.br(8, this.hOT) + b.a.a.a.br(9, this.ifO);
    if (this.ifP != null)
      j += b.a.a.b.b.a.J(10, this.ifP);
    if (this.idA != null)
      j += b.a.a.b.b.a.J(11, this.idA);
    if (this.dti != null)
      j += b.a.a.b.b.a.J(12, this.dti);
    if (this.ifQ != null)
      j += b.a.a.b.b.a.J(13, this.ifQ);
    if (this.ifR != null)
      j += b.a.a.b.b.a.J(14, this.ifR);
    int k = j + b.a.a.a.br(15, this.ifS) + b.a.a.a.br(19, this.ifT);
    if (this.ifU != null)
      k += b.a.a.a.bs(20, this.ifU.hD());
    if (this.dtm != null)
      k += b.a.a.b.b.a.J(21, this.dtm);
    if (this.hTy != null)
      k += b.a.a.b.b.a.J(22, this.hTy);
    if (this.hTz != null)
      k += b.a.a.b.b.a.J(23, this.hTz);
    if (this.dtn != null)
      k += b.a.a.b.b.a.J(24, this.dtn);
    if (this.ifV != null)
      k += b.a.a.a.bs(25, this.ifV.hD());
    if (this.iaD != null)
      k += b.a.a.b.b.a.J(26, this.iaD);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qh
 * JD-Core Version:    0.6.2
 */