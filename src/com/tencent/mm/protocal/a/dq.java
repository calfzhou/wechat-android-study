package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class dq extends vn
{
  public LinkedList hTP = new LinkedList();
  public int huF;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.huF);
    parama.d(3, 8, this.hTP);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.huF) + b.a.a.a.c(3, 8, this.hTP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.dq
 * JD-Core Version:    0.6.2
 */