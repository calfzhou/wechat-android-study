package com.tencent.mm.plugin.ext;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Looper;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.tencent.mm.compatible.a.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ci;
import com.tencent.mm.storage.cr;
import com.tencent.mm.storage.cs;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

final class g extends cm
{
  g(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140514", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public final void handleMessage(Message paramMessage)
  {
    if ((ak.getContext() == null) || (!bg.oE()))
      z.w("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "wrong status");
    Cursor localCursor;
    HashMap localHashMap;
    LinkedList localLinkedList;
    ArrayList localArrayList;
    com.tencent.mm.storage.ch localch;
    do
      while (true)
      {
        return;
        localCursor = b.Qa().rawQuery("select * from OpenMsgListener where (status = ?) ", new String[] { "1" });
        if (localCursor != null)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(localCursor.getCount());
          z.d("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "listener count = %s", arrayOfObject1);
          if (localCursor.getCount() <= 0)
          {
            localCursor.close();
            return;
          }
          try
          {
            if (localCursor.moveToFirst())
            {
              localHashMap = new HashMap();
              localHashMap.putAll(b.a(this.eLF));
              b.a(this.eLF).clear();
              do
              {
                localLinkedList = new LinkedList();
                localArrayList = new ArrayList();
                if (localHashMap.entrySet() == null)
                  break;
                localch = new com.tencent.mm.storage.ch();
                localch.b(localCursor);
                if ((!com.tencent.mm.sdk.platformtools.ch.jb(localch.field_appId)) && (!com.tencent.mm.sdk.platformtools.ch.jb(localch.field_packageName)))
                  break label272;
                Object[] arrayOfObject3 = new Object[2];
                arrayOfObject3[0] = localch.field_appId;
                arrayOfObject3[1] = localch.field_packageName;
                z.w("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "wrong msgListener, appid = %s, package = %s", arrayOfObject3);
              }
              while (localCursor.moveToNext());
            }
            localCursor.close();
            return;
          }
          catch (Exception localException)
          {
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = localException.getMessage();
            z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "Exception in handleMessage, %s", arrayOfObject2);
          }
        }
      }
    while (localCursor == null);
    localCursor.close();
    return;
    label272: Iterator localIterator = localHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = com.tencent.mm.sdk.platformtools.ch.ja((String)localEntry.getKey());
      Integer localInteger1 = (Integer)localEntry.getValue();
      r localr = bg.qW().oW().yE(str);
      if ((localr != null) && (!com.tencent.mm.sdk.platformtools.ch.jb(localr.getUsername())) && (localr.jI() <= 0))
      {
        z.d("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "no unread in conversation");
      }
      else if ((!y.dQ(str)) && (!y.dc(str)) && (!y.dj(str)))
      {
        cr localcr = b.Qb().bx(localch.field_appId, str);
        if ((localcr == null) || (com.tencent.mm.sdk.platformtools.ch.jb(localcr.field_openId)) || (com.tencent.mm.sdk.platformtools.ch.jb(localcr.field_username)))
        {
          z.d("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "openId is null, go get it.");
          Integer localInteger2 = (Integer)b.a(this.eLF).get(str);
          if (localInteger2 == null)
            b.a(this.eLF).put(str, localInteger1);
          while (true)
          {
            localLinkedList.add(str);
            break;
            b.a(this.eLF).put(str, Integer.valueOf(localInteger2.intValue() + localInteger1.intValue()));
          }
        }
        Object[] arrayOfObject6 = new Object[3];
        arrayOfObject6[0] = localcr.field_username;
        arrayOfObject6[1] = localcr.field_appId;
        arrayOfObject6[2] = localcr.field_openId;
        z.v("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "username[%s], appId[%s], openId[%s]", arrayOfObject6);
        Object[] arrayOfObject7 = new Object[3];
        arrayOfObject7[0] = localcr.field_openId;
        arrayOfObject7[1] = localInteger1;
        arrayOfObject7[2] = Long.valueOf(System.currentTimeMillis() - 1600L);
        localArrayList.add(String.format("%s,%s,%s", arrayOfObject7));
      }
    }
    if (localLinkedList.size() > 0)
      this.eLF.d(localch.field_appId, localLinkedList);
    if (localArrayList.size() <= 0)
    {
      localCursor.close();
      return;
    }
    if (localch.field_status == 1);
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = localch.field_appId;
        arrayOfObject4[1] = localch.field_packageName;
        z.w("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "invalid msgListener, appid = %s, package = %s", arrayOfObject4);
        break;
      }
      if ((com.tencent.mm.sdk.platformtools.ch.jb(localch.field_appId)) || (com.tencent.mm.sdk.platformtools.ch.jb(localch.field_packageName)))
        break;
      Object[] arrayOfObject5 = new Object[2];
      arrayOfObject5[0] = localch.field_appId;
      arrayOfObject5[1] = localch.field_packageName;
      z.d("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "notify app, appId = %s, package = %s", arrayOfObject5);
      Intent localIntent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_NOTIFY_MSG");
      localIntent.addCategory("com.tencent.mm.category." + localch.field_packageName);
      a.a(12, new h(this, localIntent));
      localIntent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "NEW_MESSAGE");
      localIntent.putStringArrayListExtra("EXTRA_EXT_OPEN_USER_DATA", localArrayList);
      ak.getContext().sendBroadcast(localIntent);
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.g
 * JD-Core Version:    0.6.2
 */