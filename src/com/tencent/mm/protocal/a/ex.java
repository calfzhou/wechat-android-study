package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ex extends com.tencent.mm.ao.a
{
  public vt hVf;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVf == null)
      throw new b("Not all required fields were included");
    if (this.hVf != null)
    {
      parama.bv(1, this.hVf.hD());
      this.hVf.a(parama);
    }
  }

  public final ex bi(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      switch (i)
      {
      default:
      case 1:
      }
      for (int m = 0; ; m = 1)
      {
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList = locala1.rN(i);
        int j = localLinkedList.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(k);
          vt localvt = new vt();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = vt.a(locala2, localvt, locala2.bet()));
          this.hVf = localvt;
        }
      }
    }
    if (this.hVf == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    vt localvt = this.hVf;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVf.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ex
 * JD-Core Version:    0.6.2
 */