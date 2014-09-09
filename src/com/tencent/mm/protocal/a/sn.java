package com.tencent.mm.protocal.a;

public final class sn extends com.tencent.mm.ao.a
{
  public int imu;
  public int imv;

  public static boolean a(b.a.a.a.a parama, sn paramsn, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramsn.imu = parama.bel();
      return true;
    case 2:
    }
    paramsn.imv = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.imu);
    parama.by(2, this.imv);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.imu) + b.a.a.a.br(2, this.imv);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sn
 * JD-Core Version:    0.6.2
 */