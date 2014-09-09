package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class pf extends com.tencent.mm.ao.a
{
  public ws hOU;
  public vt ifh;

  public static boolean a(b.a.a.a.a parama, pf parampf, int paramInt)
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
        ws localws = new ws();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = ws.a(locala2, localws, locala2.bet()));
        parampf.hOU = localws;
      }
      return true;
    case 2:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      vt localvt = new vt();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = vt.a(locala1, localvt, locala1.bet()));
      parampf.ifh = localvt;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hOU == null) || (this.ifh == null))
      throw new b("Not all required fields were included");
    if (this.hOU != null)
    {
      parama.bv(1, this.hOU.hD());
      this.hOU.a(parama);
    }
    if (this.ifh != null)
    {
      parama.bv(2, this.ifh.hD());
      this.ifh.a(parama);
    }
  }

  public final int hD()
  {
    ws localws = this.hOU;
    int i = 0;
    if (localws != null)
      i = 0 + b.a.a.a.bs(1, this.hOU.hD());
    if (this.ifh != null)
      i += b.a.a.a.bs(2, this.ifh.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pf
 * JD-Core Version:    0.6.2
 */