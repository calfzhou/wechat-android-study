package com.tencent.mm.protocal.a;

import com.tencent.mm.ao.b;

public final class cn extends com.tencent.mm.ao.a
{
  public b hSy;
  public b hSz;
  public int port;
  public int type;

  public static boolean a(b.a.a.a.a parama, cn paramcn, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcn.type = parama.bel();
      return true;
    case 2:
      paramcn.port = parama.bel();
      return true;
    case 3:
      paramcn.hSy = parama.bes();
      return true;
    case 4:
    }
    paramcn.hSz = parama.bes();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.type);
    parama.by(2, this.port);
    if (this.hSy != null)
      parama.c(3, this.hSy);
    if (this.hSz != null)
      parama.c(4, this.hSz);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.type) + b.a.a.a.br(2, this.port);
    if (this.hSy != null)
      i += b.a.a.a.a(3, this.hSy);
    if (this.hSz != null)
      i += b.a.a.a.a(4, this.hSz);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cn
 * JD-Core Version:    0.6.2
 */