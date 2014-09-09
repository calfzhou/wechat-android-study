package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class td extends vn
{
  public String dtg;
  public String eJu;
  public String eJv;
  public String eJw;
  public String hQZ;
  public vt hRC;
  public ws hRD;
  public ws hRd;
  public String hRg;
  public String hRw;
  public String hSm;
  public String hSn;
  public String hVJ;
  public vt hVf;
  public int iah;
  public String iat;
  public String ieD;
  public vt iem;
  public vt ien;
  public String inA;
  public String inB;
  public String inC;
  public ws inD;
  public int inE;
  public String inF;
  public ws inG;
  public ws inH;
  public vt jdField_int;
  public int inu;
  public String inv;
  public String inw;
  public String inx;
  public String iny;
  public int inz;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVf == null) || (this.iem == null) || (this.ien == null) || (this.jdField_int == null) || (this.hRd == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hVf != null)
    {
      parama.bv(2, this.hVf.hD());
      this.hVf.a(parama);
    }
    if (this.iem != null)
    {
      parama.bv(3, this.iem.hD());
      this.iem.a(parama);
    }
    if (this.ien != null)
    {
      parama.bv(4, this.ien.hD());
      this.ien.a(parama);
    }
    if (this.jdField_int != null)
    {
      parama.bv(5, this.jdField_int.hD());
      this.jdField_int.a(parama);
    }
    if (this.hRw != null)
      parama.I(6, this.hRw);
    parama.by(7, this.inu);
    if (this.inv != null)
      parama.I(8, this.inv);
    if (this.inw != null)
      parama.I(9, this.inw);
    if (this.eJu != null)
      parama.I(10, this.eJu);
    if (this.eJv != null)
      parama.I(11, this.eJv);
    if (this.inx != null)
      parama.I(12, this.inx);
    parama.by(13, this.iah);
    if (this.iny != null)
      parama.I(14, this.iny);
    if (this.hRC != null)
    {
      parama.bv(15, this.hRC.hD());
      this.hRC.a(parama);
    }
    if (this.hRD != null)
    {
      parama.bv(16, this.hRD.hD());
      this.hRD.a(parama);
    }
    parama.by(17, this.inz);
    if (this.hSn != null)
      parama.I(18, this.hSn);
    if (this.hSm != null)
      parama.I(19, this.hSm);
    if (this.inA != null)
      parama.I(20, this.inA);
    if (this.ieD != null)
      parama.I(21, this.ieD);
    if (this.inB != null)
      parama.I(22, this.inB);
    if (this.hQZ != null)
      parama.I(23, this.hQZ);
    if (this.hVJ != null)
      parama.I(24, this.hVJ);
    if (this.dtg != null)
      parama.I(25, this.dtg);
    if (this.hRd != null)
    {
      parama.bv(26, this.hRd.hD());
      this.hRd.a(parama);
    }
    if (this.inC != null)
      parama.I(27, this.inC);
    if (this.eJw != null)
      parama.I(28, this.eJw);
    if (this.inD != null)
    {
      parama.bv(29, this.inD.hD());
      this.inD.a(parama);
    }
    parama.by(30, this.inE);
    if (this.hRg != null)
      parama.I(31, this.hRg);
    if (this.iat != null)
      parama.I(32, this.iat);
    if (this.inF != null)
      parama.I(33, this.inF);
    if (this.inG != null)
    {
      parama.bv(34, this.inG.hD());
      this.inG.a(parama);
    }
    if (this.inH != null)
    {
      parama.bv(35, this.inH.hD());
      this.inH.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVf != null)
      i += b.a.a.a.bs(2, this.hVf.hD());
    if (this.iem != null)
      i += b.a.a.a.bs(3, this.iem.hD());
    if (this.ien != null)
      i += b.a.a.a.bs(4, this.ien.hD());
    if (this.jdField_int != null)
      i += b.a.a.a.bs(5, this.jdField_int.hD());
    if (this.hRw != null)
      i += b.a.a.b.b.a.J(6, this.hRw);
    int j = i + b.a.a.a.br(7, this.inu);
    if (this.inv != null)
      j += b.a.a.b.b.a.J(8, this.inv);
    if (this.inw != null)
      j += b.a.a.b.b.a.J(9, this.inw);
    if (this.eJu != null)
      j += b.a.a.b.b.a.J(10, this.eJu);
    if (this.eJv != null)
      j += b.a.a.b.b.a.J(11, this.eJv);
    if (this.inx != null)
      j += b.a.a.b.b.a.J(12, this.inx);
    int k = j + b.a.a.a.br(13, this.iah);
    if (this.iny != null)
      k += b.a.a.b.b.a.J(14, this.iny);
    if (this.hRC != null)
      k += b.a.a.a.bs(15, this.hRC.hD());
    if (this.hRD != null)
      k += b.a.a.a.bs(16, this.hRD.hD());
    int m = k + b.a.a.a.br(17, this.inz);
    if (this.hSn != null)
      m += b.a.a.b.b.a.J(18, this.hSn);
    if (this.hSm != null)
      m += b.a.a.b.b.a.J(19, this.hSm);
    if (this.inA != null)
      m += b.a.a.b.b.a.J(20, this.inA);
    if (this.ieD != null)
      m += b.a.a.b.b.a.J(21, this.ieD);
    if (this.inB != null)
      m += b.a.a.b.b.a.J(22, this.inB);
    if (this.hQZ != null)
      m += b.a.a.b.b.a.J(23, this.hQZ);
    if (this.hVJ != null)
      m += b.a.a.b.b.a.J(24, this.hVJ);
    if (this.dtg != null)
      m += b.a.a.b.b.a.J(25, this.dtg);
    if (this.hRd != null)
      m += b.a.a.a.bs(26, this.hRd.hD());
    if (this.inC != null)
      m += b.a.a.b.b.a.J(27, this.inC);
    if (this.eJw != null)
      m += b.a.a.b.b.a.J(28, this.eJw);
    if (this.inD != null)
      m += b.a.a.a.bs(29, this.inD.hD());
    int n = m + b.a.a.a.br(30, this.inE);
    if (this.hRg != null)
      n += b.a.a.b.b.a.J(31, this.hRg);
    if (this.iat != null)
      n += b.a.a.b.b.a.J(32, this.iat);
    if (this.inF != null)
      n += b.a.a.b.b.a.J(33, this.inF);
    if (this.inG != null)
      n += b.a.a.a.bs(34, this.inG.hD());
    if (this.inH != null)
      n += b.a.a.a.bs(35, this.inH.hD());
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.td
 * JD-Core Version:    0.6.2
 */