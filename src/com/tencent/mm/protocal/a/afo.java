package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class afo extends com.tencent.mm.ao.a
{
  public afs ixD;
  public afs ixE;
  public int iyh;
  public aez iyi;
  public aez iyj;

  public static boolean a(b.a.a.a.a parama, afo paramafo, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      LinkedList localLinkedList4 = parama.rN(paramInt);
      int i2 = localLinkedList4.size();
      for (int i3 = 0; i3 < i2; i3++)
      {
        byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i3);
        afs localafs2 = new afs();
        b.a.a.a.a locala4 = new b.a.a.a.a(arrayOfByte4, hre);
        for (boolean bool4 = true; bool4; bool4 = afs.a(locala4, localafs2, locala4.bet()));
        paramafo.ixD = localafs2;
      }
      return true;
    case 2:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        afs localafs1 = new afs();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = afs.a(locala3, localafs1, locala3.bet()));
        paramafo.ixE = localafs1;
      }
      return true;
    case 3:
      paramafo.iyh = parama.bel();
      return true;
    case 4:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        aez localaez2 = new aez();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = aez.a(locala2, localaez2, locala2.bet()));
        paramafo.iyi = localaez2;
      }
      return true;
    case 5:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      aez localaez1 = new aez();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = aez.a(locala1, localaez1, locala1.bet()));
      paramafo.iyj = localaez1;
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if ((this.ixD == null) || (this.ixE == null))
      throw new b("Not all required fields were included");
    if (this.ixD != null)
    {
      parama.bv(1, this.ixD.hD());
      this.ixD.a(parama);
    }
    if (this.ixE != null)
    {
      parama.bv(2, this.ixE.hD());
      this.ixE.a(parama);
    }
    parama.by(3, this.iyh);
    if (this.iyi != null)
    {
      parama.bv(4, this.iyi.hD());
      this.iyi.a(parama);
    }
    if (this.iyj != null)
    {
      parama.bv(5, this.iyj.hD());
      this.iyj.a(parama);
    }
  }

  public final afo cM(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    if ((this.ixD == null) || (this.ixE == null))
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    afs localafs = this.ixD;
    int i = 0;
    if (localafs != null)
      i = 0 + b.a.a.a.bs(1, this.ixD.hD());
    if (this.ixE != null)
      i += b.a.a.a.bs(2, this.ixE.hD());
    int j = i + b.a.a.a.br(3, this.iyh);
    if (this.iyi != null)
      j += b.a.a.a.bs(4, this.iyi.hD());
    if (this.iyj != null)
      j += b.a.a.a.bs(5, this.iyj.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afo
 * JD-Core Version:    0.6.2
 */