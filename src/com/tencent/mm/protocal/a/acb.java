package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class acb extends com.tencent.mm.ao.a
{
  public String gnq;
  public h gyx;
  public int hOV;
  public String hPl;
  public int ihL;
  public eo ivA;
  public String ivB;
  public String ivC;
  public String ivD;
  public int ivE;
  public int ivF;
  public String ivG;
  public String ivx;
  public rc ivy;
  public y ivz;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPl != null)
      parama.I(1, this.hPl);
    if (this.gnq != null)
      parama.I(2, this.gnq);
    parama.by(3, this.ihL);
    parama.by(4, this.hOV);
    if (this.ivx != null)
      parama.I(5, this.ivx);
    if (this.ivy != null)
    {
      parama.bv(6, this.ivy.hD());
      this.ivy.a(parama);
    }
    if (this.ivz != null)
    {
      parama.bv(7, this.ivz.hD());
      this.ivz.a(parama);
    }
    if (this.ivA != null)
    {
      parama.bv(8, this.ivA.hD());
      this.ivA.a(parama);
    }
    if (this.ivB != null)
      parama.I(9, this.ivB);
    if (this.ivC != null)
      parama.I(10, this.ivC);
    if (this.ivD != null)
      parama.I(11, this.ivD);
    parama.by(12, this.ivE);
    parama.by(13, this.ivF);
    if (this.ivG != null)
      parama.I(14, this.ivG);
    if (this.gyx != null)
    {
      parama.bv(15, this.gyx.hD());
      this.gyx.a(parama);
    }
  }

  public final acb cz(byte[] paramArrayOfByte)
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
      }
      while (true)
      {
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        this.hPl = locala1.ben();
        m = 1;
        continue;
        this.gnq = locala1.ben();
        m = 1;
        continue;
        this.ihL = locala1.bel();
        m = 1;
        continue;
        this.hOV = locala1.bel();
        m = 1;
        continue;
        this.ivx = locala1.ben();
        m = 1;
        continue;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          rc localrc = new rc();
          b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = rc.a(locala5, localrc, locala5.bet()));
          this.ivy = localrc;
        }
        m = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          y localy = new y();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = y.a(locala4, localy, locala4.bet()));
          this.ivz = localy;
        }
        m = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          eo localeo = new eo();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = eo.a(locala3, localeo, locala3.bet()));
          this.ivA = localeo;
        }
        m = 1;
        continue;
        this.ivB = locala1.ben();
        m = 1;
        continue;
        this.ivC = locala1.ben();
        m = 1;
        continue;
        this.ivD = locala1.ben();
        m = 1;
        continue;
        this.ivE = locala1.bel();
        m = 1;
        continue;
        this.ivF = locala1.bel();
        m = 1;
        continue;
        this.ivG = locala1.ben();
        m = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int j = localLinkedList1.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(k);
          h localh = new h();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = h.a(locala2, localh, locala2.bet()));
          this.gyx = localh;
        }
        m = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    String str = this.hPl;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPl);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    int j = i + b.a.a.a.br(3, this.ihL) + b.a.a.a.br(4, this.hOV);
    if (this.ivx != null)
      j += b.a.a.b.b.a.J(5, this.ivx);
    if (this.ivy != null)
      j += b.a.a.a.bs(6, this.ivy.hD());
    if (this.ivz != null)
      j += b.a.a.a.bs(7, this.ivz.hD());
    if (this.ivA != null)
      j += b.a.a.a.bs(8, this.ivA.hD());
    if (this.ivB != null)
      j += b.a.a.b.b.a.J(9, this.ivB);
    if (this.ivC != null)
      j += b.a.a.b.b.a.J(10, this.ivC);
    if (this.ivD != null)
      j += b.a.a.b.b.a.J(11, this.ivD);
    int k = j + b.a.a.a.br(12, this.ivE) + b.a.a.a.br(13, this.ivF);
    if (this.ivG != null)
      k += b.a.a.b.b.a.J(14, this.ivG);
    if (this.gyx != null)
      k += b.a.a.a.bs(15, this.gyx.hD());
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acb
 * JD-Core Version:    0.6.2
 */