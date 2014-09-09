package com.tencent.mm.protocal.a;

public final class sd extends com.tencent.mm.ao.a
{
  public String Ks;
  public String Kt;
  public int dtf;
  public String dtg;
  public String dtm;
  public int ewb;
  public String gnq;
  public String hTy;
  public String hTz;
  public int ilV;
  public int ilW;

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    parama.by(2, this.ewb);
    parama.by(3, this.dtf);
    if (this.Kt != null)
      parama.I(4, this.Kt);
    if (this.Ks != null)
      parama.I(5, this.Ks);
    if (this.dtg != null)
      parama.I(6, this.dtg);
    parama.by(7, this.ilV);
    parama.by(8, this.ilW);
    if (this.dtm != null)
      parama.I(9, this.dtm);
    if (this.hTy != null)
      parama.I(10, this.hTy);
    if (this.hTz != null)
      parama.I(11, this.hTz);
  }

  public final sd bW(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      default:
        j = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      }
      while (true)
      {
        if (j == 0)
          locala.beu();
        i = locala.bet();
        break;
        this.gnq = locala.ben();
        j = 1;
        continue;
        this.ewb = locala.bel();
        j = 1;
        continue;
        this.dtf = locala.bel();
        j = 1;
        continue;
        this.Kt = locala.ben();
        j = 1;
        continue;
        this.Ks = locala.ben();
        j = 1;
        continue;
        this.dtg = locala.ben();
        j = 1;
        continue;
        this.ilV = locala.bel();
        j = 1;
        continue;
        this.ilW = locala.bel();
        j = 1;
        continue;
        this.dtm = locala.ben();
        j = 1;
        continue;
        this.hTy = locala.ben();
        j = 1;
        continue;
        this.hTz = locala.ben();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    int j = i + b.a.a.a.br(2, this.ewb) + b.a.a.a.br(3, this.dtf);
    if (this.Kt != null)
      j += b.a.a.b.b.a.J(4, this.Kt);
    if (this.Ks != null)
      j += b.a.a.b.b.a.J(5, this.Ks);
    if (this.dtg != null)
      j += b.a.a.b.b.a.J(6, this.dtg);
    int k = j + b.a.a.a.br(7, this.ilV) + b.a.a.a.br(8, this.ilW);
    if (this.dtm != null)
      k += b.a.a.b.b.a.J(9, this.dtm);
    if (this.hTy != null)
      k += b.a.a.b.b.a.J(10, this.hTy);
    if (this.hTz != null)
      k += b.a.a.b.b.a.J(11, this.hTz);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sd
 * JD-Core Version:    0.6.2
 */