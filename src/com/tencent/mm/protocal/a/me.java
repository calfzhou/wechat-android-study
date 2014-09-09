package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class me extends vn
{
  public String hVM;
  public int hWX;
  public int icJ;
  public LinkedList icK = new LinkedList();
  public int icL;
  public LinkedList icM = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hWX);
    if (this.hVM != null)
      parama.I(3, this.hVM);
    parama.by(4, this.icJ);
    parama.d(5, 8, this.icK);
    parama.by(6, this.icL);
    parama.d(7, 8, this.icM);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hWX);
    if (this.hVM != null)
      j += b.a.a.b.b.a.J(3, this.hVM);
    return j + b.a.a.a.br(4, this.icJ) + b.a.a.a.c(5, 8, this.icK) + b.a.a.a.br(6, this.icL) + b.a.a.a.c(7, 8, this.icM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.me
 * JD-Core Version:    0.6.2
 */