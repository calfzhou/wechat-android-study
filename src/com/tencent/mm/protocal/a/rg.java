package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class rg extends com.tencent.mm.ao.a
{
  public String Ks;
  public String Kt;
  public String dte;
  public int dtf;
  public String dtg;
  public int dth;
  public String dti;
  public int dtj;
  public int dtk;
  public String dtl;
  public String dtm;
  public String dtn;
  public String hRk;
  public String hTy;
  public String hTz;
  public String iaD;
  public aan ifU;
  public ev ifV;
  public String igN;
  public hi igO;

  public static boolean a(b.a.a.a.a parama, rg paramrg, int paramInt)
  {
    switch (paramInt)
    {
    case 18:
    case 19:
    default:
      return false;
    case 1:
      paramrg.hRk = parama.ben();
      return true;
    case 2:
      paramrg.igN = parama.ben();
      return true;
    case 3:
      paramrg.dte = parama.ben();
      return true;
    case 4:
      paramrg.dtf = parama.bel();
      return true;
    case 5:
      paramrg.Ks = parama.ben();
      return true;
    case 6:
      paramrg.Kt = parama.ben();
      return true;
    case 7:
      paramrg.dtg = parama.ben();
      return true;
    case 8:
      paramrg.dth = parama.bel();
      return true;
    case 9:
      paramrg.dti = parama.ben();
      return true;
    case 10:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        hi localhi = new hi();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = hi.a(locala3, localhi, locala3.bet()));
        paramrg.igO = localhi;
      }
      return true;
    case 11:
      paramrg.dtj = parama.bel();
      return true;
    case 12:
      paramrg.dtk = parama.bel();
      return true;
    case 13:
      paramrg.dtl = parama.ben();
      return true;
    case 14:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        aan localaan = new aan();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = aan.a(locala2, localaan, locala2.bet()));
        paramrg.ifU = localaan;
      }
      return true;
    case 15:
      paramrg.dtm = parama.ben();
      return true;
    case 16:
      paramrg.dtn = parama.ben();
      return true;
    case 17:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        ev localev = new ev();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = ev.a(locala1, localev, locala1.bet()));
        paramrg.ifV = localev;
      }
      return true;
    case 20:
      paramrg.hTy = parama.ben();
      return true;
    case 21:
      paramrg.hTz = parama.ben();
      return true;
    case 22:
    }
    paramrg.iaD = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRk != null)
      parama.I(1, this.hRk);
    if (this.igN != null)
      parama.I(2, this.igN);
    if (this.dte != null)
      parama.I(3, this.dte);
    parama.by(4, this.dtf);
    if (this.Ks != null)
      parama.I(5, this.Ks);
    if (this.Kt != null)
      parama.I(6, this.Kt);
    if (this.dtg != null)
      parama.I(7, this.dtg);
    parama.by(8, this.dth);
    if (this.dti != null)
      parama.I(9, this.dti);
    if (this.igO != null)
    {
      parama.bv(10, this.igO.hD());
      this.igO.a(parama);
    }
    parama.by(11, this.dtj);
    parama.by(12, this.dtk);
    if (this.dtl != null)
      parama.I(13, this.dtl);
    if (this.ifU != null)
    {
      parama.bv(14, this.ifU.hD());
      this.ifU.a(parama);
    }
    if (this.dtm != null)
      parama.I(15, this.dtm);
    if (this.dtn != null)
      parama.I(16, this.dtn);
    if (this.ifV != null)
    {
      parama.bv(17, this.ifV.hD());
      this.ifV.a(parama);
    }
    if (this.hTy != null)
      parama.I(20, this.hTy);
    if (this.hTz != null)
      parama.I(21, this.hTz);
    if (this.iaD != null)
      parama.I(22, this.iaD);
  }

  public final int hD()
  {
    String str = this.hRk;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hRk);
    if (this.igN != null)
      i += b.a.a.b.b.a.J(2, this.igN);
    if (this.dte != null)
      i += b.a.a.b.b.a.J(3, this.dte);
    int j = i + b.a.a.a.br(4, this.dtf);
    if (this.Ks != null)
      j += b.a.a.b.b.a.J(5, this.Ks);
    if (this.Kt != null)
      j += b.a.a.b.b.a.J(6, this.Kt);
    if (this.dtg != null)
      j += b.a.a.b.b.a.J(7, this.dtg);
    int k = j + b.a.a.a.br(8, this.dth);
    if (this.dti != null)
      k += b.a.a.b.b.a.J(9, this.dti);
    if (this.igO != null)
      k += b.a.a.a.bs(10, this.igO.hD());
    int m = k + b.a.a.a.br(11, this.dtj) + b.a.a.a.br(12, this.dtk);
    if (this.dtl != null)
      m += b.a.a.b.b.a.J(13, this.dtl);
    if (this.ifU != null)
      m += b.a.a.a.bs(14, this.ifU.hD());
    if (this.dtm != null)
      m += b.a.a.b.b.a.J(15, this.dtm);
    if (this.dtn != null)
      m += b.a.a.b.b.a.J(16, this.dtn);
    if (this.ifV != null)
      m += b.a.a.a.bs(17, this.ifV.hD());
    if (this.hTy != null)
      m += b.a.a.b.b.a.J(20, this.hTy);
    if (this.hTz != null)
      m += b.a.a.b.b.a.J(21, this.hTz);
    if (this.iaD != null)
      m += b.a.a.b.b.a.J(22, this.iaD);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rg
 * JD-Core Version:    0.6.2
 */