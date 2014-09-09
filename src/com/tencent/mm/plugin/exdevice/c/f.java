package com.tencent.mm.plugin.exdevice.c;

import com.tencent.mm.ao.b;
import java.util.LinkedList;

public final class f extends i
{
  public b eJB;
  public b eJC;

  public final f V(byte[] paramArrayOfByte)
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
        this.eJB = locala1.bes();
        j = 1;
        continue;
        this.eJC = locala1.bes();
        j = 1;
      }
    }
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.eJP != null)
    {
      parama.bv(1, this.eJP.hD());
      this.eJP.a(parama);
    }
    if (this.eJB != null)
      parama.c(2, this.eJB);
    if (this.eJC != null)
      parama.c(3, this.eJC);
  }

  public final int hD()
  {
    d locald = this.eJP;
    int i = 0;
    if (locald != null)
      i = 0 + b.a.a.a.bs(1, this.eJP.hD());
    if (this.eJB != null)
      i += b.a.a.a.a(2, this.eJB);
    if (this.eJC != null)
      i += b.a.a.a.a(3, this.eJC);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.f
 * JD-Core Version:    0.6.2
 */