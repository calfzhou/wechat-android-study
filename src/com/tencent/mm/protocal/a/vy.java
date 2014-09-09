package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class vy extends com.tencent.mm.ao.a
{
  public int count;
  public LinkedList iqB = new LinkedList();
  public int timestamp;

  public static boolean a(b.a.a.a.a parama, vy paramvy, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramvy.count = parama.bel();
      return true;
    case 2:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        vz localvz = new vz();
        b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = vz.a(locala, localvz, locala.bet()));
        paramvy.iqB.add(localvz);
      }
      return true;
    case 3:
    }
    paramvy.timestamp = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.count);
    parama.d(2, 8, this.iqB);
    parama.by(3, this.timestamp);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.count) + b.a.a.a.c(2, 8, this.iqB) + b.a.a.a.br(3, this.timestamp);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vy
 * JD-Core Version:    0.6.2
 */