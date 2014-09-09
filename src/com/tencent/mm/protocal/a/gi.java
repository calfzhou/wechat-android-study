package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class gi extends com.tencent.mm.ao.a
{
  public gp hVS;
  public gj hVT;

  public static boolean a(b.a.a.a.a parama, gi paramgi, int paramInt)
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
        gp localgp = new gp();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = gp.a(locala2, localgp, locala2.bet()));
        paramgi.hVS = localgp;
      }
      return true;
    case 2:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      gj localgj = new gj();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = gj.a(locala1, localgj, locala1.bet()));
      paramgi.hVT = localgj;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVS == null) || (this.hVT == null))
      throw new b("Not all required fields were included");
    if (this.hVS != null)
    {
      parama.bv(1, this.hVS.hD());
      this.hVS.a(parama);
    }
    if (this.hVT != null)
    {
      parama.bv(2, this.hVT.hD());
      this.hVT.a(parama);
    }
  }

  public final int hD()
  {
    gp localgp = this.hVS;
    int i = 0;
    if (localgp != null)
      i = 0 + b.a.a.a.bs(1, this.hVS.hD());
    if (this.hVT != null)
      i += b.a.a.a.bs(2, this.hVT.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gi
 * JD-Core Version:    0.6.2
 */