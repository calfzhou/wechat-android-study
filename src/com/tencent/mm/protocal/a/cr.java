package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class cr extends com.tencent.mm.ao.a
{
  public ct hSG;
  public xl hSJ;
  public String hwV;

  public static boolean a(b.a.a.a.a parama, cr paramcr, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcr.hwV = parama.ben();
      return true;
    case 2:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        ct localct = new ct();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = ct.a(locala2, localct, locala2.bet()));
        paramcr.hSG = localct;
      }
      return true;
    case 3:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      xl localxl = new xl();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = xl.a(locala1, localxl, locala1.bet()));
      paramcr.hSJ = localxl;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hwV == null) || (this.hSJ == null))
      throw new b("Not all required fields were included");
    if (this.hwV != null)
      parama.I(1, this.hwV);
    if (this.hSG != null)
    {
      parama.bv(2, this.hSG.hD());
      this.hSG.a(parama);
    }
    if (this.hSJ != null)
    {
      parama.bv(3, this.hSJ.hD());
      this.hSJ.a(parama);
    }
  }

  public final int hD()
  {
    String str = this.hwV;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hwV);
    if (this.hSG != null)
      i += b.a.a.a.bs(2, this.hSG.hD());
    if (this.hSJ != null)
      i += b.a.a.a.bs(3, this.hSJ.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cr
 * JD-Core Version:    0.6.2
 */