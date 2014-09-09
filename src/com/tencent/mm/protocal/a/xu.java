package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class xu extends vn
{
  public int irJ;
  public LinkedList irK = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.irJ);
    parama.b(3, this.irK);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.irJ) + b.a.a.a.a(3, this.irK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xu
 * JD-Core Version:    0.6.2
 */