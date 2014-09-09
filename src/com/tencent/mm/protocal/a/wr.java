package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class wr extends com.tencent.mm.ao.a
{
  public vt hVf;
  public vt ifj;

  public static boolean a(b.a.a.a.a parama, wr paramwr, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        vt localvt2 = new vt();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = vt.a(locala2, localvt2, locala2.bet()));
        paramwr.hVf = localvt2;
      }
      return true;
    case 2:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      vt localvt1 = new vt();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = vt.a(locala1, localvt1, locala1.bet()));
      paramwr.ifj = localvt1;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVf == null) || (this.ifj == null))
      throw new b("Not all required fields were included");
    if (this.hVf != null)
    {
      parama.bv(1, this.hVf.hD());
      this.hVf.a(parama);
    }
    if (this.ifj != null)
    {
      parama.bv(2, this.ifj.hD());
      this.ifj.a(parama);
    }
  }

  public final int hD()
  {
    vt localvt = this.hVf;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVf.hD());
    if (this.ifj != null)
      i += b.a.a.a.bs(2, this.ifj.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wr
 * JD-Core Version:    0.6.2
 */