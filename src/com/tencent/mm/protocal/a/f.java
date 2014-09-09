package com.tencent.mm.protocal.a;

public final class f extends com.tencent.mm.ao.a
{
  public String hOd;
  public String hOe;
  public String hOf;
  public String hOg;

  public static boolean a(b.a.a.a.a parama, f paramf, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramf.hOd = parama.ben();
      return true;
    case 2:
      paramf.hOe = parama.ben();
      return true;
    case 3:
      paramf.hOf = parama.ben();
      return true;
    case 4:
    }
    paramf.hOg = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOd != null)
      parama.I(1, this.hOd);
    if (this.hOe != null)
      parama.I(2, this.hOe);
    if (this.hOf != null)
      parama.I(3, this.hOf);
    if (this.hOg != null)
      parama.I(4, this.hOg);
  }

  public final int hD()
  {
    String str = this.hOd;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hOd);
    if (this.hOe != null)
      i += b.a.a.b.b.a.J(2, this.hOe);
    if (this.hOf != null)
      i += b.a.a.b.b.a.J(3, this.hOf);
    if (this.hOg != null)
      i += b.a.a.b.b.a.J(4, this.hOg);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.f
 * JD-Core Version:    0.6.2
 */