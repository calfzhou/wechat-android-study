package com.tencent.mm.protocal.a;

public final class vk extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hXj;
  public String iaD;

  public static boolean a(b.a.a.a.a parama, vk paramvk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramvk.gnq = parama.ben();
      return true;
    case 2:
      paramvk.iaD = parama.ben();
      return true;
    case 3:
    }
    paramvk.hXj = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.iaD != null)
      parama.I(2, this.iaD);
    if (this.hXj != null)
      parama.I(3, this.hXj);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.iaD != null)
      i += b.a.a.b.b.a.J(2, this.iaD);
    if (this.hXj != null)
      i += b.a.a.b.b.a.J(3, this.hXj);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vk
 * JD-Core Version:    0.6.2
 */