package com.tencent.mm.protocal.a;

public final class acc extends com.tencent.mm.ao.a
{
  public long ivH;
  public long ivI;
  public int ivJ;

  public static boolean a(b.a.a.a.a parama, acc paramacc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramacc.ivH = parama.ber();
      return true;
    case 2:
      paramacc.ivI = parama.ber();
      return true;
    case 3:
    }
    paramacc.ivJ = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.k(1, this.ivH);
    parama.k(2, this.ivI);
    parama.by(3, this.ivJ);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.i(1, this.ivH) + b.a.a.a.i(2, this.ivI) + b.a.a.a.br(3, this.ivJ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acc
 * JD-Core Version:    0.6.2
 */