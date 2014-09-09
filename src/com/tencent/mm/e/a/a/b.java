package com.tencent.mm.e.a.a;

public final class b extends com.tencent.mm.ao.a
{
  public String cDi;
  public int dJz;
  public String dbG;

  public static boolean a(b.a.a.a.a parama, b paramb, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramb.cDi = parama.ben();
      return true;
    case 2:
      paramb.dbG = parama.ben();
      return true;
    case 3:
    }
    paramb.dJz = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.cDi != null)
      parama.I(1, this.cDi);
    if (this.dbG != null)
      parama.I(2, this.dbG);
    parama.by(3, this.dJz);
  }

  public final int hD()
  {
    String str = this.cDi;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.cDi);
    if (this.dbG != null)
      i += b.a.a.b.b.a.J(2, this.dbG);
    return i + b.a.a.a.br(3, this.dJz);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.a.a.b
 * JD-Core Version:    0.6.2
 */