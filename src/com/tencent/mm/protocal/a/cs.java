package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class cs extends com.tencent.mm.ao.a
{
  public String cCD;
  public int dZc;
  public int hQd;
  public long hSK;
  public int hSL;
  public LinkedList hSM = new LinkedList();
  public LinkedList hSN = new LinkedList();
  public String hSO;

  public static boolean a(b.a.a.a.a parama, cs paramcs, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcs.hSK = parama.ber();
      return true;
    case 2:
      paramcs.hSL = parama.bel();
      return true;
    case 3:
      paramcs.cCD = parama.ben();
      return true;
    case 4:
      paramcs.hSM.add(parama.ben());
      return true;
    case 5:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        cw localcw = new cw();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = cw.a(locala, localcw, locala.bet()));
        paramcs.hSN.add(localcw);
      }
      return true;
    case 6:
      paramcs.dZc = parama.bel();
      return true;
    case 7:
      paramcs.hSO = parama.ben();
      return true;
    case 8:
    }
    paramcs.hQd = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hSO == null)
      throw new b("Not all required fields were included");
    parama.k(1, this.hSK);
    parama.by(2, this.hSL);
    if (this.cCD != null)
      parama.I(3, this.cCD);
    parama.d(4, 1, this.hSM);
    parama.d(5, 8, this.hSN);
    parama.by(6, this.dZc);
    if (this.hSO != null)
      parama.I(7, this.hSO);
    parama.by(8, this.hQd);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.hSK) + b.a.a.a.br(2, this.hSL);
    if (this.cCD != null)
      i += b.a.a.b.b.a.J(3, this.cCD);
    int j = i + b.a.a.a.c(4, 1, this.hSM) + b.a.a.a.c(5, 8, this.hSN) + b.a.a.a.br(6, this.dZc);
    if (this.hSO != null)
      j += b.a.a.b.b.a.J(7, this.hSO);
    return j + b.a.a.a.br(8, this.hQd);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cs
 * JD-Core Version:    0.6.2
 */