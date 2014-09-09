package com.tencent.mm.protocal.a;

import b.a.a.a.a;
import b.a.a.b;
import java.util.LinkedList;

public final class tj extends vo
{
  public int hSL;
  public ws iof;
  public ws iog;
  public int ioh;
  public int ioi;
  public LinkedList ioj = new LinkedList();
  public int iok;

  public final tj cg(byte[] paramArrayOfByte)
  {
    this.ioj.clear();
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
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          ws localws2 = new ws();
          a locala4 = new a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = ws.a(locala4, localws2, locala4.bet()));
          this.iof = localws2;
        }
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          ws localws1 = new ws();
          a locala3 = new a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = ws.a(locala3, localws1, locala3.bet()));
          this.iog = localws1;
        }
        j = 1;
        continue;
        this.hSL = locala1.bel();
        j = 1;
        continue;
        this.ioh = locala1.bel();
        j = 1;
        continue;
        this.ioi = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          ee localee = new ee();
          a locala2 = new a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ee.a(locala2, localee, locala2.bet()));
          this.ioj.add(localee);
        }
        j = 1;
        continue;
        this.iok = locala1.bel();
        j = 1;
      }
    }
    if ((this.hRz == null) || (this.iof == null) || (this.iog == null))
      throw new b("Not all required fields were included");
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tj
 * JD-Core Version:    0.6.2
 */