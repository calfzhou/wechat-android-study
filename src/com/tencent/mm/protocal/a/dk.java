package com.tencent.mm.protocal.a;

public final class dk extends com.tencent.mm.ao.a
{
  public String gnq;
  public int hTA;
  public String hTx;
  public String hTy;
  public String hTz;
  public String hwV;

  public static boolean a(b.a.a.a.a parama, dk paramdk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramdk.gnq = parama.ben();
      return true;
    case 2:
      paramdk.hwV = parama.ben();
      return true;
    case 3:
      paramdk.hTx = parama.ben();
      return true;
    case 4:
      paramdk.hTy = parama.ben();
      return true;
    case 5:
      paramdk.hTz = parama.ben();
      return true;
    case 6:
    }
    paramdk.hTA = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hwV != null)
      parama.I(2, this.hwV);
    if (this.hTx != null)
      parama.I(3, this.hTx);
    if (this.hTy != null)
      parama.I(4, this.hTy);
    if (this.hTz != null)
      parama.I(5, this.hTz);
    parama.by(6, this.hTA);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(2, this.hwV);
    if (this.hTx != null)
      i += b.a.a.b.b.a.J(3, this.hTx);
    if (this.hTy != null)
      i += b.a.a.b.b.a.J(4, this.hTy);
    if (this.hTz != null)
      i += b.a.a.b.b.a.J(5, this.hTz);
    return i + b.a.a.a.br(6, this.hTA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.dk
 * JD-Core Version:    0.6.2
 */