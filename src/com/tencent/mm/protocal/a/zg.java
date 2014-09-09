package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class zg extends com.tencent.mm.ao.a
{
  public String hOJ;
  public long isD;
  public long isE;
  public zf isF;
  public zf isG;

  public static boolean a(b.a.a.a.a parama, zg paramzg, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramzg.isD = parama.ber();
      return true;
    case 2:
      paramzg.isE = parama.ber();
      return true;
    case 3:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        zf localzf2 = new zf();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = zf.a(locala2, localzf2, locala2.bet()));
        paramzg.isF = localzf2;
      }
      return true;
    case 4:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        zf localzf1 = new zf();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = zf.a(locala1, localzf1, locala1.bet()));
        paramzg.isG = localzf1;
      }
      return true;
    case 5:
    }
    paramzg.hOJ = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.isF == null)
      throw new b("Not all required fields were included");
    parama.k(1, this.isD);
    parama.k(2, this.isE);
    if (this.isF != null)
    {
      parama.bv(3, this.isF.hD());
      this.isF.a(parama);
    }
    if (this.isG != null)
    {
      parama.bv(4, this.isG.hD());
      this.isG.a(parama);
    }
    if (this.hOJ != null)
      parama.I(5, this.hOJ);
  }

  public final zg cr(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    if (this.isF == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.isD) + b.a.a.a.i(2, this.isE);
    if (this.isF != null)
      i += b.a.a.a.bs(3, this.isF.hD());
    if (this.isG != null)
      i += b.a.a.a.bs(4, this.isG.hD());
    if (this.hOJ != null)
      i += b.a.a.b.b.a.J(5, this.hOJ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zg
 * JD-Core Version:    0.6.2
 */