package com.tencent.mm.platformtools;

import android.util.SparseArray;
import com.tencent.mm.as.h;
import com.tencent.mm.as.j;
import com.tencent.mm.model.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import junit.framework.Assert;

public final class l
{
  private static SparseArray dUI = new SparseArray();

  public static final m a(int paramInt, String paramString, HashMap paramHashMap)
  {
    boolean bool1 = true;
    if ((!ch.jb(paramString)) && (paramHashMap != null));
    int i;
    m localm;
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      i = paramString.hashCode();
      localm = (m)dUI.get(i);
      if (localm != null)
        break label102;
      localm = new m(paramString, false);
      if (localm.b(paramString, paramHashMap, bool1, false))
        break;
      throw new a((byte)0);
    }
    dUI.put(i, localm);
    while (true)
    {
      localm.eu(paramInt);
      return localm;
      label102: if (!localm.dUJ);
      long l;
      while (true)
      {
        Assert.assertTrue(bool1);
        l = localm.aKU();
        Iterator localIterator = paramHashMap.values().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            String[] arrayOfString = ((j)localIterator.next()).kF();
            int j = arrayOfString.length;
            int k = 0;
            label167: if (k < j)
            {
              String str = arrayOfString[k];
              z.d("!44@/B4Tb64lLpKLtvWkVeLEdAH+ecu3SbUE1q+PcZlao4w=", "init sql:" + str);
              try
              {
                localm.bp(null, str);
                k++;
                break label167;
                bool1 = false;
              }
              catch (Exception localException)
              {
                while (true)
                  Assert.assertTrue("CreateTable failed:[" + str + "][" + localException.getMessage() + "]", false);
              }
            }
          }
      }
      localm.dd(l);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.l
 * JD-Core Version:    0.6.2
 */