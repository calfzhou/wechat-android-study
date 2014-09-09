package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class fp extends com.tencent.mm.ao.a
{
  public int hVr;
  public fq hVs;
  public int hVt;
  public fq hVu;

  public static boolean a(b.a.a.a.a parama, fp paramfp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramfp.hVr = parama.bel();
      return true;
    case 2:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        fq localfq2 = new fq();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = fq.a(locala2, localfq2, locala2.bet()));
        paramfp.hVs = localfq2;
      }
      return true;
    case 3:
      paramfp.hVt = parama.bel();
      return true;
    case 4:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      fq localfq1 = new fq();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = fq.a(locala1, localfq1, locala1.bet()));
      paramfp.hVu = localfq1;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVs == null) || (this.hVu == null))
      throw new b("Not all required fields were included");
    parama.by(1, this.hVr);
    if (this.hVs != null)
    {
      parama.bv(2, this.hVs.hD());
      this.hVs.a(parama);
    }
    parama.by(3, this.hVt);
    if (this.hVu != null)
    {
      parama.bv(4, this.hVu.hD());
      this.hVu.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hVr);
    if (this.hVs != null)
      i += b.a.a.a.bs(2, this.hVs.hD());
    int j = i + b.a.a.a.br(3, this.hVt);
    if (this.hVu != null)
      j += b.a.a.a.bs(4, this.hVu.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fp
 * JD-Core Version:    0.6.2
 */