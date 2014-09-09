package com.tencent.mm.protocal.a;

import b.a.a.a.a;
import b.a.a.b;
import java.util.LinkedList;

public final class xp extends vo
{
  public final xp co(byte[] paramArrayOfByte)
  {
    a locala1 = new a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      switch (i)
      {
      default:
      case 1:
      }
      for (int m = 0; ; m = 1)
      {
        if (m == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList = locala1.rN(i);
        int j = localLinkedList.size();
        for (int k = 0; k < j; k++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(k);
          bb localbb = new bb();
          a locala2 = new a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = bb.a(locala2, localbb, locala2.bet()));
          this.hRz = localbb;
        }
      }
    }
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xp
 * JD-Core Version:    0.6.2
 */