package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class ae extends com.tencent.mm.ao.a
{
  public String KH;
  public String cCD;
  public String hPA;
  public String hPB;
  public af hPC;

  public static boolean a(b.a.a.a.a parama, ae paramae, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramae.KH = parama.ben();
      return true;
    case 2:
      paramae.cCD = parama.ben();
      return true;
    case 3:
      paramae.hPA = parama.ben();
      return true;
    case 4:
      paramae.hPB = parama.ben();
      return true;
    case 5:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      af localaf = new af();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = af.a(locala, localaf, locala.bet()));
      paramae.hPC = localaf;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPC == null)
      throw new b("Not all required fields were included");
    if (this.KH != null)
      parama.I(1, this.KH);
    if (this.cCD != null)
      parama.I(2, this.cCD);
    if (this.hPA != null)
      parama.I(3, this.hPA);
    if (this.hPB != null)
      parama.I(4, this.hPB);
    if (this.hPC != null)
    {
      parama.bv(5, this.hPC.hD());
      this.hPC.a(parama);
    }
  }

  public final ae ba(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    if (this.hPC == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    String str = this.KH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.KH);
    if (this.cCD != null)
      i += b.a.a.b.b.a.J(2, this.cCD);
    if (this.hPA != null)
      i += b.a.a.b.b.a.J(3, this.hPA);
    if (this.hPB != null)
      i += b.a.a.b.b.a.J(4, this.hPB);
    if (this.hPC != null)
      i += b.a.a.a.bs(5, this.hPC.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ae
 * JD-Core Version:    0.6.2
 */