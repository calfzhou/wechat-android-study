package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class aeh extends com.tencent.mm.ao.a
{
  public String hwQ;
  public int ixd;
  public ws ixe;
  public ws ixf;

  public static boolean a(b.a.a.a.a parama, aeh paramaeh, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaeh.ixd = parama.bel();
      return true;
    case 2:
      paramaeh.hwQ = parama.ben();
      return true;
    case 3:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        ws localws2 = new ws();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = ws.a(locala2, localws2, locala2.bet()));
        paramaeh.ixe = localws2;
      }
      return true;
    case 4:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      ws localws1 = new ws();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = ws.a(locala1, localws1, locala1.bet()));
      paramaeh.ixf = localws1;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.ixe == null) || (this.ixf == null))
      throw new b("Not all required fields were included");
    parama.by(1, this.ixd);
    if (this.hwQ != null)
      parama.I(2, this.hwQ);
    if (this.ixe != null)
    {
      parama.bv(3, this.ixe.hD());
      this.ixe.a(parama);
    }
    if (this.ixf != null)
    {
      parama.bv(4, this.ixf.hD());
      this.ixf.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ixd);
    if (this.hwQ != null)
      i += b.a.a.b.b.a.J(2, this.hwQ);
    if (this.ixe != null)
      i += b.a.a.a.bs(3, this.ixe.hD());
    if (this.ixf != null)
      i += b.a.a.a.bs(4, this.ixf.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aeh
 * JD-Core Version:    0.6.2
 */