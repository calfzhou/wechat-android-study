package com.tencent.mm.protocal.a;

public final class zp extends com.tencent.mm.ao.a
{
  public long isT;

  public static boolean a(b.a.a.a.a parama, zp paramzp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    }
    paramzp.isT = parama.ber();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.k(1, this.isT);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.i(1, this.isT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zp
 * JD-Core Version:    0.6.2
 */