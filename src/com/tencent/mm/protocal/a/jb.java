package com.tencent.mm.protocal.a;

public final class jb extends com.tencent.mm.ao.a
{
  private String cJE;
  private String desc;
  public boolean hXu = false;
  public boolean hXv = false;
  private String hZW;
  public boolean hZX = false;
  private int hZY;
  public boolean hZZ = false;
  public boolean hZs = false;
  private String title;

  public static boolean a(b.a.a.a.a parama, jb paramjb, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramjb.title = parama.ben();
      paramjb.hXu = true;
      return true;
    case 2:
      paramjb.desc = parama.ben();
      paramjb.hXv = true;
      return true;
    case 3:
      paramjb.hZW = parama.ben();
      paramjb.hZX = true;
      return true;
    case 4:
      paramjb.cJE = parama.ben();
      paramjb.hZs = true;
      return true;
    case 5:
    }
    paramjb.hZY = parama.bel();
    paramjb.hZZ = true;
    return true;
  }

  public final jb As(String paramString)
  {
    this.title = paramString;
    this.hXu = true;
    return this;
  }

  public final jb At(String paramString)
  {
    this.desc = paramString;
    this.hXv = true;
    return this;
  }

  public final jb Au(String paramString)
  {
    this.hZW = paramString;
    this.hZX = true;
    return this;
  }

  public final jb Av(String paramString)
  {
    this.cJE = paramString;
    this.hZs = true;
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.title != null)
      parama.I(1, this.title);
    if (this.desc != null)
      parama.I(2, this.desc);
    if (this.hZW != null)
      parama.I(3, this.hZW);
    if (this.cJE != null)
      parama.I(4, this.cJE);
    if (this.hZZ == true)
      parama.by(5, this.hZY);
  }

  public final String aLF()
  {
    return this.cJE;
  }

  public final String aLI()
  {
    return this.hZW;
  }

  public final int aLJ()
  {
    return this.hZY;
  }

  public final String getDesc()
  {
    return this.desc;
  }

  public final String getTitle()
  {
    return this.title;
  }

  public final int hD()
  {
    String str = this.title;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.title);
    if (this.desc != null)
      i += b.a.a.b.b.a.J(2, this.desc);
    if (this.hZW != null)
      i += b.a.a.b.b.a.J(3, this.hZW);
    if (this.cJE != null)
      i += b.a.a.b.b.a.J(4, this.cJE);
    if (this.hZZ == true)
      i += b.a.a.a.br(5, this.hZY);
    return i;
  }

  public final jb nH(int paramInt)
  {
    this.hZY = paramInt;
    this.hZZ = true;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.jb
 * JD-Core Version:    0.6.2
 */