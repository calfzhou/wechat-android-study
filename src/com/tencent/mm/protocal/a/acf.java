package com.tencent.mm.protocal.a;

public final class acf extends com.tencent.mm.ao.a
{
  public int ivO;
  public String ivP;
  public String ivQ;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ivO);
    if (this.ivP != null)
      parama.I(2, this.ivP);
    if (this.ivQ != null)
      parama.I(3, this.ivQ);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ivO);
    if (this.ivP != null)
      i += b.a.a.b.b.a.J(2, this.ivP);
    if (this.ivQ != null)
      i += b.a.a.b.b.a.J(3, this.ivQ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acf
 * JD-Core Version:    0.6.2
 */