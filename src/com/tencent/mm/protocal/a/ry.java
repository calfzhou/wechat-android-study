package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ry extends com.tencent.mm.ao.a
{
  public String Ks;
  public String Kt;
  public int dtf;
  public String dtg;
  public int dth;
  public String dtm;
  public int hUI;
  public vt hUY;
  public vt hUZ;
  public vt hVj;
  public int ifO;
  public String ifP;
  public vt ifj;
  public int ilP;
  public vt ilQ;
  public vt ilR;
  public vt ilS;

  public static boolean a(b.a.a.a.a parama, ry paramry, int paramInt)
  {
    switch (paramInt)
    {
    case 7:
    case 8:
    default:
      return false;
    case 1:
      LinkedList localLinkedList7 = parama.rN(paramInt);
      int i8 = localLinkedList7.size();
      for (int i9 = 0; i9 < i8; i9++)
      {
        byte[] arrayOfByte7 = (byte[])localLinkedList7.get(i9);
        vt localvt7 = new vt();
        b.a.a.a.a locala7 = new b.a.a.a.a(arrayOfByte7, hre);
        for (boolean bool7 = true; bool7; bool7 = vt.a(locala7, localvt7, locala7.bet()));
        paramry.hVj = localvt7;
      }
      return true;
    case 2:
      paramry.ilP = parama.bel();
      return true;
    case 3:
      LinkedList localLinkedList6 = parama.rN(paramInt);
      int i6 = localLinkedList6.size();
      for (int i7 = 0; i7 < i6; i7++)
      {
        byte[] arrayOfByte6 = (byte[])localLinkedList6.get(i7);
        vt localvt6 = new vt();
        b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte6, hre);
        for (boolean bool6 = true; bool6; bool6 = vt.a(locala6, localvt6, locala6.bet()));
        paramry.ifj = localvt6;
      }
      return true;
    case 4:
      LinkedList localLinkedList5 = parama.rN(paramInt);
      int i4 = localLinkedList5.size();
      for (int i5 = 0; i5 < i4; i5++)
      {
        byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i5);
        vt localvt5 = new vt();
        b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte5, hre);
        for (boolean bool5 = true; bool5; bool5 = vt.a(locala5, localvt5, locala5.bet()));
        paramry.hUY = localvt5;
      }
      return true;
    case 5:
      LinkedList localLinkedList4 = parama.rN(paramInt);
      int i2 = localLinkedList4.size();
      for (int i3 = 0; i3 < i2; i3++)
      {
        byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i3);
        vt localvt4 = new vt();
        b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte4, hre);
        for (boolean bool4 = true; bool4; bool4 = vt.a(locala4, localvt4, locala4.bet()));
        paramry.hUZ = localvt4;
      }
      return true;
    case 6:
      paramry.dtf = parama.bel();
      return true;
    case 9:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        vt localvt3 = new vt();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = vt.a(locala3, localvt3, locala3.bet()));
        paramry.ilQ = localvt3;
      }
      return true;
    case 10:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        vt localvt2 = new vt();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = vt.a(locala2, localvt2, locala2.bet()));
        paramry.ilR = localvt2;
      }
      return true;
    case 11:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        vt localvt1 = new vt();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = vt.a(locala1, localvt1, locala1.bet()));
        paramry.ilS = localvt1;
      }
      return true;
    case 12:
      paramry.hUI = parama.bel();
      return true;
    case 13:
      paramry.Ks = parama.ben();
      return true;
    case 14:
      paramry.Kt = parama.ben();
      return true;
    case 15:
      paramry.dtg = parama.ben();
      return true;
    case 16:
      paramry.dth = parama.bel();
      return true;
    case 17:
      paramry.ifO = parama.bel();
      return true;
    case 18:
      paramry.ifP = parama.ben();
      return true;
    case 19:
    }
    paramry.dtm = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVj == null) || (this.ifj == null) || (this.hUY == null) || (this.hUZ == null) || (this.ilQ == null) || (this.ilR == null) || (this.ilS == null))
      throw new b("Not all required fields were included");
    if (this.hVj != null)
    {
      parama.bv(1, this.hVj.hD());
      this.hVj.a(parama);
    }
    parama.by(2, this.ilP);
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
    if (this.ilQ != null)
    {
      parama.bv(9, this.ilQ.hD());
      this.ilQ.a(parama);
    }
    if (this.ilR != null)
    {
      parama.bv(10, this.ilR.hD());
      this.ilR.a(parama);
    }
    if (this.ilS != null)
    {
      parama.bv(11, this.ilS.hD());
      this.ilS.a(parama);
    }
    parama.by(12, this.hUI);
    if (this.Ks != null)
      parama.I(13, this.Ks);
    if (this.Kt != null)
      parama.I(14, this.Kt);
    if (this.dtg != null)
      parama.I(15, this.dtg);
    parama.by(16, this.dth);
    parama.by(17, this.ifO);
    if (this.ifP != null)
      parama.I(18, this.ifP);
    if (this.dtm != null)
      parama.I(19, this.dtm);
  }

  public final int hD()
  {
    vt localvt = this.hVj;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVj.hD());
    int j = i + b.a.a.a.br(2, this.ilP);
    if (this.ifj != null)
      j += b.a.a.a.bs(3, this.ifj.hD());
    if (this.hUY != null)
      j += b.a.a.a.bs(4, this.hUY.hD());
    if (this.hUZ != null)
      j += b.a.a.a.bs(5, this.hUZ.hD());
    int k = j + b.a.a.a.br(6, this.dtf);
    if (this.ilQ != null)
      k += b.a.a.a.bs(9, this.ilQ.hD());
    if (this.ilR != null)
      k += b.a.a.a.bs(10, this.ilR.hD());
    if (this.ilS != null)
      k += b.a.a.a.bs(11, this.ilS.hD());
    int m = k + b.a.a.a.br(12, this.hUI);
    if (this.Ks != null)
      m += b.a.a.b.b.a.J(13, this.Ks);
    if (this.Kt != null)
      m += b.a.a.b.b.a.J(14, this.Kt);
    if (this.dtg != null)
      m += b.a.a.b.b.a.J(15, this.dtg);
    int n = m + b.a.a.a.br(16, this.dth) + b.a.a.a.br(17, this.ifO);
    if (this.ifP != null)
      n += b.a.a.b.b.a.J(18, this.ifP);
    if (this.dtm != null)
      n += b.a.a.b.b.a.J(19, this.dtm);
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ry
 * JD-Core Version:    0.6.2
 */