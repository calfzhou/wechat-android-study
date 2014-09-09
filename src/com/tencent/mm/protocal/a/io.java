package com.tencent.mm.protocal.a;

public final class io extends com.tencent.mm.ao.a
{
  private String cJE;
  private String desc;
  public boolean hXu = false;
  public boolean hXv = false;
  public boolean hZs = false;
  public boolean hZt = false;
  private String info;
  private String title;

  public static boolean a(b.a.a.a.a parama, io paramio, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramio.title = parama.ben();
      paramio.hXu = true;
      return true;
    case 2:
      paramio.desc = parama.ben();
      paramio.hXv = true;
      return true;
    case 3:
      paramio.cJE = parama.ben();
      paramio.hZs = true;
      return true;
    case 4:
    }
    paramio.info = parama.ben();
    paramio.hZt = true;
    return true;
  }

  public final io Ao(String paramString)
  {
    this.title = paramString;
    this.hXu = true;
    return this;
  }

  public final io Ap(String paramString)
  {
    this.desc = paramString;
    this.hXv = true;
    return this;
  }

  public final io Aq(String paramString)
  {
    this.cJE = paramString;
    this.hZs = true;
    return this;
  }

  public final io Ar(String paramString)
  {
    this.info = paramString;
    this.hZt = true;
    return this;
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
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.io
 * JD-Core Version:    0.6.2
 */