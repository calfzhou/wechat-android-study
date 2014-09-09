package com.tencent.mm.plugin.exdevice.c;

import java.util.LinkedList;

public final class k extends i
{
  public com.tencent.mm.ao.b dZx;
  public int ewb;

  public final k W(byte[] paramArrayOfByte)
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
          d locald = new d();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = d.a(locala2, locald, locala2.bet()));
          this.eJP = locald;
        }
        j = 1;
        continue;
        this.dZx = locala1.bes();
        j = 1;
        continue;
        this.ewb = locala1.bel();
        j = 1;
      }
    }
    if (this.dZx == null)
      throw new b.a.a.b("Not all required fields were included");
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.dZx == null)
      throw new b.a.a.b("Not all required fields were included");
    if (this.eJP != null)
    {
      parama.bv(1, this.eJP.hD());
      this.eJP.a(parama);
    }
    if (this.dZx != null)
      parama.c(2, this.dZx);
    parama.by(3, this.ewb);
  }

  public final int hD()
  {
    d locald = this.eJP;
    int i = 0;
    if (locald != null)
      i = 0 + b.a.a.a.bs(1, this.eJP.hD());
    if (this.dZx != null)
      i += b.a.a.a.a(2, this.dZx);
    return i + b.a.a.a.br(3, this.ewb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.k
 * JD-Core Version:    0.6.2
 */