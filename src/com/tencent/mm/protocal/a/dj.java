package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class dj extends com.tencent.mm.ao.a
{
  public int hOA;
  public LinkedList hTv = new LinkedList();
  public int hTw;

  public static boolean a(b.a.a.a.a parama, dj paramdj, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramdj.hOA = parama.bel();
      return true;
    case 2:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        dk localdk = new dk();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = dk.a(locala, localdk, locala.bet()));
        paramdj.hTv.add(localdk);
      }
      return true;
    case 3:
    }
    paramdj.hTw = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hOA);
    parama.d(2, 8, this.hTv);
    parama.by(3, this.hTw);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hOA) + b.a.a.a.c(2, 8, this.hTv) + b.a.a.a.br(3, this.hTw);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.dj
 * JD-Core Version:    0.6.2
 */