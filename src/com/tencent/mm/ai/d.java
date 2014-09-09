package com.tencent.mm.ai;

public final class d extends com.tencent.mm.ao.a
{
  public String dRW;
  public String dRX;
  public String dRY;
  public String djA;
  public String djy;
  public long time;
  public String title;
  public int type;
  public String url;

  public static boolean a(b.a.a.a.a parama, d paramd, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramd.title = parama.ben();
      return true;
    case 2:
      paramd.url = parama.ben();
      return true;
    case 3:
      paramd.dRW = parama.ben();
      return true;
    case 4:
      paramd.dRX = parama.ben();
      return true;
    case 5:
      paramd.time = parama.ber();
      return true;
    case 6:
      paramd.djy = parama.ben();
      return true;
    case 7:
      paramd.dRY = parama.ben();
      return true;
    case 8:
      paramd.djA = parama.ben();
      return true;
    case 9:
    }
    paramd.type = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.title != null)
      parama.I(1, this.title);
    if (this.url != null)
      parama.I(2, this.url);
    if (this.dRW != null)
      parama.I(3, this.dRW);
    if (this.dRX != null)
      parama.I(4, this.dRX);
    parama.k(5, this.time);
    if (this.djy != null)
      parama.I(6, this.djy);
    if (this.dRY != null)
      parama.I(7, this.dRY);
    if (this.djA != null)
      parama.I(8, this.djA);
    parama.by(9, this.type);
  }

  public final int hD()
  {
    String str = this.title;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.title);
    if (this.url != null)
      i += b.a.a.b.b.a.J(2, this.url);
    if (this.dRW != null)
      i += b.a.a.b.b.a.J(3, this.dRW);
    if (this.dRX != null)
      i += b.a.a.b.b.a.J(4, this.dRX);
    int j = i + b.a.a.a.i(5, this.time);
    if (this.djy != null)
      j += b.a.a.b.b.a.J(6, this.djy);
    if (this.dRY != null)
      j += b.a.a.b.b.a.J(7, this.dRY);
    if (this.djA != null)
      j += b.a.a.b.b.a.J(8, this.djA);
    return j + b.a.a.a.br(9, this.type);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.d
 * JD-Core Version:    0.6.2
 */