package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.r;

public final class cn
{
  public static void a(h paramh)
  {
    a(paramh, "conversation", "rconversation", 50);
    a(paramh, "bottleconversation", "rbottleconversation", 51);
  }

  private static void a(h paramh, String paramString1, String paramString2, int paramInt)
  {
    if (ch.a((Integer)bg.qW().oQ().get(paramInt)) == -1)
      z.w("!44@/B4Tb64lLpLZu+frguCSjnvN3zxfsgC2WMREjVBjAF4=", "check old " + paramString1 + " not exist");
    Cursor localCursor1;
    do
    {
      return;
      if (!h.b(paramh, paramString1))
      {
        z.w("!44@/B4Tb64lLpLZu+frguCSjnvN3zxfsgC2WMREjVBjAF4=", "check old " + paramString1 + " not exist");
        bg.qW().oQ().set(paramInt, Integer.valueOf(-1));
        return;
      }
      localCursor1 = paramh.rawQuery("select unReadCount,status,isSend,createTime,username,content,reserved from " + paramString1, null);
    }
    while (localCursor1 == null);
    int i = localCursor1.getCount();
    z.d("!44@/B4Tb64lLpLZu+frguCSjnvN3zxfsgC2WMREjVBjAF4=", "Read From Old " + paramString1 + "  :" + i);
    if (i == ch.a((Integer)bg.qW().oQ().get(paramInt)))
    {
      z.w("!44@/B4Tb64lLpLZu+frguCSjnvN3zxfsgC2WMREjVBjAF4=", "Copy has been finished count:" + i);
      localCursor1.close();
      return;
    }
    long l = paramh.dc(Thread.currentThread().getId());
    int j = 0;
    if (j < i)
    {
      localCursor1.moveToPosition(j);
      r localr = new r();
      localr.bt(localCursor1.getInt(0));
      localr.setStatus(localCursor1.getInt(1));
      localr.bv(localCursor1.getInt(2));
      localr.k(localCursor1.getLong(3));
      localr.setUsername(localCursor1.getString(4));
      localr.setContent(localCursor1.getString(5));
      localr.bv(localCursor1.getString(6));
      Cursor localCursor2;
      int k;
      StringBuilder localStringBuilder;
      if (!ch.jb(localr.getUsername()))
      {
        localCursor2 = paramh.rawQuery("select username from " + paramString2 + " where username=" + h.cG(localr.getUsername()), null);
        k = localCursor2.getCount();
        localStringBuilder = new StringBuilder("get old:").append(localr.getUsername()).append(" in new:");
        if (k == 0)
          break label485;
      }
      label485: for (boolean bool = true; ; bool = false)
      {
        z.d("!44@/B4Tb64lLpLZu+frguCSjnvN3zxfsgC2WMREjVBjAF4=", bool);
        localCursor2.close();
        if (k == 0)
          paramh.insert(paramString2, "", localr.ir());
        j++;
        break;
      }
    }
    if (l != 0L)
      paramh.dd(l);
    localCursor1.close();
    bg.qW().oQ().set(paramInt, Integer.valueOf(i));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cn
 * JD-Core Version:    0.6.2
 */