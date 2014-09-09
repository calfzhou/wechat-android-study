package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class zq extends com.tencent.mm.ao.a
{
  public int hOV;
  public LinkedList hPe = new LinkedList();
  public String hRk;
  public String igN;
  public int ioe;
  public int isC;
  public long isD;
  public ws isU;
  public int isV;
  public int isW;
  public int isX;
  public LinkedList isY = new LinkedList();
  public int isZ;
  public int ita;
  public LinkedList itb = new LinkedList();
  public int itc;
  public int itd;
  public LinkedList ite = new LinkedList();
  public int itf;
  public int itg;
  public String ith;
  public long iti;
  public int itj;
  public LinkedList itk = new LinkedList();

  public static boolean a(b.a.a.a.a parama, zq paramzq, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramzq.isD = parama.ber();
      return true;
    case 2:
      paramzq.hRk = parama.ben();
      return true;
    case 3:
      paramzq.igN = parama.ben();
      return true;
    case 4:
      paramzq.hOV = parama.bel();
      return true;
    case 5:
      LinkedList localLinkedList6 = parama.rN(paramInt);
      int i6 = localLinkedList6.size();
      for (int i7 = 0; i7 < i6; i7++)
      {
        byte[] arrayOfByte6 = (byte[])localLinkedList6.get(i7);
        ws localws = new ws();
        b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte6, hre);
        for (boolean bool6 = true; bool6; bool6 = ws.a(locala6, localws, locala6.bet()));
        paramzq.isU = localws;
      }
      return true;
    case 6:
      paramzq.isV = parama.bel();
      return true;
    case 7:
      paramzq.isW = parama.bel();
      return true;
    case 8:
      paramzq.isX = parama.bel();
      return true;
    case 9:
      LinkedList localLinkedList5 = parama.rN(paramInt);
      int i4 = localLinkedList5.size();
      for (int i5 = 0; i5 < i4; i5++)
      {
        byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i5);
        zk localzk3 = new zk();
        b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte5, hre);
        for (boolean bool5 = true; bool5; bool5 = zk.a(locala5, localzk3, locala5.bet()));
        paramzq.isY.add(localzk3);
      }
      return true;
    case 10:
      paramzq.isZ = parama.bel();
      return true;
    case 11:
      paramzq.ita = parama.bel();
      return true;
    case 12:
      LinkedList localLinkedList4 = parama.rN(paramInt);
      int i2 = localLinkedList4.size();
      for (int i3 = 0; i3 < i2; i3++)
      {
        byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i3);
        zk localzk2 = new zk();
        b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte4, hre);
        for (boolean bool4 = true; bool4; bool4 = zk.a(locala4, localzk2, locala4.bet()));
        paramzq.itb.add(localzk2);
      }
      return true;
    case 13:
      paramzq.itc = parama.bel();
      return true;
    case 14:
      paramzq.itd = parama.bel();
      return true;
    case 15:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        zk localzk1 = new zk();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = zk.a(locala3, localzk1, locala3.bet()));
        paramzq.ite.add(localzk1);
      }
      return true;
    case 16:
      paramzq.itf = parama.bel();
      return true;
    case 17:
      paramzq.itg = parama.bel();
      return true;
    case 18:
      paramzq.ioe = parama.bel();
      return true;
    case 19:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        zp localzp = new zp();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = zp.a(locala2, localzp, locala2.bet()));
        paramzq.hPe.add(localzp);
      }
      return true;
    case 20:
      paramzq.isC = parama.bel();
      return true;
    case 21:
      paramzq.ith = parama.ben();
      return true;
    case 22:
      paramzq.iti = parama.ber();
      return true;
    case 23:
      paramzq.itj = parama.bel();
      return true;
    case 24:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      vt localvt = new vt();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = vt.a(locala1, localvt, locala1.bet()));
      paramzq.itk.add(localvt);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.isU == null)
      throw new b("Not all required fields were included");
    parama.k(1, this.isD);
    if (this.hRk != null)
      parama.I(2, this.hRk);
    if (this.igN != null)
      parama.I(3, this.igN);
    parama.by(4, this.hOV);
    if (this.isU != null)
    {
      parama.bv(5, this.isU.hD());
      this.isU.a(parama);
    }
    parama.by(6, this.isV);
    parama.by(7, this.isW);
    parama.by(8, this.isX);
    parama.d(9, 8, this.isY);
    parama.by(10, this.isZ);
    parama.by(11, this.ita);
    parama.d(12, 8, this.itb);
    parama.by(13, this.itc);
    parama.by(14, this.itd);
    parama.d(15, 8, this.ite);
    parama.by(16, this.itf);
    parama.by(17, this.itg);
    parama.by(18, this.ioe);
    parama.d(19, 8, this.hPe);
    parama.by(20, this.isC);
    if (this.ith != null)
      parama.I(21, this.ith);
    parama.k(22, this.iti);
    parama.by(23, this.itj);
    parama.d(24, 8, this.itk);
  }

  public final zq cs(byte[] paramArrayOfByte)
  {
    this.isY.clear();
    this.itb.clear();
    this.ite.clear();
    this.hPe.clear();
    this.itk.clear();
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    if (this.isU == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.isD);
    if (this.hRk != null)
      i += b.a.a.b.b.a.J(2, this.hRk);
    if (this.igN != null)
      i += b.a.a.b.b.a.J(3, this.igN);
    int j = i + b.a.a.a.br(4, this.hOV);
    if (this.isU != null)
      j += b.a.a.a.bs(5, this.isU.hD());
    int k = j + b.a.a.a.br(6, this.isV) + b.a.a.a.br(7, this.isW) + b.a.a.a.br(8, this.isX) + b.a.a.a.c(9, 8, this.isY) + b.a.a.a.br(10, this.isZ) + b.a.a.a.br(11, this.ita) + b.a.a.a.c(12, 8, this.itb) + b.a.a.a.br(13, this.itc) + b.a.a.a.br(14, this.itd) + b.a.a.a.c(15, 8, this.ite) + b.a.a.a.br(16, this.itf) + b.a.a.a.br(17, this.itg) + b.a.a.a.br(18, this.ioe) + b.a.a.a.c(19, 8, this.hPe) + b.a.a.a.br(20, this.isC);
    if (this.ith != null)
      k += b.a.a.b.b.a.J(21, this.ith);
    return k + b.a.a.a.i(22, this.iti) + b.a.a.a.br(23, this.itj) + b.a.a.a.c(24, 8, this.itk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zq
 * JD-Core Version:    0.6.2
 */