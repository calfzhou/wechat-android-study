package com.tencent.mm.protocal.a;

import com.tencent.mm.ao.b;

public final class ba extends com.tencent.mm.ao.a
{
  public int hOi;
  public b hPL;
  public int hPM;
  public b hPN;
  public b hQu;
  public int hQv;

  public static boolean a(b.a.a.a.a parama, ba paramba, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramba.hQu = parama.bes();
      return true;
    case 2:
      paramba.hQv = parama.bel();
      return true;
    case 3:
      paramba.hPL = parama.bes();
      return true;
    case 4:
      paramba.hPM = parama.bel();
      return true;
    case 5:
      paramba.hPN = parama.bes();
      return true;
    case 6:
    }
    paramba.hOi = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQu != null)
      parama.c(1, this.hQu);
    parama.by(2, this.hQv);
    if (this.hPL != null)
      parama.c(3, this.hPL);
    parama.by(4, this.hPM);
    if (this.hPN != null)
      parama.c(5, this.hPN);
    parama.by(6, this.hOi);
  }

  public final int hD()
  {
    b localb = this.hQu;
    int i = 0;
    if (localb != null)
      i = 0 + b.a.a.a.a(1, this.hQu);
    int j = i + b.a.a.a.br(2, this.hQv);
    if (this.hPL != null)
      j += b.a.a.a.a(3, this.hPL);
    int k = j + b.a.a.a.br(4, this.hPM);
    if (this.hPN != null)
      k += b.a.a.a.a(5, this.hPN);
    return k + b.a.a.a.br(6, this.hOi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ba
 * JD-Core Version:    0.6.2
 */