package com.tencent.mm.plugin.exdevice.c;

import java.util.LinkedList;

public final class a extends i
{
  public com.tencent.mm.ao.b eJp;
  public int eJq;
  public int eJr;
  public int eJs;
  public com.tencent.mm.ao.b eJt;
  public String eJu;
  public String eJv;
  public String eJw;

  public final a U(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      case 7:
      case 8:
      case 9:
      default:
        j = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 10:
      case 11:
      case 12:
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
        this.eJp = locala1.bes();
        j = 1;
        continue;
        this.eJq = locala1.bel();
        j = 1;
        continue;
        this.eJr = locala1.bel();
        j = 1;
        continue;
        this.eJs = locala1.bel();
        j = 1;
        continue;
        this.eJt = locala1.bes();
        j = 1;
        continue;
        this.eJu = locala1.ben();
        j = 1;
        continue;
        this.eJv = locala1.ben();
        j = 1;
        continue;
        this.eJw = locala1.ben();
        j = 1;
      }
    }
    if ((this.eJp == null) || (this.eJt == null))
      throw new b.a.a.b("Not all required fields were included");
    return this;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.eJp == null) || (this.eJt == null))
      throw new b.a.a.b("Not all required fields were included");
    if (this.eJP != null)
    {
      parama.bv(1, this.eJP.hD());
      this.eJP.a(parama);
    }
    if (this.eJp != null)
      parama.c(2, this.eJp);
    parama.by(3, this.eJq);
    parama.by(4, this.eJr);
    parama.by(5, this.eJs);
    if (this.eJt != null)
      parama.c(6, this.eJt);
    if (this.eJu != null)
      parama.I(10, this.eJu);
    if (this.eJv != null)
      parama.I(11, this.eJv);
    if (this.eJw != null)
      parama.I(12, this.eJw);
  }

  public final int hD()
  {
    d locald = this.eJP;
    int i = 0;
    if (locald != null)
      i = 0 + b.a.a.a.bs(1, this.eJP.hD());
    if (this.eJp != null)
      i += b.a.a.a.a(2, this.eJp);
    int j = i + b.a.a.a.br(3, this.eJq) + b.a.a.a.br(4, this.eJr) + b.a.a.a.br(5, this.eJs);
    if (this.eJt != null)
      j += b.a.a.a.a(6, this.eJt);
    if (this.eJu != null)
      j += b.a.a.b.b.a.J(10, this.eJu);
    if (this.eJv != null)
      j += b.a.a.b.b.a.J(11, this.eJv);
    if (this.eJw != null)
      j += b.a.a.b.b.a.J(12, this.eJw);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.a
 * JD-Core Version:    0.6.2
 */