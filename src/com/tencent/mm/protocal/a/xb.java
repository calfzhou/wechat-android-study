package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class xb extends vo
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
  public vt hUY;
  public vt hUZ;
  public vt hVf;
  public String iaD;
  public int ibK;
  public LinkedList ibL = new LinkedList();
  public int ifO;
  public String ifP;
  public String ifQ;
  public String ifR;
  public int ifS;
  public aan ifU;
  public ev ifV;
  public vt ifj;
  public ws irr;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hRz == null) || (this.hVf == null) || (this.ifj == null) || (this.hUY == null) || (this.hUZ == null) || (this.hOU == null))
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    if (this.hVf != null)
    {
      parama.bv(2, this.hVf.hD());
      this.hVf.a(parama);
    }
    if (this.ifj != null)
    {
      parama.bv(3, this.ifj.hD());
      this.ifj.a(parama);
    }
    if (this.hUY != null)
    {
      parama.bv(4, this.hUY.hD());
      this.hUY.a(parama);
    }
    if (this.hUZ != null)
    {
      parama.bv(5, this.hUZ.hD());
      this.hUZ.a(parama);
    }
    parama.by(6, this.dtf);
    if (this.hOU != null)
    {
      parama.bv(7, this.hOU.hD());
      this.hOU.a(parama);
    }
    if (this.Ks != null)
      parama.I(8, this.Ks);
    if (this.Kt != null)
      parama.I(9, this.Kt);
    if (this.dtg != null)
      parama.I(10, this.dtg);
    parama.by(11, this.dth);
    parama.by(12, this.ifO);
    if (this.ifP != null)
      parama.I(13, this.ifP);
    if (this.ifQ != null)
      parama.I(14, this.ifQ);
    if (this.dti != null)
      parama.I(15, this.dti);
    if (this.ifR != null)
      parama.I(16, this.ifR);
    parama.by(17, this.ifS);
    parama.by(18, this.dtk);
    parama.by(19, this.dtj);
    if (this.dtl != null)
      parama.I(20, this.dtl);
    if (this.ifU != null)
    {
      parama.bv(21, this.ifU.hD());
      this.ifU.a(parama);
    }
    if (this.dtm != null)
      parama.I(22, this.dtm);
    if (this.dtn != null)
      parama.I(23, this.dtn);
    if (this.ifV != null)
    {
      parama.bv(24, this.ifV.hD());
      this.ifV.a(parama);
    }
    parama.by(25, this.ibK);
    parama.d(26, 8, this.ibL);
    if (this.hTy != null)
      parama.I(27, this.hTy);
    if (this.hTz != null)
      parama.I(28, this.hTz);
    if (this.irr != null)
    {
      parama.bv(29, this.irr.hD());
      this.irr.a(parama);
    }
    if (this.iaD != null)
      parama.I(30, this.iaD);
  }

  public final xb cn(byte[] paramArrayOfByte)
  {
    this.ibL.clear();
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      default:
        j = 0;
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
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList10 = locala1.rN(i);
        int i16 = localLinkedList10.size();
        for (int i17 = 0; i17 < i16; i17++)
        {
          byte[] arrayOfByte10 = (byte[])localLinkedList10.get(i17);
          bb localbb = new bb();
          b.a.a.a.a locala11 = new b.a.a.a.a(arrayOfByte10, hre);
          for (boolean bool10 = true; bool10; bool10 = bb.a(locala11, localbb, locala11.bet()));
          this.hRz = localbb;
        }
        j = 1;
        continue;
        LinkedList localLinkedList9 = locala1.rN(i);
        int i14 = localLinkedList9.size();
        for (int i15 = 0; i15 < i14; i15++)
        {
          byte[] arrayOfByte9 = (byte[])localLinkedList9.get(i15);
          vt localvt4 = new vt();
          b.a.a.a.a locala10 = new b.a.a.a.a(arrayOfByte9, hre);
          for (boolean bool9 = true; bool9; bool9 = vt.a(locala10, localvt4, locala10.bet()));
          this.hVf = localvt4;
        }
        j = 1;
        continue;
        LinkedList localLinkedList8 = locala1.rN(i);
        int i12 = localLinkedList8.size();
        for (int i13 = 0; i13 < i12; i13++)
        {
          byte[] arrayOfByte8 = (byte[])localLinkedList8.get(i13);
          vt localvt3 = new vt();
          b.a.a.a.a locala9 = new b.a.a.a.a(arrayOfByte8, hre);
          for (boolean bool8 = true; bool8; bool8 = vt.a(locala9, localvt3, locala9.bet()));
          this.ifj = localvt3;
        }
        j = 1;
        continue;
        LinkedList localLinkedList7 = locala1.rN(i);
        int i10 = localLinkedList7.size();
        for (int i11 = 0; i11 < i10; i11++)
        {
          byte[] arrayOfByte7 = (byte[])localLinkedList7.get(i11);
          vt localvt2 = new vt();
          b.a.a.a.a locala8 = new b.a.a.a.a(arrayOfByte7, hre);
          for (boolean bool7 = true; bool7; bool7 = vt.a(locala8, localvt2, locala8.bet()));
          this.hUY = localvt2;
        }
        j = 1;
        continue;
        LinkedList localLinkedList6 = locala1.rN(i);
        int i8 = localLinkedList6.size();
        for (int i9 = 0; i9 < i8; i9++)
        {
          byte[] arrayOfByte6 = (byte[])localLinkedList6.get(i9);
          vt localvt1 = new vt();
          b.a.a.a.a locala7 = new b.a.a.a.a(arrayOfByte6, hre);
          for (boolean bool6 = true; bool6; bool6 = vt.a(locala7, localvt1, locala7.bet()));
          this.hUZ = localvt1;
        }
        j = 1;
        continue;
        this.dtf = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList5 = locala1.rN(i);
        int i6 = localLinkedList5.size();
        for (int i7 = 0; i7 < i6; i7++)
        {
          byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i7);
          ws localws2 = new ws();
          b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte5, hre);
          for (boolean bool5 = true; bool5; bool5 = ws.a(locala6, localws2, locala6.bet()));
          this.hOU = localws2;
        }
        j = 1;
        continue;
        this.Ks = locala1.ben();
        j = 1;
        continue;
        this.Kt = locala1.ben();
        j = 1;
        continue;
        this.dtg = locala1.ben();
        j = 1;
        continue;
        this.dth = locala1.bel();
        j = 1;
        continue;
        this.ifO = locala1.bel();
        j = 1;
        continue;
        this.ifP = locala1.ben();
        j = 1;
        continue;
        this.ifQ = locala1.ben();
        j = 1;
        continue;
        this.dti = locala1.ben();
        j = 1;
        continue;
        this.ifR = locala1.ben();
        j = 1;
        continue;
        this.ifS = locala1.bel();
        j = 1;
        continue;
        this.dtk = locala1.bel();
        j = 1;
        continue;
        this.dtj = locala1.bel();
        j = 1;
        continue;
        this.dtl = locala1.ben();
        j = 1;
        continue;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          aan localaan = new aan();
          b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = aan.a(locala5, localaan, locala5.bet()));
          this.ifU = localaan;
        }
        j = 1;
        continue;
        this.dtm = locala1.ben();
        j = 1;
        continue;
        this.dtn = locala1.ben();
        j = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          ev localev = new ev();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = ev.a(locala4, localev, locala4.bet()));
          this.ifV = localev;
        }
        j = 1;
        continue;
        this.ibK = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          wz localwz = new wz();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = wz.a(locala3, localwz, locala3.bet()));
          this.ibL.add(localwz);
        }
        j = 1;
        continue;
        this.hTy = locala1.ben();
        j = 1;
        continue;
        this.hTz = locala1.ben();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          ws localws1 = new ws();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ws.a(locala2, localws1, locala2.bet()));
          this.irr = localws1;
        }
        j = 1;
        continue;
        this.iaD = locala1.ben();
        j = 1;
      }
    }
    if ((this.hRz == null) || (this.hVf == null) || (this.ifj == null) || (this.hUY == null) || (this.hUZ == null) || (this.hOU == null))
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    if (this.hVf != null)
      i += b.a.a.a.bs(2, this.hVf.hD());
    if (this.ifj != null)
      i += b.a.a.a.bs(3, this.ifj.hD());
    if (this.hUY != null)
      i += b.a.a.a.bs(4, this.hUY.hD());
    if (this.hUZ != null)
      i += b.a.a.a.bs(5, this.hUZ.hD());
    int j = i + b.a.a.a.br(6, this.dtf);
    if (this.hOU != null)
      j += b.a.a.a.bs(7, this.hOU.hD());
    if (this.Ks != null)
      j += b.a.a.b.b.a.J(8, this.Ks);
    if (this.Kt != null)
      j += b.a.a.b.b.a.J(9, this.Kt);
    if (this.dtg != null)
      j += b.a.a.b.b.a.J(10, this.dtg);
    int k = j + b.a.a.a.br(11, this.dth) + b.a.a.a.br(12, this.ifO);
    if (this.ifP != null)
      k += b.a.a.b.b.a.J(13, this.ifP);
    if (this.ifQ != null)
      k += b.a.a.b.b.a.J(14, this.ifQ);
    if (this.dti != null)
      k += b.a.a.b.b.a.J(15, this.dti);
    if (this.ifR != null)
      k += b.a.a.b.b.a.J(16, this.ifR);
    int m = k + b.a.a.a.br(17, this.ifS) + b.a.a.a.br(18, this.dtk) + b.a.a.a.br(19, this.dtj);
    if (this.dtl != null)
      m += b.a.a.b.b.a.J(20, this.dtl);
    if (this.ifU != null)
      m += b.a.a.a.bs(21, this.ifU.hD());
    if (this.dtm != null)
      m += b.a.a.b.b.a.J(22, this.dtm);
    if (this.dtn != null)
      m += b.a.a.b.b.a.J(23, this.dtn);
    if (this.ifV != null)
      m += b.a.a.a.bs(24, this.ifV.hD());
    int n = m + b.a.a.a.br(25, this.ibK) + b.a.a.a.c(26, 8, this.ibL);
    if (this.hTy != null)
      n += b.a.a.b.b.a.J(27, this.hTy);
    if (this.hTz != null)
      n += b.a.a.b.b.a.J(28, this.hTz);
    if (this.irr != null)
      n += b.a.a.a.bs(29, this.irr.hD());
    if (this.iaD != null)
      n += b.a.a.b.b.a.J(30, this.iaD);
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xb
 * JD-Core Version:    0.6.2
 */