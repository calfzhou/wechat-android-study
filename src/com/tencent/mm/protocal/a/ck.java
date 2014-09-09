package com.tencent.mm.protocal.a;

public final class ck extends vn
{
  public int count;
  public String fUT;
  public String fUU;
  public String hSm;
  public String hSn;
  public String hSo;
  public String hSp;
  public String hSq;
  public int hSr;
  public String hSs;
  public int type;
  public String value;

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
    parama.by(7, this.hSr);
    if (this.hSs != null)
      parama.I(8, this.hSs);
    if (this.fUU != null)
      parama.I(9, this.fUU);
    if (this.fUT != null)
      parama.I(10, this.fUT);
    parama.by(11, this.type);
    if (this.value != null)
      parama.I(12, this.value);
    parama.by(13, this.count);
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
    int j = i + b.a.a.a.br(7, this.hSr);
    if (this.hSs != null)
      j += b.a.a.b.b.a.J(8, this.hSs);
    if (this.fUU != null)
      j += b.a.a.b.b.a.J(9, this.fUU);
    if (this.fUT != null)
      j += b.a.a.b.b.a.J(10, this.fUT);
    int k = j + b.a.a.a.br(11, this.type);
    if (this.value != null)
      k += b.a.a.b.b.a.J(12, this.value);
    return k + b.a.a.a.br(13, this.count);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ck
 * JD-Core Version:    0.6.2
 */