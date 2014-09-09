package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class q extends com.tencent.mm.ao.a
{
  public int dZy;
  public int hOO;
  public vt hOP;
  public vt hOQ;
  public int hOR;
  public vt hOS;
  public int hOT;
  public ws hOU;
  public int hOV;
  public String hOW;
  public String hOX;
  public long hOY;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hOP == null) || (this.hOQ == null) || (this.hOS == null) || (this.hOU == null))
      throw new b("Not all required fields were included");
    parama.by(1, this.hOO);
    if (this.hOP != null)
    {
      parama.bv(2, this.hOP.hD());
      this.hOP.a(parama);
    }
    if (this.hOQ != null)
    {
      parama.bv(3, this.hOQ.hD());
      this.hOQ.a(parama);
    }
    parama.by(4, this.hOR);
    if (this.hOS != null)
    {
      parama.bv(5, this.hOS.hD());
      this.hOS.a(parama);
    }
    parama.by(6, this.dZy);
    parama.by(7, this.hOT);
    if (this.hOU != null)
    {
      parama.bv(8, this.hOU.hD());
      this.hOU.a(parama);
    }
    parama.by(9, this.hOV);
    if (this.hOW != null)
      parama.I(10, this.hOW);
    if (this.hOX != null)
      parama.I(11, this.hOX);
    parama.k(12, this.hOY);
  }

  public final q aX(byte[] paramArrayOfByte)
  {
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
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        this.hOO = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          vt localvt3 = new vt();
          b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = vt.a(locala5, localvt3, locala5.bet()));
          this.hOP = localvt3;
        }
        j = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          vt localvt2 = new vt();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = vt.a(locala4, localvt2, locala4.bet()));
          this.hOQ = localvt2;
        }
        j = 1;
        continue;
        this.hOR = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          vt localvt1 = new vt();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = vt.a(locala3, localvt1, locala3.bet()));
          this.hOS = localvt1;
        }
        j = 1;
        continue;
        this.dZy = locala1.bel();
        j = 1;
        continue;
        this.hOT = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          ws localws = new ws();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ws.a(locala2, localws, locala2.bet()));
          this.hOU = localws;
        }
        j = 1;
        continue;
        this.hOV = locala1.bel();
        j = 1;
        continue;
        this.hOW = locala1.ben();
        j = 1;
        continue;
        this.hOX = locala1.ben();
        j = 1;
        continue;
        this.hOY = locala1.ber();
        j = 1;
      }
    }
    if ((this.hOP == null) || (this.hOQ == null) || (this.hOS == null) || (this.hOU == null))
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hOO);
    if (this.hOP != null)
      i += b.a.a.a.bs(2, this.hOP.hD());
    if (this.hOQ != null)
      i += b.a.a.a.bs(3, this.hOQ.hD());
    int j = i + b.a.a.a.br(4, this.hOR);
    if (this.hOS != null)
      j += b.a.a.a.bs(5, this.hOS.hD());
    int k = j + b.a.a.a.br(6, this.dZy) + b.a.a.a.br(7, this.hOT);
    if (this.hOU != null)
      k += b.a.a.a.bs(8, this.hOU.hD());
    int m = k + b.a.a.a.br(9, this.hOV);
    if (this.hOW != null)
      m += b.a.a.b.b.a.J(10, this.hOW);
    if (this.hOX != null)
      m += b.a.a.b.b.a.J(11, this.hOX);
    return m + b.a.a.a.i(12, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.q
 * JD-Core Version:    0.6.2
 */