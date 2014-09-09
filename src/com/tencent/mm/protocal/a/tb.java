package com.tencent.mm.protocal.a;

public final class tb extends com.tencent.mm.ao.a
{
  public String hOd;
  public int hQj;
  public String hQq;
  public int idq;
  public int imY;
  public String imZ;
  public float ina;
  public String inb;
  public String inc;
  public String ind;
  public String ine;
  public String ing;
  public String inh;
  public String ini;
  public String inj;
  public String ink;
  public String inl;
  public int inm;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.imY);
    parama.by(2, this.hQj);
    if (this.imZ != null)
      parama.I(3, this.imZ);
    parama.c(4, this.ina);
    if (this.inb != null)
      parama.I(5, this.inb);
    if (this.inc != null)
      parama.I(6, this.inc);
    if (this.ind != null)
      parama.I(7, this.ind);
    if (this.ine != null)
      parama.I(8, this.ine);
    if (this.ing != null)
      parama.I(9, this.ing);
    if (this.inh != null)
      parama.I(10, this.inh);
    if (this.ini != null)
      parama.I(11, this.ini);
    if (this.inj != null)
      parama.I(12, this.inj);
    if (this.ink != null)
      parama.I(13, this.ink);
    if (this.inl != null)
      parama.I(15, this.inl);
    if (this.hOd != null)
      parama.I(16, this.hOd);
    parama.by(17, this.inm);
    parama.by(18, this.idq);
    if (this.hQq != null)
      parama.I(19, this.hQq);
  }

  public final tb cd(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      case 14:
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
      case 12:
      case 13:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      }
      while (true)
      {
        if (j == 0)
          locala.beu();
        i = locala.bet();
        break;
        this.imY = locala.bel();
        j = 1;
        continue;
        this.hQj = locala.bel();
        j = 1;
        continue;
        this.imZ = locala.ben();
        j = 1;
        continue;
        this.ina = locala.beq();
        j = 1;
        continue;
        this.inb = locala.ben();
        j = 1;
        continue;
        this.inc = locala.ben();
        j = 1;
        continue;
        this.ind = locala.ben();
        j = 1;
        continue;
        this.ine = locala.ben();
        j = 1;
        continue;
        this.ing = locala.ben();
        j = 1;
        continue;
        this.inh = locala.ben();
        j = 1;
        continue;
        this.ini = locala.ben();
        j = 1;
        continue;
        this.inj = locala.ben();
        j = 1;
        continue;
        this.ink = locala.ben();
        j = 1;
        continue;
        this.inl = locala.ben();
        j = 1;
        continue;
        this.hOd = locala.ben();
        j = 1;
        continue;
        this.inm = locala.bel();
        j = 1;
        continue;
        this.idq = locala.bel();
        j = 1;
        continue;
        this.hQq = locala.ben();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.imY) + b.a.a.a.br(2, this.hQj);
    if (this.imZ != null)
      i += b.a.a.b.b.a.J(3, this.imZ);
    int j = i + (4 + b.a.a.b.b.a.rV(4));
    if (this.inb != null)
      j += b.a.a.b.b.a.J(5, this.inb);
    if (this.inc != null)
      j += b.a.a.b.b.a.J(6, this.inc);
    if (this.ind != null)
      j += b.a.a.b.b.a.J(7, this.ind);
    if (this.ine != null)
      j += b.a.a.b.b.a.J(8, this.ine);
    if (this.ing != null)
      j += b.a.a.b.b.a.J(9, this.ing);
    if (this.inh != null)
      j += b.a.a.b.b.a.J(10, this.inh);
    if (this.ini != null)
      j += b.a.a.b.b.a.J(11, this.ini);
    if (this.inj != null)
      j += b.a.a.b.b.a.J(12, this.inj);
    if (this.ink != null)
      j += b.a.a.b.b.a.J(13, this.ink);
    if (this.inl != null)
      j += b.a.a.b.b.a.J(15, this.inl);
    if (this.hOd != null)
      j += b.a.a.b.b.a.J(16, this.hOd);
    int k = j + b.a.a.a.br(17, this.inm) + b.a.a.a.br(18, this.idq);
    if (this.hQq != null)
      k += b.a.a.b.b.a.J(19, this.hQq);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tb
 * JD-Core Version:    0.6.2
 */