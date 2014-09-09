package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ll extends vo
{
  public ws hPj;
  public int ibR;
  public LinkedList ibS = new LinkedList();
  public gi ibT;
  public int ibU;
  public LinkedList ibV = new LinkedList();
  public int ibW;
  public LinkedList ibX = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hRz == null) || (this.hPj == null))
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    if (this.hPj != null)
    {
      parama.bv(2, this.hPj.hD());
      this.hPj.a(parama);
    }
    parama.by(3, this.ibR);
    parama.d(4, 8, this.ibS);
    if (this.ibT != null)
    {
      parama.bv(5, this.ibT.hD());
      this.ibT.a(parama);
    }
    parama.by(6, this.ibU);
    parama.d(7, 8, this.ibV);
    parama.by(8, this.ibW);
    parama.d(9, 8, this.ibX);
  }

  public final ll bL(byte[] paramArrayOfByte)
  {
    this.ibS.clear();
    this.ibV.clear();
    this.ibX.clear();
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
      }
      while (true)
      {
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList6 = locala1.rN(i);
        int i8 = localLinkedList6.size();
        for (int i9 = 0; i9 < i8; i9++)
        {
          byte[] arrayOfByte6 = (byte[])localLinkedList6.get(i9);
          bb localbb = new bb();
          b.a.a.a.a locala7 = new b.a.a.a.a(arrayOfByte6, hre);
          for (boolean bool6 = true; bool6; bool6 = bb.a(locala7, localbb, locala7.bet()));
          this.hRz = localbb;
        }
        m = 1;
        continue;
        LinkedList localLinkedList5 = locala1.rN(i);
        int i6 = localLinkedList5.size();
        for (int i7 = 0; i7 < i6; i7++)
        {
          byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i7);
          ws localws = new ws();
          b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte5, hre);
          for (boolean bool5 = true; bool5; bool5 = ws.a(locala6, localws, locala6.bet()));
          this.hPj = localws;
        }
        m = 1;
        continue;
        this.ibR = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          gp localgp = new gp();
          b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = gp.a(locala5, localgp, locala5.bet()));
          this.ibS.add(localgp);
        }
        m = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          gi localgi2 = new gi();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = gi.a(locala4, localgi2, locala4.bet()));
          this.ibT = localgi2;
        }
        m = 1;
        continue;
        this.ibU = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          gi localgi1 = new gi();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = gi.a(locala3, localgi1, locala3.bet()));
          this.ibV.add(localgi1);
        }
        m = 1;
        continue;
        this.ibW = locala1.bel();
        m = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int j = localLinkedList1.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(k);
          gl localgl = new gl();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = gl.a(locala2, localgl, locala2.bet()));
          this.ibX.add(localgl);
        }
        m = 1;
      }
    }
    if ((this.hRz == null) || (this.hPj == null))
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    if (this.hPj != null)
      i += b.a.a.a.bs(2, this.hPj.hD());
    int j = i + b.a.a.a.br(3, this.ibR) + b.a.a.a.c(4, 8, this.ibS);
    if (this.ibT != null)
      j += b.a.a.a.bs(5, this.ibT.hD());
    return j + b.a.a.a.br(6, this.ibU) + b.a.a.a.c(7, 8, this.ibV) + b.a.a.a.br(8, this.ibW) + b.a.a.a.c(9, 8, this.ibX);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ll
 * JD-Core Version:    0.6.2
 */