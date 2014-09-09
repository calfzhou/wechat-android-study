package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class hr extends com.tencent.mm.ao.a
{
  private String desc;
  public boolean hXu = false;
  public boolean hXv = false;
  private hs hYD;
  public boolean hYE = false;
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
  private String title;

  public static boolean a(b.a.a.a.a parama, hr paramhr, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      LinkedList localLinkedList5 = parama.rN(paramInt);
      int i4 = localLinkedList5.size();
      for (int i5 = 0; i5 < i4; i5++)
      {
        byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i5);
        hs localhs = new hs();
        b.a.a.a.a locala5 = new b.a.a.a.a(arrayOfByte5, hre);
        for (boolean bool5 = true; bool5; bool5 = hs.a(locala5, localhs, locala5.bet()));
        paramhr.hYD = localhs;
      }
      paramhr.hYE = true;
      return true;
    case 2:
      LinkedList localLinkedList4 = parama.rN(paramInt);
      int i2 = localLinkedList4.size();
      for (int i3 = 0; i3 < i2; i3++)
      {
        byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i3);
        hv localhv = new hv();
        b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte4, hre);
        for (boolean bool4 = true; bool4; bool4 = hv.a(locala4, localhv, locala4.bet()));
        paramhr.hYF = localhv;
      }
      paramhr.hYG = true;
      return true;
    case 3:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        jb localjb = new jb();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = jb.a(locala3, localjb, locala3.bet()));
        paramhr.hYH = localjb;
      }
      paramhr.hYI = true;
      return true;
    case 4:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        hx localhx = new hx();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = hx.a(locala2, localhx, locala2.bet()));
        paramhr.hYJ = localhx;
      }
      paramhr.hYK = true;
      return true;
    case 5:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        io localio = new io();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = io.a(locala1, localio, locala1.bet()));
        paramhr.hYL = localio;
      }
      paramhr.hYM = true;
      return true;
    case 6:
      paramhr.hYN = parama.ben();
      paramhr.hYO = true;
      return true;
    case 7:
      paramhr.title = parama.ben();
      paramhr.hXu = true;
      return true;
    case 8:
      paramhr.desc = parama.ben();
      paramhr.hXv = true;
      return true;
    case 9:
      paramhr.hYP = parama.ber();
      paramhr.hYQ = true;
      return true;
    case 10:
      paramhr.hYR = parama.bel();
      paramhr.hYS = true;
      return true;
    case 11:
    }
    paramhr.hYT = parama.ber();
    paramhr.hYU = true;
    return true;
  }

  public final hr a(hv paramhv)
  {
    this.hYF = paramhv;
    this.hYG = true;
    return this;
  }

  public final hr a(hx paramhx)
  {
    this.hYJ = paramhx;
    this.hYK = true;
    return this;
  }

  public final hr a(io paramio)
  {
    this.hYL = paramio;
    this.hYM = true;
    return this;
  }

  public final hr a(jb paramjb)
  {
    this.hYH = paramjb;
    this.hYI = true;
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hYD != null)
    {
      parama.bv(1, this.hYD.hD());
      this.hYD.a(parama);
    }
    if (this.hYF != null)
    {
      parama.bv(2, this.hYF.hD());
      this.hYF.a(parama);
    }
    if (this.hYH != null)
    {
      parama.bv(3, this.hYH.hD());
      this.hYH.a(parama);
    }
    if (this.hYJ != null)
    {
      parama.bv(4, this.hYJ.hD());
      this.hYJ.a(parama);
    }
    if (this.hYL != null)
    {
      parama.bv(5, this.hYL.hD());
      this.hYL.a(parama);
    }
    if (this.hYN != null)
      parama.I(6, this.hYN);
    if (this.title != null)
      parama.I(7, this.title);
    if (this.desc != null)
      parama.I(8, this.desc);
    if (this.hYQ == true)
      parama.k(9, this.hYP);
    if (this.hYS == true)
      parama.by(10, this.hYR);
    if (this.hYU == true)
      parama.k(11, this.hYT);
  }

  public final hs aLk()
  {
    return this.hYD;
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

  public final hr c(hs paramhs)
  {
    this.hYD = paramhs;
    this.hYE = true;
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
    hs localhs = this.hYD;
    int i = 0;
    if (localhs != null)
      i = 0 + b.a.a.a.bs(1, this.hYD.hD());
    if (this.hYF != null)
      i += b.a.a.a.bs(2, this.hYF.hD());
    if (this.hYH != null)
      i += b.a.a.a.bs(3, this.hYH.hD());
    if (this.hYJ != null)
      i += b.a.a.a.bs(4, this.hYJ.hD());
    if (this.hYL != null)
      i += b.a.a.a.bs(5, this.hYL.hD());
    if (this.hYN != null)
      i += b.a.a.b.b.a.J(6, this.hYN);
    if (this.title != null)
      i += b.a.a.b.b.a.J(7, this.title);
    if (this.desc != null)
      i += b.a.a.b.b.a.J(8, this.desc);
    if (this.hYQ == true)
      i += b.a.a.a.i(9, this.hYP);
    if (this.hYS == true)
      i += b.a.a.a.br(10, this.hYR);
    if (this.hYU == true)
      i += b.a.a.a.i(11, this.hYT);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hr
 * JD-Core Version:    0.6.2
 */