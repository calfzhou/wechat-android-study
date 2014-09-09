package com.tencent.mm.protocal.a;

public final class abp extends com.tencent.mm.ao.a
{
  public int itQ;
  public int ivg;

  public static boolean a(b.a.a.a.a parama, abp paramabp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramabp.ivg = parama.bel();
      return true;
    case 2:
    }
    paramabp.itQ = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ivg);
    parama.by(2, this.itQ);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.ivg) + b.a.a.a.br(2, this.itQ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.abp
 * JD-Core Version:    0.6.2
 */