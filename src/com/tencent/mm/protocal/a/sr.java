package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class sr extends com.tencent.mm.ao.a
{
  public oy hQL;
  public oz hQM;
  public int imB;

  public static boolean a(b.a.a.a.a parama, sr paramsr, int paramInt)
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
        oy localoy = new oy();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = oy.a(locala2, localoy, locala2.bet()));
        paramsr.hQL = localoy;
      }
      return true;
    case 2:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        oz localoz = new oz();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = oz.a(locala1, localoz, locala1.bet()));
        paramsr.hQM = localoz;
      }
      return true;
    case 3:
    }
    paramsr.imB = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hQL == null) || (this.hQM == null))
      throw new b("Not all required fields were included");
    if (this.hQL != null)
    {
      parama.bv(1, this.hQL.hD());
      this.hQL.a(parama);
    }
    if (this.hQM != null)
    {
      parama.bv(2, this.hQM.hD());
      this.hQM.a(parama);
    }
    parama.by(3, this.imB);
  }

  public final int hD()
  {
    oy localoy = this.hQL;
    int i = 0;
    if (localoy != null)
      i = 0 + b.a.a.a.bs(1, this.hQL.hD());
    if (this.hQM != null)
      i += b.a.a.a.bs(2, this.hQM.hD());
    return i + b.a.a.a.br(3, this.imB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sr
 * JD-Core Version:    0.6.2
 */