package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class wt extends com.tencent.mm.ao.a
{
  private int irm;
  private boolean irn;

  protected static boolean a(b.a.a.a.a parama, wt paramwt, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    }
    paramwt.nL(parama.bek());
    return true;
  }

  private wt aLP()
  {
    if (!this.irn)
      throw new b("Not all required fields were included (false = not included in message),  uiVal:" + this.irn);
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.bx(1, this.irm);
  }

  public final int aLO()
  {
    return this.irm;
  }

  public final int hD()
  {
    return 0 + (0 + b.a.a.a.br(1, this.irm));
  }

  public final wt nL(int paramInt)
  {
    this.irm = paramInt;
    this.irn = true;
    return this;
  }

  public final byte[] toByteArray()
  {
    aLP();
    return super.toByteArray();
  }

  public final String toString()
  {
    return new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString())).append("uiVal = ").append(this.irm).append("   ").toString() + ")";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wt
 * JD-Core Version:    0.6.2
 */