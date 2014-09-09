package com.tencent.mm.ai;

import java.util.LinkedList;

public final class c extends com.tencent.mm.ao.a
{
  public String cNM;
  public String cNN;
  public LinkedList dRV = new LinkedList();
  public LinkedList dRn = null;
  public String ddY;
  public String name;
  public int type;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.type);
    if (this.name != null)
      parama.I(2, this.name);
    if (this.cNM != null)
      parama.I(3, this.cNM);
    if (this.cNN != null)
      parama.I(4, this.cNN);
    if (this.ddY != null)
      parama.I(5, this.ddY);
    parama.d(6, 8, this.dRV);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.type);
    if (this.name != null)
      i += b.a.a.b.b.a.J(2, this.name);
    if (this.cNM != null)
      i += b.a.a.b.b.a.J(3, this.cNM);
    if (this.cNN != null)
      i += b.a.a.b.b.a.J(4, this.cNN);
    if (this.ddY != null)
      i += b.a.a.b.b.a.J(5, this.ddY);
    return i + b.a.a.a.c(6, 8, this.dRV);
  }

  public final c m(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int m;
      switch (i)
      {
      default:
        m = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
      while (true)
      {
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        this.type = locala1.bel();
        m = 1;
        continue;
        this.name = locala1.ben();
        m = 1;
        continue;
        this.cNM = locala1.ben();
        m = 1;
        continue;
        this.cNN = locala1.ben();
        m = 1;
        continue;
        this.ddY = locala1.ben();
        m = 1;
        continue;
        LinkedList localLinkedList = locala1.rN(i);
        int j = localLinkedList.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(k);
          d locald = new d();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = d.a(locala2, locald, locala2.bet()));
          this.dRV.add(locald);
        }
        m = 1;
      }
    }
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.c
 * JD-Core Version:    0.6.2
 */