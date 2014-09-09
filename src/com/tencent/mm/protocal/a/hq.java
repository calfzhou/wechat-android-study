package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class hq extends com.tencent.mm.ao.a
{
  private String cHY;
  private String dRg;
  private String desc;
  private int duration;
  private int eVS;
  private int eeK;
  private int hXA;
  public boolean hXB = false;
  private String hXC;
  public boolean hXD = false;
  private String hXE;
  public boolean hXF = false;
  private int hXG;
  public boolean hXH = false;
  public boolean hXI = false;
  private String hXJ;
  public boolean hXK = false;
  private String hXL;
  public boolean hXM = false;
  private String hXN;
  public boolean hXO = false;
  public boolean hXP = false;
  public boolean hXQ = false;
  private String hXR;
  public boolean hXS = false;
  private String hXT;
  public boolean hXU = false;
  private String hXV;
  public boolean hXW = false;
  private long hXX;
  public boolean hXY = false;
  private String hXZ;
  public boolean hXu = false;
  public boolean hXv = false;
  public boolean hXw = false;
  private String hXx;
  public boolean hXy = false;
  public boolean hXz = false;
  public boolean hYA = false;
  private String hYB;
  public boolean hYC = false;
  public boolean hYa = false;
  private String hYb;
  public boolean hYc = false;
  private String hYd;
  public boolean hYe = false;
  private String hYf;
  public boolean hYg = false;
  private String hYh;
  public boolean hYi = false;
  private long hYj;
  public boolean hYk = false;
  private String hYl;
  public boolean hYm = false;
  private String hYn;
  public boolean hYo = false;
  private boolean hYp;
  public boolean hYq = false;
  private boolean hYr;
  public boolean hYs = false;
  private int hYt;
  public boolean hYu = false;
  private String hYv;
  public boolean hYw = false;
  private hr hYx;
  public boolean hYy = false;
  private String hYz;
  private String title;

  public static boolean a(b.a.a.a.a parama, hq paramhq, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhq.title = parama.ben();
      paramhq.hXu = true;
      return true;
    case 2:
      paramhq.desc = parama.ben();
      paramhq.hXv = true;
      return true;
    case 3:
      paramhq.dRg = parama.ben();
      paramhq.hXw = true;
      return true;
    case 4:
      paramhq.hXx = parama.ben();
      paramhq.hXy = true;
      return true;
    case 5:
      paramhq.eVS = parama.bel();
      paramhq.hXz = true;
      return true;
    case 6:
      paramhq.hXA = parama.bel();
      paramhq.hXB = true;
      return true;
    case 7:
      paramhq.hXC = parama.ben();
      paramhq.hXD = true;
      return true;
    case 8:
      paramhq.hXE = parama.ben();
      paramhq.hXF = true;
      return true;
    case 9:
      paramhq.hXG = parama.bel();
      paramhq.hXH = true;
      return true;
    case 10:
      paramhq.duration = parama.bel();
      paramhq.hXI = true;
      return true;
    case 11:
      paramhq.hXJ = parama.ben();
      paramhq.hXK = true;
      return true;
    case 12:
      paramhq.hXL = parama.ben();
      paramhq.hXM = true;
      return true;
    case 13:
      paramhq.hXN = parama.ben();
      paramhq.hXO = true;
      return true;
    case 14:
      paramhq.cHY = parama.ben();
      paramhq.hXP = true;
      return true;
    case 15:
      paramhq.eeK = parama.bel();
      paramhq.hXQ = true;
      return true;
    case 16:
      paramhq.hXR = parama.ben();
      paramhq.hXS = true;
      return true;
    case 17:
      paramhq.hXT = parama.ben();
      paramhq.hXU = true;
      return true;
    case 18:
      paramhq.hXV = parama.ben();
      paramhq.hXW = true;
      return true;
    case 19:
      paramhq.hXX = parama.ber();
      paramhq.hXY = true;
      return true;
    case 20:
      paramhq.hXZ = parama.ben();
      paramhq.hYa = true;
      return true;
    case 21:
      paramhq.hYb = parama.ben();
      paramhq.hYc = true;
      return true;
    case 22:
      paramhq.hYd = parama.ben();
      paramhq.hYe = true;
      return true;
    case 23:
      paramhq.hYf = parama.ben();
      paramhq.hYg = true;
      return true;
    case 24:
      paramhq.hYh = parama.ben();
      paramhq.hYi = true;
      return true;
    case 25:
      paramhq.hYj = parama.ber();
      paramhq.hYk = true;
      return true;
    case 26:
      paramhq.hYl = parama.ben();
      paramhq.hYm = true;
      return true;
    case 27:
      paramhq.hYn = parama.ben();
      paramhq.hYo = true;
      return true;
    case 28:
      paramhq.hYp = parama.beo();
      paramhq.hYq = true;
      return true;
    case 29:
      paramhq.hYr = parama.beo();
      paramhq.hYs = true;
      return true;
    case 30:
      paramhq.hYt = parama.bel();
      paramhq.hYu = true;
      return true;
    case 31:
      paramhq.hYv = parama.ben();
      paramhq.hYw = true;
      return true;
    case 32:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        hr localhr = new hr();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = hr.a(locala, localhr, locala.bet()));
        paramhq.hYx = localhr;
      }
      paramhq.hYy = true;
      return true;
    case 33:
      paramhq.hYz = parama.ben();
      paramhq.hYA = true;
      return true;
    case 34:
    }
    paramhq.hYB = parama.ben();
    paramhq.hYC = true;
    return true;
  }

  public final int Tw()
  {
    return this.eVS;
  }

  public final hq a(hr paramhr)
  {
    this.hYx = paramhr;
    this.hYy = true;
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.title != null)
      parama.I(1, this.title);
    if (this.desc != null)
      parama.I(2, this.desc);
    if (this.dRg != null)
      parama.I(3, this.dRg);
    if (this.hXx != null)
      parama.I(4, this.hXx);
    if (this.hXz == true)
      parama.by(5, this.eVS);
    if (this.hXB == true)
      parama.by(6, this.hXA);
    if (this.hXC != null)
      parama.I(7, this.hXC);
    if (this.hXE != null)
      parama.I(8, this.hXE);
    if (this.hXH == true)
      parama.by(9, this.hXG);
    if (this.hXI == true)
      parama.by(10, this.duration);
    if (this.hXJ != null)
      parama.I(11, this.hXJ);
    if (this.hXL != null)
      parama.I(12, this.hXL);
    if (this.hXN != null)
      parama.I(13, this.hXN);
    if (this.cHY != null)
      parama.I(14, this.cHY);
    if (this.hXQ == true)
      parama.by(15, this.eeK);
    if (this.hXR != null)
      parama.I(16, this.hXR);
    if (this.hXT != null)
      parama.I(17, this.hXT);
    if (this.hXV != null)
      parama.I(18, this.hXV);
    if (this.hXY == true)
      parama.k(19, this.hXX);
    if (this.hXZ != null)
      parama.I(20, this.hXZ);
    if (this.hYb != null)
      parama.I(21, this.hYb);
    if (this.hYd != null)
      parama.I(22, this.hYd);
    if (this.hYf != null)
      parama.I(23, this.hYf);
    if (this.hYh != null)
      parama.I(24, this.hYh);
    if (this.hYk == true)
      parama.k(25, this.hYj);
    if (this.hYl != null)
      parama.I(26, this.hYl);
    if (this.hYn != null)
      parama.I(27, this.hYn);
    if (this.hYq == true)
      parama.D(28, this.hYp);
    if (this.hYs == true)
      parama.D(29, this.hYr);
    if (this.hYu == true)
      parama.by(30, this.hYt);
    if (this.hYv != null)
      parama.I(31, this.hYv);
    if (this.hYx != null)
    {
      parama.bv(32, this.hYx.hD());
      this.hYx.a(parama);
    }
    if (this.hYz != null)
      parama.I(33, this.hYz);
    if (this.hYB != null)
      parama.I(34, this.hYB);
  }

  public final String aHA()
  {
    return this.hXx;
  }

  public final int aHB()
  {
    return this.hXA;
  }

  public final String aHC()
  {
    return this.hXC;
  }

  public final String aHD()
  {
    return this.hXE;
  }

  public final int aHE()
  {
    return this.hXG;
  }

  public final String aHF()
  {
    return this.hXJ;
  }

  public final String aHR()
  {
    return this.hXL;
  }

  public final String aHS()
  {
    return this.hXN;
  }

  public final String aHT()
  {
    return this.cHY;
  }

  public final String aHU()
  {
    return this.hXR;
  }

  public final String aHV()
  {
    return this.hXT;
  }

  public final String aHz()
  {
    return this.dRg;
  }

  public final String aIL()
  {
    return this.hXV;
  }

  public final long aJz()
  {
    return this.hXX;
  }

  public final String aKW()
  {
    return this.hYb;
  }

  public final String aKX()
  {
    return this.hYd;
  }

  public final String aKY()
  {
    return this.hYf;
  }

  public final String aKZ()
  {
    return this.hYh;
  }

  public final String aKr()
  {
    return this.hXZ;
  }

  public final long aLa()
  {
    return this.hYj;
  }

  public final String aLb()
  {
    return this.hYl;
  }

  public final String aLc()
  {
    return this.hYn;
  }

  public final boolean aLd()
  {
    return this.hYp;
  }

  public final boolean aLe()
  {
    return this.hYr;
  }

  public final int aLf()
  {
    return this.hYt;
  }

  public final String aLg()
  {
    return this.hYv;
  }

  public final hr aLh()
  {
    return this.hYx;
  }

  public final String aLi()
  {
    return this.hYz;
  }

  public final String aLj()
  {
    return this.hYB;
  }

  public final hq cF(long paramLong)
  {
    this.hXX = paramLong;
    this.hXY = true;
    return this;
  }

  public final hq cG(long paramLong)
  {
    this.hYj = paramLong;
    this.hYk = true;
    return this;
  }

  public final hq ea(boolean paramBoolean)
  {
    this.hYp = paramBoolean;
    this.hYq = true;
    return this;
  }

  public final hq eb(boolean paramBoolean)
  {
    this.hYr = paramBoolean;
    this.hYs = true;
    return this;
  }

  public final int getDataType()
  {
    return this.eeK;
  }

  public final String getDesc()
  {
    return this.desc;
  }

  public final int getDuration()
  {
    return this.duration;
  }

  public final String getTitle()
  {
    return this.title;
  }

  public final int hD()
  {
    String str = this.title;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.title);
    if (this.desc != null)
      i += b.a.a.b.b.a.J(2, this.desc);
    if (this.dRg != null)
      i += b.a.a.b.b.a.J(3, this.dRg);
    if (this.hXx != null)
      i += b.a.a.b.b.a.J(4, this.hXx);
    if (this.hXz == true)
      i += b.a.a.a.br(5, this.eVS);
    if (this.hXB == true)
      i += b.a.a.a.br(6, this.hXA);
    if (this.hXC != null)
      i += b.a.a.b.b.a.J(7, this.hXC);
    if (this.hXE != null)
      i += b.a.a.b.b.a.J(8, this.hXE);
    if (this.hXH == true)
      i += b.a.a.a.br(9, this.hXG);
    if (this.hXI == true)
      i += b.a.a.a.br(10, this.duration);
    if (this.hXJ != null)
      i += b.a.a.b.b.a.J(11, this.hXJ);
    if (this.hXL != null)
      i += b.a.a.b.b.a.J(12, this.hXL);
    if (this.hXN != null)
      i += b.a.a.b.b.a.J(13, this.hXN);
    if (this.cHY != null)
      i += b.a.a.b.b.a.J(14, this.cHY);
    if (this.hXQ == true)
      i += b.a.a.a.br(15, this.eeK);
    if (this.hXR != null)
      i += b.a.a.b.b.a.J(16, this.hXR);
    if (this.hXT != null)
      i += b.a.a.b.b.a.J(17, this.hXT);
    if (this.hXV != null)
      i += b.a.a.b.b.a.J(18, this.hXV);
    if (this.hXY == true)
      i += b.a.a.a.i(19, this.hXX);
    if (this.hXZ != null)
      i += b.a.a.b.b.a.J(20, this.hXZ);
    if (this.hYb != null)
      i += b.a.a.b.b.a.J(21, this.hYb);
    if (this.hYd != null)
      i += b.a.a.b.b.a.J(22, this.hYd);
    if (this.hYf != null)
      i += b.a.a.b.b.a.J(23, this.hYf);
    if (this.hYh != null)
      i += b.a.a.b.b.a.J(24, this.hYh);
    if (this.hYk == true)
      i += b.a.a.a.i(25, this.hYj);
    if (this.hYl != null)
      i += b.a.a.b.b.a.J(26, this.hYl);
    if (this.hYn != null)
      i += b.a.a.b.b.a.J(27, this.hYn);
    if (this.hYq == true)
      i += 1 + b.a.a.b.b.a.rV(28);
    if (this.hYs == true)
      i += 1 + b.a.a.b.b.a.rV(29);
    if (this.hYu == true)
      i += b.a.a.a.br(30, this.hYt);
    if (this.hYv != null)
      i += b.a.a.b.b.a.J(31, this.hYv);
    if (this.hYx != null)
      i += b.a.a.a.bs(32, this.hYx.hD());
    if (this.hYz != null)
      i += b.a.a.b.b.a.J(33, this.hYz);
    if (this.hYB != null)
      i += b.a.a.b.b.a.J(34, this.hYB);
    return i;
  }

  public final hq nA(int paramInt)
  {
    this.eeK = paramInt;
    this.hXQ = true;
    return this;
  }

  public final hq nB(int paramInt)
  {
    this.hYt = paramInt;
    this.hYu = true;
    return this;
  }

  public final hq nx(int paramInt)
  {
    this.eVS = paramInt;
    this.hXz = true;
    return this;
  }

  public final hq ny(int paramInt)
  {
    this.hXA = paramInt;
    this.hXB = true;
    return this;
  }

  public final hq nz(int paramInt)
  {
    this.duration = paramInt;
    this.hXI = true;
    return this;
  }

  public final hq wA(String paramString)
  {
    this.cHY = paramString;
    this.hXP = true;
    return this;
  }

  public final hq wB(String paramString)
  {
    this.hXR = paramString;
    this.hXS = true;
    return this;
  }

  public final hq wC(String paramString)
  {
    this.hXT = paramString;
    this.hXU = true;
    return this;
  }

  public final hq wD(String paramString)
  {
    this.hXV = paramString;
    this.hXW = true;
    return this;
  }

  public final hq wE(String paramString)
  {
    this.hXZ = paramString;
    this.hYa = true;
    return this;
  }

  public final hq wG(String paramString)
  {
    this.hYb = paramString;
    this.hYc = true;
    return this;
  }

  public final hq wH(String paramString)
  {
    this.hYd = paramString;
    this.hYe = true;
    return this;
  }

  public final hq wI(String paramString)
  {
    this.hYf = paramString;
    this.hYg = true;
    return this;
  }

  public final hq wJ(String paramString)
  {
    this.hYh = paramString;
    this.hYi = true;
    return this;
  }

  public final hq wK(String paramString)
  {
    this.hYl = paramString;
    this.hYm = true;
    return this;
  }

  public final hq wL(String paramString)
  {
    this.hYn = paramString;
    this.hYo = true;
    return this;
  }

  public final hq wM(String paramString)
  {
    this.hYv = paramString;
    this.hYw = true;
    return this;
  }

  public final hq wN(String paramString)
  {
    this.hYz = paramString;
    this.hYA = true;
    return this;
  }

  public final hq wO(String paramString)
  {
    this.hYB = paramString;
    this.hYC = true;
    return this;
  }

  public final hq wr(String paramString)
  {
    this.title = paramString;
    this.hXu = true;
    return this;
  }

  public final hq ws(String paramString)
  {
    this.desc = paramString;
    this.hXv = true;
    return this;
  }

  public final hq wt(String paramString)
  {
    this.dRg = paramString;
    this.hXw = true;
    return this;
  }

  public final hq wu(String paramString)
  {
    this.hXx = paramString;
    this.hXy = true;
    return this;
  }

  public final hq wv(String paramString)
  {
    this.hXC = paramString;
    this.hXD = true;
    return this;
  }

  public final hq ww(String paramString)
  {
    this.hXE = paramString;
    this.hXF = true;
    return this;
  }

  public final hq wx(String paramString)
  {
    this.hXJ = paramString;
    this.hXK = true;
    return this;
  }

  public final hq wy(String paramString)
  {
    this.hXL = paramString;
    this.hXM = true;
    return this;
  }

  public final hq wz(String paramString)
  {
    this.hXN = paramString;
    this.hXO = true;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hq
 * JD-Core Version:    0.6.2
 */