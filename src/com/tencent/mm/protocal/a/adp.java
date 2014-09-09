package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class adp extends com.tencent.mm.ao.a
{
  public adn hXq;

  public static boolean a(b.a.a.a.a parama, adp paramadp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      adn localadn = new adn();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = adn.a(locala, localadn, locala.bet()));
      paramadp.hXq = localadn;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hXq == null)
      throw new b("Not all required fields were included");
    if (this.hXq != null)
    {
      parama.bv(1, this.hXq.hD());
      this.hXq.a(parama);
    }
  }

  public final int hD()
  {
    adn localadn = this.hXq;
    int i = 0;
    if (localadn != null)
      i = 0 + b.a.a.a.bs(1, this.hXq.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adp
 * JD-Core Version:    0.6.2
 */