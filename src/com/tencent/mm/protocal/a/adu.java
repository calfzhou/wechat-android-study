package com.tencent.mm.protocal.a;

public final class adu extends com.tencent.mm.ao.a
{
  public int hQk;
  public int hQs;
  public int hUu;

  public static boolean a(b.a.a.a.a parama, adu paramadu, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramadu.hQk = parama.bel();
      return true;
    case 2:
      paramadu.hUu = parama.bel();
      return true;
    case 3:
    }
    paramadu.hQs = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hQk);
    parama.by(2, this.hUu);
    parama.by(3, this.hQs);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hQk) + b.a.a.a.br(2, this.hUu) + b.a.a.a.br(3, this.hQs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adu
 * JD-Core Version:    0.6.2
 */