package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class jf extends com.tencent.mm.ao.a
{
  public String hOr;
  public String hOs;
  public String hOx;
  public agb hOy;
  public String hsT;
  public String iaf;

  public static boolean a(b.a.a.a.a parama, jf paramjf, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramjf.hsT = parama.ben();
      return true;
    case 2:
      paramjf.iaf = parama.ben();
      return true;
    case 3:
      paramjf.hOs = parama.ben();
      return true;
    case 4:
      paramjf.hOr = parama.ben();
      return true;
    case 5:
      paramjf.hOx = parama.ben();
      return true;
    case 6:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      agb localagb = new agb();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = agb.a(locala, localagb, locala.bet()));
      paramjf.hOy = localagb;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hsT != null)
      parama.I(1, this.hsT);
    if (this.iaf != null)
      parama.I(2, this.iaf);
    if (this.hOs != null)
      parama.I(3, this.hOs);
    if (this.hOr != null)
      parama.I(4, this.hOr);
    if (this.hOx != null)
      parama.I(5, this.hOx);
    if (this.hOy != null)
    {
      parama.bv(6, this.hOy.hD());
      this.hOy.a(parama);
    }
  }

  public final int hD()
  {
    String str = this.hsT;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hsT);
    if (this.iaf != null)
      i += b.a.a.b.b.a.J(2, this.iaf);
    if (this.hOs != null)
      i += b.a.a.b.b.a.J(3, this.hOs);
    if (this.hOr != null)
      i += b.a.a.b.b.a.J(4, this.hOr);
    if (this.hOx != null)
      i += b.a.a.b.b.a.J(5, this.hOx);
    if (this.hOy != null)
      i += b.a.a.a.bs(6, this.hOy.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.jf
 * JD-Core Version:    0.6.2
 */