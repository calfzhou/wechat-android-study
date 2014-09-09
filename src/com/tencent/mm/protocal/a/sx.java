package com.tencent.mm.protocal.a;

import com.tencent.mm.ao.b;

public final class sx extends com.tencent.mm.ao.a
{
  public String hTy;
  public String hTz;
  public int imG;
  public int imH;
  public b imI;
  public String imJ;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.imG);
    parama.by(2, this.imH);
    if (this.imI != null)
      parama.c(3, this.imI);
    if (this.imJ != null)
      parama.I(4, this.imJ);
    if (this.hTy != null)
      parama.I(5, this.hTy);
    if (this.hTz != null)
      parama.I(6, this.hTz);
  }

  public final sx cb(byte[] paramArrayOfByte)
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
      }
      while (true)
      {
        if (j == 0)
          locala.beu();
        i = locala.bet();
        break;
        this.imG = locala.bel();
        j = 1;
        continue;
        this.imH = locala.bel();
        j = 1;
        continue;
        this.imI = locala.bes();
        j = 1;
        continue;
        this.imJ = locala.ben();
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
    int i = 0 + b.a.a.a.br(1, this.imG) + b.a.a.a.br(2, this.imH);
    if (this.imI != null)
      i += b.a.a.a.a(3, this.imI);
    if (this.imJ != null)
      i += b.a.a.b.b.a.J(4, this.imJ);
    if (this.hTy != null)
      i += b.a.a.b.b.a.J(5, this.hTy);
    if (this.hTz != null)
      i += b.a.a.b.b.a.J(6, this.hTz);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sx
 * JD-Core Version:    0.6.2
 */