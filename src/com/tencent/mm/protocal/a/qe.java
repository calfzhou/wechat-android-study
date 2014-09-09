package com.tencent.mm.protocal.a;

public final class qe extends com.tencent.mm.ao.a
{
  public int hPS;
  public int ifK;

  public static boolean a(b.a.a.a.a parama, qe paramqe, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqe.hPS = parama.bel();
      return true;
    case 2:
    }
    paramqe.ifK = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hPS);
    parama.by(2, this.ifK);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hPS) + b.a.a.a.br(2, this.ifK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qe
 * JD-Core Version:    0.6.2
 */