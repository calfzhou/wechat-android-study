package com.tencent.mm.protocal.a;

public final class ge extends com.tencent.mm.ao.a
{
  public String ID;
  public int hQk;
  public int hUu;
  public String hVM;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ID != null)
      parama.I(1, this.ID);
    parama.by(2, this.hUu);
    parama.by(3, this.hQk);
    if (this.hVM != null)
      parama.I(4, this.hVM);
  }

  public final int hD()
  {
    String str = this.ID;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ID);
    int j = i + b.a.a.a.br(2, this.hUu) + b.a.a.a.br(3, this.hQk);
    if (this.hVM != null)
      j += b.a.a.b.b.a.J(4, this.hVM);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ge
 * JD-Core Version:    0.6.2
 */