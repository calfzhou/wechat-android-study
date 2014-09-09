package com.tencent.mm.an;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  public static void aFs()
  {
    int i;
    if ((bg.oE()) && (!bg.rd()))
      i = 1;
    while ((i != 0) && (lx()))
    {
      String str = (String)bg.qW().oQ().get(77829, null);
      if (str != null)
      {
        Map localMap = d.wm(str);
        if ((localMap != null) && (localMap.size() > 0))
        {
          LinkedList localLinkedList = new LinkedList();
          Iterator localIterator = localMap.entrySet().iterator();
          while (true)
            if (localIterator.hasNext())
            {
              Map.Entry localEntry = (Map.Entry)localIterator.next();
              d locald = (d)localEntry.getValue();
              if (locald != null)
              {
                int j = locald.hitCount;
                int k = locald.dAr;
                if ((j > 0) || (k > 0))
                  localLinkedList.add(new bq(10166, (String)localEntry.getKey() + "," + j + "," + k));
                z.d("!44@CnzAcTcbtYFRSXd7O2W+aoew+LcYo3Eeko0uZc3BjDo=", "report PostTaskTenMinutesLogicState  name " + (String)localEntry.getKey() + " " + j + "  " + k);
                continue;
                i = 0;
                break;
              }
            }
          if (!localLinkedList.isEmpty())
          {
            bg.qW().oS().a(new bp(localLinkedList));
            bg.qW().oQ().set(77829, null);
          }
        }
      }
    }
    bg.qW().oQ().set(77828, Long.valueOf(ch.CL()));
    z.d("!44@CnzAcTcbtYFRSXd7O2W+aoew+LcYo3Eeko0uZc3BjDo=", "report PostTaskTenMinutesLogicState done ");
  }

  public static boolean lx()
  {
    return 1000L * ch.ab(ch.a((Long)bg.qW().oQ().get(77828), 0L)) > 1800000L;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.c
 * JD-Core Version:    0.6.2
 */