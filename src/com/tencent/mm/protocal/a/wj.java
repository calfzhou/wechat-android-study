package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class wj extends com.tencent.mm.ao.a
{
  public vt iqR;
  public int iqS;
  public LinkedList iqT = new LinkedList();

  public static boolean a(b.a.a.a.a parama, wj paramwj, int paramInt)
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
        vt localvt = new vt();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = vt.a(locala2, localvt, locala2.bet()));
        paramwj.iqR = localvt;
      }
      return true;
    case 2:
      paramwj.iqS = parama.bel();
      return true;
    case 3:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      xk localxk = new xk();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = xk.a(locala1, localxk, locala1.bet()));
      paramwj.iqT.add(localxk);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.iqR == null)
      throw new b("Not all required fields were included");
    if (this.iqR != null)
    {
      parama.bv(1, this.iqR.hD());
      this.iqR.a(parama);
    }
    parama.by(2, this.iqS);
    parama.d(3, 8, this.iqT);
  }

  public final int hD()
  {
    vt localvt = this.iqR;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.iqR.hD());
    return i + b.a.a.a.br(2, this.iqS) + b.a.a.a.c(3, 8, this.iqT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wj
 * JD-Core Version:    0.6.2
 */