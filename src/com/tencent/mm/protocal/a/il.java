package com.tencent.mm.protocal.a;

public final class il extends com.tencent.mm.ao.a
{
  private String appId;
  private String cIA;
  private String cOr;
  private String dDa;
  private long dGa;
  private String diG;
  private int fPW;
  private String fuQ;
  private String gvC;
  public boolean hYV = false;
  public boolean hYW = false;
  public boolean hYX = false;
  public boolean hZA = false;
  private String hZa;
  public boolean hZb = false;
  public boolean hZc = false;
  public boolean hZd = false;
  public boolean hZe = false;
  public boolean hZf = false;
  public boolean hZg = false;
  public boolean hZh = false;
  private String hZi;
  public boolean hZj = false;
  private String hZz;

  public static boolean a(b.a.a.a.a parama, il paramil, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramil.fPW = parama.bel();
      paramil.hYV = true;
      return true;
    case 2:
      paramil.diG = parama.ben();
      paramil.hYW = true;
      return true;
    case 3:
      paramil.cIA = parama.ben();
      paramil.hYX = true;
      return true;
    case 4:
      paramil.hZz = parama.ben();
      paramil.hZA = true;
      return true;
    case 5:
      paramil.hZa = parama.ben();
      paramil.hZb = true;
      return true;
    case 6:
      paramil.dGa = parama.ber();
      paramil.hZc = true;
      return true;
    case 7:
      paramil.fuQ = parama.ben();
      paramil.hZd = true;
      return true;
    case 8:
      paramil.cOr = parama.ben();
      paramil.hZe = true;
      return true;
    case 9:
      paramil.appId = parama.ben();
      paramil.hZf = true;
      return true;
    case 10:
      paramil.dDa = parama.ben();
      paramil.hZg = true;
      return true;
    case 11:
      paramil.gvC = parama.ben();
      paramil.hZh = true;
      return true;
    case 12:
    }
    paramil.hZi = parama.ben();
    paramil.hZj = true;
    return true;
  }

  public final il Ai(String paramString)
  {
    this.hZa = paramString;
    this.hZb = true;
    return this;
  }

  public final il Aj(String paramString)
  {
    this.fuQ = paramString;
    this.hZd = true;
    return this;
  }

  public final il Ak(String paramString)
  {
    this.cOr = paramString;
    this.hZe = true;
    return this;
  }

  public final il Al(String paramString)
  {
    this.appId = paramString;
    this.hZf = true;
    return this;
  }

  public final il Am(String paramString)
  {
    this.dDa = paramString;
    this.hZg = true;
    return this;
  }

  public final il An(String paramString)
  {
    this.hZi = paramString;
    this.hZj = true;
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hYV == true)
      parama.by(1, this.fPW);
    if (this.diG != null)
      parama.I(2, this.diG);
    if (this.cIA != null)
      parama.I(3, this.cIA);
    if (this.hZz != null)
      parama.I(4, this.hZz);
    if (this.hZa != null)
      parama.I(5, this.hZa);
    if (this.hZc == true)
      parama.k(6, this.dGa);
    if (this.fuQ != null)
      parama.I(7, this.fuQ);
    if (this.cOr != null)
      parama.I(8, this.cOr);
    if (this.appId != null)
      parama.I(9, this.appId);
    if (this.dDa != null)
      parama.I(10, this.dDa);
    if (this.gvC != null)
      parama.I(11, this.gvC);
    if (this.hZi != null)
      parama.I(12, this.hZi);
  }

  public final String aLA()
  {
    return this.gvC;
  }

  public final String aLB()
  {
    return this.hZi;
  }

  public final String aLH()
  {
    return this.hZz;
  }

  public final int aLt()
  {
    return this.fPW;
  }

  public final String aLu()
  {
    return this.cIA;
  }

  public final String aLw()
  {
    return this.hZa;
  }

  public final String aLx()
  {
    return this.fuQ;
  }

  public final String aLy()
  {
    return this.cOr;
  }

  public final String aLz()
  {
    return this.dDa;
  }

  public final String acg()
  {
    return this.diG;
  }

  public final il cL(long paramLong)
  {
    this.dGa = paramLong;
    this.hZc = true;
    return this;
  }

  public final String getAppId()
  {
    return this.appId;
  }

  public final int hD()
  {
    boolean bool = this.hYV;
    int i = 0;
    if (bool == true)
      i = 0 + b.a.a.a.br(1, this.fPW);
    if (this.diG != null)
      i += b.a.a.b.b.a.J(2, this.diG);
    if (this.cIA != null)
      i += b.a.a.b.b.a.J(3, this.cIA);
    if (this.hZz != null)
      i += b.a.a.b.b.a.J(4, this.hZz);
    if (this.hZa != null)
      i += b.a.a.b.b.a.J(5, this.hZa);
    if (this.hZc == true)
      i += b.a.a.a.i(6, this.dGa);
    if (this.fuQ != null)
      i += b.a.a.b.b.a.J(7, this.fuQ);
    if (this.cOr != null)
      i += b.a.a.b.b.a.J(8, this.cOr);
    if (this.appId != null)
      i += b.a.a.b.b.a.J(9, this.appId);
    if (this.dDa != null)
      i += b.a.a.b.b.a.J(10, this.dDa);
    if (this.gvC != null)
      i += b.a.a.b.b.a.J(11, this.gvC);
    if (this.hZi != null)
      i += b.a.a.b.b.a.J(12, this.hZi);
    return i;
  }

  public final long kn()
  {
    return this.dGa;
  }

  public final il nG(int paramInt)
  {
    this.fPW = paramInt;
    this.hYV = true;
    return this;
  }

  public final il xL(String paramString)
  {
    this.diG = paramString;
    this.hYW = true;
    return this;
  }

  public final il xM(String paramString)
  {
    this.cIA = paramString;
    this.hYX = true;
    return this;
  }

  public final il xO(String paramString)
  {
    this.hZz = paramString;
    this.hZA = true;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.il
 * JD-Core Version:    0.6.2
 */