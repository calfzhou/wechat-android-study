package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class yz extends vn
{
  public int hOi;
  public LinkedList hQA = new LinkedList();
  public int huF;
  public String isp;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isp != null)
      parama.I(2, this.isp);
    parama.by(3, this.hOi);
    parama.by(4, this.huF);
    parama.b(5, this.hQA);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isp != null)
      i += b.a.a.b.b.a.J(2, this.isp);
    return i + b.a.a.a.br(3, this.hOi) + b.a.a.a.br(4, this.huF) + b.a.a.a.a(5, this.hQA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.yz
 * JD-Core Version:    0.6.2
 */