package com.tencent.mm.protocal.a;

public final class qk extends com.tencent.mm.ao.a
{
  public String KT;
  public float hXd;
  public float hXe;
  public int hXf;
  public String hXg;
  public String hXh;
  public int hXi;

  public static boolean a(b.a.a.a.a parama, qk paramqk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqk.hXd = parama.beq();
      return true;
    case 2:
      paramqk.hXe = parama.beq();
      return true;
    case 3:
      paramqk.hXf = parama.bel();
      return true;
    case 4:
      paramqk.hXg = parama.ben();
      return true;
    case 5:
      paramqk.hXh = parama.ben();
      return true;
    case 6:
      paramqk.hXi = parama.bel();
      return true;
    case 7:
    }
    paramqk.KT = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.c(1, this.hXd);
    parama.c(2, this.hXe);
    parama.by(3, this.hXf);
    if (this.hXg != null)
      parama.I(4, this.hXg);
    if (this.hXh != null)
      parama.I(5, this.hXh);
    parama.by(6, this.hXi);
    if (this.KT != null)
      parama.I(7, this.KT);
  }

  public final int hD()
  {
    int i = 0 + (4 + b.a.a.b.b.a.rV(1));
    int j = i + (4 + b.a.a.b.b.a.rV(2)) + b.a.a.a.br(3, this.hXf);
    if (this.hXg != null)
      j += b.a.a.b.b.a.J(4, this.hXg);
    if (this.hXh != null)
      j += b.a.a.b.b.a.J(5, this.hXh);
    int k = j + b.a.a.a.br(6, this.hXi);
    if (this.KT != null)
      k += b.a.a.b.b.a.J(7, this.KT);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qk
 * JD-Core Version:    0.6.2
 */