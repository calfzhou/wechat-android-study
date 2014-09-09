package com.tencent.mm.protocal.a;

public final class aek extends vn
{
  public int hQF;
  public vt hRC;
  public ws hRD;
  public String hRw;
  public vt ien;
  public vt jdField_int;
  public int irX;
  public String ixh;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQF);
    if (this.ixh != null)
      parama.I(3, this.ixh);
    if (this.hRw != null)
      parama.I(4, this.hRw);
    if (this.ien != null)
    {
      parama.bv(5, this.ien.hD());
      this.ien.a(parama);
    }
    if (this.jdField_int != null)
    {
      parama.bv(6, this.jdField_int.hD());
      this.jdField_int.a(parama);
    }
    if (this.hRC != null)
    {
      parama.bv(7, this.hRC.hD());
      this.hRC.a(parama);
    }
    if (this.hRD != null)
    {
      parama.bv(8, this.hRD.hD());
      this.hRD.a(parama);
    }
    parama.by(9, this.irX);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQF);
    if (this.ixh != null)
      j += b.a.a.b.b.a.J(3, this.ixh);
    if (this.hRw != null)
      j += b.a.a.b.b.a.J(4, this.hRw);
    if (this.ien != null)
      j += b.a.a.a.bs(5, this.ien.hD());
    if (this.jdField_int != null)
      j += b.a.a.a.bs(6, this.jdField_int.hD());
    if (this.hRC != null)
      j += b.a.a.a.bs(7, this.hRC.hD());
    if (this.hRD != null)
      j += b.a.a.a.bs(8, this.hRD.hD());
    return j + b.a.a.a.br(9, this.irX);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aek
 * JD-Core Version:    0.6.2
 */