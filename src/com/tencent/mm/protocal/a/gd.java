package com.tencent.mm.protocal.a;

import b.a.a.a.a;
import b.a.a.b;
import java.util.LinkedList;

public final class gd extends vo
{
  public pe hRl;
  public co hRm;
  public tc hRn;
  public zb hRu;
  public String hVL;

  public final gd bm(byte[] paramArrayOfByte)
  {
    a locala1 = new a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int m;
      switch (i)
      {
      default:
        m = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
      while (true)
      {
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList5 = locala1.rN(i);
        int i6 = localLinkedList5.size();
        for (int i7 = 0; i7 < i6; i7++)
        {
          byte[] arrayOfByte5 = (byte[])localLinkedList5.get(i7);
          bb localbb = new bb();
          a locala6 = new a(arrayOfByte5, hre);
          for (boolean bool5 = true; bool5; bool5 = bb.a(locala6, localbb, locala6.bet()));
          this.hRz = localbb;
        }
        m = 1;
        continue;
        this.hVL = locala1.ben();
        m = 1;
        continue;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          co localco = new co();
          a locala5 = new a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = co.a(locala5, localco, locala5.bet()));
          this.hRm = localco;
        }
        m = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          pe localpe = new pe();
          a locala4 = new a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = pe.a(locala4, localpe, locala4.bet()));
          this.hRl = localpe;
        }
        m = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          zb localzb = new zb();
          a locala3 = new a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = zb.a(locala3, localzb, locala3.bet()));
          this.hRu = localzb;
        }
        m = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int j = localLinkedList1.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(k);
          tc localtc = new tc();
          a locala2 = new a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = tc.a(locala2, localtc, locala2.bet()));
          this.hRn = localtc;
        }
        m = 1;
      }
    }
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gd
 * JD-Core Version:    0.6.2
 */