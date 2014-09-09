package com.tencent.mm.protocal.a;

public final class cd extends com.tencent.mm.ao.a
{
  public String KH;
  public String hOd;
  public String hOw;
  public String hOx;
  public String hPB;
  public String hPE;
  public String hPH;
  public String hRN;
  public String hRO;
  public String hRP;
  public String hRQ;
  public String hRR;
  public String hRS;
  public String hRT;
  public String hRU;
  public String hRV;
  public int hRW;
  public int hRX;
  public int hRY;
  public String hRZ;
  public String hSa;
  public String hSb;

  public static boolean a(b.a.a.a.a parama, cd paramcd, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcd.hOd = parama.ben();
      return true;
    case 2:
      paramcd.KH = parama.ben();
      return true;
    case 3:
      paramcd.hPB = parama.ben();
      return true;
    case 4:
      paramcd.hRN = parama.ben();
      return true;
    case 5:
      paramcd.hRO = parama.ben();
      return true;
    case 6:
      paramcd.hRP = parama.ben();
      return true;
    case 7:
      paramcd.hRQ = parama.ben();
      return true;
    case 8:
      paramcd.hRR = parama.ben();
      return true;
    case 9:
      paramcd.hRS = parama.ben();
      return true;
    case 10:
      paramcd.hRT = parama.ben();
      return true;
    case 11:
      paramcd.hRU = parama.ben();
      return true;
    case 12:
      paramcd.hOw = parama.ben();
      return true;
    case 13:
      paramcd.hRV = parama.ben();
      return true;
    case 14:
      paramcd.hPE = parama.ben();
      return true;
    case 15:
      paramcd.hPH = parama.ben();
      return true;
    case 16:
      paramcd.hRW = parama.bel();
      return true;
    case 17:
      paramcd.hRX = parama.bel();
      return true;
    case 18:
      paramcd.hRY = parama.bel();
      return true;
    case 19:
      paramcd.hRZ = parama.ben();
      return true;
    case 20:
      paramcd.hSa = parama.ben();
      return true;
    case 21:
      paramcd.hSb = parama.ben();
      return true;
    case 22:
    }
    paramcd.hOx = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOd != null)
      parama.I(1, this.hOd);
    if (this.KH != null)
      parama.I(2, this.KH);
    if (this.hPB != null)
      parama.I(3, this.hPB);
    if (this.hRN != null)
      parama.I(4, this.hRN);
    if (this.hRO != null)
      parama.I(5, this.hRO);
    if (this.hRP != null)
      parama.I(6, this.hRP);
    if (this.hRQ != null)
      parama.I(7, this.hRQ);
    if (this.hRR != null)
      parama.I(8, this.hRR);
    if (this.hRS != null)
      parama.I(9, this.hRS);
    if (this.hRT != null)
      parama.I(10, this.hRT);
    if (this.hRU != null)
      parama.I(11, this.hRU);
    if (this.hOw != null)
      parama.I(12, this.hOw);
    if (this.hRV != null)
      parama.I(13, this.hRV);
    if (this.hPE != null)
      parama.I(14, this.hPE);
    if (this.hPH != null)
      parama.I(15, this.hPH);
    parama.by(16, this.hRW);
    parama.by(17, this.hRX);
    parama.by(18, this.hRY);
    if (this.hRZ != null)
      parama.I(19, this.hRZ);
    if (this.hSa != null)
      parama.I(20, this.hSa);
    if (this.hSb != null)
      parama.I(21, this.hSb);
    if (this.hOx != null)
      parama.I(22, this.hOx);
  }

  public final int hD()
  {
    String str = this.hOd;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hOd);
    if (this.KH != null)
      i += b.a.a.b.b.a.J(2, this.KH);
    if (this.hPB != null)
      i += b.a.a.b.b.a.J(3, this.hPB);
    if (this.hRN != null)
      i += b.a.a.b.b.a.J(4, this.hRN);
    if (this.hRO != null)
      i += b.a.a.b.b.a.J(5, this.hRO);
    if (this.hRP != null)
      i += b.a.a.b.b.a.J(6, this.hRP);
    if (this.hRQ != null)
      i += b.a.a.b.b.a.J(7, this.hRQ);
    if (this.hRR != null)
      i += b.a.a.b.b.a.J(8, this.hRR);
    if (this.hRS != null)
      i += b.a.a.b.b.a.J(9, this.hRS);
    if (this.hRT != null)
      i += b.a.a.b.b.a.J(10, this.hRT);
    if (this.hRU != null)
      i += b.a.a.b.b.a.J(11, this.hRU);
    if (this.hOw != null)
      i += b.a.a.b.b.a.J(12, this.hOw);
    if (this.hRV != null)
      i += b.a.a.b.b.a.J(13, this.hRV);
    if (this.hPE != null)
      i += b.a.a.b.b.a.J(14, this.hPE);
    if (this.hPH != null)
      i += b.a.a.b.b.a.J(15, this.hPH);
    int j = i + b.a.a.a.br(16, this.hRW) + b.a.a.a.br(17, this.hRX) + b.a.a.a.br(18, this.hRY);
    if (this.hRZ != null)
      j += b.a.a.b.b.a.J(19, this.hRZ);
    if (this.hSa != null)
      j += b.a.a.b.b.a.J(20, this.hSa);
    if (this.hSb != null)
      j += b.a.a.b.b.a.J(21, this.hSb);
    if (this.hOx != null)
      j += b.a.a.b.b.a.J(22, this.hOx);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cd
 * JD-Core Version:    0.6.2
 */