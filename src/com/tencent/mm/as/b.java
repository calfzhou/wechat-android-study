package com.tencent.mm.as;

import android.database.Cursor;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class b
{
  private static l ild = null;
  private static long ile = 0L;
  private static int ilf = 0;
  private static int index;
  private static boolean on = false;

  static
  {
    index = 0;
  }

  static void a(String paramString, Cursor paramCursor, long paramLong)
  {
    if (!on)
      return;
    long l = ild.nM();
    String str1 = "Thread:[" + Thread.currentThread().getId() + "," + Thread.currentThread().getName() + "]";
    String str2 = str1 + "[" + index + "][" + l + "]";
    if (paramLong != 0L)
      str2 = str2 + "[INTRANS]";
    if (paramCursor != null)
    {
      h(paramCursor);
      str2 = str2 + "[cuCnt:" + ilf + ",cuTime:" + ile + "]";
    }
    String str3 = str2 + "[" + paramString + "]--";
    z.v("MicroMsg.dbtest", str3 + ch.aHN());
  }

  public static void aKP()
  {
  }

  static void begin()
  {
    if (!on)
      return;
    ild = new l();
    index = 1 + index;
  }

  private static void h(Cursor paramCursor)
  {
    if (!on);
    while (paramCursor == null)
      return;
    ilf = paramCursor.getCount();
    l locall = new l();
    for (int i = 0; i < ilf; i++)
      paramCursor.moveToPosition(i);
    paramCursor.moveToPosition(-1);
    ile = locall.nM();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.b
 * JD-Core Version:    0.6.2
 */