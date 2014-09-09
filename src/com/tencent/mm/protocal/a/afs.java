package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class afs extends com.tencent.mm.ao.a
{
  public int ewb;
  public ws hPZ;

  public static boolean a(b.a.a.a.a parama, afs paramafs, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramafs.ewb = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      ws localws = new ws();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = ws.a(locala, localws, locala.bet()));
      paramafs.hPZ = localws;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPZ == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.ewb);
    if (this.hPZ != null)
    {
      parama.bv(2, this.hPZ.hD());
      this.hPZ.a(parama);
    }
  }

  public final afs cN(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    if (this.hPZ == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ewb);
    if (this.hPZ != null)
      i += b.a.a.a.bs(2, this.hPZ.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afs
 * JD-Core Version:    0.6.2
 */