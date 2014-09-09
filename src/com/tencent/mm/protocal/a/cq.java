package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class cq extends com.tencent.mm.ao.a
{
  public String cCD;
  public String hSF;
  public ct hSG;
  public cu hSH;
  public cp hSI;
  public String hwQ;

  public static boolean a(b.a.a.a.a parama, cq paramcq, int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcq.cCD = parama.ben();
      return true;
    case 2:
      paramcq.hwQ = parama.ben();
      return true;
    case 3:
      paramcq.hSF = parama.ben();
      return true;
    case 4:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int i1 = localLinkedList3.size();
      while (i < i1)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i);
        ct localct = new ct();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool2 = true; bool2; bool2 = ct.a(locala3, localct, locala3.bet()));
        paramcq.hSG = localct;
        i++;
      }
      return true;
    case 5:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        cu localcu = new cu();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (int n = 1; n != 0; n = 0)
          locala2.bet();
        paramcq.hSH = localcu;
      }
      return true;
    case 6:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int j = localLinkedList1.size();
    while (i < j)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(i);
      cp localcp = new cp();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = cp.a(locala1, localcp, locala1.bet()));
      paramcq.hSI = localcp;
      i++;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.cCD == null) || (this.hwQ == null) || (this.hSF == null) || (this.hSG == null) || (this.hSI == null))
      throw new b("Not all required fields were included");
    if (this.cCD != null)
      parama.I(1, this.cCD);
    if (this.hwQ != null)
      parama.I(2, this.hwQ);
    if (this.hSF != null)
      parama.I(3, this.hSF);
    if (this.hSG != null)
    {
      parama.bv(4, this.hSG.hD());
      this.hSG.a(parama);
    }
    if (this.hSH != null)
    {
      parama.bv(5, this.hSH.hD());
      this.hSH.a(parama);
    }
    if (this.hSI != null)
    {
      parama.bv(6, this.hSI.hD());
      this.hSI.a(parama);
    }
  }

  public final int hD()
  {
    String str = this.cCD;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.cCD);
    if (this.hwQ != null)
      i += b.a.a.b.b.a.J(2, this.hwQ);
    if (this.hSF != null)
      i += b.a.a.b.b.a.J(3, this.hSF);
    if (this.hSG != null)
      i += b.a.a.a.bs(4, this.hSG.hD());
    if (this.hSH != null)
      i += b.a.a.a.bs(5, this.hSH.hD());
    if (this.hSI != null)
      i += b.a.a.a.bs(6, this.hSI.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cq
 * JD-Core Version:    0.6.2
 */