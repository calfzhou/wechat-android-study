package com.tencent.mm.protocal.a;

public class adz extends com.tencent.mm.ao.a
{
  public int hUh;
  public int hUm;
  public int hUn;
  public int iwM;
  public String iwN;

  public static boolean a(b.a.a.a.a parama, adz paramadz, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramadz.hUh = parama.bel();
      return true;
    case 2:
      paramadz.iwM = parama.bel();
      return true;
    case 3:
      paramadz.iwN = parama.ben();
      return true;
    case 4:
      paramadz.hUm = parama.bel();
      return true;
    case 5:
    }
    paramadz.hUn = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hUh);
    parama.by(2, this.iwM);
    if (this.iwN != null)
      parama.I(3, this.iwN);
    parama.by(4, this.hUm);
    parama.by(5, this.hUn);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hUh) + b.a.a.a.br(2, this.iwM);
    if (this.iwN != null)
      i += b.a.a.b.b.a.J(3, this.iwN);
    return i + b.a.a.a.br(4, this.hUm) + b.a.a.a.br(5, this.hUn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adz
 * JD-Core Version:    0.6.2
 */