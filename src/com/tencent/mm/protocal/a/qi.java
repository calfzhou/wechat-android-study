package com.tencent.mm.protocal.a;

import com.tencent.mm.ao.b;
import java.util.LinkedList;

public final class qi extends com.tencent.mm.ao.a
{
  public String cCD;
  public int ewb;
  public String fsX;
  public float ifW;
  public int ifX;
  public LinkedList ifY = new LinkedList();
  public int ifZ;
  public LinkedList iga = new LinkedList();
  public float igb;
  public String igc;

  public static boolean a(b.a.a.a.a parama, qi paramqi, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqi.fsX = parama.ben();
      return true;
    case 2:
      paramqi.cCD = parama.ben();
      return true;
    case 3:
      paramqi.ifW = parama.beq();
      return true;
    case 4:
      paramqi.ifX = parama.bel();
      return true;
    case 5:
      paramqi.ifY = new b.a.a.a.a(parama.bes().getBytes(), hre).bem();
      return true;
    case 6:
      paramqi.ifZ = parama.bel();
      return true;
    case 7:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        vt localvt = new vt();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = vt.a(locala, localvt, locala.bet()));
        paramqi.iga.add(localvt);
      }
      return true;
    case 8:
      paramqi.igb = parama.beq();
      return true;
    case 9:
      paramqi.igc = parama.ben();
      return true;
    case 10:
    }
    paramqi.ewb = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.fsX != null)
      parama.I(1, this.fsX);
    if (this.cCD != null)
      parama.I(2, this.cCD);
    parama.c(3, this.ifW);
    parama.by(4, this.ifX);
    parama.b(5, this.ifY);
    parama.by(6, this.ifZ);
    parama.d(7, 8, this.iga);
    parama.c(8, this.igb);
    if (this.igc != null)
      parama.I(9, this.igc);
    parama.by(10, this.ewb);
  }

  public final qi bT(byte[] paramArrayOfByte)
  {
    this.ifY.clear();
    this.iga.clear();
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    String str = this.fsX;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.fsX);
    if (this.cCD != null)
      i += b.a.a.b.b.a.J(2, this.cCD);
    int j = i + (4 + b.a.a.b.b.a.rV(3)) + b.a.a.a.br(4, this.ifX) + b.a.a.a.a(5, this.ifY) + b.a.a.a.br(6, this.ifZ) + b.a.a.a.c(7, 8, this.iga);
    int k = j + (4 + b.a.a.b.b.a.rV(8));
    if (this.igc != null)
      k += b.a.a.b.b.a.J(9, this.igc);
    return k + b.a.a.a.br(10, this.ewb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qi
 * JD-Core Version:    0.6.2
 */