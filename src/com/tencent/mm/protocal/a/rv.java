package com.tencent.mm.protocal.a;

public final class rv extends com.tencent.mm.ao.a
{
  public float ilG;
  public float ilH;
  public float ilI;

  public static boolean a(b.a.a.a.a parama, rv paramrv, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramrv.ilG = parama.beq();
      return true;
    case 2:
      paramrv.ilH = parama.beq();
      return true;
    case 3:
    }
    paramrv.ilI = parama.beq();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.c(1, this.ilG);
    parama.c(2, this.ilH);
    parama.c(3, this.ilI);
  }

  public final int hD()
  {
    int i = 0 + (4 + b.a.a.b.b.a.rV(1));
    int j = i + (4 + b.a.a.b.b.a.rV(2));
    return j + (4 + b.a.a.b.b.a.rV(3));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rv
 * JD-Core Version:    0.6.2
 */