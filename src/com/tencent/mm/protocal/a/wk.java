package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class wk extends com.tencent.mm.ao.a
{
  public int ioe;
  public LinkedList iqU = new LinkedList();

  public static boolean a(b.a.a.a.a parama, wk paramwk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramwk.ioe = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      wj localwj = new wj();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = wj.a(locala, localwj, locala.bet()));
      paramwk.iqU.add(localwj);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ioe);
    parama.d(2, 8, this.iqU);
  }

  public final wk ck(byte[] paramArrayOfByte)
  {
    this.iqU.clear();
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.ioe) + b.a.a.a.c(2, 8, this.iqU);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wk
 * JD-Core Version:    0.6.2
 */