package com.tencent.mm.protocal.a;

public final class hb extends com.tencent.mm.ao.a
{
  public int id;
  public int resourceId;
  public String value;

  public static boolean a(b.a.a.a.a parama, hb paramhb, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhb.id = parama.bel();
      return true;
    case 2:
      paramhb.value = parama.ben();
      return true;
    case 3:
    }
    paramhb.resourceId = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.id);
    if (this.value != null)
      parama.I(2, this.value);
    parama.by(3, this.resourceId);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.id);
    if (this.value != null)
      i += b.a.a.b.b.a.J(2, this.value);
    return i + b.a.a.a.br(3, this.resourceId);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hb
 * JD-Core Version:    0.6.2
 */