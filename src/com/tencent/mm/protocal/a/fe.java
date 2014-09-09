package com.tencent.mm.protocal.a;

public final class fe extends com.tencent.mm.ao.a
{
  public int hOF;
  public int hQw;

  public static boolean a(b.a.a.a.a parama, fe paramfe, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramfe.hQw = parama.bel();
      return true;
    case 2:
    }
    paramfe.hOF = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hQw);
    parama.by(2, this.hOF);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hQw) + b.a.a.a.br(2, this.hOF);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fe
 * JD-Core Version:    0.6.2
 */