package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class yq extends com.tencent.mm.ao.a
{
  public String Ks;
  public String Kt;
  public int dtf;
  public String dtg;
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
  public int irS;
  public ws irT;
  public int irU;

  public static boolean a(b.a.a.a.a parama, yq paramyq, int paramInt)
  {
    switch (paramInt)
    {
    case 18:
    case 19:
    case 20:
    default:
      return false;
    case 1:
      paramyq.gnq = parama.ben();
      return true;
    case 2:
      paramyq.hwV = parama.ben();
      return true;
    case 3:
      paramyq.Ks = parama.ben();
      return true;
    case 4:
      paramyq.Kt = parama.ben();
      return true;
    case 5:
      paramyq.dtg = parama.ben();
      return true;
    case 6:
      paramyq.ifN = parama.ben();
      return true;
    case 7:
      paramyq.dtf = parama.bel();
      return true;
    case 8:
      paramyq.hOT = parama.bel();
      return true;
    case 9:
      paramyq.irS = parama.bel();
      return true;
    case 10:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        ws localws = new ws();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = ws.a(locala3, localws, locala3.bet()));
        paramyq.irT = localws;
      }
      return true;
    case 11:
      paramyq.irU = parama.bel();
      return true;
    case 12:
      paramyq.ifQ = parama.ben();
      return true;
    case 13:
      paramyq.ifR = parama.ben();
      return true;
    case 14:
      paramyq.ifS = parama.bel();
      return true;
    case 15:
      paramyq.ifO = parama.bel();
      return true;
    case 16:
      paramyq.ifP = parama.ben();
      return true;
    case 17:
      paramyq.idA = parama.ben();
      return true;
    case 21:
      paramyq.ifT = parama.bel();
      return true;
    case 22:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        aan localaan = new aan();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = aan.a(locala2, localaan, locala2.bet()));
        paramyq.ifU = localaan;
      }
      return true;
    case 23:
      paramyq.dtm = parama.ben();
      return true;
    case 24:
      paramyq.hTy = parama.ben();
      return true;
    case 25:
      paramyq.hTz = parama.ben();
      return true;
    case 26:
      paramyq.dtn = parama.ben();
      return true;
    case 27:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        ev localev = new ev();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = ev.a(locala1, localev, locala1.bet()));
        paramyq.ifV = localev;
      }
      return true;
    case 28:
    }
    paramyq.iaD = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.irT == null)
      throw new b("Not all required fields were included");
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
    parama.by(9, this.irS);
    if (this.irT != null)
    {
      parama.bv(10, this.irT.hD());
      this.irT.a(parama);
    }
    parama.by(11, this.irU);
    if (this.ifQ != null)
      parama.I(12, this.ifQ);
    if (this.ifR != null)
      parama.I(13, this.ifR);
    parama.by(14, this.ifS);
    parama.by(15, this.ifO);
    if (this.ifP != null)
      parama.I(16, this.ifP);
    if (this.idA != null)
      parama.I(17, this.idA);
    parama.by(21, this.ifT);
    if (this.ifU != null)
    {
      parama.bv(22, this.ifU.hD());
      this.ifU.a(parama);
    }
    if (this.dtm != null)
      parama.I(23, this.dtm);
    if (this.hTy != null)
      parama.I(24, this.hTy);
    if (this.hTz != null)
      parama.I(25, this.hTz);
    if (this.dtn != null)
      parama.I(26, this.dtn);
    if (this.ifV != null)
    {
      parama.bv(27, this.ifV.hD());
      this.ifV.a(parama);
    }
    if (this.iaD != null)
      parama.I(28, this.iaD);
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
    int j = i + b.a.a.a.br(7, this.dtf) + b.a.a.a.br(8, this.hOT) + b.a.a.a.br(9, this.irS);
    if (this.irT != null)
      j += b.a.a.a.bs(10, this.irT.hD());
    int k = j + b.a.a.a.br(11, this.irU);
    if (this.ifQ != null)
      k += b.a.a.b.b.a.J(12, this.ifQ);
    if (this.ifR != null)
      k += b.a.a.b.b.a.J(13, this.ifR);
    int m = k + b.a.a.a.br(14, this.ifS) + b.a.a.a.br(15, this.ifO);
    if (this.ifP != null)
      m += b.a.a.b.b.a.J(16, this.ifP);
    if (this.idA != null)
      m += b.a.a.b.b.a.J(17, this.idA);
    int n = m + b.a.a.a.br(21, this.ifT);
    if (this.ifU != null)
      n += b.a.a.a.bs(22, this.ifU.hD());
    if (this.dtm != null)
      n += b.a.a.b.b.a.J(23, this.dtm);
    if (this.hTy != null)
      n += b.a.a.b.b.a.J(24, this.hTy);
    if (this.hTz != null)
      n += b.a.a.b.b.a.J(25, this.hTz);
    if (this.dtn != null)
      n += b.a.a.b.b.a.J(26, this.dtn);
    if (this.ifV != null)
      n += b.a.a.a.bs(27, this.ifV.hD());
    if (this.iaD != null)
      n += b.a.a.b.b.a.J(28, this.iaD);
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.yq
 * JD-Core Version:    0.6.2
 */