package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class sf extends com.tencent.mm.ao.a
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
  public ws hOU;
  public String hTy;
  public String hTz;
  public int hUI;
  public vt hUY;
  public vt hUZ;
  public vt hVf;
  public String idA;
  public int ifO;
  public String ifP;
  public String ifQ;
  public String ifR;
  public int ifS;
  public aan ifU;
  public ev ifV;
  public vt ifj;
  public vt ilQ;
  public vt ilR;
  public vt ilS;
  public int ilV;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVf == null) || (this.ifj == null) || (this.hUY == null) || (this.hUZ == null) || (this.hOU == null) || (this.ilQ == null) || (this.ilR == null) || (this.ilS == null))
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
    if (this.hUY != null)
    {
      parama.bv(3, this.hUY.hD());
      this.hUY.a(parama);
    }
    if (this.hUZ != null)
    {
      parama.bv(4, this.hUZ.hD());
      this.hUZ.a(parama);
    }
    parama.by(5, this.dtf);
    if (this.hOU != null)
    {
      parama.bv(6, this.hOU.hD());
      this.hOU.a(parama);
    }
    parama.by(7, this.ilV);
    if (this.ilQ != null)
    {
      parama.bv(8, this.ilQ.hD());
      this.ilQ.a(parama);
    }
    if (this.ilR != null)
    {
      parama.bv(9, this.ilR.hD());
      this.ilR.a(parama);
    }
    if (this.ilS != null)
    {
      parama.bv(10, this.ilS.hD());
      this.ilS.a(parama);
    }
    parama.by(11, this.hUI);
    if (this.Ks != null)
      parama.I(12, this.Ks);
    if (this.Kt != null)
      parama.I(13, this.Kt);
    if (this.dtg != null)
      parama.I(14, this.dtg);
    parama.by(15, this.dth);
    parama.by(16, this.ifO);
    if (this.ifP != null)
      parama.I(17, this.ifP);
    if (this.ifQ != null)
      parama.I(18, this.ifQ);
    if (this.idA != null)
      parama.I(19, this.idA);
    if (this.ifR != null)
      parama.I(20, this.ifR);
    parama.by(21, this.ifS);
    parama.by(22, this.dtk);
    parama.by(23, this.dtj);
    if (this.dtl != null)
      parama.I(24, this.dtl);
    if (this.dti != null)
      parama.I(25, this.dti);
    if (this.ifU != null)
    {
      parama.bv(26, this.ifU.hD());
      this.ifU.a(parama);
    }
    if (this.dtm != null)
      parama.I(27, this.dtm);
    if (this.hTy != null)
      parama.I(28, this.hTy);
    if (this.hTz != null)
      parama.I(29, this.hTz);
    if (this.dtn != null)
      parama.I(30, this.dtn);
    if (this.ifV != null)
    {
      parama.bv(31, this.ifV.hD());
      this.ifV.a(parama);
    }
  }

  public final sf bX(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int m;
      switch (i)
      {
      default:
        m = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      }
      while (true)
      {
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList10 = locala1.rN(i);
        int i16 = localLinkedList10.size();
        for (int i17 = 0; i17 < i16; i17++)
        {
          byte[] arrayOfByte10 = (byte[])localLinkedList10.get(i17);
          vt localvt7 = new vt();
          b.a.a.a.a locala11 = new b.a.a.a.a(arrayOfByte10, hre);
          for (boolean bool10 = true; bool10; bool10 = vt.a(locala11, localvt7, locala11.bet()));
          this.hVf = localvt7;
        }
        m = 1;
        continue;
        LinkedList localLinkedList9 = locala1.rN(i);
        int i14 = localLinkedList9.size();
        for (int i15 = 0; i15 < i14; i15++)
        {
          byte[] arrayOfByte9 = (byte[])localLinkedList9.get(i15);
          vt localvt6 = new vt();
          b.a.a.a.a locala10 = new b.a.a.a.a(arrayOfByte9, hre);
          for (boolean bool9 = true; bool9; bool9 = vt.a(locala10, localvt6, locala10.bet()));
          this.ifj = localvt6;
        }
        m = 1;
        continue;
        LinkedList localLinkedList8 = locala1.rN(i);
        int i12 = localLinkedList8.size();
        for (int i13 = 0; i13 < i12; i13++)
        {
          byte[] arrayOfByte8 = (byte[])localLinkedList8.get(i13);
          vt localvt5 = new vt();
          b.a.a.a.a locala9 = new b.a.a.a.a(arrayOfByte8, hre);
          for (boolean bool8 = true; bool8; bool8 = vt.a(locala9, localvt5, locala9.bet()));
          this.hUY = localvt5;
        }
        m = 1;
        continue;
        LinkedList localLinkedList7 = locala1.rN(i);
        int i10 = localLinkedList7.size();
        for (int i11 = 0; i11 < i10; i11++)
        {
          byte[] arrayOfByte7 = (byte[])localLinkedList7.get(i11);
          vt localvt4 = new vt();
          b.a.a.a.a locala8 = new b.a.a.a.a(arrayOfByte7, hre);
          for (boolean bool7 = true; bool7; bool7 = vt.a(locala8, localvt4, locala8.bet()));
          this.hUZ = localvt4;
        }
        m = 1;
        continue;
        this.dtf = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList6 = locala1.rN(i);
        int i8 = localLinkedList6.size();
        for (int i9 = 0; i9 < i8; i9++)
        {
          byte[] arrayOfByte6 = (byte[])localLinkedList6.get(i9);
          ws localws = new ws();
          b.a.a.a.a locala7 = new b.a.a.a.a(arrayOfByte6, hre);
          for (boolean bool6 = true; bool6; bool6 = ws.a(locala7, localws, locala7.bet()));
          this.hOU = localws;
        }
        m = 1;
        continue;
        this.ilV = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList5 = locala1.rN(i);
        int i6 = localLinkedList5.size();
        for (int i7 = 0; i7 < i6; i7++)
        {
          byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i7);
          vt localvt3 = new vt();
          b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte5, hre);
          for (boolean bool5 = true; bool5; bool5 = vt.a(locala6, localvt3, locala6.bet()));
          this.ilQ = localvt3;
        }
        m = 1;
        continue;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          vt localvt2 = new vt();
          b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = vt.a(locala5, localvt2, locala5.bet()));
          this.ilR = localvt2;
        }
        m = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          vt localvt1 = new vt();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = vt.a(locala4, localvt1, locala4.bet()));
          this.ilS = localvt1;
        }
        m = 1;
        continue;
        this.hUI = locala1.bel();
        m = 1;
        continue;
        this.Ks = locala1.ben();
        m = 1;
        continue;
        this.Kt = locala1.ben();
        m = 1;
        continue;
        this.dtg = locala1.ben();
        m = 1;
        continue;
        this.dth = locala1.bel();
        m = 1;
        continue;
        this.ifO = locala1.bel();
        m = 1;
        continue;
        this.ifP = locala1.ben();
        m = 1;
        continue;
        this.ifQ = locala1.ben();
        m = 1;
        continue;
        this.idA = locala1.ben();
        m = 1;
        continue;
        this.ifR = locala1.ben();
        m = 1;
        continue;
        this.ifS = locala1.bel();
        m = 1;
        continue;
        this.dtk = locala1.bel();
        m = 1;
        continue;
        this.dtj = locala1.bel();
        m = 1;
        continue;
        this.dtl = locala1.ben();
        m = 1;
        continue;
        this.dti = locala1.ben();
        m = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          aan localaan = new aan();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = aan.a(locala3, localaan, locala3.bet()));
          this.ifU = localaan;
        }
        m = 1;
        continue;
        this.dtm = locala1.ben();
        m = 1;
        continue;
        this.hTy = locala1.ben();
        m = 1;
        continue;
        this.hTz = locala1.ben();
        m = 1;
        continue;
        this.dtn = locala1.ben();
        m = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int j = localLinkedList1.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(k);
          ev localev = new ev();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ev.a(locala2, localev, locala2.bet()));
          this.ifV = localev;
        }
        m = 1;
      }
    }
    if ((this.hVf == null) || (this.ifj == null) || (this.hUY == null) || (this.hUZ == null) || (this.hOU == null) || (this.ilQ == null) || (this.ilR == null) || (this.ilS == null))
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    vt localvt = this.hVf;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVf.hD());
    if (this.ifj != null)
      i += b.a.a.a.bs(2, this.ifj.hD());
    if (this.hUY != null)
      i += b.a.a.a.bs(3, this.hUY.hD());
    if (this.hUZ != null)
      i += b.a.a.a.bs(4, this.hUZ.hD());
    int j = i + b.a.a.a.br(5, this.dtf);
    if (this.hOU != null)
      j += b.a.a.a.bs(6, this.hOU.hD());
    int k = j + b.a.a.a.br(7, this.ilV);
    if (this.ilQ != null)
      k += b.a.a.a.bs(8, this.ilQ.hD());
    if (this.ilR != null)
      k += b.a.a.a.bs(9, this.ilR.hD());
    if (this.ilS != null)
      k += b.a.a.a.bs(10, this.ilS.hD());
    int m = k + b.a.a.a.br(11, this.hUI);
    if (this.Ks != null)
      m += b.a.a.b.b.a.J(12, this.Ks);
    if (this.Kt != null)
      m += b.a.a.b.b.a.J(13, this.Kt);
    if (this.dtg != null)
      m += b.a.a.b.b.a.J(14, this.dtg);
    int n = m + b.a.a.a.br(15, this.dth) + b.a.a.a.br(16, this.ifO);
    if (this.ifP != null)
      n += b.a.a.b.b.a.J(17, this.ifP);
    if (this.ifQ != null)
      n += b.a.a.b.b.a.J(18, this.ifQ);
    if (this.idA != null)
      n += b.a.a.b.b.a.J(19, this.idA);
    if (this.ifR != null)
      n += b.a.a.b.b.a.J(20, this.ifR);
    int i1 = n + b.a.a.a.br(21, this.ifS) + b.a.a.a.br(22, this.dtk) + b.a.a.a.br(23, this.dtj);
    if (this.dtl != null)
      i1 += b.a.a.b.b.a.J(24, this.dtl);
    if (this.dti != null)
      i1 += b.a.a.b.b.a.J(25, this.dti);
    if (this.ifU != null)
      i1 += b.a.a.a.bs(26, this.ifU.hD());
    if (this.dtm != null)
      i1 += b.a.a.b.b.a.J(27, this.dtm);
    if (this.hTy != null)
      i1 += b.a.a.b.b.a.J(28, this.hTy);
    if (this.hTz != null)
      i1 += b.a.a.b.b.a.J(29, this.hTz);
    if (this.dtn != null)
      i1 += b.a.a.b.b.a.J(30, this.dtn);
    if (this.ifV != null)
      i1 += b.a.a.a.bs(31, this.ifV.hD());
    return i1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sf
 * JD-Core Version:    0.6.2
 */