package com.tencent.mm.protocal.a;

public final class abq extends com.tencent.mm.ao.a
{
  public String gnq;
  public int ivh;

  public static boolean a(b.a.a.a.a parama, abq paramabq, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramabq.ivh = parama.bel();
      return true;
    case 2:
    }
    paramabq.gnq = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ivh);
    if (this.gnq != null)
      parama.I(2, this.gnq);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ivh);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.abq
 * JD-Core Version:    0.6.2
 */