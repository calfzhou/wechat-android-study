package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class hu extends com.tencent.mm.ao.a
{
  public String appId;
  public hy cMK;
  public String desc;
  public String diG;
  public String hZi;
  public String hZl;
  public LinkedList hZm = new LinkedList();
  public String title;
  public int type;

  public final void a(b.a.a.c.a parama)
  {
    if (this.title != null)
      parama.I(1, this.title);
    if (this.desc != null)
      parama.I(2, this.desc);
    if (this.diG != null)
      parama.I(3, this.diG);
    if (this.hZl != null)
      parama.I(4, this.hZl);
    if (this.appId != null)
      parama.I(5, this.appId);
    if (this.hZi != null)
      parama.I(6, this.hZi);
    parama.d(7, 1, this.hZm);
    parama.by(8, this.type);
    if (this.cMK != null)
    {
      parama.bv(9, this.cMK.hD());
      this.cMK.a(parama);
    }
  }

  public final int hD()
  {
    String str = this.title;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.title);
    if (this.desc != null)
      i += b.a.a.b.b.a.J(2, this.desc);
    if (this.diG != null)
      i += b.a.a.b.b.a.J(3, this.diG);
    if (this.hZl != null)
      i += b.a.a.b.b.a.J(4, this.hZl);
    if (this.appId != null)
      i += b.a.a.b.b.a.J(5, this.appId);
    if (this.hZi != null)
      i += b.a.a.b.b.a.J(6, this.hZi);
    int j = i + b.a.a.a.c(7, 1, this.hZm) + b.a.a.a.br(8, this.type);
    if (this.cMK != null)
      j += b.a.a.a.bs(9, this.cMK.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hu
 * JD-Core Version:    0.6.2
 */