package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class vb extends com.tencent.mm.ao.a
{
  public String Ks;
  public String Kt;
  public int dtf;
  public String dtg;
  public int dth;
  public String dti;
  public int dtj;
  public int dtk;
  public String dtl;
  public String dtm;
  public String dtn;
  public String gnq;
  public String hTy;
  public String hTz;
  public String hwV;
  public String iaD;
  public aan ifU;
  public ev ifV;
  public int ipZ;
  public String iqa;
  public int iqb;
  public String iqc;

  public static boolean a(b.a.a.a.a parama, vb paramvb, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramvb.ipZ = parama.bel();
      return true;
    case 2:
      paramvb.gnq = parama.ben();
      return true;
    case 3:
      paramvb.hwV = parama.ben();
      return true;
    case 4:
      paramvb.iqa = parama.ben();
      return true;
    case 5:
      paramvb.iqb = parama.bel();
      return true;
    case 6:
      paramvb.iqc = parama.ben();
      return true;
    case 7:
      paramvb.dtf = parama.bel();
      return true;
    case 8:
      paramvb.Ks = parama.ben();
      return true;
    case 9:
      paramvb.Kt = parama.ben();
      return true;
    case 10:
      paramvb.dtg = parama.ben();
      return true;
    case 11:
      paramvb.dth = parama.bel();
      return true;
    case 12:
      paramvb.dti = parama.ben();
      return true;
    case 13:
      paramvb.dtj = parama.bel();
      return true;
    case 14:
      paramvb.dtk = parama.bel();
      return true;
    case 15:
      paramvb.dtl = parama.ben();
      return true;
    case 16:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        aan localaan = new aan();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = aan.a(locala2, localaan, locala2.bet()));
        paramvb.ifU = localaan;
      }
      return true;
    case 17:
      paramvb.dtm = parama.ben();
      return true;
    case 18:
      paramvb.dtn = parama.ben();
      return true;
    case 19:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        ev localev = new ev();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = ev.a(locala1, localev, locala1.bet()));
        paramvb.ifV = localev;
      }
      return true;
    case 20:
      paramvb.hTy = parama.ben();
      return true;
    case 21:
      paramvb.hTz = parama.ben();
      return true;
    case 22:
    }
    paramvb.iaD = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ipZ);
    if (this.gnq != null)
      parama.I(2, this.gnq);
    if (this.hwV != null)
      parama.I(3, this.hwV);
    if (this.iqa != null)
      parama.I(4, this.iqa);
    parama.by(5, this.iqb);
    if (this.iqc != null)
      parama.I(6, this.iqc);
    parama.by(7, this.dtf);
    if (this.Ks != null)
      parama.I(8, this.Ks);
    if (this.Kt != null)
      parama.I(9, this.Kt);
    if (this.dtg != null)
      parama.I(10, this.dtg);
    parama.by(11, this.dth);
    if (this.dti != null)
      parama.I(12, this.dti);
    parama.by(13, this.dtj);
    parama.by(14, this.dtk);
    if (this.dtl != null)
      parama.I(15, this.dtl);
    if (this.ifU != null)
    {
      parama.bv(16, this.ifU.hD());
      this.ifU.a(parama);
    }
    if (this.dtm != null)
      parama.I(17, this.dtm);
    if (this.dtn != null)
      parama.I(18, this.dtn);
    if (this.ifV != null)
    {
      parama.bv(19, this.ifV.hD());
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
    int i = 0 + b.a.a.a.br(1, this.ipZ);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(3, this.hwV);
    if (this.iqa != null)
      i += b.a.a.b.b.a.J(4, this.iqa);
    int j = i + b.a.a.a.br(5, this.iqb);
    if (this.iqc != null)
      j += b.a.a.b.b.a.J(6, this.iqc);
    int k = j + b.a.a.a.br(7, this.dtf);
    if (this.Ks != null)
      k += b.a.a.b.b.a.J(8, this.Ks);
    if (this.Kt != null)
      k += b.a.a.b.b.a.J(9, this.Kt);
    if (this.dtg != null)
      k += b.a.a.b.b.a.J(10, this.dtg);
    int m = k + b.a.a.a.br(11, this.dth);
    if (this.dti != null)
      m += b.a.a.b.b.a.J(12, this.dti);
    int n = m + b.a.a.a.br(13, this.dtj) + b.a.a.a.br(14, this.dtk);
    if (this.dtl != null)
      n += b.a.a.b.b.a.J(15, this.dtl);
    if (this.ifU != null)
      n += b.a.a.a.bs(16, this.ifU.hD());
    if (this.dtm != null)
      n += b.a.a.b.b.a.J(17, this.dtm);
    if (this.dtn != null)
      n += b.a.a.b.b.a.J(18, this.dtn);
    if (this.ifV != null)
      n += b.a.a.a.bs(19, this.ifV.hD());
    if (this.hTy != null)
      n += b.a.a.b.b.a.J(20, this.hTy);
    if (this.hTz != null)
      n += b.a.a.b.b.a.J(21, this.hTz);
    if (this.iaD != null)
      n += b.a.a.b.b.a.J(22, this.iaD);
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vb
 * JD-Core Version:    0.6.2
 */