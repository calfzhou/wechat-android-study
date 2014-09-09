package com.tencent.mm.protocal.a;

public final class xe extends vn
{
  public String irv;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.irv != null)
      parama.I(2, this.irv);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.irv != null)
      i += b.a.a.b.b.a.J(2, this.irv);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xe
 * JD-Core Version:    0.6.2
 */