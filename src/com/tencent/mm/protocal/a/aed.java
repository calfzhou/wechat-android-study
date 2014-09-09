package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class aed extends com.tencent.mm.ao.a
{
  public String dtn;
  public qs hOZ;
  public String hQI;
  public int hRo;
  public wv hRr;
  public String hTy;
  public String hTz;
  public aan ifU;
  public String img;
  public String imh;
  public String iwP;
  public String iwQ;
  public int iwR;
  public int iwS;
  public int iwT;
  public String iwU;
  public int iwV;
  public vt iwW;
  public int iwX;
  public String iwY;
  public String iwZ;
  public String ixa;
  public String ixb;

  public static boolean a(b.a.a.a.a parama, aed paramaed, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      LinkedList localLinkedList4 = parama.rN(paramInt);
      int i2 = localLinkedList4.size();
      for (int i3 = 0; i3 < i2; i3++)
      {
        byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i3);
        aan localaan = new aan();
        b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte4, hre);
        for (boolean bool4 = true; bool4; bool4 = aan.a(locala4, localaan, locala4.bet()));
        paramaed.ifU = localaan;
      }
      return true;
    case 2:
      paramaed.dtn = parama.ben();
      return true;
    case 3:
      paramaed.iwP = parama.ben();
      return true;
    case 4:
      paramaed.iwQ = parama.ben();
      return true;
    case 5:
      paramaed.iwR = parama.bel();
      return true;
    case 6:
      paramaed.iwS = parama.bel();
      return true;
    case 7:
      paramaed.iwT = parama.bel();
      return true;
    case 8:
      paramaed.iwU = parama.ben();
      return true;
    case 9:
      paramaed.hTy = parama.ben();
      return true;
    case 10:
      paramaed.hTz = parama.ben();
      return true;
    case 11:
      paramaed.iwV = parama.bel();
      return true;
    case 12:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        vt localvt = new vt();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = vt.a(locala3, localvt, locala3.bet()));
        paramaed.iwW = localvt;
      }
      return true;
    case 13:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        wv localwv = new wv();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = wv.a(locala2, localwv, locala2.bet()));
        paramaed.hRr = localwv;
      }
      return true;
    case 14:
      paramaed.hRo = parama.bel();
      return true;
    case 15:
      paramaed.iwX = parama.bel();
      return true;
    case 16:
      paramaed.hQI = parama.ben();
      return true;
    case 17:
      paramaed.img = parama.ben();
      return true;
    case 18:
      paramaed.imh = parama.ben();
      return true;
    case 19:
      paramaed.iwY = parama.ben();
      return true;
    case 20:
      paramaed.iwZ = parama.ben();
      return true;
    case 21:
      paramaed.ixa = parama.ben();
      return true;
    case 22:
      paramaed.ixb = parama.ben();
      return true;
    case 23:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      qs localqs = new qs();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = qs.a(locala1, localqs, locala1.bet()));
      paramaed.hOZ = localqs;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifU == null)
      throw new b("Not all required fields were included");
    if (this.ifU != null)
    {
      parama.bv(1, this.ifU.hD());
      this.ifU.a(parama);
    }
    if (this.dtn != null)
      parama.I(2, this.dtn);
    if (this.iwP != null)
      parama.I(3, this.iwP);
    if (this.iwQ != null)
      parama.I(4, this.iwQ);
    parama.by(5, this.iwR);
    parama.by(6, this.iwS);
    parama.by(7, this.iwT);
    if (this.iwU != null)
      parama.I(8, this.iwU);
    if (this.hTy != null)
      parama.I(9, this.hTy);
    if (this.hTz != null)
      parama.I(10, this.hTz);
    parama.by(11, this.iwV);
    if (this.iwW != null)
    {
      parama.bv(12, this.iwW.hD());
      this.iwW.a(parama);
    }
    if (this.hRr != null)
    {
      parama.bv(13, this.hRr.hD());
      this.hRr.a(parama);
    }
    parama.by(14, this.hRo);
    parama.by(15, this.iwX);
    if (this.hQI != null)
      parama.I(16, this.hQI);
    if (this.img != null)
      parama.I(17, this.img);
    if (this.imh != null)
      parama.I(18, this.imh);
    if (this.iwY != null)
      parama.I(19, this.iwY);
    if (this.iwZ != null)
      parama.I(20, this.iwZ);
    if (this.ixa != null)
      parama.I(21, this.ixa);
    if (this.ixb != null)
      parama.I(22, this.ixb);
    if (this.hOZ != null)
    {
      parama.bv(23, this.hOZ.hD());
      this.hOZ.a(parama);
    }
  }

  public final aed cC(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    if (this.ifU == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    aan localaan = this.ifU;
    int i = 0;
    if (localaan != null)
      i = 0 + b.a.a.a.bs(1, this.ifU.hD());
    if (this.dtn != null)
      i += b.a.a.b.b.a.J(2, this.dtn);
    if (this.iwP != null)
      i += b.a.a.b.b.a.J(3, this.iwP);
    if (this.iwQ != null)
      i += b.a.a.b.b.a.J(4, this.iwQ);
    int j = i + b.a.a.a.br(5, this.iwR) + b.a.a.a.br(6, this.iwS) + b.a.a.a.br(7, this.iwT);
    if (this.iwU != null)
      j += b.a.a.b.b.a.J(8, this.iwU);
    if (this.hTy != null)
      j += b.a.a.b.b.a.J(9, this.hTy);
    if (this.hTz != null)
      j += b.a.a.b.b.a.J(10, this.hTz);
    int k = j + b.a.a.a.br(11, this.iwV);
    if (this.iwW != null)
      k += b.a.a.a.bs(12, this.iwW.hD());
    if (this.hRr != null)
      k += b.a.a.a.bs(13, this.hRr.hD());
    int m = k + b.a.a.a.br(14, this.hRo) + b.a.a.a.br(15, this.iwX);
    if (this.hQI != null)
      m += b.a.a.b.b.a.J(16, this.hQI);
    if (this.img != null)
      m += b.a.a.b.b.a.J(17, this.img);
    if (this.imh != null)
      m += b.a.a.b.b.a.J(18, this.imh);
    if (this.iwY != null)
      m += b.a.a.b.b.a.J(19, this.iwY);
    if (this.iwZ != null)
      m += b.a.a.b.b.a.J(20, this.iwZ);
    if (this.ixa != null)
      m += b.a.a.b.b.a.J(21, this.ixa);
    if (this.ixb != null)
      m += b.a.a.b.b.a.J(22, this.ixb);
    if (this.hOZ != null)
      m += b.a.a.a.bs(23, this.hOZ.hD());
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aed
 * JD-Core Version:    0.6.2
 */