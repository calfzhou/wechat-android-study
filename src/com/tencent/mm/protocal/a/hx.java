package com.tencent.mm.protocal.a;

public final class hx extends com.tencent.mm.ao.a
{
  private String cJE;
  private String desc;
  public boolean hXu = false;
  public boolean hXv = false;
  public boolean hZs = false;
  public boolean hZt = false;
  public boolean hZu = false;
  private String info;
  private String title;
  private int type;

  public static boolean a(b.a.a.a.a parama, hx paramhx, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhx.title = parama.ben();
      paramhx.hXu = true;
      return true;
    case 2:
      paramhx.desc = parama.ben();
      paramhx.hXv = true;
      return true;
    case 3:
      paramhx.cJE = parama.ben();
      paramhx.hZs = true;
      return true;
    case 4:
      paramhx.info = parama.ben();
      paramhx.hZt = true;
      return true;
    case 5:
    }
    paramhx.type = parama.bel();
    paramhx.hZu = true;
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.title != null)
      parama.I(1, this.title);
    if (this.desc != null)
      parama.I(2, this.desc);
    if (this.cJE != null)
      parama.I(3, this.cJE);
    if (this.info != null)
      parama.I(4, this.info);
    if (this.hZu == true)
      parama.by(5, this.type);
  }

  public final String aLF()
  {
    return this.cJE;
  }

  public final String getDesc()
  {
    return this.desc;
  }

  public final String getInfo()
  {
    return this.info;
  }

  public final String getTitle()
  {
    return this.title;
  }

  public final int getType()
  {
    return this.type;
  }

  public final int hD()
  {
    String str = this.title;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.title);
    if (this.desc != null)
      i += b.a.a.b.b.a.J(2, this.desc);
    if (this.cJE != null)
      i += b.a.a.b.b.a.J(3, this.cJE);
    if (this.info != null)
      i += b.a.a.b.b.a.J(4, this.info);
    if (this.hZu == true)
      i += b.a.a.a.br(5, this.type);
    return i;
  }

  public final hx nE(int paramInt)
  {
    this.type = paramInt;
    this.hZu = true;
    return this;
  }

  public final hx xk(String paramString)
  {
    this.title = paramString;
    this.hXu = true;
    return this;
  }

  public final hx xl(String paramString)
  {
    this.desc = paramString;
    this.hXv = true;
    return this;
  }

  public final hx xm(String paramString)
  {
    this.cJE = paramString;
    this.hZs = true;
    return this;
  }

  public final hx xn(String paramString)
  {
    this.info = paramString;
    this.hZt = true;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hx
 * JD-Core Version:    0.6.2
 */