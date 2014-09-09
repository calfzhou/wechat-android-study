package com.tencent.mm.protocal.a;

public final class bw extends vn
{
  public int hQH;
  public int hQN;
  public String hQO;
  public String hQP;
  public String hQQ;
  public String hQR;
  public String hQS;
  public String hQT;
  public String hQU;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQH);
    parama.by(3, this.hQN);
    if (this.hQO != null)
      parama.I(4, this.hQO);
    if (this.hQP != null)
      parama.I(5, this.hQP);
    if (this.hQQ != null)
      parama.I(6, this.hQQ);
    if (this.hQR != null)
      parama.I(7, this.hQR);
    if (this.hQS != null)
      parama.I(8, this.hQS);
    if (this.hQT != null)
      parama.I(9, this.hQT);
    if (this.hQU != null)
      parama.I(10, this.hQU);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQH) + b.a.a.a.br(3, this.hQN);
    if (this.hQO != null)
      j += b.a.a.b.b.a.J(4, this.hQO);
    if (this.hQP != null)
      j += b.a.a.b.b.a.J(5, this.hQP);
    if (this.hQQ != null)
      j += b.a.a.b.b.a.J(6, this.hQQ);
    if (this.hQR != null)
      j += b.a.a.b.b.a.J(7, this.hQR);
    if (this.hQS != null)
      j += b.a.a.b.b.a.J(8, this.hQS);
    if (this.hQT != null)
      j += b.a.a.b.b.a.J(9, this.hQT);
    if (this.hQU != null)
      j += b.a.a.b.b.a.J(10, this.hQU);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.bw
 * JD-Core Version:    0.6.2
 */