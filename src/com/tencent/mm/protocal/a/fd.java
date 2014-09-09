package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class fd extends com.tencent.mm.ao.a
{
  public long hOY;
  public vt hVf;
  public int hVi;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVf == null)
      throw new b("Not all required fields were included");
    if (this.hVf != null)
    {
      parama.bv(1, this.hVf.hD());
      this.hVf.a(parama);
    }
    parama.by(2, this.hVi);
    parama.k(3, this.hOY);
  }

  public final fd bk(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      default:
        j = 0;
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList = locala1.rN(i);
        int k = localLinkedList.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(m);
          vt localvt = new vt();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = vt.a(locala2, localvt, locala2.bet()));
          this.hVf = localvt;
        }
        j = 1;
        continue;
        this.hVi = locala1.bel();
        j = 1;
        continue;
        this.hOY = locala1.ber();
        j = 1;
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
    return i + b.a.a.a.br(2, this.hVi) + b.a.a.a.i(3, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fd
 * JD-Core Version:    0.6.2
 */