package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class mn extends vo
{
  public String hOh;
  public int hQF;
  public String icG;
  public int icV;
  public LinkedList icW = new LinkedList();
  public int icX;
  public String icY;
  public ws icz;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hRz == null) || (this.icz == null))
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    parama.by(2, this.icV);
    parama.d(3, 8, this.icW);
    parama.by(4, this.hQF);
    parama.by(5, this.icX);
    if (this.icz != null)
    {
      parama.bv(6, this.icz.hD());
      this.icz.a(parama);
    }
    if (this.hOh != null)
      parama.I(7, this.hOh);
    if (this.icG != null)
      parama.I(8, this.icG);
    if (this.icY != null)
      parama.I(9, this.icY);
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    int j = i + b.a.a.a.br(2, this.icV) + b.a.a.a.c(3, 8, this.icW) + b.a.a.a.br(4, this.hQF) + b.a.a.a.br(5, this.icX);
    if (this.icz != null)
      j += b.a.a.a.bs(6, this.icz.hD());
    if (this.hOh != null)
      j += b.a.a.b.b.a.J(7, this.hOh);
    if (this.icG != null)
      j += b.a.a.b.b.a.J(8, this.icG);
    if (this.icY != null)
      j += b.a.a.b.b.a.J(9, this.icY);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.mn
 * JD-Core Version:    0.6.2
 */