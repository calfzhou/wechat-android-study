package com.tencent.mm.protocal.a;

public final class v extends com.tencent.mm.ao.a
{
  public int hPh;
  public int hPi;

  public static boolean a(b.a.a.a.a parama, v paramv, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramv.hPh = parama.bel();
      return true;
    case 2:
    }
    paramv.hPi = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hPh);
    parama.by(2, this.hPi);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hPh) + b.a.a.a.br(2, this.hPi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.v
 * JD-Core Version:    0.6.2
 */