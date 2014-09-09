package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class adj extends vn
{
  public String gnq;
  public int hQH;
  public String hQV;
  public LinkedList igy = new LinkedList();
  public int iwm;
  public int iwn;
  public LinkedList iwo = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.gnq != null)
      parama.I(2, this.gnq);
    parama.by(3, this.hQH);
    if (this.hQV != null)
      parama.I(4, this.hQV);
    parama.by(5, this.iwm);
    parama.d(6, 8, this.igy);
    parama.by(7, this.iwn);
    parama.d(8, 8, this.iwo);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    int j = i + b.a.a.a.br(3, this.hQH);
    if (this.hQV != null)
      j += b.a.a.b.b.a.J(4, this.hQV);
    return j + b.a.a.a.br(5, this.iwm) + b.a.a.a.c(6, 8, this.igy) + b.a.a.a.br(7, this.iwn) + b.a.a.a.c(8, 8, this.iwo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adj
 * JD-Core Version:    0.6.2
 */