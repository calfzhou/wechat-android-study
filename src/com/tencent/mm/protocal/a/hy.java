package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class hy extends com.tencent.mm.ao.a
{
  private String desc;
  public boolean hXu = false;
  public boolean hXv = false;
  private hv hYF;
  public boolean hYG = false;
  private jb hYH;
  public boolean hYI = false;
  private hx hYJ;
  public boolean hYK = false;
  private io hYL;
  public boolean hYM = false;
  private String hYN;
  public boolean hYO = false;
  private long hYP;
  public boolean hYQ = false;
  private int hYR = -1;
  public boolean hYS = false;
  private long hYT;
  public boolean hYU = false;
  private il hZv;
  public boolean hZw = false;
  public LinkedList hZx = new LinkedList();
  public boolean hZy = false;
  private String title;

  public static boolean a(b.a.a.a.a parama, hy paramhy, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      LinkedList localLinkedList6 = parama.rN(paramInt);
      int i6 = localLinkedList6.size();
      for (int i7 = 0; i7 < i6; i7++)
      {
        byte[] arrayOfByte6 = (byte[])localLinkedList6.get(i7);
        il localil = new il();
        b.a.a.a.a locala6 = new b.a.a.a.a(arrayOfByte6, hre);
        for (boolean bool6 = true; bool6; bool6 = il.a(locala6, localil, locala6.bet()));
        paramhy.hZv = localil;
      }
      paramhy.hZw = true;
      return true;
    case 2:
      LinkedList localLinkedList5 = parama.rN(paramInt);
      int i4 = localLinkedList5.size();
      for (int i5 = 0; i5 < i4; i5++)
      {
        byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i5);
        hq localhq = new hq();
        b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte5, hre);
        for (boolean bool5 = true; bool5; bool5 = hq.a(locala5, localhq, locala5.bet()));
        paramhy.hZx.add(localhq);
      }
      paramhy.hZy = true;
      return true;
    case 3:
      LinkedList localLinkedList4 = parama.rN(paramInt);
      int i2 = localLinkedList4.size();
      for (int i3 = 0; i3 < i2; i3++)
      {
        byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i3);
        hv localhv = new hv();
        b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte4, hre);
        for (boolean bool4 = true; bool4; bool4 = hv.a(locala4, localhv, locala4.bet()));
        paramhy.hYF = localhv;
      }
      paramhy.hYG = true;
      return true;
    case 4:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        jb localjb = new jb();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = jb.a(locala3, localjb, locala3.bet()));
        paramhy.hYH = localjb;
      }
      paramhy.hYI = true;
      return true;
    case 5:
      paramhy.hYN = parama.ben();
      paramhy.hYO = true;
      return true;
    case 6:
      paramhy.title = parama.ben();
      paramhy.hXu = true;
      return true;
    case 7:
      paramhy.desc = parama.ben();
      paramhy.hXv = true;
      return true;
    case 8:
      paramhy.hYP = parama.ber();
      paramhy.hYQ = true;
      return true;
    case 9:
      paramhy.hYR = parama.bel();
      paramhy.hYS = true;
      return true;
    case 10:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        hx localhx = new hx();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = hx.a(locala2, localhx, locala2.bet()));
        paramhy.hYJ = localhx;
      }
      paramhy.hYK = true;
      return true;
    case 11:
      paramhy.hYT = parama.ber();
      paramhy.hYU = true;
      return true;
    case 12:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      io localio = new io();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = io.a(locala1, localio, locala1.bet()));
      paramhy.hYL = localio;
    }
    paramhy.hYM = true;
    return true;
  }

  public final hy U(LinkedList paramLinkedList)
  {
    this.hZx = paramLinkedList;
    this.hZy = true;
    return this;
  }

  public final hy a(il paramil)
  {
    this.hZv = paramil;
    this.hZw = true;
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hZv != null)
    {
      parama.bv(1, this.hZv.hD());
      this.hZv.a(parama);
    }
    parama.d(2, 8, this.hZx);
    if (this.hYF != null)
    {
      parama.bv(3, this.hYF.hD());
      this.hYF.a(parama);
    }
    if (this.hYH != null)
    {
      parama.bv(4, this.hYH.hD());
      this.hYH.a(parama);
    }
    if (this.hYN != null)
      parama.I(5, this.hYN);
    if (this.title != null)
      parama.I(6, this.title);
    if (this.desc != null)
      parama.I(7, this.desc);
    if (this.hYQ == true)
      parama.k(8, this.hYP);
    if (this.hYS == true)
      parama.by(9, this.hYR);
    if (this.hYJ != null)
    {
      parama.bv(10, this.hYJ.hD());
      this.hYJ.a(parama);
    }
    if (this.hYU == true)
      parama.k(11, this.hYT);
    if (this.hYL != null)
    {
      parama.bv(12, this.hYL.hD());
      this.hYL.a(parama);
    }
  }

  public final il aLG()
  {
    return this.hZv;
  }

  public final hv aLl()
  {
    return this.hYF;
  }

  public final jb aLm()
  {
    return this.hYH;
  }

  public final hx aLn()
  {
    return this.hYJ;
  }

  public final io aLo()
  {
    return this.hYL;
  }

  public final String aLp()
  {
    return this.hYN;
  }

  public final long aLq()
  {
    return this.hYP;
  }

  public final int aLr()
  {
    return this.hYR;
  }

  public final long aLs()
  {
    return this.hYT;
  }

  public final hy b(hv paramhv)
  {
    this.hYF = paramhv;
    this.hYG = true;
    return this;
  }

  public final hy b(hx paramhx)
  {
    this.hYJ = paramhx;
    this.hYK = true;
    return this;
  }

  public final hy b(io paramio)
  {
    this.hYL = paramio;
    this.hYM = true;
    return this;
  }

  public final hy b(jb paramjb)
  {
    this.hYH = paramjb;
    this.hYI = true;
    return this;
  }

  public final hy bF(byte[] paramArrayOfByte)
  {
    this.hZx.clear();
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final hy cJ(long paramLong)
  {
    this.hYP = paramLong;
    this.hYQ = true;
    return this;
  }

  public final hy cK(long paramLong)
  {
    this.hYT = paramLong;
    this.hYU = true;
    return this;
  }

  public final String getDesc()
  {
    return this.desc;
  }

  public final String getTitle()
  {
    return this.title;
  }

  public final int hD()
  {
    il localil = this.hZv;
    int i = 0;
    if (localil != null)
      i = 0 + b.a.a.a.bs(1, this.hZv.hD());
    int j = i + b.a.a.a.c(2, 8, this.hZx);
    if (this.hYF != null)
      j += b.a.a.a.bs(3, this.hYF.hD());
    if (this.hYH != null)
      j += b.a.a.a.bs(4, this.hYH.hD());
    if (this.hYN != null)
      j += b.a.a.b.b.a.J(5, this.hYN);
    if (this.title != null)
      j += b.a.a.b.b.a.J(6, this.title);
    if (this.desc != null)
      j += b.a.a.b.b.a.J(7, this.desc);
    if (this.hYQ == true)
      j += b.a.a.a.i(8, this.hYP);
    if (this.hYS == true)
      j += b.a.a.a.br(9, this.hYR);
    if (this.hYJ != null)
      j += b.a.a.a.bs(10, this.hYJ.hD());
    if (this.hYU == true)
      j += b.a.a.a.i(11, this.hYT);
    if (this.hYL != null)
      j += b.a.a.a.bs(12, this.hYL.hD());
    return j;
  }

  public final hy nF(int paramInt)
  {
    this.hYR = paramInt;
    this.hYS = true;
    return this;
  }

  public final hy xI(String paramString)
  {
    this.hYN = paramString;
    this.hYO = true;
    return this;
  }

  public final hy xJ(String paramString)
  {
    this.title = paramString;
    this.hXu = true;
    return this;
  }

  public final hy xK(String paramString)
  {
    this.desc = paramString;
    this.hXv = true;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hy
 * JD-Core Version:    0.6.2
 */