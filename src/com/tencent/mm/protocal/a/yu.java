package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class yu extends vo
{
  public int hQj;
  public ws ids;
  public float ina;
  public int isb;
  public ws isc;
  public ws isd;
  public ws ise;
  public ws isf;
  public ws isg;
  public ws ish;
  public ws isi;
  public int isj;
  public int isk;
  public String isl;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hRz == null) || (this.isc == null) || (this.isd == null) || (this.ise == null) || (this.isf == null) || (this.isg == null) || (this.ish == null) || (this.isi == null) || (this.ids == null))
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    parama.by(2, this.hQj);
    parama.by(3, this.isb);
    parama.c(4, this.ina);
    if (this.isc != null)
    {
      parama.bv(5, this.isc.hD());
      this.isc.a(parama);
    }
    if (this.isd != null)
    {
      parama.bv(6, this.isd.hD());
      this.isd.a(parama);
    }
    if (this.ise != null)
    {
      parama.bv(7, this.ise.hD());
      this.ise.a(parama);
    }
    if (this.isf != null)
    {
      parama.bv(8, this.isf.hD());
      this.isf.a(parama);
    }
    if (this.isg != null)
    {
      parama.bv(9, this.isg.hD());
      this.isg.a(parama);
    }
    if (this.ish != null)
    {
      parama.bv(10, this.ish.hD());
      this.ish.a(parama);
    }
    if (this.isi != null)
    {
      parama.bv(11, this.isi.hD());
      this.isi.a(parama);
    }
    if (this.ids != null)
    {
      parama.bv(12, this.ids.hD());
      this.ids.a(parama);
    }
    parama.by(13, this.isj);
    parama.by(14, this.isk);
    if (this.isl != null)
      parama.I(15, this.isl);
  }

  public final yu cp(byte[] paramArrayOfByte)
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
      case 13:
      case 14:
      case 15:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList9 = locala1.rN(i);
        int i14 = localLinkedList9.size();
        for (int i15 = 0; i15 < i14; i15++)
        {
          byte[] arrayOfByte9 = (byte[])localLinkedList9.get(i15);
          bb localbb = new bb();
          b.a.a.a.a locala10 = new b.a.a.a.a(arrayOfByte9, hre);
          for (boolean bool9 = true; bool9; bool9 = bb.a(locala10, localbb, locala10.bet()));
          this.hRz = localbb;
        }
        j = 1;
        continue;
        this.hQj = locala1.bel();
        j = 1;
        continue;
        this.isb = locala1.bel();
        j = 1;
        continue;
        this.ina = locala1.beq();
        j = 1;
        continue;
        LinkedList localLinkedList8 = locala1.rN(i);
        int i12 = localLinkedList8.size();
        for (int i13 = 0; i13 < i12; i13++)
        {
          byte[] arrayOfByte8 = (byte[])localLinkedList8.get(i13);
          ws localws8 = new ws();
          b.a.a.a.a locala9 = new b.a.a.a.a(arrayOfByte8, hre);
          for (boolean bool8 = true; bool8; bool8 = ws.a(locala9, localws8, locala9.bet()));
          this.isc = localws8;
        }
        j = 1;
        continue;
        LinkedList localLinkedList7 = locala1.rN(i);
        int i10 = localLinkedList7.size();
        for (int i11 = 0; i11 < i10; i11++)
        {
          byte[] arrayOfByte7 = (byte[])localLinkedList7.get(i11);
          ws localws7 = new ws();
          b.a.a.a.a locala8 = new b.a.a.a.a(arrayOfByte7, hre);
          for (boolean bool7 = true; bool7; bool7 = ws.a(locala8, localws7, locala8.bet()));
          this.isd = localws7;
        }
        j = 1;
        continue;
        LinkedList localLinkedList6 = locala1.rN(i);
        int i8 = localLinkedList6.size();
        for (int i9 = 0; i9 < i8; i9++)
        {
          byte[] arrayOfByte6 = (byte[])localLinkedList6.get(i9);
          ws localws6 = new ws();
          b.a.a.a.a locala7 = new b.a.a.a.a(arrayOfByte6, hre);
          for (boolean bool6 = true; bool6; bool6 = ws.a(locala7, localws6, locala7.bet()));
          this.ise = localws6;
        }
        j = 1;
        continue;
        LinkedList localLinkedList5 = locala1.rN(i);
        int i6 = localLinkedList5.size();
        for (int i7 = 0; i7 < i6; i7++)
        {
          byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i7);
          ws localws5 = new ws();
          b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte5, hre);
          for (boolean bool5 = true; bool5; bool5 = ws.a(locala6, localws5, locala6.bet()));
          this.isf = localws5;
        }
        j = 1;
        continue;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          ws localws4 = new ws();
          b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = ws.a(locala5, localws4, locala5.bet()));
          this.isg = localws4;
        }
        j = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          ws localws3 = new ws();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = ws.a(locala4, localws3, locala4.bet()));
          this.ish = localws3;
        }
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          ws localws2 = new ws();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = ws.a(locala3, localws2, locala3.bet()));
          this.isi = localws2;
        }
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
          this.ids = localws1;
        }
        j = 1;
        continue;
        this.isj = locala1.bel();
        j = 1;
        continue;
        this.isk = locala1.bel();
        j = 1;
        continue;
        this.isl = locala1.ben();
        j = 1;
      }
    }
    if ((this.hRz == null) || (this.isc == null) || (this.isd == null) || (this.ise == null) || (this.isf == null) || (this.isg == null) || (this.ish == null) || (this.isi == null) || (this.ids == null))
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    int j = i + b.a.a.a.br(2, this.hQj) + b.a.a.a.br(3, this.isb);
    int k = j + (4 + b.a.a.b.b.a.rV(4));
    if (this.isc != null)
      k += b.a.a.a.bs(5, this.isc.hD());
    if (this.isd != null)
      k += b.a.a.a.bs(6, this.isd.hD());
    if (this.ise != null)
      k += b.a.a.a.bs(7, this.ise.hD());
    if (this.isf != null)
      k += b.a.a.a.bs(8, this.isf.hD());
    if (this.isg != null)
      k += b.a.a.a.bs(9, this.isg.hD());
    if (this.ish != null)
      k += b.a.a.a.bs(10, this.ish.hD());
    if (this.isi != null)
      k += b.a.a.a.bs(11, this.isi.hD());
    if (this.ids != null)
      k += b.a.a.a.bs(12, this.ids.hD());
    int m = k + b.a.a.a.br(13, this.isj) + b.a.a.a.br(14, this.isk);
    if (this.isl != null)
      m += b.a.a.b.b.a.J(15, this.isl);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.yu
 * JD-Core Version:    0.6.2
 */