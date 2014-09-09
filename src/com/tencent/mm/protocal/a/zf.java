package com.tencent.mm.protocal.a;

public final class zf extends com.tencent.mm.ao.a
{
  public int ewb;
  public String fxG;
  public int gDG;
  public int hOV;
  public int hPv;
  public String hWB;
  public String isA;
  public int isB;
  public int isC;
  public String isy;
  public String isz;

  public static boolean a(b.a.a.a.a parama, zf paramzf, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramzf.isy = parama.ben();
      return true;
    case 2:
      paramzf.hWB = parama.ben();
      return true;
    case 3:
      paramzf.isz = parama.ben();
      return true;
    case 4:
      paramzf.isA = parama.ben();
      return true;
    case 5:
      paramzf.ewb = parama.bel();
      return true;
    case 6:
      paramzf.hPv = parama.bel();
      return true;
    case 7:
      paramzf.hOV = parama.bel();
      return true;
    case 8:
      paramzf.fxG = parama.ben();
      return true;
    case 9:
      paramzf.isB = parama.bel();
      return true;
    case 10:
      paramzf.gDG = parama.bel();
      return true;
    case 11:
    }
    paramzf.isC = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.isy != null)
      parama.I(1, this.isy);
    if (this.hWB != null)
      parama.I(2, this.hWB);
    if (this.isz != null)
      parama.I(3, this.isz);
    if (this.isA != null)
      parama.I(4, this.isA);
    parama.by(5, this.ewb);
    parama.by(6, this.hPv);
    parama.by(7, this.hOV);
    if (this.fxG != null)
      parama.I(8, this.fxG);
    parama.by(9, this.isB);
    parama.by(10, this.gDG);
    parama.by(11, this.isC);
  }

  public final zf cq(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    String str = this.isy;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.isy);
    if (this.hWB != null)
      i += b.a.a.b.b.a.J(2, this.hWB);
    if (this.isz != null)
      i += b.a.a.b.b.a.J(3, this.isz);
    if (this.isA != null)
      i += b.a.a.b.b.a.J(4, this.isA);
    int j = i + b.a.a.a.br(5, this.ewb) + b.a.a.a.br(6, this.hPv) + b.a.a.a.br(7, this.hOV);
    if (this.fxG != null)
      j += b.a.a.b.b.a.J(8, this.fxG);
    return j + b.a.a.a.br(9, this.isB) + b.a.a.a.br(10, this.gDG) + b.a.a.a.br(11, this.isC);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zf
 * JD-Core Version:    0.6.2
 */