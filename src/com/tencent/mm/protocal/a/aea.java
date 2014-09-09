package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class aea extends vn
{
  public LinkedList hQc = new LinkedList();
  public String hSm;
  public String hSn;
  public String hSo;
  public String hSp;
  public String hSq;
  public int iwO;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hSm != null)
      parama.I(2, this.hSm);
    if (this.hSn != null)
      parama.I(3, this.hSn);
    if (this.hSo != null)
      parama.I(4, this.hSo);
    if (this.hSp != null)
      parama.I(5, this.hSp);
    if (this.hSq != null)
      parama.I(6, this.hSq);
    parama.by(7, this.iwO);
    parama.d(8, 8, this.hQc);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hSm != null)
      i += b.a.a.b.b.a.J(2, this.hSm);
    if (this.hSn != null)
      i += b.a.a.b.b.a.J(3, this.hSn);
    if (this.hSo != null)
      i += b.a.a.b.b.a.J(4, this.hSo);
    if (this.hSp != null)
      i += b.a.a.b.b.a.J(5, this.hSp);
    if (this.hSq != null)
      i += b.a.a.b.b.a.J(6, this.hSq);
    return i + b.a.a.a.br(7, this.iwO) + b.a.a.a.c(8, 8, this.hQc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aea
 * JD-Core Version:    0.6.2
 */