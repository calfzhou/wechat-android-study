package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ek extends com.tencent.mm.ao.a
{
  public String hUy;
  public LinkedList hUz = new LinkedList();

  public static boolean a(b.a.a.a.a parama, ek paramek, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramek.hUy = parama.ben();
      return true;
    case 2:
    }
    paramek.hUz.add(Integer.valueOf(parama.bel()));
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hUy != null)
      parama.I(1, this.hUy);
    parama.d(2, 2, this.hUz);
  }

  public final int hD()
  {
    String str = this.hUy;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hUy);
    return i + b.a.a.a.c(2, 2, this.hUz);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ek
 * JD-Core Version:    0.6.2
 */