package com.tencent.mm.protocal.a;

public final class gl extends com.tencent.mm.ao.a
{
  public String fxH;
  public String hVX;
  public int hVY;
  public int hVZ;
  public String hWa;

  public static boolean a(b.a.a.a.a parama, gl paramgl, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgl.hVX = parama.ben();
      return true;
    case 2:
      paramgl.hVY = parama.bel();
      return true;
    case 3:
      paramgl.hVZ = parama.bel();
      return true;
    case 4:
      paramgl.fxH = parama.ben();
      return true;
    case 5:
    }
    paramgl.hWa = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVX != null)
      parama.I(1, this.hVX);
    parama.by(2, this.hVY);
    parama.by(3, this.hVZ);
    if (this.fxH != null)
      parama.I(4, this.fxH);
    if (this.hWa != null)
      parama.I(5, this.hWa);
  }

  public final int hD()
  {
    String str = this.hVX;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hVX);
    int j = i + b.a.a.a.br(2, this.hVY) + b.a.a.a.br(3, this.hVZ);
    if (this.fxH != null)
      j += b.a.a.b.b.a.J(4, this.fxH);
    if (this.hWa != null)
      j += b.a.a.b.b.a.J(5, this.hWa);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gl
 * JD-Core Version:    0.6.2
 */