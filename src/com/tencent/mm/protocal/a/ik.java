package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ik extends vo
{
  public int hEB;
  public String hER;
  public String hES;
  public String hET;
  public int hEU;
  public LinkedList hEV = new LinkedList();
  public int hEW;
  public LinkedList hEX = new LinkedList();
  public int hEY;
  public LinkedList hEZ = new LinkedList();
  public int hEw;
  public int hEx;
  public int hFa;
  public LinkedList hFb = new LinkedList();
  public int hFc;
  public LinkedList hFd = new LinkedList();
  public String hFe;
  public String hFf;
  public String hFg;
  public String hsB;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    parama.by(2, this.hEx);
    if (this.hET != null)
      parama.I(3, this.hET);
    parama.by(4, this.hEw);
    if (this.hsB != null)
      parama.I(5, this.hsB);
    parama.by(6, this.hEU);
    parama.d(7, 8, this.hEV);
    parama.by(8, this.hEW);
    parama.d(9, 8, this.hEX);
    parama.by(10, this.hEY);
    parama.d(11, 8, this.hEZ);
    parama.by(12, this.hFa);
    parama.d(13, 8, this.hFb);
    if (this.hER != null)
      parama.I(14, this.hER);
    if (this.hES != null)
      parama.I(15, this.hES);
    parama.by(16, this.hEB);
    parama.by(17, this.hFc);
    parama.d(18, 8, this.hFd);
    if (this.hFe != null)
      parama.I(19, this.hFe);
    if (this.hFf != null)
      parama.I(20, this.hFf);
    if (this.hFg != null)
      parama.I(21, this.hFg);
  }

  public final ik by(byte[] paramArrayOfByte)
  {
    this.hEV.clear();
    this.hEX.clear();
    this.hEZ.clear();
    this.hFb.clear();
    this.hFd.clear();
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
      }
      while (true)
      {
        if (j == 0)
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
        j = 1;
        continue;
        this.hEx = locala1.bel();
        j = 1;
        continue;
        this.hET = locala1.ben();
        j = 1;
        continue;
        this.hEw = locala1.bel();
        j = 1;
        continue;
        this.hsB = locala1.ben();
        j = 1;
        continue;
        this.hEU = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList5 = locala1.rN(i);
        int i6 = localLinkedList5.size();
        for (int i7 = 0; i7 < i6; i7++)
        {
          byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i7);
          adn localadn = new adn();
          b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte5, hre);
          for (boolean bool5 = true; bool5; bool5 = adn.a(locala6, localadn, locala6.bet()));
          this.hEV.add(localadn);
        }
        j = 1;
        continue;
        this.hEW = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          adp localadp = new adp();
          b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = adp.a(locala5, localadp, locala5.bet()));
          this.hEX.add(localadp);
        }
        j = 1;
        continue;
        this.hEY = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          iv localiv = new iv();
          b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = iv.a(locala4, localiv, locala4.bet()));
          this.hEZ.add(localiv);
        }
        j = 1;
        continue;
        this.hFa = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          hz localhz = new hz();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = hz.a(locala3, localhz, locala3.bet()));
          this.hFb.add(localhz);
        }
        j = 1;
        continue;
        this.hER = locala1.ben();
        j = 1;
        continue;
        this.hES = locala1.ben();
        j = 1;
        continue;
        this.hEB = locala1.bel();
        j = 1;
        continue;
        this.hFc = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          vt localvt = new vt();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = vt.a(locala2, localvt, locala2.bet()));
          this.hFd.add(localvt);
        }
        j = 1;
        continue;
        this.hFe = locala1.ben();
        j = 1;
        continue;
        this.hFf = locala1.ben();
        j = 1;
        continue;
        this.hFg = locala1.ben();
        j = 1;
      }
    }
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    int j = i + b.a.a.a.br(2, this.hEx);
    if (this.hET != null)
      j += b.a.a.b.b.a.J(3, this.hET);
    int k = j + b.a.a.a.br(4, this.hEw);
    if (this.hsB != null)
      k += b.a.a.b.b.a.J(5, this.hsB);
    int m = k + b.a.a.a.br(6, this.hEU) + b.a.a.a.c(7, 8, this.hEV) + b.a.a.a.br(8, this.hEW) + b.a.a.a.c(9, 8, this.hEX) + b.a.a.a.br(10, this.hEY) + b.a.a.a.c(11, 8, this.hEZ) + b.a.a.a.br(12, this.hFa) + b.a.a.a.c(13, 8, this.hFb);
    if (this.hER != null)
      m += b.a.a.b.b.a.J(14, this.hER);
    if (this.hES != null)
      m += b.a.a.b.b.a.J(15, this.hES);
    int n = m + b.a.a.a.br(16, this.hEB) + b.a.a.a.br(17, this.hFc) + b.a.a.a.c(18, 8, this.hFd);
    if (this.hFe != null)
      n += b.a.a.b.b.a.J(19, this.hFe);
    if (this.hFf != null)
      n += b.a.a.b.b.a.J(20, this.hFf);
    if (this.hFg != null)
      n += b.a.a.b.b.a.J(21, this.hFg);
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ik
 * JD-Core Version:    0.6.2
 */