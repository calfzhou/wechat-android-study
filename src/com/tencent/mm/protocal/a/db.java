package com.tencent.mm.protocal.a;

public final class db extends vn
{
  public String hTn;
  public String hTo;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hTn != null)
      parama.I(2, this.hTn);
    if (this.hTo != null)
      parama.I(3, this.hTo);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hTn != null)
      i += b.a.a.b.b.a.J(2, this.hTn);
    if (this.hTo != null)
      i += b.a.a.b.b.a.J(3, this.hTo);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.db
 * JD-Core Version:    0.6.2
 */