package com.tencent.mm.plugin.f.c;

import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class j
{
  private static SparseArray fTA = new SparseArray();
  private static boolean fTB = true;

  public static void e(int paramInt, long paramLong)
  {
    if (!fTB)
      return;
    fTA.put(8, Long.valueOf(paramLong));
  }

  public static void js(int paramInt)
  {
    if (!fTB)
      return;
    fTA.put(paramInt, Long.valueOf(ch.CM()));
  }

  public static void jt(int paramInt)
  {
    if (!fTB);
    Long localLong;
    do
    {
      return;
      localLong = (Long)fTA.get(paramInt);
    }
    while ((localLong == null) || (localLong.longValue() == -1L));
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Long.valueOf(ch.CM() - localLong.longValue());
    z.i("!32@/B4Tb64lLpL9SB0DqhCSWmhsddwbSvcx", "ReportLogInfo operationEnd eventID:%d  time:%d", arrayOfObject);
    fTA.put(paramInt, Long.valueOf(-1L));
  }

  public static void ju(int paramInt)
  {
    if (!fTB)
      return;
    fTA.put(paramInt, Long.valueOf(-1L));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.j
 * JD-Core Version:    0.6.2
 */