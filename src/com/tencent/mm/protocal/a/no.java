package com.tencent.mm.protocal.a;

import b.a.a.a.a;
import b.a.a.b;
import java.util.LinkedList;

public final class no extends vo
{
  public LinkedList hQc = new LinkedList();
  public int huF;
  public ws idC;
  public int idD;
  public String idz;

  public final no bM(byte[] paramArrayOfByte)
  {
    this.hQc.clear();
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
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList3 = locala1.rN(i);
        int i2 = localLinkedList3.size();
        for (int i3 = 0; i3 < i2; i3++)
        {
          byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i3);
          bb localbb = new bb();
          a locala4 = new a(arrayOfByte3, hre);
          for (boolean bool3 = true; bool3; bool3 = bb.a(locala4, localbb, locala4.bet()));
          this.hRz = localbb;
        }
        j = 1;
        continue;
        this.huF = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          vt localvt = new vt();
          a locala3 = new a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = vt.a(locala3, localvt, locala3.bet()));
          this.hQc.add(localvt);
        }
        j = 1;
        continue;
        this.idz = locala1.ben();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          ws localws = new ws();
          a locala2 = new a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = ws.a(locala2, localws, locala2.bet()));
          this.idC = localws;
        }
        j = 1;
        continue;
        this.idD = locala1.bel();
        j = 1;
      }
    }
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.no
 * JD-Core Version:    0.6.2
 */