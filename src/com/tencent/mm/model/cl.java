package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class cl
{
  private static String dlP = "select * from chatroom_members";

  public static void a(af paramaf)
  {
    if (!(paramaf instanceof h))
      z.e("!44@/B4Tb64lLpJbBGgMQaEYKMh+oVaGueiBmc5NEIJ4blM=", "!(db instanceof SqliteDB)");
    Cursor localCursor1;
    do
    {
      return;
      if (ch.a((Integer)bg.qW().oQ().get(63)) == -1)
      {
        z.w("!44@/B4Tb64lLpJbBGgMQaEYKMh+oVaGueiBmc5NEIJ4blM=", "check old contact not exist");
        return;
      }
      if (!h.b((h)paramaf, "chatroom_members"))
      {
        z.w("!44@/B4Tb64lLpJbBGgMQaEYKMh+oVaGueiBmc5NEIJ4blM=", "check old contact not exist");
        bg.qW().oQ().set(63, Integer.valueOf(-1));
        return;
      }
      localCursor1 = paramaf.rawQuery(dlP, null);
    }
    while (localCursor1 == null);
    int i = localCursor1.getCount();
    long l1 = System.currentTimeMillis();
    z.d("!44@/B4Tb64lLpJbBGgMQaEYKMh+oVaGueiBmc5NEIJ4blM=", "Read From Old ChatRoomMember :" + i);
    if (i == ch.a((Integer)bg.qW().oQ().get(63)))
    {
      z.w("!44@/B4Tb64lLpJbBGgMQaEYKMh+oVaGueiBmc5NEIJ4blM=", "Copy has been finished count:" + i);
      localCursor1.close();
      return;
    }
    long l2 = ((h)paramaf).dc(Thread.currentThread().getId());
    int j = 0;
    if (j < i)
    {
      localCursor1.moveToPosition(j);
      com.tencent.mm.storage.b localb = new com.tencent.mm.storage.b();
      localb.field_chatroomname = localCursor1.getString(0);
      localb.field_memberlist = localCursor1.getString(1);
      localb.field_addtime = localCursor1.getLong(2);
      localb.field_roomflag = localCursor1.getInt(3);
      localb.field_displayname = localCursor1.getString(4);
      localb.field_roomowner = localCursor1.getString(4);
      Cursor localCursor2;
      int k;
      StringBuilder localStringBuilder;
      if (!ch.jb(localb.field_chatroomname))
      {
        localCursor2 = paramaf.rawQuery("select chatroomname from " + "chatroom" + " where chatroomname=" + h.cG(localb.field_chatroomname), null);
        k = localCursor2.getCount();
        localStringBuilder = new StringBuilder("get chatroom:").append(localb.field_chatroomname).append(" in newchatroomStg:");
        if (k == 0)
          break label432;
      }
      label432: for (boolean bool = true; ; bool = false)
      {
        z.d("!44@/B4Tb64lLpJbBGgMQaEYKMh+oVaGueiBmc5NEIJ4blM=", bool);
        localCursor2.close();
        if (k == 0)
          paramaf.insert("chatroom", "", localb.ir());
        j++;
        break;
      }
    }
    if (l2 != 0L)
      ((h)paramaf).dd(l2);
    localCursor1.close();
    z.d("!44@/B4Tb64lLpJbBGgMQaEYKMh+oVaGueiBmc5NEIJ4blM=", "chatroomProc end time  " + (System.currentTimeMillis() - l1));
    bg.qW().oQ().set(63, Integer.valueOf(i));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cl
 * JD-Core Version:    0.6.2
 */