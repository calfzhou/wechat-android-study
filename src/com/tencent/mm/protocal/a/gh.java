package com.tencent.mm.protocal.a;

public final class gh extends com.tencent.mm.ao.a
{
  public long hOY;
  public int hQk;
  public int hQw;
  public int hUu;
  public String hVM;
  public int hVR;

  public static boolean a(b.a.a.a.a parama, gh paramgh, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgh.hQw = parama.bel();
      return true;
    case 2:
      paramgh.hUu = parama.bel();
      return true;
    case 3:
      paramgh.hQk = parama.bel();
      return true;
    case 4:
      paramgh.hVM = parama.ben();
      return true;
    case 5:
      paramgh.hVR = parama.bel();
      return true;
    case 6:
    }
    paramgh.hOY = parama.ber();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hQw);
    parama.by(2, this.hUu);
    parama.by(3, this.hQk);
    if (this.hVM != null)
      parama.I(4, this.hVM);
    parama.by(5, this.hVR);
    parama.k(6, this.hOY);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hQw) + b.a.a.a.br(2, this.hUu) + b.a.a.a.br(3, this.hQk);
    if (this.hVM != null)
      i += b.a.a.b.b.a.J(4, this.hVM);
    return i + b.a.a.a.br(5, this.hVR) + b.a.a.a.i(6, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gh
 * JD-Core Version:    0.6.2
 */