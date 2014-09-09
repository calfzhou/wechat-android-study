package com.tencent.mm.protocal.a;

public final class wu extends com.tencent.mm.ao.a
{
  public String KH;
  public int hOV;
  public String hVl;
  public String ieD;

  public static boolean a(b.a.a.a.a parama, wu paramwu, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramwu.KH = parama.ben();
      return true;
    case 2:
      paramwu.hVl = parama.ben();
      return true;
    case 3:
      paramwu.ieD = parama.ben();
      return true;
    case 4:
    }
    paramwu.hOV = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.KH != null)
      parama.I(1, this.KH);
    if (this.hVl != null)
      parama.I(2, this.hVl);
    if (this.ieD != null)
      parama.I(3, this.ieD);
    parama.by(4, this.hOV);
  }

  public final int hD()
  {
    String str = this.KH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.KH);
    if (this.hVl != null)
      i += b.a.a.b.b.a.J(2, this.hVl);
    if (this.ieD != null)
      i += b.a.a.b.b.a.J(3, this.ieD);
    return i + b.a.a.a.br(4, this.hOV);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wu
 * JD-Core Version:    0.6.2
 */