package com.tencent.mm.protocal.a;

public final class zz extends com.tencent.mm.ao.a
{
  public int its;
  public int itt;

  public static boolean a(b.a.a.a.a parama, zz paramzz, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramzz.its = parama.bel();
      return true;
    case 2:
    }
    paramzz.itt = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.its);
    parama.by(2, this.itt);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.its) + b.a.a.a.br(2, this.itt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zz
 * JD-Core Version:    0.6.2
 */