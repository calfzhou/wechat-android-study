package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class gg extends com.tencent.mm.ao.a
{
  public int ewb;
  public String hOW;
  public String hPs;
  public int hQk;
  public int hUu;
  public String hVM;
  public ws hVN;
  public String hVO;
  public String hVP;
  public String hVQ;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVN == null)
      throw new b("Not all required fields were included");
    if (this.hVM != null)
      parama.I(1, this.hVM);
    parama.by(2, this.hUu);
    parama.by(3, this.hQk);
    if (this.hVN != null)
    {
      parama.bv(4, this.hVN.hD());
      this.hVN.a(parama);
    }
    parama.by(5, this.ewb);
    if (this.hPs != null)
      parama.I(6, this.hPs);
    if (this.hVO != null)
      parama.I(7, this.hVO);
    if (this.hVP != null)
      parama.I(8, this.hVP);
    if (this.hVQ != null)
      parama.I(9, this.hVQ);
    if (this.hOW != null)
      parama.I(10, this.hOW);
  }

  public final int hD()
  {
    String str = this.hVM;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hVM);
    int j = i + b.a.a.a.br(2, this.hUu) + b.a.a.a.br(3, this.hQk);
    if (this.hVN != null)
      j += b.a.a.a.bs(4, this.hVN.hD());
    int k = j + b.a.a.a.br(5, this.ewb);
    if (this.hPs != null)
      k += b.a.a.b.b.a.J(6, this.hPs);
    if (this.hVO != null)
      k += b.a.a.b.b.a.J(7, this.hVO);
    if (this.hVP != null)
      k += b.a.a.b.b.a.J(8, this.hVP);
    if (this.hVQ != null)
      k += b.a.a.b.b.a.J(9, this.hVQ);
    if (this.hOW != null)
      k += b.a.a.b.b.a.J(10, this.hOW);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gg
 * JD-Core Version:    0.6.2
 */