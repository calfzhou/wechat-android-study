package com.tencent.mm.protocal.a;

import b.a.a.a.a;
import b.a.a.b;
import java.util.LinkedList;

public final class kt extends vo
{
  public int iaW;
  public vj ibk;

  public final kt bK(byte[] paramArrayOfByte)
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
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          bb localbb = new bb();
          a locala3 = new a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = bb.a(locala3, localbb, locala3.bet()));
          this.hRz = localbb;
        }
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          vj localvj = new vj();
          a locala2 = new a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = vj.a(locala2, localvj, locala2.bet()));
          this.ibk = localvj;
        }
        j = 1;
        continue;
        this.iaW = locala1.bel();
        j = 1;
      }
    }
    if ((this.hRz == null) || (this.ibk == null))
      throw new b("Not all required fields were included");
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.kt
 * JD-Core Version:    0.6.2
 */