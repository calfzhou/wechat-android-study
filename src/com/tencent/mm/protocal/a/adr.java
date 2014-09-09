package com.tencent.mm.protocal.a;

import b.a.a.a.a;
import b.a.a.b;
import java.util.LinkedList;

public final class adr extends vo
{
  public int hOO;
  public vt hOP;
  public vt hOQ;
  public int hOV;
  public long hOY;
  public int hQk;
  public int hQs;
  public int hUu;
  public vt iws;

  public final adr cA(byte[] paramArrayOfByte)
  {
    a locala1 = new a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      default:
        j = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList4 = locala1.rN(i);
        int i4 = localLinkedList4.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          byte[] arrayOfByte4 = (byte[])localLinkedList4.get(i5);
          bb localbb = new bb();
          a locala5 = new a(arrayOfByte4, hre);
          for (boolean bool4 = true; bool4; bool4 = bb.a(locala5, localbb, locala5.bet()));
          this.hRz = localbb;
        }
        j = 1;
        continue;
        this.hOO = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          vt localvt3 = new vt();
          a locala4 = new a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = vt.a(locala4, localvt3, locala4.bet()));
          this.iws = localvt3;
        }
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          vt localvt2 = new vt();
          a locala3 = new a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = vt.a(locala3, localvt2, locala3.bet()));
          this.hOP = localvt2;
        }
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          vt localvt1 = new vt();
          a locala2 = new a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = vt.a(locala2, localvt1, locala2.bet()));
          this.hOQ = localvt1;
        }
        j = 1;
        continue;
        this.hQk = locala1.bel();
        j = 1;
        continue;
        this.hUu = locala1.bel();
        j = 1;
        continue;
        this.hQs = locala1.bel();
        j = 1;
        continue;
        this.hOV = locala1.bel();
        j = 1;
        continue;
        this.hOY = locala1.ber();
        j = 1;
      }
    }
    if ((this.hRz == null) || (this.iws == null) || (this.hOP == null) || (this.hOQ == null))
      throw new b("Not all required fields were included");
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adr
 * JD-Core Version:    0.6.2
 */