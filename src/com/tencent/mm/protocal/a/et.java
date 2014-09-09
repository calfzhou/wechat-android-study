package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class et extends vn
{
  public String KH;
  public String KV;
  public String KY;
  public qj hVa;
  public LinkedList hVb = new LinkedList();
  public String hVc;
  public String hVd;
  public int huF;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVa == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.KH != null)
      parama.I(2, this.KH);
    if (this.KV != null)
      parama.I(3, this.KV);
    if (this.KY != null)
      parama.I(4, this.KY);
    if (this.hVa != null)
    {
      parama.bv(5, this.hVa.hD());
      this.hVa.a(parama);
    }
    parama.by(6, this.huF);
    parama.d(7, 8, this.hVb);
    if (this.hVc != null)
      parama.I(8, this.hVc);
    if (this.hVd != null)
      parama.I(9, this.hVd);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.KH != null)
      i += b.a.a.b.b.a.J(2, this.KH);
    if (this.KV != null)
      i += b.a.a.b.b.a.J(3, this.KV);
    if (this.KY != null)
      i += b.a.a.b.b.a.J(4, this.KY);
    if (this.hVa != null)
      i += b.a.a.a.bs(5, this.hVa.hD());
    int j = i + b.a.a.a.br(6, this.huF) + b.a.a.a.c(7, 8, this.hVb);
    if (this.hVc != null)
      j += b.a.a.b.b.a.J(8, this.hVc);
    if (this.hVd != null)
      j += b.a.a.b.b.a.J(9, this.hVd);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.et
 * JD-Core Version:    0.6.2
 */