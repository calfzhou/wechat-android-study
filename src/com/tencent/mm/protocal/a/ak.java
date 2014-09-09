package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ak extends com.tencent.mm.ao.a
{
  public int ewb;
  public int hOO;
  public vt hOP;
  public vt hOQ;
  public vt hOS;
  public String hOW;
  public long hOY;
  public int hPU;
  public int hPV;
  public int hPW;
  public LinkedList hPX = new LinkedList();
  public LinkedList hPY = new LinkedList();
  public ws hPZ;
  public String hPt;
  public int hQa;
  public int hQb;

  public static boolean a(b.a.a.a.a parama, ak paramak, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramak.ewb = parama.bel();
      return true;
    case 2:
      paramak.hPt = parama.ben();
      return true;
    case 3:
      LinkedList localLinkedList6 = parama.rN(paramInt);
      int i6 = localLinkedList6.size();
      for (int i7 = 0; i7 < i6; i7++)
      {
        byte[] arrayOfByte6 = (byte[])localLinkedList6.get(i7);
        vt localvt4 = new vt();
        b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte6, hre);
        for (boolean bool6 = true; bool6; bool6 = vt.a(locala6, localvt4, locala6.bet()));
        paramak.hOP = localvt4;
      }
      return true;
    case 4:
      LinkedList localLinkedList5 = parama.rN(paramInt);
      int i4 = localLinkedList5.size();
      for (int i5 = 0; i5 < i4; i5++)
      {
        byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i5);
        vt localvt3 = new vt();
        b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte5, hre);
        for (boolean bool5 = true; bool5; bool5 = vt.a(locala5, localvt3, locala5.bet()));
        paramak.hOQ = localvt3;
      }
      return true;
    case 5:
      LinkedList localLinkedList4 = parama.rN(paramInt);
      int i2 = localLinkedList4.size();
      for (int i3 = 0; i3 < i2; i3++)
      {
        byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i3);
        vt localvt2 = new vt();
        b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte4, hre);
        for (boolean bool4 = true; bool4; bool4 = vt.a(locala4, localvt2, locala4.bet()));
        paramak.hOS = localvt2;
      }
      return true;
    case 6:
      paramak.hPU = parama.bel();
      return true;
    case 7:
      paramak.hPV = parama.bel();
      return true;
    case 8:
      paramak.hOW = parama.ben();
      return true;
    case 9:
      paramak.hOO = parama.bel();
      return true;
    case 10:
      paramak.hPW = parama.bel();
      return true;
    case 11:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        vt localvt1 = new vt();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = vt.a(locala3, localvt1, locala3.bet()));
        paramak.hPX.add(localvt1);
      }
      return true;
    case 12:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        wt localwt = new wt();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = wt.a(locala2, localwt, locala2.bet()));
        paramak.hPY.add(localwt);
      }
      return true;
    case 13:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        ws localws = new ws();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = ws.a(locala1, localws, locala1.bet()));
        paramak.hPZ = localws;
      }
      return true;
    case 14:
      paramak.hQa = parama.bel();
      return true;
    case 15:
      paramak.hQb = parama.bel();
      return true;
    case 16:
    }
    paramak.hOY = parama.ber();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hOP == null) || (this.hOQ == null) || (this.hOS == null))
      throw new b("Not all required fields were included");
    parama.by(1, this.ewb);
    if (this.hPt != null)
      parama.I(2, this.hPt);
    if (this.hOP != null)
    {
      parama.bv(3, this.hOP.hD());
      this.hOP.a(parama);
    }
    if (this.hOQ != null)
    {
      parama.bv(4, this.hOQ.hD());
      this.hOQ.a(parama);
    }
    if (this.hOS != null)
    {
      parama.bv(5, this.hOS.hD());
      this.hOS.a(parama);
    }
    parama.by(6, this.hPU);
    parama.by(7, this.hPV);
    if (this.hOW != null)
      parama.I(8, this.hOW);
    parama.by(9, this.hOO);
    parama.by(10, this.hPW);
    parama.d(11, 8, this.hPX);
    parama.d(12, 8, this.hPY);
    if (this.hPZ != null)
    {
      parama.bv(13, this.hPZ.hD());
      this.hPZ.a(parama);
    }
    parama.by(14, this.hQa);
    parama.by(15, this.hQb);
    parama.k(16, this.hOY);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ewb);
    if (this.hPt != null)
      i += b.a.a.b.b.a.J(2, this.hPt);
    if (this.hOP != null)
      i += b.a.a.a.bs(3, this.hOP.hD());
    if (this.hOQ != null)
      i += b.a.a.a.bs(4, this.hOQ.hD());
    if (this.hOS != null)
      i += b.a.a.a.bs(5, this.hOS.hD());
    int j = i + b.a.a.a.br(6, this.hPU) + b.a.a.a.br(7, this.hPV);
    if (this.hOW != null)
      j += b.a.a.b.b.a.J(8, this.hOW);
    int k = j + b.a.a.a.br(9, this.hOO) + b.a.a.a.br(10, this.hPW) + b.a.a.a.c(11, 8, this.hPX) + b.a.a.a.c(12, 8, this.hPY);
    if (this.hPZ != null)
      k += b.a.a.a.bs(13, this.hPZ.hD());
    return k + b.a.a.a.br(14, this.hQa) + b.a.a.a.br(15, this.hQb) + b.a.a.a.i(16, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ak
 * JD-Core Version:    0.6.2
 */