package com.tencent.mm.plugin.f.c;

import android.util.SparseArray;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.f.a.e;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class k
{
  private static SparseArray fTC;

  static
  {
    SparseArray localSparseArray = new SparseArray();
    fTC = localSparseArray;
    localSparseArray.put(3, new a());
    fTC.put(1, new f());
    fTC.put(0, new b());
  }

  static void a(e parame, boolean paramBoolean)
  {
    int i = parame.getType();
    m localm = (m)fTC.get(i);
    if (localm != null)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = Boolean.valueOf(paramBoolean);
      z.v("!32@/B4Tb64lLpL9SB0DqhCSWoIHNqU52jZC", "get reportHelper ok, type=%d, sync=%B", arrayOfObject2);
      if (!paramBoolean)
      {
        bg.qQ().n(new l(localm, parame));
        return;
      }
      localm.b(parame);
      return;
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i);
    z.d("!32@/B4Tb64lLpL9SB0DqhCSWoIHNqU52jZC", "get reportHelper fail, it is null, type=%d", arrayOfObject1);
  }

  static void aeZ()
  {
    for (int i = 0; i < fTC.size(); i++)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(fTC.keyAt(i));
      z.v("!32@/B4Tb64lLpL9SB0DqhCSWoIHNqU52jZC", "do save, key = %d", arrayOfObject);
      ((m)fTC.valueAt(i)).save();
    }
  }

  static void afa()
  {
    for (int i = 0; i < fTC.size(); i++)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(fTC.keyAt(i));
      z.v("!32@/B4Tb64lLpL9SB0DqhCSWoIHNqU52jZC", "do clear, key = %d", arrayOfObject);
      ((m)fTC.valueAt(i)).clear();
    }
  }

  static String afb()
  {
    if (bg.oE())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = bg.qW().pq();
      arrayOfObject[1] = com.tencent.mm.a.f.d("__report_rule__".getBytes());
      return String.format("%s/%s", arrayOfObject);
    }
    return "";
  }

  static x jv(int paramInt)
  {
    m localm = (m)fTC.get(paramInt);
    if (localm != null)
      return localm.aeS();
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.k
 * JD-Core Version:    0.6.2
 */