package com.tencent.mm.b;

import b.a.a.b;

public final class c extends com.tencent.mm.ao.a
{
  private boolean cFA;
  private boolean cFB;
  private boolean cFC;
  private String cFl;
  private boolean cFm;
  private int cFn;
  private boolean cFo;
  private String cFp;
  private boolean cFq;
  private int cFr;
  private boolean cFs;
  private String cFt;
  private boolean cFu;
  private String cFv;
  private boolean cFw;
  private boolean cFx;
  private boolean cFy;
  private int cFz;

  public static c h(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala.bet();
    c localc = new c();
    if (i <= 0)
      return localc.hG();
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
    }
    while (true)
    {
      if (j == 0)
        locala.beu();
      i = locala.bet();
      break;
      localc.al(locala.ben());
      j = 1;
      continue;
      localc.cFn = locala.bek();
      localc.cFo = true;
      j = 1;
      continue;
      localc.cFp = locala.ben();
      localc.cFq = true;
      j = 1;
      continue;
      localc.cFr = locala.bek();
      localc.cFs = true;
      j = 1;
      continue;
      localc.cFt = locala.ben();
      localc.cFu = true;
      j = 1;
      continue;
      localc.cFv = locala.ben();
      localc.cFw = true;
      j = 1;
      continue;
      localc.cFx = locala.beo();
      localc.cFy = true;
      j = 1;
      continue;
      localc.cFz = locala.bek();
      localc.cFA = true;
      j = 1;
      continue;
      localc.cFB = locala.beo();
      localc.cFC = true;
      j = 1;
    }
  }

  private c hG()
  {
    if (!this.cFm)
      throw new b("Not all required fields were included (false = not included in message),  apkMd5:" + this.cFm);
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.I(1, this.cFl);
    if (this.cFo)
      parama.bx(2, this.cFn);
    if (this.cFq)
      parama.I(3, this.cFp);
    if (this.cFs)
      parama.bx(4, this.cFr);
    if (this.cFu)
      parama.I(5, this.cFt);
    if (this.cFw)
      parama.I(6, this.cFv);
    if (this.cFy)
      parama.D(7, this.cFx);
    if (this.cFA)
      parama.bx(8, this.cFz);
    if (this.cFC)
      parama.D(9, this.cFB);
  }

  public final c al(String paramString)
  {
    this.cFl = paramString;
    this.cFm = true;
    return this;
  }

  public final int hA()
  {
    return this.cFz;
  }

  public final boolean hB()
  {
    return this.cFA;
  }

  public final boolean hC()
  {
    return this.cFB;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.b.b.a.J(1, this.cFl);
    if (this.cFo)
      i += b.a.a.a.br(2, this.cFn);
    if (this.cFq)
      i += b.a.a.b.b.a.J(3, this.cFp);
    if (this.cFs)
      i += b.a.a.a.br(4, this.cFr);
    if (this.cFu)
      i += b.a.a.b.b.a.J(5, this.cFt);
    if (this.cFw)
      i += b.a.a.b.b.a.J(6, this.cFv);
    if (this.cFy)
      i += 1 + b.a.a.b.b.a.rV(7);
    if (this.cFA)
      i += b.a.a.a.br(8, this.cFz);
    if (this.cFC)
      i += 1 + b.a.a.b.b.a.rV(9);
    return i + 0;
  }

  public final boolean hF()
  {
    return this.cFC;
  }

  public final String hn()
  {
    return this.cFl;
  }

  public final int ho()
  {
    return this.cFn;
  }

  public final boolean hp()
  {
    return this.cFo;
  }

  public final String hq()
  {
    return this.cFp;
  }

  public final boolean hr()
  {
    return this.cFq;
  }

  public final int hs()
  {
    return this.cFr;
  }

  public final boolean ht()
  {
    return this.cFs;
  }

  public final String hu()
  {
    return this.cFt;
  }

  public final boolean hv()
  {
    return this.cFu;
  }

  public final String hw()
  {
    return this.cFv;
  }

  public final boolean hx()
  {
    return this.cFw;
  }

  public final boolean hy()
  {
    return this.cFx;
  }

  public final boolean hz()
  {
    return this.cFy;
  }

  public final byte[] toByteArray()
  {
    hG();
    return super.toByteArray();
  }

  public final String toString()
  {
    String str = new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString() + "apkMd5 = " + this.cFl + "   ";
    if (this.cFo)
      str = str + "channelId = " + this.cFn + "   ";
    if (this.cFq)
      str = str + "profileDeviceType = " + this.cFp + "   ";
    if (this.cFs)
      str = str + "updateMode = " + this.cFr + "   ";
    if (this.cFu)
      str = str + "buildVersion = " + this.cFt + "   ";
    if (this.cFw)
      str = str + "marketUrl = " + this.cFv + "   ";
    if (this.cFy)
      str = str + "gprsAlert = " + this.cFx + "   ";
    if (this.cFA)
      str = str + "autoAddAccount = " + this.cFz + "   ";
    if (this.cFC)
      str = str + "nokiaAol = " + this.cFB + "   ";
    return str + ")";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.c
 * JD-Core Version:    0.6.2
 */