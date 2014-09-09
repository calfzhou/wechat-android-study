package com.tencent.mm.protocal.a;

public final class fl extends com.tencent.mm.ao.a
{
  public String hVn;
  public int hVo;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVn != null)
      parama.I(1, this.hVn);
    parama.by(2, this.hVo);
  }

  public final int hD()
  {
    String str = this.hVn;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hVn);
    return i + b.a.a.a.br(2, this.hVo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fl
 * JD-Core Version:    0.6.2
 */