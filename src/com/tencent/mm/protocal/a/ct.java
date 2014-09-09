package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ct extends com.tencent.mm.ao.a
{
  public String fxH;
  public String hSP;
  public String hSQ;

  public static boolean a(b.a.a.a.a parama, ct paramct, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramct.fxH = parama.ben();
      return true;
    case 2:
      paramct.hSP = parama.ben();
      return true;
    case 3:
    }
    paramct.hSQ = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.fxH == null)
      throw new b("Not all required fields were included");
    if (this.fxH != null)
      parama.I(1, this.fxH);
    if (this.hSP != null)
      parama.I(2, this.hSP);
    if (this.hSQ != null)
      parama.I(3, this.hSQ);
  }

  public final int hD()
  {
    String str = this.fxH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.fxH);
    if (this.hSP != null)
      i += b.a.a.b.b.a.J(2, this.hSP);
    if (this.hSQ != null)
      i += b.a.a.b.b.a.J(3, this.hSQ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ct
 * JD-Core Version:    0.6.2
 */