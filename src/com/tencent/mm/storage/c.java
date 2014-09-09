package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class c extends ah
  implements g
{
  public static final String[] cKz = { "CREATE INDEX IF NOT EXISTS serverChatRoomUserIndex ON chatroom ( chatroomname )" };
  public static final String[] dmc;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(b.dhu, "chatroom");
    dmc = arrayOfString;
  }

  public c(af paramaf)
  {
    super(paramaf, b.dhu, "chatroom", cKz);
    this.dtV = paramaf;
  }

  private static List xR(String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    if (paramString.equals(""))
      return localLinkedList;
    String[] arrayOfString = paramString.split(";");
    for (int i = 0; i < arrayOfString.length; i++)
      localLinkedList.add(arrayOfString[i]);
    return localLinkedList;
  }

  public final int a(f paramf)
  {
    return 0;
  }

  public final List aIe()
  {
    z.d("!44@/B4Tb64lLpIELL9O96QoKG6hYx4y45rzIZBjRMoLQqc=", "getAllGroupCard : select * from chatroom where chatroomname like '%@groupcard'");
    Cursor localCursor = this.dtV.rawQuery("select * from chatroom where chatroomname like '%@groupcard'", null);
    int i = localCursor.getCount();
    String str = "";
    if (i == 0)
    {
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    do
    {
      b localb = new b();
      localb.b(localCursor);
      str = str + localb.field_chatroomname + ";";
    }
    while (localCursor.moveToNext());
    localCursor.close();
    return xR(str);
  }

  public final boolean b(b paramb)
  {
    if (super.a(paramb))
    {
      Ba(paramb.field_chatroomname);
      return true;
    }
    z.w("!44@/B4Tb64lLpIELL9O96QoKG6hYx4y45rzIZBjRMoLQqc=", "replace error");
    return false;
  }

  public final String dh(String paramString)
  {
    int i = 1;
    boolean bool;
    Cursor localCursor;
    int j;
    if (paramString.length() > 0)
    {
      bool = i;
      Assert.assertTrue(bool);
      String str = "select displayname from chatroom where chatroomname='" + ch.iV(paramString) + "'";
      localCursor = this.dtV.rawQuery(str, null);
      j = localCursor.getCount();
      if (j > i)
        break label119;
    }
    while (true)
    {
      Assert.assertTrue(i);
      if (j > 0)
        break label124;
      z.e("!44@/B4Tb64lLpIELL9O96QoKG6hYx4y45rzIZBjRMoLQqc=", "getDisplayName:" + paramString + " getCount ==0");
      localCursor.close();
      return null;
      bool = false;
      break;
      label119: i = 0;
    }
    label124: localCursor.moveToFirst();
    b localb = new b();
    localb.b(localCursor);
    localCursor.close();
    return localb.field_displayname;
  }

  public final void p(String paramString, long paramLong)
  {
    String str = "update chatroom set modifytime = " + paramLong + " where chatroomname = '" + ch.iV(paramString) + "'";
    this.dtV.bp("chatroom", str);
  }

  public final b xS(String paramString)
  {
    b localb = new b();
    localb.field_chatroomname = paramString;
    if (super.c(localb, new String[] { "chatroomname" }))
      return localb;
    return null;
  }

  public final b xT(String paramString)
  {
    b localb = new b();
    localb.field_chatroomname = paramString;
    if (super.c(localb, new String[] { "chatroomname" }));
    return localb;
  }

  public final String xU(String paramString)
  {
    int i = 1;
    boolean bool;
    Cursor localCursor;
    int j;
    if (paramString.length() > 0)
    {
      bool = i;
      Assert.assertTrue(bool);
      String str = "select memberlist from chatroom where chatroomname='" + ch.iV(paramString) + "'";
      localCursor = this.dtV.rawQuery(str, null);
      j = localCursor.getCount();
      if (j > i)
        break label119;
    }
    while (true)
    {
      Assert.assertTrue(i);
      if (j > 0)
        break label124;
      z.e("!44@/B4Tb64lLpIELL9O96QoKG6hYx4y45rzIZBjRMoLQqc=", "getMemberListByChatroomName chatroomName:" + paramString + " getCount ==0");
      localCursor.close();
      return null;
      bool = false;
      break;
      label119: i = 0;
    }
    label124: localCursor.moveToFirst();
    b localb = new b();
    localb.b(localCursor);
    localCursor.close();
    return localb.field_memberlist;
  }

  public final List xV(String paramString)
  {
    String str = xU(paramString);
    if (str == null)
      return null;
    return xR(str);
  }

  public final boolean xW(String paramString)
  {
    String str = "select * from chatroom where chatroomname='" + ch.iV(paramString) + "'";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    boolean bool;
    if (i <= 1)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (i > 0)
        break label104;
      z.e("!44@/B4Tb64lLpIELL9O96QoKG6hYx4y45rzIZBjRMoLQqc=", "getMemberListByChatroomName chatroomName:" + paramString + " getCount ==0");
      localCursor.close();
    }
    label104: b localb;
    do
    {
      return false;
      bool = false;
      break;
      localCursor.moveToFirst();
      localb = new b();
      localb.b(localCursor);
      localCursor.close();
    }
    while ((0x1 & localb.field_roomflag) != 0);
    return true;
  }

  public final boolean xX(String paramString)
  {
    if (paramString.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.dtV.delete("chatroom", "chatroomname=?", new String[] { paramString }) != 0)
        break;
      return false;
    }
    Ba(paramString);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.c
 * JD-Core Version:    0.6.2
 */