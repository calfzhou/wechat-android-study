package com.tencent.mm.protocal.a;

public final class vj extends com.tencent.mm.ao.a
{
  public String iqh;
  public String iqi;

  public static boolean a(b.a.a.a.a parama, vj paramvj, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramvj.iqh = parama.ben();
      return true;
    case 2:
    }
    paramvj.iqi = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.iqh != null)
      parama.I(1, this.iqh);
    if (this.iqi != null)
      parama.I(2, this.iqi);
  }

  public final int hD()
  {
    String str = this.iqh;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.iqh);
    if (this.iqi != null)
      i += b.a.a.b.b.a.J(2, this.iqi);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vj
 * JD-Core Version:    0.6.2
 */