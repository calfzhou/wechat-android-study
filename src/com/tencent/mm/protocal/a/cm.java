package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class cm extends com.tencent.mm.ao.a
{
  public String hSt;
  public int hSu;
  public String hSv;
  public int hSw;
  public LinkedList hSx = new LinkedList();

  public static boolean a(b.a.a.a.a parama, cm paramcm, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcm.hSt = parama.ben();
      return true;
    case 2:
      paramcm.hSu = parama.bel();
      return true;
    case 3:
      paramcm.hSv = parama.ben();
      return true;
    case 4:
      paramcm.hSw = parama.bel();
      return true;
    case 5:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      cc localcc = new cc();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = cc.a(locala, localcc, locala.bet()));
      paramcm.hSx.add(localcc);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hSt != null)
      parama.I(1, this.hSt);
    parama.by(2, this.hSu);
    if (this.hSv != null)
      parama.I(3, this.hSv);
    parama.by(4, this.hSw);
    parama.d(5, 8, this.hSx);
  }

  public final cm bd(byte[] paramArrayOfByte)
  {
    this.hSx.clear();
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    String str = this.hSt;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hSt);
    int j = i + b.a.a.a.br(2, this.hSu);
    if (this.hSv != null)
      j += b.a.a.b.b.a.J(3, this.hSv);
    return j + b.a.a.a.br(4, this.hSw) + b.a.a.a.c(5, 8, this.hSx);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cm
 * JD-Core Version:    0.6.2
 */