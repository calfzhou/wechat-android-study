package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class xk extends com.tencent.mm.ao.a
{
  public String Ks;
  public String Kt;
  public int dtf;
  public String dtg;
  public int dth;
  public String dti;
  public String dtm;
  public String hTy;
  public String hTz;
  public vt hVf;
  public int ifO;
  public String ifP;
  public String ifQ;
  public String ifR;
  public int ifS;
  public ev ifV;
  public vt ifj;

  public static boolean a(b.a.a.a.a parama, xk paramxk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        vt localvt2 = new vt();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = vt.a(locala3, localvt2, locala3.bet()));
        paramxk.hVf = localvt2;
      }
      return true;
    case 2:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        vt localvt1 = new vt();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = vt.a(locala2, localvt1, locala2.bet()));
        paramxk.ifj = localvt1;
      }
      return true;
    case 3:
      paramxk.dtf = parama.bel();
      return true;
    case 4:
      paramxk.Ks = parama.ben();
      return true;
    case 5:
      paramxk.Kt = parama.ben();
      return true;
    case 6:
      paramxk.dtg = parama.ben();
      return true;
    case 7:
      paramxk.dth = parama.bel();
      return true;
    case 8:
      paramxk.ifO = parama.bel();
      return true;
    case 9:
      paramxk.ifP = parama.ben();
      return true;
    case 10:
      paramxk.ifQ = parama.ben();
      return true;
    case 11:
      paramxk.dti = parama.ben();
      return true;
    case 12:
      paramxk.ifR = parama.ben();
      return true;
    case 13:
      paramxk.ifS = parama.bel();
      return true;
    case 14:
      paramxk.dtm = parama.ben();
      return true;
    case 15:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        ev localev = new ev();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = ev.a(locala1, localev, locala1.bet()));
        paramxk.ifV = localev;
      }
      return true;
    case 16:
      paramxk.hTy = parama.ben();
      return true;
    case 17:
    }
    paramxk.hTz = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVf == null) || (this.ifj == null))
      throw new b("Not all required fields were included");
    if (this.hVf != null)
    {
      parama.bv(1, this.hVf.hD());
      this.hVf.a(parama);
    }
    if (this.ifj != null)
    {
      parama.bv(2, this.ifj.hD());
      this.ifj.a(parama);
    }
    parama.by(3, this.dtf);
    if (this.Ks != null)
      parama.I(4, this.Ks);
    if (this.Kt != null)
      parama.I(5, this.Kt);
    if (this.dtg != null)
      parama.I(6, this.dtg);
    parama.by(7, this.dth);
    parama.by(8, this.ifO);
    if (this.ifP != null)
      parama.I(9, this.ifP);
    if (this.ifQ != null)
      parama.I(10, this.ifQ);
    if (this.dti != null)
      parama.I(11, this.dti);
    if (this.ifR != null)
      parama.I(12, this.ifR);
    parama.by(13, this.ifS);
    if (this.dtm != null)
      parama.I(14, this.dtm);
    if (this.ifV != null)
    {
      parama.bv(15, this.ifV.hD());
      this.ifV.a(parama);
    }
    if (this.hTy != null)
      parama.I(16, this.hTy);
    if (this.hTz != null)
      parama.I(17, this.hTz);
  }

  public final int hD()
  {
    vt localvt = this.hVf;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVf.hD());
    if (this.ifj != null)
      i += b.a.a.a.bs(2, this.ifj.hD());
    int j = i + b.a.a.a.br(3, this.dtf);
    if (this.Ks != null)
      j += b.a.a.b.b.a.J(4, this.Ks);
    if (this.Kt != null)
      j += b.a.a.b.b.a.J(5, this.Kt);
    if (this.dtg != null)
      j += b.a.a.b.b.a.J(6, this.dtg);
    int k = j + b.a.a.a.br(7, this.dth) + b.a.a.a.br(8, this.ifO);
    if (this.ifP != null)
      k += b.a.a.b.b.a.J(9, this.ifP);
    if (this.ifQ != null)
      k += b.a.a.b.b.a.J(10, this.ifQ);
    if (this.dti != null)
      k += b.a.a.b.b.a.J(11, this.dti);
    if (this.ifR != null)
      k += b.a.a.b.b.a.J(12, this.ifR);
    int m = k + b.a.a.a.br(13, this.ifS);
    if (this.dtm != null)
      m += b.a.a.b.b.a.J(14, this.dtm);
    if (this.ifV != null)
      m += b.a.a.a.bs(15, this.ifV.hD());
    if (this.hTy != null)
      m += b.a.a.b.b.a.J(16, this.hTy);
    if (this.hTz != null)
      m += b.a.a.b.b.a.J(17, this.hTz);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xk
 * JD-Core Version:    0.6.2
 */