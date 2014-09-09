package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class fg extends com.tencent.mm.ao.a
{
  public vt hVj;

  public static boolean a(b.a.a.a.a parama, fg paramfg, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      vt localvt = new vt();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = vt.a(locala, localvt, locala.bet()));
      paramfg.hVj = localvt;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVj == null)
      throw new b("Not all required fields were included");
    if (this.hVj != null)
    {
      parama.bv(1, this.hVj.hD());
      this.hVj.a(parama);
    }
  }

  public final int hD()
  {
    vt localvt = this.hVj;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVj.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fg
 * JD-Core Version:    0.6.2
 */