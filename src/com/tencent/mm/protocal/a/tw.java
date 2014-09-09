package com.tencent.mm.protocal.a;

public final class tw extends com.tencent.mm.ao.a
{
  public String hOt;
  public String hOu;
  public String hOw;
  public String hRV;
  public int hRW;
  public int hRX;
  public String hsT;
  public String ioL;
  public String ioM;
  public String ioN;
  public String ioO;
  public String ioP;
  public String ioQ;
  public String ioR;

  public static boolean a(b.a.a.a.a parama, tw paramtw, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramtw.hsT = parama.ben();
      return true;
    case 2:
      paramtw.hOt = parama.ben();
      return true;
    case 3:
      paramtw.ioL = parama.ben();
      return true;
    case 4:
      paramtw.hOu = parama.ben();
      return true;
    case 5:
      paramtw.ioM = parama.ben();
      return true;
    case 6:
      paramtw.hRX = parama.bel();
      return true;
    case 7:
      paramtw.ioN = parama.ben();
      return true;
    case 8:
      paramtw.hOw = parama.ben();
      return true;
    case 9:
      paramtw.hRV = parama.ben();
      return true;
    case 10:
      paramtw.ioO = parama.ben();
      return true;
    case 11:
      paramtw.ioP = parama.ben();
      return true;
    case 12:
      paramtw.ioQ = parama.ben();
      return true;
    case 13:
      paramtw.ioR = parama.ben();
      return true;
    case 14:
    }
    paramtw.hRW = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hsT != null)
      parama.I(1, this.hsT);
    if (this.hOt != null)
      parama.I(2, this.hOt);
    if (this.ioL != null)
      parama.I(3, this.ioL);
    if (this.hOu != null)
      parama.I(4, this.hOu);
    if (this.ioM != null)
      parama.I(5, this.ioM);
    parama.by(6, this.hRX);
    if (this.ioN != null)
      parama.I(7, this.ioN);
    if (this.hOw != null)
      parama.I(8, this.hOw);
    if (this.hRV != null)
      parama.I(9, this.hRV);
    if (this.ioO != null)
      parama.I(10, this.ioO);
    if (this.ioP != null)
      parama.I(11, this.ioP);
    if (this.ioQ != null)
      parama.I(12, this.ioQ);
    if (this.ioR != null)
      parama.I(13, this.ioR);
    parama.by(14, this.hRW);
  }

  public final int hD()
  {
    String str = this.hsT;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hsT);
    if (this.hOt != null)
      i += b.a.a.b.b.a.J(2, this.hOt);
    if (this.ioL != null)
      i += b.a.a.b.b.a.J(3, this.ioL);
    if (this.hOu != null)
      i += b.a.a.b.b.a.J(4, this.hOu);
    if (this.ioM != null)
      i += b.a.a.b.b.a.J(5, this.ioM);
    int j = i + b.a.a.a.br(6, this.hRX);
    if (this.ioN != null)
      j += b.a.a.b.b.a.J(7, this.ioN);
    if (this.hOw != null)
      j += b.a.a.b.b.a.J(8, this.hOw);
    if (this.hRV != null)
      j += b.a.a.b.b.a.J(9, this.hRV);
    if (this.ioO != null)
      j += b.a.a.b.b.a.J(10, this.ioO);
    if (this.ioP != null)
      j += b.a.a.b.b.a.J(11, this.ioP);
    if (this.ioQ != null)
      j += b.a.a.b.b.a.J(12, this.ioQ);
    if (this.ioR != null)
      j += b.a.a.b.b.a.J(13, this.ioR);
    return j + b.a.a.a.br(14, this.hRW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tw
 * JD-Core Version:    0.6.2
 */