package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class np extends vn
{
  public String hPf;
  public int idF;
  public int idG;
  public int idH;
  public int idK;
  public LinkedList idL = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.idF);
    parama.by(3, this.idG);
    parama.by(4, this.idH);
    if (this.hPf != null)
      parama.I(5, this.hPf);
    parama.by(6, this.idK);
    parama.d(7, 8, this.idL);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.idF) + b.a.a.a.br(3, this.idG) + b.a.a.a.br(4, this.idH);
    if (this.hPf != null)
      j += b.a.a.b.b.a.J(5, this.hPf);
    return j + b.a.a.a.br(6, this.idK) + b.a.a.a.c(7, 8, this.idL);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.np
 * JD-Core Version:    0.6.2
 */