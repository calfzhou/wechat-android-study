package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class bb extends com.tencent.mm.ao.a
{
  public int hQw;
  public vt hQx;

  public static boolean a(b.a.a.a.a parama, bb parambb, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parambb.hQw = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      vt localvt = new vt();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = vt.a(locala, localvt, locala.bet()));
      parambb.hQx = localvt;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQx == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.hQw);
    if (this.hQx != null)
    {
      parama.bv(2, this.hQx.hD());
      this.hQx.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hQw);
    if (this.hQx != null)
      i += b.a.a.a.bs(2, this.hQx.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.bb
 * JD-Core Version:    0.6.2
 */