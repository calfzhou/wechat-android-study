package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class i extends com.tencent.mm.ao.a
{
  public String hOq;
  public String hOr;
  public String hOs;
  public String hOt;
  public String hOu;
  public String hOv;
  public String hOw;
  public String hOx;
  public agb hOy;
  public String hOz;
  public String hsT;

  public static boolean a(b.a.a.a.a parama, i parami, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parami.hsT = parama.ben();
      return true;
    case 2:
      parami.hOq = parama.ben();
      return true;
    case 3:
      parami.hOr = parama.ben();
      return true;
    case 4:
      parami.hOs = parama.ben();
      return true;
    case 5:
      parami.hOt = parama.ben();
      return true;
    case 6:
      parami.hOu = parama.ben();
      return true;
    case 7:
      parami.hOv = parama.ben();
      return true;
    case 8:
      parami.hOw = parama.ben();
      return true;
    case 9:
      parami.hOx = parama.ben();
      return true;
    case 10:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        agb localagb = new agb();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = agb.a(locala, localagb, locala.bet()));
        parami.hOy = localagb;
      }
      return true;
    case 11:
    }
    parami.hOz = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hsT != null)
      parama.I(1, this.hsT);
    if (this.hOq != null)
      parama.I(2, this.hOq);
    if (this.hOr != null)
      parama.I(3, this.hOr);
    if (this.hOs != null)
      parama.I(4, this.hOs);
    if (this.hOt != null)
      parama.I(5, this.hOt);
    if (this.hOu != null)
      parama.I(6, this.hOu);
    if (this.hOv != null)
      parama.I(7, this.hOv);
    if (this.hOw != null)
      parama.I(8, this.hOw);
    if (this.hOx != null)
      parama.I(9, this.hOx);
    if (this.hOy != null)
    {
      parama.bv(10, this.hOy.hD());
      this.hOy.a(parama);
    }
    if (this.hOz != null)
      parama.I(11, this.hOz);
  }

  public final int hD()
  {
    String str = this.hsT;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hsT);
    if (this.hOq != null)
      i += b.a.a.b.b.a.J(2, this.hOq);
    if (this.hOr != null)
      i += b.a.a.b.b.a.J(3, this.hOr);
    if (this.hOs != null)
      i += b.a.a.b.b.a.J(4, this.hOs);
    if (this.hOt != null)
      i += b.a.a.b.b.a.J(5, this.hOt);
    if (this.hOu != null)
      i += b.a.a.b.b.a.J(6, this.hOu);
    if (this.hOv != null)
      i += b.a.a.b.b.a.J(7, this.hOv);
    if (this.hOw != null)
      i += b.a.a.b.b.a.J(8, this.hOw);
    if (this.hOx != null)
      i += b.a.a.b.b.a.J(9, this.hOx);
    if (this.hOy != null)
      i += b.a.a.a.bs(10, this.hOy.hD());
    if (this.hOz != null)
      i += b.a.a.b.b.a.J(11, this.hOz);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.i
 * JD-Core Version:    0.6.2
 */