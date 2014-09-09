package com.tencent.mm.protocal.a;

public final class zk extends com.tencent.mm.ao.a
{
  public int ewb;
  public String fxG;
  public int gDG;
  public int hOV;
  public int hPv;
  public String hRk;
  public String igN;
  public int isB;
  public int isC;
  public String isO;

  public static boolean a(b.a.a.a.a parama, zk paramzk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramzk.hRk = parama.ben();
      return true;
    case 2:
      paramzk.igN = parama.ben();
      return true;
    case 3:
      paramzk.hPv = parama.bel();
      return true;
    case 4:
      paramzk.ewb = parama.bel();
      return true;
    case 5:
      paramzk.fxG = parama.ben();
      return true;
    case 6:
      paramzk.hOV = parama.bel();
      return true;
    case 7:
      paramzk.gDG = parama.bel();
      return true;
    case 8:
      paramzk.isB = parama.bel();
      return true;
    case 9:
      paramzk.isO = parama.ben();
      return true;
    case 10:
    }
    paramzk.isC = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRk != null)
      parama.I(1, this.hRk);
    if (this.igN != null)
      parama.I(2, this.igN);
    parama.by(3, this.hPv);
    parama.by(4, this.ewb);
    if (this.fxG != null)
      parama.I(5, this.fxG);
    parama.by(6, this.hOV);
    parama.by(7, this.gDG);
    parama.by(8, this.isB);
    if (this.isO != null)
      parama.I(9, this.isO);
    parama.by(10, this.isC);
  }

  public final int hD()
  {
    String str = this.hRk;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hRk);
    if (this.igN != null)
      i += b.a.a.b.b.a.J(2, this.igN);
    int j = i + b.a.a.a.br(3, this.hPv) + b.a.a.a.br(4, this.ewb);
    if (this.fxG != null)
      j += b.a.a.b.b.a.J(5, this.fxG);
    int k = j + b.a.a.a.br(6, this.hOV) + b.a.a.a.br(7, this.gDG) + b.a.a.a.br(8, this.isB);
    if (this.isO != null)
      k += b.a.a.b.b.a.J(9, this.isO);
    return k + b.a.a.a.br(10, this.isC);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zk
 * JD-Core Version:    0.6.2
 */