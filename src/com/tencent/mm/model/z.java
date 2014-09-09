package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import java.util.List;

public final class z
{
  public static int a(String paramString, List paramList)
  {
    if (!bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "get total unread with black list, but has not set uin");
      return 0;
    }
    long l1 = ch.CN();
    Cursor localCursor1 = bg.qW().oW().k(paramString, paramList);
    long l2 = ch.CN();
    if ((localCursor1 != null) && (localCursor1.getCount() > 0))
      localCursor1.moveToFirst();
    for (int i = localCursor1.getInt(0); ; i = 0)
    {
      if (localCursor1 != null)
        localCursor1.close();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "unreadcheck unRead getTotalUnread %d", arrayOfObject1);
      if (i <= 0)
        i = 0;
      while (true)
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Long.valueOf(ch.ad(l1));
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "get count with black list use %d ms", arrayOfObject4);
        return i;
        Cursor localCursor2 = bg.qW().oW().yO(paramString);
        if (localCursor2 == null)
        {
          com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "cursor is null, return");
          Object[] arrayOfObject6 = new Object[1];
          arrayOfObject6[0] = Long.valueOf(ch.ad(l2));
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "get count use %d ms", arrayOfObject6);
        }
        else
        {
          localCursor2.moveToFirst();
          while (!localCursor2.isAfterLast())
          {
            i locali = bg.qW().oT().ys(localCursor2.getString(0));
            if ((locali != null) && (locali.jv() == 0))
            {
              i -= localCursor2.getInt(1);
              Object[] arrayOfObject5 = new Object[2];
              arrayOfObject5[0] = locali.getUsername();
              arrayOfObject5[1] = Integer.valueOf(i);
              com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "unreadcheck chatroom mute %s, unRead %d,", arrayOfObject5);
            }
            localCursor2.moveToNext();
          }
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(i);
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "unreadcheck  result talker count is %d", arrayOfObject2);
          localCursor2.close();
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Long.valueOf(ch.ad(l2));
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "unreadcheck get count use %d ms", arrayOfObject3);
          i = Math.max(0, i);
        }
      }
    }
  }

  public static int dY(String paramString)
  {
    return a(paramString, null);
  }

  public static int dZ(String paramString)
  {
    if (!bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "get Total Unread Talker, but has not set uin");
      return 0;
    }
    long l = ch.CN();
    Cursor localCursor1 = bg.qW().oW().yP(paramString);
    if (localCursor1.getCount() > 0)
      localCursor1.moveToFirst();
    for (int i = localCursor1.getInt(0); ; i = 0)
    {
      localCursor1.close();
      if (i <= 0)
        break;
      Cursor localCursor2 = bg.qW().oW().yO(paramString);
      if (localCursor2 == null)
      {
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "cursor is null, return");
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Long.valueOf(ch.ad(l));
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "get count use %d ms", arrayOfObject3);
        return i;
      }
      localCursor2.moveToFirst();
      while (!localCursor2.isAfterLast())
      {
        i locali = bg.qW().oT().ys(localCursor2.getString(0));
        if ((locali != null) && (locali.jv() == 0))
          i--;
        localCursor2.moveToNext();
      }
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "result talker count is %d", arrayOfObject1);
      localCursor2.close();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(ch.ad(l));
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "get count use %d ms", arrayOfObject2);
      return Math.max(0, i);
    }
  }

  public static int qs()
  {
    int i = 0;
    if (!bg.oE())
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "get Bottle Total Conversation Unread, but has not set uin");
    Cursor localCursor;
    do
    {
      return i;
      localCursor = bg.qW().oW().aIJ();
      i = 0;
      if (localCursor != null)
      {
        int j = localCursor.getCount();
        i = 0;
        if (j > 0)
        {
          localCursor.moveToFirst();
          i = localCursor.getInt(0);
        }
      }
    }
    while (localCursor == null);
    localCursor.close();
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.z
 * JD-Core Version:    0.6.2
 */