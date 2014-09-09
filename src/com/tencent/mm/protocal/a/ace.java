package com.tencent.mm.protocal.a;

public final class ace extends com.tencent.mm.ao.a
{
  public String hVW;
  public int ivK;
  public String ivL;
  public int ivM;
  public long ivN;

  public static boolean a(b.a.a.a.a parama, ace paramace, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramace.ivK = parama.bel();
      return true;
    case 2:
      paramace.ivL = parama.ben();
      return true;
    case 3:
      paramace.hVW = parama.ben();
      return true;
    case 4:
      paramace.ivM = parama.bel();
      return true;
    case 5:
    }
    paramace.ivN = parama.ber();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ivK);
    if (this.ivL != null)
      parama.I(2, this.ivL);
    if (this.hVW != null)
      parama.I(3, this.hVW);
    parama.by(4, this.ivM);
    parama.k(5, this.ivN);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ivK);
    if (this.ivL != null)
      i += b.a.a.b.b.a.J(2, this.ivL);
    if (this.hVW != null)
      i += b.a.a.b.b.a.J(3, this.hVW);
    return i + b.a.a.a.br(4, this.ivM) + b.a.a.a.i(5, this.ivN);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ace
 * JD-Core Version:    0.6.2
 */