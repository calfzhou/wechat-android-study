package com.tencent.mm.protocal.a;

public final class vt extends com.tencent.mm.ao.a
{
  private String hRK;
  private boolean hRL;

  public static boolean a(b.a.a.a.a parama, vt paramvt, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    }
    paramvt.wF(parama.ben());
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRL)
      parama.I(1, this.hRK);
  }

  public final String getString()
  {
    return this.hRK;
  }

  public final int hD()
  {
    boolean bool = this.hRL;
    int i = 0;
    if (bool)
      i = 0 + b.a.a.b.b.a.J(1, this.hRK);
    return i + 0;
  }

  public final byte[] toByteArray()
  {
    return super.toByteArray();
  }

  public final String toString()
  {
    return this.hRK;
  }

  public final vt wF(String paramString)
  {
    this.hRK = paramString;
    this.hRL = true;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vt
 * JD-Core Version:    0.6.2
 */