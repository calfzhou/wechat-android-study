package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class h extends com.tencent.mm.ao.a
{
  public int ewb;
  public String hOh;
  public int hOi;
  public String hOj;
  public String hOk;
  public String hOl;
  public f hOm;
  public String hOn;
  public v hOo;
  public z hOp;

  public static boolean a(b.a.a.a.a parama, h paramh, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramh.ewb = parama.bel();
      return true;
    case 2:
      paramh.hOh = parama.ben();
      return true;
    case 3:
      paramh.hOi = parama.bel();
      return true;
    case 4:
      paramh.hOj = parama.ben();
      return true;
    case 5:
      paramh.hOk = parama.ben();
      return true;
    case 6:
      paramh.hOl = parama.ben();
      return true;
    case 7:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        f localf = new f();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = f.a(locala3, localf, locala3.bet()));
        paramh.hOm = localf;
      }
      return true;
    case 8:
      paramh.hOn = parama.ben();
      return true;
    case 9:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        v localv = new v();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = v.a(locala2, localv, locala2.bet()));
        paramh.hOo = localv;
      }
      return true;
    case 10:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      z localz = new z();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = z.a(locala1, localz, locala1.bet()));
      paramh.hOp = localz;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ewb);
    if (this.hOh != null)
      parama.I(2, this.hOh);
    parama.by(3, this.hOi);
    if (this.hOj != null)
      parama.I(4, this.hOj);
    if (this.hOk != null)
      parama.I(5, this.hOk);
    if (this.hOl != null)
      parama.I(6, this.hOl);
    if (this.hOm != null)
    {
      parama.bv(7, this.hOm.hD());
      this.hOm.a(parama);
    }
    if (this.hOn != null)
      parama.I(8, this.hOn);
    if (this.hOo != null)
    {
      parama.bv(9, this.hOo.hD());
      this.hOo.a(parama);
    }
    if (this.hOp != null)
    {
      parama.bv(10, this.hOp.hD());
      this.hOp.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ewb);
    if (this.hOh != null)
      i += b.a.a.b.b.a.J(2, this.hOh);
    int j = i + b.a.a.a.br(3, this.hOi);
    if (this.hOj != null)
      j += b.a.a.b.b.a.J(4, this.hOj);
    if (this.hOk != null)
      j += b.a.a.b.b.a.J(5, this.hOk);
    if (this.hOl != null)
      j += b.a.a.b.b.a.J(6, this.hOl);
    if (this.hOm != null)
      j += b.a.a.a.bs(7, this.hOm.hD());
    if (this.hOn != null)
      j += b.a.a.b.b.a.J(8, this.hOn);
    if (this.hOo != null)
      j += b.a.a.a.bs(9, this.hOo.hD());
    if (this.hOp != null)
      j += b.a.a.a.bs(10, this.hOp.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.h
 * JD-Core Version:    0.6.2
 */