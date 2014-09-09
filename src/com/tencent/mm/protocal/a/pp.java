package com.tencent.mm.protocal.a;

public final class pp extends com.tencent.mm.ao.a
{
  public int iak;
  public int ifu;
  public int ifv;
  public int ifw;

  public static boolean a(b.a.a.a.a parama, pp parampp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parampp.iak = parama.bel();
      return true;
    case 2:
      parampp.ifu = parama.bel();
      return true;
    case 3:
      parampp.ifv = parama.bel();
      return true;
    case 4:
    }
    parampp.ifw = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.iak);
    parama.by(2, this.ifu);
    parama.by(3, this.ifv);
    parama.by(4, this.ifw);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.iak) + b.a.a.a.br(2, this.ifu) + b.a.a.a.br(3, this.ifv) + b.a.a.a.br(4, this.ifw);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pp
 * JD-Core Version:    0.6.2
 */