package com.tencent.mm.protocal.a;

public final class aan extends com.tencent.mm.ao.a
{
  public int dto;
  public String dtp;
  public long dtq;
  public int itD;

  public static boolean a(b.a.a.a.a parama, aan paramaan, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaan.dto = parama.bel();
      return true;
    case 2:
      paramaan.dtp = parama.ben();
      return true;
    case 3:
      paramaan.dtq = parama.ber();
      return true;
    case 4:
    }
    paramaan.itD = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.dto);
    if (this.dtp != null)
      parama.I(2, this.dtp);
    parama.k(3, this.dtq);
    parama.by(4, this.itD);
  }

  public final aan ct(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.dto);
    if (this.dtp != null)
      i += b.a.a.b.b.a.J(2, this.dtp);
    return i + b.a.a.a.i(3, this.dtq) + b.a.a.a.br(4, this.itD);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aan
 * JD-Core Version:    0.6.2
 */