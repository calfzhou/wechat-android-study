package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class cw extends com.tencent.mm.ao.a
{
  public int ewb;
  public cr hSR;
  public cq hSS;
  public long hST;
  public cv hSU;

  public static boolean a(b.a.a.a.a parama, cw paramcw, int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcw.ewb = parama.bel();
      return true;
    case 2:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int i1 = localLinkedList3.size();
      while (i < i1)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i);
        cr localcr = new cr();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool2 = true; bool2; bool2 = cr.a(locala3, localcr, locala3.bet()));
        paramcw.hSR = localcr;
        i++;
      }
      return true;
    case 3:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int n = localLinkedList2.size();
      while (i < n)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i);
        cq localcq = new cq();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool1 = true; bool1; bool1 = cq.a(locala2, localcq, locala2.bet()));
        paramcw.hSS = localcq;
        i++;
      }
      return true;
    case 4:
      paramcw.hST = parama.ber();
      return true;
    case 5:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int j = localLinkedList1.size();
    for (int k = 0; k < j; k++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(k);
      cv localcv = new cv();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (int m = 1; m != 0; m = 0)
        locala1.bet();
      paramcw.hSU = localcv;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ewb);
    if (this.hSR != null)
    {
      parama.bv(2, this.hSR.hD());
      this.hSR.a(parama);
    }
    if (this.hSS != null)
    {
      parama.bv(3, this.hSS.hD());
      this.hSS.a(parama);
    }
    parama.k(4, this.hST);
    if (this.hSU != null)
    {
      parama.bv(5, this.hSU.hD());
      this.hSU.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ewb);
    if (this.hSR != null)
      i += b.a.a.a.bs(2, this.hSR.hD());
    if (this.hSS != null)
      i += b.a.a.a.bs(3, this.hSS.hD());
    int j = i + b.a.a.a.i(4, this.hST);
    if (this.hSU != null)
      j += b.a.a.a.bs(5, this.hSU.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cw
 * JD-Core Version:    0.6.2
 */