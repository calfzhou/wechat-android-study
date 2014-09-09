package com.tencent.mm.protocal.a;

import b.a.a.a.a;
import b.a.a.b;
import java.util.LinkedList;

public final class px extends vo
{
  public ws ifF;

  public final px bR(byte[] paramArrayOfByte)
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
      }
      while (true)
      {
        if (m == 0)
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
        m = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int j = localLinkedList1.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(k);
          ws localws = new ws();
          a locala2 = new a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ws.a(locala2, localws, locala2.bet()));
          this.ifF = localws;
        }
        m = 1;
      }
    }
    if ((this.hRz == null) || (this.ifF == null))
      throw new b("Not all required fields were included");
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.px
 * JD-Core Version:    0.6.2
 */