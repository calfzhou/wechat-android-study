package com.tencent.mm.ad;

import com.tencent.mm.a.c;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.protocal.a.qc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class o extends com.tencent.mm.sdk.c.g
{
  public o()
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    int i;
    int j;
    if ((bg.oE()) && (!bg.rd()))
    {
      i = 1;
      if (i == 0)
        break label326;
      if (1000L * ch.ab(ch.a((Long)bg.qW().oQ().get(68097), 0L)) <= 3600000L)
        break label108;
      j = 1;
    }
    LinkedList localLinkedList;
    while (true)
      if (j != 0)
      {
        localLinkedList = new LinkedList();
        byte[] arrayOfByte = c.b(bg.qW().pt() + "eggresult.rep", 0, -1);
        if (arrayOfByte == null)
        {
          return false;
          i = 0;
          break;
          label108: j = 0;
          continue;
        }
        try
        {
          Iterator localIterator = new h().v(arrayOfByte).dAt.iterator();
          while (localIterator.hasNext())
          {
            g localg = (g)localIterator.next();
            if (localg.dAr != 0)
            {
              qc localqc1 = new qc();
              localqc1.hPS = 17;
              localqc1.ifH = (localg.dAk + "," + localg.dAr);
              localLinkedList.add(localqc1);
            }
            if (localg.dAs != 0)
            {
              qc localqc2 = new qc();
              localqc2.hPS = 18;
              localqc2.ifH = (localg.dAk + "," + localg.dAs);
              localLinkedList.add(localqc2);
            }
          }
        }
        catch (Exception localException)
        {
        }
      }
    while (true)
    {
      if (!localLinkedList.isEmpty())
      {
        cx.a(localLinkedList);
        bg.qW().oQ().set(68097, Long.valueOf(ch.CL()));
      }
      label326: z.d("!44@/B4Tb64lLpIuznxMDiXSbM2vpbzQ0bYkL8uONMGJOyQ=", "report egg done");
      return false;
      c.deleteFile(bg.qW().pt() + "eggresult.rep");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.o
 * JD-Core Version:    0.6.2
 */