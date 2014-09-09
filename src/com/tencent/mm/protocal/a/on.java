package com.tencent.mm.protocal.a;

public final class on extends com.tencent.mm.ao.a
{
  public String cCD;
  public String fxH;
  public String hwQ;
  public String iet;
  public String ieu;

  public static boolean a(b.a.a.a.a parama, on paramon, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramon.iet = parama.ben();
      return true;
    case 2:
      paramon.fxH = parama.ben();
      return true;
    case 3:
      paramon.cCD = parama.ben();
      return true;
    case 4:
      paramon.hwQ = parama.ben();
      return true;
    case 5:
    }
    paramon.ieu = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.iet != null)
      parama.I(1, this.iet);
    if (this.fxH != null)
      parama.I(2, this.fxH);
    if (this.cCD != null)
      parama.I(3, this.cCD);
    if (this.hwQ != null)
      parama.I(4, this.hwQ);
    if (this.ieu != null)
      parama.I(5, this.ieu);
  }

  public final on bP(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    String str = this.iet;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.iet);
    if (this.fxH != null)
      i += b.a.a.b.b.a.J(2, this.fxH);
    if (this.cCD != null)
      i += b.a.a.b.b.a.J(3, this.cCD);
    if (this.hwQ != null)
      i += b.a.a.b.b.a.J(4, this.hwQ);
    if (this.ieu != null)
      i += b.a.a.b.b.a.J(5, this.ieu);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.on
 * JD-Core Version:    0.6.2
 */