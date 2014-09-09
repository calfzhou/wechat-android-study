package com.tencent.mm.protocal.a;

public final class fq extends com.tencent.mm.ao.a
{
  public int hUn;
  public int hVv;

  public static boolean a(b.a.a.a.a parama, fq paramfq, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramfq.hVv = parama.bel();
      return true;
    case 2:
    }
    paramfq.hUn = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hVv);
    parama.by(2, this.hUn);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hVv) + b.a.a.a.br(2, this.hUn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fq
 * JD-Core Version:    0.6.2
 */