package com.tencent.mm.ui;

import android.util.SparseArray;
import com.tencent.mm.dbsupport.newcursor.a;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class o
  implements t
{
  o(n paramn)
  {
  }

  public final void aON()
  {
    if (n.a(this.iIy, n.b(this.iIy)))
    {
      HashSet localHashSet = new HashSet(n.b(this.iIy).size());
      Iterator localIterator1 = n.b(this.iIy).values().iterator();
      while (localIterator1.hasNext())
        localHashSet.add(((r)localIterator1.next()).fa);
      z.i(this.iIy.TAG, "newcursor all event is delete");
      n.c(this.iIy).b(localHashSet.toArray(), null);
    }
    while (true)
    {
      n.b(this.iIy).clear();
      return;
      if (!n.b(this.iIy).containsKey(this.iIy.iIx))
      {
        long l2 = System.currentTimeMillis();
        SparseArray[] arrayOfSparseArray1 = this.iIy.aOH();
        SparseArray[] arrayOfSparseArray2 = this.iIy.a(new HashSet(n.b(this.iIy).values()), arrayOfSparseArray1);
        int i = arrayOfSparseArray1.length;
        if (i > 1)
          for (int j = 0; j < i; j++)
          {
            String str5 = this.iIy.TAG;
            Object[] arrayOfObject5 = new Object[4];
            arrayOfObject5[0] = Integer.valueOf(j);
            arrayOfObject5[1] = Long.valueOf(System.currentTimeMillis() - l2);
            arrayOfObject5[2] = Integer.valueOf(arrayOfSparseArray1[j].size());
            arrayOfObject5[3] = Integer.valueOf(arrayOfSparseArray2[j].size());
            z.i(str5, "newcursor %d  refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", arrayOfObject5);
          }
        String str2 = this.iIy.TAG;
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - l2);
        arrayOfObject2[1] = Integer.valueOf(arrayOfSparseArray1[0].size());
        arrayOfObject2[2] = Integer.valueOf(arrayOfSparseArray2[0].size());
        z.i(str2, "newcursor refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", arrayOfObject2);
        Iterator localIterator2 = n.b(this.iIy).values().iterator();
        if (localIterator2.hasNext())
        {
          r localr = (r)localIterator2.next();
          if (localr != null)
            if (localr.iIB != null)
            {
              String str4 = this.iIy.TAG;
              Object[] arrayOfObject4 = new Object[1];
              arrayOfObject4[0] = localr.fa;
              z.i(str4, "newcursor notify cache update : key : %s ", arrayOfObject4);
            }
          while (true)
          {
            n.c(this.iIy).b(localr.fa, (a)localr.iIB);
            break;
            z.e(this.iIy.TAG, "newcursor event is null ! ");
          }
        }
        this.iIy.a(arrayOfSparseArray2);
        String str3 = this.iIy.TAG;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(n.c(this.iIy).oq()[0].size());
        z.i(str3, "newcursor after resort new pos size :%d  ", arrayOfObject3);
      }
      else
      {
        long l1 = System.currentTimeMillis();
        n.a(this.iIy, new s(this.iIy, this.iIy.aOG()), true, false);
        String str1 = this.iIy.TAG;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Long.valueOf(System.currentTimeMillis() - l1);
        z.i(str1, "cache unuseful,reset cursor,last : %d", arrayOfObject1);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.o
 * JD-Core Version:    0.6.2
 */