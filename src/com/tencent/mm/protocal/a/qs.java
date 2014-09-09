package com.tencent.mm.protocal.a;

public final class qs extends com.tencent.mm.ao.a
{
  public String hQO;
  public String hQP;
  public String hQQ;

  public static boolean a(b.a.a.a.a parama, qs paramqs, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqs.hQP = parama.ben();
      return true;
    case 2:
      paramqs.hQO = parama.ben();
      return true;
    case 3:
    }
    paramqs.hQQ = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQP != null)
      parama.I(1, this.hQP);
    if (this.hQO != null)
      parama.I(2, this.hQO);
    if (this.hQQ != null)
      parama.I(3, this.hQQ);
  }

  public final int hD()
  {
    String str = this.hQP;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hQP);
    if (this.hQO != null)
      i += b.a.a.b.b.a.J(2, this.hQO);
    if (this.hQQ != null)
      i += b.a.a.b.b.a.J(3, this.hQQ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qs
 * JD-Core Version:    0.6.2
 */