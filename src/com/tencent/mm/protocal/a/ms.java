package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ms extends vn
{
  public String hTI;
  public String ida;
  public int idb;
  public LinkedList idc = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ida != null)
      parama.I(2, this.ida);
    parama.by(3, this.idb);
    parama.d(4, 8, this.idc);
    if (this.hTI != null)
      parama.I(5, this.hTI);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ida != null)
      i += b.a.a.b.b.a.J(2, this.ida);
    int j = i + b.a.a.a.br(3, this.idb) + b.a.a.a.c(4, 8, this.idc);
    if (this.hTI != null)
      j += b.a.a.b.b.a.J(5, this.hTI);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ms
 * JD-Core Version:    0.6.2
 */