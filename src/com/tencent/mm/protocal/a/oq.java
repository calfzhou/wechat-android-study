package com.tencent.mm.protocal.a;

public final class oq extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hQI;
  public int hQw;
  public String hwV;
  public String iaD;
  public String iey;
  public String iez;

  public static boolean a(b.a.a.a.a parama, oq paramoq, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramoq.hQI = parama.ben();
      return true;
    case 2:
      paramoq.gnq = parama.ben();
      return true;
    case 3:
      paramoq.iey = parama.ben();
      return true;
    case 4:
      paramoq.iez = parama.ben();
      return true;
    case 5:
      paramoq.hQw = parama.bel();
      return true;
    case 6:
      paramoq.hwV = parama.ben();
      return true;
    case 7:
    }
    paramoq.iaD = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQI != null)
      parama.I(1, this.hQI);
    if (this.gnq != null)
      parama.I(2, this.gnq);
    if (this.iey != null)
      parama.I(3, this.iey);
    if (this.iez != null)
      parama.I(4, this.iez);
    parama.by(5, this.hQw);
    if (this.hwV != null)
      parama.I(6, this.hwV);
    if (this.iaD != null)
      parama.I(7, this.iaD);
  }

  public final int hD()
  {
    String str = this.hQI;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hQI);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    if (this.iey != null)
      i += b.a.a.b.b.a.J(3, this.iey);
    if (this.iez != null)
      i += b.a.a.b.b.a.J(4, this.iez);
    int j = i + b.a.a.a.br(5, this.hQw);
    if (this.hwV != null)
      j += b.a.a.b.b.a.J(6, this.hwV);
    if (this.iaD != null)
      j += b.a.a.b.b.a.J(7, this.iaD);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.oq
 * JD-Core Version:    0.6.2
 */