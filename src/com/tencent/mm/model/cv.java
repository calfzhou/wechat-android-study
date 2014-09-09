package com.tencent.mm.model;

public final class cv extends com.tencent.mm.ao.a
{
  public String dmm;
  public long dmn;
  public int key;

  public static boolean a(b.a.a.a.a parama, cv paramcv, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcv.key = parama.bel();
      return true;
    case 2:
      paramcv.dmm = parama.ben();
      return true;
    case 3:
    }
    paramcv.dmn = parama.ber();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.key);
    if (this.dmm != null)
      parama.I(2, this.dmm);
    parama.k(3, this.dmn);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.key);
    if (this.dmm != null)
      i += b.a.a.b.b.a.J(2, this.dmm);
    return i + b.a.a.a.i(3, this.dmn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cv
 * JD-Core Version:    0.6.2
 */