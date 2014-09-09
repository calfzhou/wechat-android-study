package com.tencent.mm.protocal.a;

public final class afy extends com.tencent.mm.ao.a
{
  public int dZy;
  public String hRk;

  public static boolean a(b.a.a.a.a parama, afy paramafy, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramafy.hRk = parama.ben();
      return true;
    case 2:
    }
    paramafy.dZy = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRk != null)
      parama.I(1, this.hRk);
    parama.by(2, this.dZy);
  }

  public final afy cO(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    String str = this.hRk;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hRk);
    return i + b.a.a.a.br(2, this.dZy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afy
 * JD-Core Version:    0.6.2
 */