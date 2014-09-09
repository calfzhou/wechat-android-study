package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class hf extends vn
{
  public LinkedList dJw = new LinkedList();
  public int hOi;
  public String hWS;
  public int hWT;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hWS == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hWS != null)
      parama.I(2, this.hWS);
    parama.by(3, this.hWT);
    parama.d(4, 8, this.dJw);
    parama.by(5, this.hOi);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hWS != null)
      i += b.a.a.b.b.a.J(2, this.hWS);
    return i + b.a.a.a.br(3, this.hWT) + b.a.a.a.c(4, 8, this.dJw) + b.a.a.a.br(5, this.hOi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hf
 * JD-Core Version:    0.6.2
 */