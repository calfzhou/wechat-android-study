package com.tencent.mm.protocal.a;

public final class ws extends com.tencent.mm.ao.a
{
  private int iri;
  private boolean irj;
  private com.tencent.mm.ao.b irk;
  private boolean irl;

  public static boolean a(b.a.a.a.a parama, ws paramws, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramws.nI(parama.bek());
      return true;
    case 2:
    }
    paramws.a(parama.bes());
    return true;
  }

  private ws aLN()
  {
    if (!this.irj)
      throw new b.a.a.b("Not all required fields were included (false = not included in message),  iLen:" + this.irj);
    return this;
  }

  private ws nI(int paramInt)
  {
    this.iri = paramInt;
    this.irj = true;
    return this;
  }

  public final ws a(com.tencent.mm.ao.b paramb)
  {
    if (paramb == null)
      cl(null);
    this.irk = paramb;
    this.irl = true;
    nI(this.irk.size());
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.bx(1, this.iri);
    if (this.irl)
      parama.c(2, this.irk);
  }

  public final int aLK()
  {
    return this.iri;
  }

  public final com.tencent.mm.ao.b aLL()
  {
    return this.irk;
  }

  public final byte[] aLM()
  {
    return this.irk.getBytes();
  }

  public final ws cl(byte[] paramArrayOfByte)
  {
    com.tencent.mm.ao.b localb = com.tencent.mm.ao.b.aO(paramArrayOfByte);
    a(localb);
    nI(localb.size());
    return this;
  }

  public final ws cm(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); ; i = locala.bet())
    {
      if (i <= 0)
        return aLN();
      if (!a(locala, this, i))
        locala.beu();
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.iri);
    if (this.irl)
      i += b.a.a.a.a(2, this.irk);
    return i + 0;
  }

  public final ws o(byte[] paramArrayOfByte, int paramInt)
  {
    com.tencent.mm.ao.b localb = com.tencent.mm.ao.b.c(paramArrayOfByte, 0, paramInt);
    a(localb);
    nI(localb.size());
    return this;
  }

  public final byte[] toByteArray()
  {
    aLN();
    return super.toByteArray();
  }

  public final String toString()
  {
    String str = new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString() + "iLen = " + this.iri + "   ";
    if (this.irl)
      str = str + "Buffer = " + this.irk + "   ";
    return str + ")";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ws
 * JD-Core Version:    0.6.2
 */